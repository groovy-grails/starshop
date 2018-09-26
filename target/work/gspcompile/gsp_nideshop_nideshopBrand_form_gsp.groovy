import nideshop.NideshopBrand
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopBrand_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopBrand/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopBrandInstance, field: 'appListPicUrl', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopBrand.appListPicUrl.label"),'default':("App List Pic Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("appListPicUrl"),'required':(""),'value':(nideshopBrandInstance?.appListPicUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopBrandInstance, field: 'floorPrice', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopBrand.floorPrice.label"),'default':("Floor Price")],-1)
printHtmlPart(2)
invokeTag('field','g',19,['name':("floorPrice"),'value':(fieldValue(bean: nideshopBrandInstance, field: 'floorPrice')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopBrandInstance, field: 'isNew', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopBrand.isNew.label"),'default':("Is New")],-1)
printHtmlPart(6)
invokeTag('checkBox','g',28,['name':("isNew"),'value':(nideshopBrandInstance?.isNew)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopBrandInstance, field: 'isShow', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("nideshopBrand.isShow.label"),'default':("Is Show")],-1)
printHtmlPart(6)
invokeTag('checkBox','g',37,['name':("isShow"),'value':(nideshopBrandInstance?.isShow)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopBrandInstance, field: 'listPicUrl', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("nideshopBrand.listPicUrl.label"),'default':("List Pic Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("listPicUrl"),'required':(""),'value':(nideshopBrandInstance?.listPicUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopBrandInstance, field: 'name', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("nideshopBrand.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("name"),'required':(""),'value':(nideshopBrandInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopBrandInstance, field: 'newPicUrl', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("nideshopBrand.newPicUrl.label"),'default':("New Pic Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',64,['name':("newPicUrl"),'required':(""),'value':(nideshopBrandInstance?.newPicUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopBrandInstance, field: 'newSortOrder', 'error'))
printHtmlPart(11)
invokeTag('message','g',70,['code':("nideshopBrand.newSortOrder.label"),'default':("New Sort Order")],-1)
printHtmlPart(2)
invokeTag('field','g',73,['name':("newSortOrder"),'type':("number"),'value':(nideshopBrandInstance.newSortOrder),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopBrandInstance, field: 'picUrl', 'error'))
printHtmlPart(12)
invokeTag('message','g',79,['code':("nideshopBrand.picUrl.label"),'default':("Pic Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',82,['name':("picUrl"),'required':(""),'value':(nideshopBrandInstance?.picUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopBrandInstance, field: 'simpleDesc', 'error'))
printHtmlPart(13)
invokeTag('message','g',88,['code':("nideshopBrand.simpleDesc.label"),'default':("Simple Desc")],-1)
printHtmlPart(2)
invokeTag('textField','g',91,['name':("simpleDesc"),'required':(""),'value':(nideshopBrandInstance?.simpleDesc)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopBrandInstance, field: 'sortOrder', 'error'))
printHtmlPart(14)
invokeTag('message','g',97,['code':("nideshopBrand.sortOrder.label"),'default':("Sort Order")],-1)
printHtmlPart(2)
invokeTag('field','g',100,['name':("sortOrder"),'type':("number"),'value':(nideshopBrandInstance.sortOrder),'required':("")],-1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537425558000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
