import nideshop.NideshopComment
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopCommentshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopComment/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'nideshopComment.label', default: 'NideshopComment'))],-1)
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
if(true && (nideshopCommentInstance?.content)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("nideshopComment.content.label"),'default':("Content")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(nideshopCommentInstance),'field':("content")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCommentInstance?.newContent)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("nideshopComment.newContent.label"),'default':("New Content")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(nideshopCommentInstance),'field':("newContent")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCommentInstance?.addTime)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("nideshopComment.addTime.label"),'default':("Add Time")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(nideshopCommentInstance),'field':("addTime")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCommentInstance?.status)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("nideshopComment.status.label"),'default':("Status")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(nideshopCommentInstance),'field':("status")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCommentInstance?.typeId)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("nideshopComment.typeId.label"),'default':("Type Id")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(nideshopCommentInstance),'field':("typeId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCommentInstance?.userId)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("nideshopComment.userId.label"),'default':("User Id")],-1)
printHtmlPart(27)
createTagBody(3, {->
expressionOut.print(nideshopCommentInstance?.userId?.encodeAsHTML())
})
invokeTag('link','g',75,['controller':("nideshopUser"),'action':("show"),'id':(nideshopCommentInstance?.userId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCommentInstance?.valueId)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("nideshopComment.valueId.label"),'default':("Value Id")],-1)
printHtmlPart(29)
createTagBody(3, {->
expressionOut.print(nideshopCommentInstance?.valueId?.encodeAsHTML())
})
invokeTag('link','g',84,['controller':("nideshopGoods"),'action':("show"),'id':(nideshopCommentInstance?.valueId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(30)
createTagBody(2, {->
printHtmlPart(31)
createTagBody(3, {->
invokeTag('message','g',92,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',92,['class':("edit"),'action':("edit"),'resource':(nideshopCommentInstance)],3)
printHtmlPart(32)
invokeTag('actionSubmit','g',93,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(33)
})
invokeTag('form','g',95,['url':([resource:nideshopCommentInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',97,[:],1)
printHtmlPart(35)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537372888000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
