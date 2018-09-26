import nideshop.NideshopCommentPicture
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopCommentPicture_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopCommentPicture/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopCommentPictureInstance, field: 'commentId', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopCommentPicture.commentId.label"),'default':("Comment Id")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("commentId"),'name':("commentId.id"),'from':(nideshop.NideshopComment.list()),'optionKey':("id"),'required':(""),'value':(nideshopCommentPictureInstance?.commentId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCommentPictureInstance, field: 'picUrl', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopCommentPicture.picUrl.label"),'default':("Pic Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("picUrl"),'required':(""),'value':(nideshopCommentPictureInstance?.picUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCommentPictureInstance, field: 'sortOrder', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopCommentPicture.sortOrder.label"),'default':("Sort Order")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['name':("sortOrder"),'type':("number"),'value':(nideshopCommentPictureInstance.sortOrder),'required':("")],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537152352000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
