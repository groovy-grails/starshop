import nideshop.NideshopTopic
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopTopicshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopTopic/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'nideshopTopic.label', default: 'NideshopTopic'))],-1)
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
if(true && (nideshopTopicInstance?.content)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("nideshopTopic.content.label"),'default':("Content")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(nideshopTopicInstance),'field':("content")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopTopicInstance?.avatar)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("nideshopTopic.avatar.label"),'default':("Avatar")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(nideshopTopicInstance),'field':("avatar")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopTopicInstance?.isShow)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("nideshopTopic.isShow.label"),'default':("Is Show")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(nideshopTopicInstance),'field':("isShow")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopTopicInstance?.itemPicUrl)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("nideshopTopic.itemPicUrl.label"),'default':("Item Pic Url")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(nideshopTopicInstance),'field':("itemPicUrl")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopTopicInstance?.priceInfo)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("nideshopTopic.priceInfo.label"),'default':("Price Info")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(nideshopTopicInstance),'field':("priceInfo")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopTopicInstance?.readCount)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("nideshopTopic.readCount.label"),'default':("Read Count")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(nideshopTopicInstance),'field':("readCount")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopTopicInstance?.scenePicUrl)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("nideshopTopic.scenePicUrl.label"),'default':("Scene Pic Url")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(nideshopTopicInstance),'field':("scenePicUrl")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopTopicInstance?.sortOrder)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("nideshopTopic.sortOrder.label"),'default':("Sort Order")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(nideshopTopicInstance),'field':("sortOrder")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopTopicInstance?.subtitle)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("nideshopTopic.subtitle.label"),'default':("Subtitle")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(nideshopTopicInstance),'field':("subtitle")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopTopicInstance?.title)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("nideshopTopic.title.label"),'default':("Title")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',111,['bean':(nideshopTopicInstance),'field':("title")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopTopicInstance?.topicCategoryId)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("nideshopTopic.topicCategoryId.label"),'default':("Topic Category Id")],-1)
printHtmlPart(37)
createTagBody(3, {->
expressionOut.print(nideshopTopicInstance?.topicCategoryId?.encodeAsHTML())
})
invokeTag('link','g',120,['controller':("nideshopTopicCategory"),'action':("show"),'id':(nideshopTopicInstance?.topicCategoryId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopTopicInstance?.topicTagId)) {
printHtmlPart(38)
invokeTag('message','g',127,['code':("nideshopTopic.topicTagId.label"),'default':("Topic Tag Id")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',129,['bean':(nideshopTopicInstance),'field':("topicTagId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopTopicInstance?.topicTemplateId)) {
printHtmlPart(40)
invokeTag('message','g',136,['code':("nideshopTopic.topicTemplateId.label"),'default':("Topic Template Id")],-1)
printHtmlPart(41)
invokeTag('fieldValue','g',138,['bean':(nideshopTopicInstance),'field':("topicTemplateId")],-1)
printHtmlPart(16)
}
printHtmlPart(42)
createTagBody(2, {->
printHtmlPart(43)
createTagBody(3, {->
invokeTag('message','g',146,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',146,['class':("edit"),'action':("edit"),'resource':(nideshopTopicInstance)],3)
printHtmlPart(44)
invokeTag('actionSubmit','g',147,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(45)
})
invokeTag('form','g',149,['url':([resource:nideshopTopicInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(46)
})
invokeTag('captureBody','sitemesh',151,[:],1)
printHtmlPart(47)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537372837000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
