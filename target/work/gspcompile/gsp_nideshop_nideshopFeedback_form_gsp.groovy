import nideshop.NideshopFeedback
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopFeedback_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopFeedback/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopFeedbackInstance, field: 'userName', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopFeedback.userName.label"),'default':("User Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("userName"),'maxlength':("60"),'required':(""),'value':(nideshopFeedbackInstance?.userName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopFeedbackInstance, field: 'userEmail', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopFeedback.userEmail.label"),'default':("User Email")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("userEmail"),'maxlength':("60"),'required':(""),'value':(nideshopFeedbackInstance?.userEmail)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopFeedbackInstance, field: 'msgTitle', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopFeedback.msgTitle.label"),'default':("Msg Title")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("msgTitle"),'maxlength':("200"),'required':(""),'value':(nideshopFeedbackInstance?.msgTitle)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopFeedbackInstance, field: 'msgContent', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopFeedback.msgContent.label"),'default':("Msg Content")],-1)
printHtmlPart(2)
invokeTag('textArea','g',37,['name':("msgContent"),'cols':("40"),'rows':("5"),'maxlength':("8000"),'required':(""),'value':(nideshopFeedbackInstance?.msgContent)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopFeedbackInstance, field: 'parentId', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("nideshopFeedback.parentId.label"),'default':("Parent Id")],-1)
printHtmlPart(8)
invokeTag('select','g',46,['id':("parentId"),'name':("parentId.id"),'from':(nideshop.NideshopFeedback.list()),'optionKey':("id"),'value':(nideshopFeedbackInstance?.parentId?.id),'class':("many-to-one"),'noSelection':(['null': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopFeedbackInstance, field: 'messageImg', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("nideshopFeedback.messageImg.label"),'default':("Message Img")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("messageImg"),'required':(""),'value':(nideshopFeedbackInstance?.messageImg)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopFeedbackInstance, field: 'msgArea', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("nideshopFeedback.msgArea.label"),'default':("Msg Area")],-1)
printHtmlPart(2)
invokeTag('field','g',64,['name':("msgArea"),'type':("number"),'value':(nideshopFeedbackInstance.msgArea),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopFeedbackInstance, field: 'msgStatus', 'error'))
printHtmlPart(11)
invokeTag('message','g',70,['code':("nideshopFeedback.msgStatus.label"),'default':("Msg Status")],-1)
printHtmlPart(2)
invokeTag('field','g',73,['name':("msgStatus"),'type':("number"),'value':(nideshopFeedbackInstance.msgStatus),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopFeedbackInstance, field: 'msgTime', 'error'))
printHtmlPart(12)
invokeTag('message','g',79,['code':("nideshopFeedback.msgTime.label"),'default':("Msg Time")],-1)
printHtmlPart(2)
invokeTag('field','g',82,['name':("msgTime"),'type':("number"),'value':(nideshopFeedbackInstance.msgTime),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopFeedbackInstance, field: 'msgType', 'error'))
printHtmlPart(13)
invokeTag('message','g',88,['code':("nideshopFeedback.msgType.label"),'default':("Msg Type")],-1)
printHtmlPart(2)
invokeTag('field','g',91,['name':("msgType"),'type':("number"),'value':(nideshopFeedbackInstance.msgType),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopFeedbackInstance, field: 'orderId', 'error'))
printHtmlPart(14)
invokeTag('message','g',97,['code':("nideshopFeedback.orderId.label"),'default':("Order Id")],-1)
printHtmlPart(2)
invokeTag('select','g',100,['id':("orderId"),'name':("orderId.id"),'from':(nideshop.NideshopOrder.list()),'optionKey':("id"),'required':(""),'value':(nideshopFeedbackInstance?.orderId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopFeedbackInstance, field: 'userId', 'error'))
printHtmlPart(15)
invokeTag('message','g',106,['code':("nideshopFeedback.userId.label"),'default':("User Id")],-1)
printHtmlPart(2)
invokeTag('select','g',109,['id':("userId"),'name':("userId.id"),'from':(nideshop.NideshopUser.list()),'optionKey':("id"),'required':(""),'value':(nideshopFeedbackInstance?.userId?.id),'class':("many-to-one")],-1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537421795000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
