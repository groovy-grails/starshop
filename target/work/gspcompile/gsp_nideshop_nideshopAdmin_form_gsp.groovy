import nideshop.NideshopAdmin
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopAdmin_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopAdmin/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopAdminInstance, field: 'username', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopAdmin.username.label"),'default':("Username")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("username"),'maxlength':("10"),'required':(""),'value':(nideshopAdminInstance?.username)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdminInstance, field: 'lastLoginIp', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopAdmin.lastLoginIp.label"),'default':("Last Login Ip")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("lastLoginIp"),'maxlength':("60"),'required':(""),'value':(nideshopAdminInstance?.lastLoginIp)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdminInstance, field: 'addTime', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopAdmin.addTime.label"),'default':("Add Time")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['name':("addTime"),'type':("number"),'value':(nideshopAdminInstance.addTime),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdminInstance, field: 'adminRoleId', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopAdmin.adminRoleId.label"),'default':("Admin Role Id")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['name':("adminRoleId"),'type':("number"),'value':(nideshopAdminInstance.adminRoleId),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdminInstance, field: 'avatar', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("nideshopAdmin.avatar.label"),'default':("Avatar")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("avatar"),'required':(""),'value':(nideshopAdminInstance?.avatar)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdminInstance, field: 'lastLoginTime', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("nideshopAdmin.lastLoginTime.label"),'default':("Last Login Time")],-1)
printHtmlPart(2)
invokeTag('field','g',55,['name':("lastLoginTime"),'type':("number"),'value':(nideshopAdminInstance.lastLoginTime),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdminInstance, field: 'password', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("nideshopAdmin.password.label"),'default':("Password")],-1)
printHtmlPart(2)
invokeTag('textField','g',64,['name':("password"),'required':(""),'value':(nideshopAdminInstance?.password)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdminInstance, field: 'passwordSalt', 'error'))
printHtmlPart(10)
invokeTag('message','g',70,['code':("nideshopAdmin.passwordSalt.label"),'default':("Password Salt")],-1)
printHtmlPart(2)
invokeTag('textField','g',73,['name':("passwordSalt"),'required':(""),'value':(nideshopAdminInstance?.passwordSalt)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdminInstance, field: 'updateTime', 'error'))
printHtmlPart(11)
invokeTag('message','g',79,['code':("nideshopAdmin.updateTime.label"),'default':("Update Time")],-1)
printHtmlPart(2)
invokeTag('field','g',82,['name':("updateTime"),'type':("number"),'value':(nideshopAdminInstance.updateTime),'required':("")],-1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537152195000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
