import nideshop.NideshopGoodsGallery
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopGoodsGallery_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopGoodsGallery/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopGoodsGalleryInstance, field: 'goodsId', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopGoodsGallery.goodsId.label"),'default':("Goods Id")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("goodsId"),'name':("goodsId.id"),'from':(nideshop.NideshopGoods.list()),'optionKey':("id"),'required':(""),'value':(nideshopGoodsGalleryInstance?.goodsId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopGoodsGalleryInstance, field: 'imgDesc', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopGoodsGallery.imgDesc.label"),'default':("Img Desc")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("imgDesc"),'required':(""),'value':(nideshopGoodsGalleryInstance?.imgDesc)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopGoodsGalleryInstance, field: 'imgUrl', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopGoodsGallery.imgUrl.label"),'default':("Img Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("imgUrl"),'required':(""),'value':(nideshopGoodsGalleryInstance?.imgUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopGoodsGalleryInstance, field: 'sortOrder', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopGoodsGallery.sortOrder.label"),'default':("Sort Order")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['name':("sortOrder"),'type':("number"),'value':(nideshopGoodsGalleryInstance.sortOrder),'required':("")],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537372731000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
