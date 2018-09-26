import nideshop.NideshopUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopUser_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopUser/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopUserInstance, field: 'username', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopUser.username.label"),'default':("Username")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("username"),'maxlength':("60"),'required':(""),'value':(nideshopUserInstance?.username)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserInstance, field: 'password', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopUser.password.label"),'default':("Password")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("password"),'maxlength':("32"),'required':(""),'value':(nideshopUserInstance?.password)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserInstance, field: 'lastLoginIp', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopUser.lastLoginIp.label"),'default':("Last Login Ip")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("lastLoginIp"),'maxlength':("15"),'required':(""),'value':(nideshopUserInstance?.lastLoginIp)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserInstance, field: 'nickname', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopUser.nickname.label"),'default':("Nickname")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("nickname"),'maxlength':("60"),'required':(""),'value':(nideshopUserInstance?.nickname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserInstance, field: 'mobile', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("nideshopUser.mobile.label"),'default':("Mobile")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("mobile"),'maxlength':("20"),'required':(""),'value':(nideshopUserInstance?.mobile)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserInstance, field: 'registerIp', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("nideshopUser.registerIp.label"),'default':("Register Ip")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("registerIp"),'maxlength':("45"),'required':(""),'value':(nideshopUserInstance?.registerIp)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserInstance, field: 'weixinOpenid', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("nideshopUser.weixinOpenid.label"),'default':("Weixin Openid")],-1)
printHtmlPart(2)
invokeTag('textField','g',64,['name':("weixinOpenid"),'maxlength':("50"),'required':(""),'value':(nideshopUserInstance?.weixinOpenid)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserInstance, field: 'avatar', 'error'))
printHtmlPart(10)
invokeTag('message','g',70,['code':("nideshopUser.avatar.label"),'default':("Avatar")],-1)
printHtmlPart(2)
invokeTag('textField','g',73,['name':("avatar"),'required':(""),'value':(nideshopUserInstance?.avatar)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserInstance, field: 'birthday', 'error'))
printHtmlPart(11)
invokeTag('message','g',79,['code':("nideshopUser.birthday.label"),'default':("Birthday")],-1)
printHtmlPart(2)
invokeTag('field','g',82,['name':("birthday"),'type':("number"),'value':(nideshopUserInstance.birthday),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserInstance, field: 'gender', 'error'))
printHtmlPart(12)
invokeTag('message','g',88,['code':("nideshopUser.gender.label"),'default':("Gender")],-1)
printHtmlPart(2)
invokeTag('field','g',91,['name':("gender"),'type':("number"),'value':(nideshopUserInstance.gender),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserInstance, field: 'lastLoginTime', 'error'))
printHtmlPart(13)
invokeTag('message','g',97,['code':("nideshopUser.lastLoginTime.label"),'default':("Last Login Time")],-1)
printHtmlPart(2)
invokeTag('field','g',100,['name':("lastLoginTime"),'type':("number"),'value':(nideshopUserInstance.lastLoginTime),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserInstance, field: 'registerTime', 'error'))
printHtmlPart(14)
invokeTag('message','g',106,['code':("nideshopUser.registerTime.label"),'default':("Register Time")],-1)
printHtmlPart(2)
invokeTag('field','g',109,['name':("registerTime"),'type':("number"),'value':(nideshopUserInstance.registerTime),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserInstance, field: 'userLevelId', 'error'))
printHtmlPart(15)
invokeTag('message','g',115,['code':("nideshopUser.userLevelId.label"),'default':("User Level Id")],-1)
printHtmlPart(2)
invokeTag('select','g',118,['id':("userLevelId"),'name':("userLevelId.id"),'from':(nideshop.NideshopUserLevel.list()),'optionKey':("id"),'required':(""),'value':(nideshopUserInstance?.userLevelId?.id),'class':("many-to-one")],-1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537152667000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
