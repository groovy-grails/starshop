import nideshop.SysUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_sysUser_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/sysUser/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: sysUserInstance, field: 'username', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("sysUser.username.label"),'default':("Username")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("username"),'required':(""),'value':(sysUserInstance?.username)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: sysUserInstance, field: 'password', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("sysUser.password.label"),'default':("Password")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("password"),'required':(""),'value':(sysUserInstance?.password)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: sysUserInstance, field: 'accountExpired', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("sysUser.accountExpired.label"),'default':("Account Expired")],-1)
printHtmlPart(6)
invokeTag('checkBox','g',28,['name':("accountExpired"),'value':(sysUserInstance?.accountExpired)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: sysUserInstance, field: 'accountLocked', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("sysUser.accountLocked.label"),'default':("Account Locked")],-1)
printHtmlPart(6)
invokeTag('checkBox','g',37,['name':("accountLocked"),'value':(sysUserInstance?.accountLocked)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: sysUserInstance, field: 'enabled', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("sysUser.enabled.label"),'default':("Enabled")],-1)
printHtmlPart(6)
invokeTag('checkBox','g',46,['name':("enabled"),'value':(sysUserInstance?.enabled)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: sysUserInstance, field: 'passwordExpired', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("sysUser.passwordExpired.label"),'default':("Password Expired")],-1)
printHtmlPart(6)
invokeTag('checkBox','g',55,['name':("passwordExpired"),'value':(sysUserInstance?.passwordExpired)],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537177440000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
