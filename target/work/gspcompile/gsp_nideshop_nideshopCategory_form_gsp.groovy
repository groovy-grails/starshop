import nideshop.NideshopCategory
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopCategory_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopCategory/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopCategoryInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopCategory.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'maxlength':("90"),'required':(""),'value':(nideshopCategoryInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCategoryInstance, field: 'parentId', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopCategory.parentId.label"),'default':("Parent Id")],-1)
printHtmlPart(5)
invokeTag('select','g',19,['id':("parentId"),'name':("parentId.id"),'from':(nideshop.NideshopCategory.list()),'optionKey':("id"),'value':(nideshopCategoryInstance?.parentId?.id),'class':("many-to-one"),'noSelection':(['null': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCategoryInstance, field: 'level', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("nideshopCategory.level.label"),'default':("Level")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['name':("level"),'from':(nideshopCategoryInstance.constraints.level.inList),'required':(""),'value':(nideshopCategoryInstance?.level),'valueMessagePrefix':("nideshopCategory.level")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCategoryInstance, field: 'bannerUrl', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("nideshopCategory.bannerUrl.label"),'default':("Banner Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("bannerUrl"),'required':(""),'value':(nideshopCategoryInstance?.bannerUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCategoryInstance, field: 'frontDesc', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("nideshopCategory.frontDesc.label"),'default':("Front Desc")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("frontDesc"),'required':(""),'value':(nideshopCategoryInstance?.frontDesc)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCategoryInstance, field: 'frontName', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("nideshopCategory.frontName.label"),'default':("Front Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("frontName"),'required':(""),'value':(nideshopCategoryInstance?.frontName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCategoryInstance, field: 'iconUrl', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("nideshopCategory.iconUrl.label"),'default':("Icon Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',64,['name':("iconUrl"),'required':(""),'value':(nideshopCategoryInstance?.iconUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCategoryInstance, field: 'imgUrl', 'error'))
printHtmlPart(11)
invokeTag('message','g',70,['code':("nideshopCategory.imgUrl.label"),'default':("Img Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',73,['name':("imgUrl"),'required':(""),'value':(nideshopCategoryInstance?.imgUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCategoryInstance, field: 'isShow', 'error'))
printHtmlPart(12)
invokeTag('message','g',79,['code':("nideshopCategory.isShow.label"),'default':("Is Show")],-1)
printHtmlPart(2)
invokeTag('field','g',82,['name':("isShow"),'type':("number"),'value':(nideshopCategoryInstance.isShow),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCategoryInstance, field: 'keywords', 'error'))
printHtmlPart(13)
invokeTag('message','g',88,['code':("nideshopCategory.keywords.label"),'default':("Keywords")],-1)
printHtmlPart(2)
invokeTag('textField','g',91,['name':("keywords"),'required':(""),'value':(nideshopCategoryInstance?.keywords)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCategoryInstance, field: 'showIndex', 'error'))
printHtmlPart(14)
invokeTag('message','g',97,['code':("nideshopCategory.showIndex.label"),'default':("Show Index")],-1)
printHtmlPart(2)
invokeTag('field','g',100,['name':("showIndex"),'type':("number"),'value':(nideshopCategoryInstance.showIndex),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCategoryInstance, field: 'sortOrder', 'error'))
printHtmlPart(15)
invokeTag('message','g',106,['code':("nideshopCategory.sortOrder.label"),'default':("Sort Order")],-1)
printHtmlPart(2)
invokeTag('field','g',109,['name':("sortOrder"),'type':("number"),'value':(nideshopCategoryInstance.sortOrder),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCategoryInstance, field: 'type', 'error'))
printHtmlPart(16)
invokeTag('message','g',115,['code':("nideshopCategory.type.label"),'default':("Type")],-1)
printHtmlPart(2)
invokeTag('field','g',118,['name':("type"),'type':("number"),'value':(nideshopCategoryInstance.type),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCategoryInstance, field: 'wapBannerUrl', 'error'))
printHtmlPart(17)
invokeTag('message','g',124,['code':("nideshopCategory.wapBannerUrl.label"),'default':("Wap Banner Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',127,['name':("wapBannerUrl"),'required':(""),'value':(nideshopCategoryInstance?.wapBannerUrl)],-1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537372580000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
