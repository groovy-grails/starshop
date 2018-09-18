package nideshop

import javax.servlet.ServletOutputStream
import org.springframework.web.multipart.commons.CommonsMultipartFile
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

class PController {
	static allowedMethods = [index:"GET",create:"GET",save: "POST"]
    def index() {
		def filename=params["filename"]
		println "filename="+filename
		def path=request.getSession().getServletContext().getRealPath("/")
		def filePath=path+"/uploads/"
		def url=new File(filePath+filename)
		response.setContentType("image/jpeg;");
		BufferedInputStream bis = null;
		ServletOutputStream sout = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(url));
			byte[] buffer = new byte[1024*8];
			int result = -1;
			sout = response.getOutputStream();
			while((result = bis.read(buffer)) != -1){
				sout.write(buffer,0,result);
			}
			sout.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(bis!=null)bis.close();
				if(sout!=null)sout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	def create() {
		respond new Image(params) 
		}
	def save() { 
		Image imageInstance=new Image()
		def errorflag=false
		def errormsg="文件不是图片文件！"
		CommonsMultipartFile downloadedfile = request.getFile('name');
		def path=request.getSession().getServletContext().getRealPath("/")
		def filePath=path+"/uploads/"
		def dir=new File(filePath)
		if(!dir.isDirectory()){
			dir.mkdir()
		}
		Random rand = new Random()
		def randStr=rand.nextInt(1000000)
		def fileName=new Date().getTime()+"-"+randStr
		def oFileName=downloadedfile.getOriginalFilename()
		
		if(oFileName.lastIndexOf(".")!=-1){
			imageInstance.ext=oFileName.substring(oFileName.lastIndexOf(".")+1).toLowerCase()
			def ext=imageInstance.ext.toLowerCase()
			if("png".equals(ext)||"jpg".equals(ext)||"jpeg".equals(ext)||"gif".equals(ext)||"bmp".equals(ext)){}else{
				errorflag=true
			}
		}else{
			errorflag=true
		}
		if(errorflag){
			flash.message = errormsg
			redirect create
		}else{
		
		def lastfileName=filePath+fileName+"."+imageInstance.ext
		imageInstance.name=fileName+"."+imageInstance.ext
		
		def fos= new FileOutputStream(new File(lastfileName))
		downloadedfile.getBytes().each{ fos.write(it) }
		
		imageInstance.save flush:true
		if (!imageInstance.save()) {
			imageInstance.errors.each {
				System.out.println( it )
			}
		}
		}
		
		render("upload success!")
	}
}
