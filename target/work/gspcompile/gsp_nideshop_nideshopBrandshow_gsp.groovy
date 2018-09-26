import nideshop.NideshopBrand
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopBrandshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopBrand/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'nideshopBrand.label', default: 'NideshopBrand'))],-1)
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
if(true && (nideshopBrandInstance?.appListPicUrl)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("nideshopBrand.appListPicUrl.label"),'default':("App List Pic Url")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(nideshopBrandInstance),'field':("appListPicUrl")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopBrandInstance?.floorPrice)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("nideshopBrand.floorPrice.label"),'default':("Floor Price")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(nideshopBrandInstance),'field':("floorPrice")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopBrandInstance?.isNew)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("nideshopBrand.isNew.label"),'default':("Is New")],-1)
printHtmlPart(21)
invokeTag('formatBoolean','g',48,['boolean':(nideshopBrandInstance?.isNew)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopBrandInstance?.isShow)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("nideshopBrand.isShow.label"),'default':("Is Show")],-1)
printHtmlPart(23)
invokeTag('formatBoolean','g',57,['boolean':(nideshopBrandInstance?.isShow)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopBrandInstance?.listPicUrl)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("nideshopBrand.listPicUrl.label"),'default':("List Pic Url")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(nideshopBrandInstance),'field':("listPicUrl")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopBrandInstance?.name)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("nideshopBrand.name.label"),'default':("Name")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(nideshopBrandInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopBrandInstance?.newPicUrl)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("nideshopBrand.newPicUrl.label"),'default':("New Pic Url")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(nideshopBrandInstance),'field':("newPicUrl")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopBrandInstance?.newSortOrder)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("nideshopBrand.newSortOrder.label"),'default':("New Sort Order")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(nideshopBrandInstance),'field':("newSortOrder")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopBrandInstance?.picUrl)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("nideshopBrand.picUrl.label"),'default':("Pic Url")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(nideshopBrandInstance),'field':("picUrl")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopBrandInstance?.simpleDesc)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("nideshopBrand.simpleDesc.label"),'default':("Simple Desc")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',111,['bean':(nideshopBrandInstance),'field':("simpleDesc")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopBrandInstance?.sortOrder)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("nideshopBrand.sortOrder.label"),'default':("Sort Order")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',120,['bean':(nideshopBrandInstance),'field':("sortOrder")],-1)
printHtmlPart(16)
}
printHtmlPart(38)
createTagBody(2, {->
printHtmlPart(39)
createTagBody(3, {->
invokeTag('message','g',128,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',128,['class':("edit"),'action':("edit"),'resource':(nideshopBrandInstance)],3)
printHtmlPart(40)
invokeTag('actionSubmit','g',129,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(41)
})
invokeTag('form','g',131,['url':([resource:nideshopBrandInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(42)
})
invokeTag('captureBody','sitemesh',133,[:],1)
printHtmlPart(43)
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
