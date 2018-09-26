import nideshop.NideshopCategory
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopCategoryshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopCategory/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'nideshopCategory.label', default: 'NideshopCategory'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (nideshopCategoryInstance?.name)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("nideshopCategory.name.label"),'default':("Name")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(nideshopCategoryInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCategoryInstance?.parentId)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("nideshopCategory.parentId.label"),'default':("Parent Id")],-1)
printHtmlPart(19)
createTagBody(3, {->
expressionOut.print(nideshopCategoryInstance?.parentId?.encodeAsHTML())
})
invokeTag('link','g',39,['controller':("nideshopCategory"),'action':("show"),'id':(nideshopCategoryInstance?.parentId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCategoryInstance?.level)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("nideshopCategory.level.label"),'default':("Level")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(nideshopCategoryInstance),'field':("level")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCategoryInstance?.bannerUrl)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("nideshopCategory.bannerUrl.label"),'default':("Banner Url")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(nideshopCategoryInstance),'field':("bannerUrl")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCategoryInstance?.frontDesc)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("nideshopCategory.frontDesc.label"),'default':("Front Desc")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(nideshopCategoryInstance),'field':("frontDesc")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCategoryInstance?.frontName)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("nideshopCategory.frontName.label"),'default':("Front Name")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(nideshopCategoryInstance),'field':("frontName")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCategoryInstance?.iconUrl)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("nideshopCategory.iconUrl.label"),'default':("Icon Url")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(nideshopCategoryInstance),'field':("iconUrl")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCategoryInstance?.imgUrl)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("nideshopCategory.imgUrl.label"),'default':("Img Url")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(nideshopCategoryInstance),'field':("imgUrl")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCategoryInstance?.isShow)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("nideshopCategory.isShow.label"),'default':("Is Show")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(nideshopCategoryInstance),'field':("isShow")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCategoryInstance?.keywords)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("nideshopCategory.keywords.label"),'default':("Keywords")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',111,['bean':(nideshopCategoryInstance),'field':("keywords")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCategoryInstance?.showIndex)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("nideshopCategory.showIndex.label"),'default':("Show Index")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',120,['bean':(nideshopCategoryInstance),'field':("showIndex")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCategoryInstance?.sortOrder)) {
printHtmlPart(38)
invokeTag('message','g',127,['code':("nideshopCategory.sortOrder.label"),'default':("Sort Order")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',129,['bean':(nideshopCategoryInstance),'field':("sortOrder")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCategoryInstance?.type)) {
printHtmlPart(40)
invokeTag('message','g',136,['code':("nideshopCategory.type.label"),'default':("Type")],-1)
printHtmlPart(41)
invokeTag('fieldValue','g',138,['bean':(nideshopCategoryInstance),'field':("type")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCategoryInstance?.wapBannerUrl)) {
printHtmlPart(42)
invokeTag('message','g',145,['code':("nideshopCategory.wapBannerUrl.label"),'default':("Wap Banner Url")],-1)
printHtmlPart(43)
invokeTag('fieldValue','g',147,['bean':(nideshopCategoryInstance),'field':("wapBannerUrl")],-1)
printHtmlPart(16)
}
printHtmlPart(44)
createTagBody(2, {->
printHtmlPart(45)
createTagBody(3, {->
invokeTag('message','g',155,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',155,['class':("edit"),'action':("edit"),'resource':(nideshopCategoryInstance)],3)
printHtmlPart(46)
invokeTag('actionSubmit','g',156,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(47)
})
invokeTag('form','g',158,['url':([resource:nideshopCategoryInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(48)
})
invokeTag('captureBody','sitemesh',160,[:],1)
printHtmlPart(49)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537372579000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
