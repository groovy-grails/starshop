import nideshop.NideshopComment
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopComment_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopComment/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopCommentInstance, field: 'content', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopComment.content.label"),'default':("Content")],-1)
printHtmlPart(2)
invokeTag('textArea','g',10,['name':("content"),'cols':("40"),'rows':("5"),'maxlength':("8000"),'required':(""),'value':(nideshopCommentInstance?.content)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCommentInstance, field: 'newContent', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopComment.newContent.label"),'default':("New Content")],-1)
printHtmlPart(2)
invokeTag('textArea','g',19,['name':("newContent"),'cols':("40"),'rows':("5"),'maxlength':("8000"),'required':(""),'value':(nideshopCommentInstance?.newContent)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCommentInstance, field: 'addTime', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopComment.addTime.label"),'default':("Add Time")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['name':("addTime"),'type':("number"),'value':(nideshopCommentInstance.addTime),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCommentInstance, field: 'status', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopComment.status.label"),'default':("Status")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['name':("status"),'type':("number"),'value':(nideshopCommentInstance.status),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCommentInstance, field: 'typeId', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("nideshopComment.typeId.label"),'default':("Type Id")],-1)
printHtmlPart(2)
invokeTag('field','g',46,['name':("typeId"),'type':("number"),'value':(nideshopCommentInstance.typeId),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCommentInstance, field: 'userId', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("nideshopComment.userId.label"),'default':("User Id")],-1)
printHtmlPart(2)
invokeTag('select','g',55,['id':("userId"),'name':("userId.id"),'from':(nideshop.NideshopUser.list()),'optionKey':("id"),'required':(""),'value':(nideshopCommentInstance?.userId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCommentInstance, field: 'valueId', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("nideshopComment.valueId.label"),'default':("Value Id")],-1)
printHtmlPart(2)
invokeTag('select','g',64,['id':("valueId"),'name':("valueId.id"),'from':(nideshop.NideshopGoods.list()),'optionKey':("id"),'required':(""),'value':(nideshopCommentInstance?.valueId?.id),'class':("many-to-one")],-1)
printHtmlPart(10)
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
