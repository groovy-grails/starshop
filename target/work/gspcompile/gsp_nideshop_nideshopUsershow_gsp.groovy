import nideshop.NideshopUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopUsershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopUser/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'nideshopUser.label', default: 'NideshopUser'))],-1)
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
if(true && (nideshopUserInstance?.username)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("nideshopUser.username.label"),'default':("Username")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(nideshopUserInstance),'field':("username")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopUserInstance?.password)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("nideshopUser.password.label"),'default':("Password")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(nideshopUserInstance),'field':("password")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopUserInstance?.lastLoginIp)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("nideshopUser.lastLoginIp.label"),'default':("Last Login Ip")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(nideshopUserInstance),'field':("lastLoginIp")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopUserInstance?.nickname)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("nideshopUser.nickname.label"),'default':("Nickname")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(nideshopUserInstance),'field':("nickname")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopUserInstance?.mobile)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("nideshopUser.mobile.label"),'default':("Mobile")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(nideshopUserInstance),'field':("mobile")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopUserInstance?.registerIp)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("nideshopUser.registerIp.label"),'default':("Register Ip")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(nideshopUserInstance),'field':("registerIp")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopUserInstance?.weixinOpenid)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("nideshopUser.weixinOpenid.label"),'default':("Weixin Openid")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(nideshopUserInstance),'field':("weixinOpenid")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopUserInstance?.avatar)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("nideshopUser.avatar.label"),'default':("Avatar")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(nideshopUserInstance),'field':("avatar")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopUserInstance?.birthday)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("nideshopUser.birthday.label"),'default':("Birthday")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(nideshopUserInstance),'field':("birthday")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopUserInstance?.gender)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("nideshopUser.gender.label"),'default':("Gender")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',111,['bean':(nideshopUserInstance),'field':("gender")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopUserInstance?.lastLoginTime)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("nideshopUser.lastLoginTime.label"),'default':("Last Login Time")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',120,['bean':(nideshopUserInstance),'field':("lastLoginTime")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopUserInstance?.registerTime)) {
printHtmlPart(38)
invokeTag('message','g',127,['code':("nideshopUser.registerTime.label"),'default':("Register Time")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',129,['bean':(nideshopUserInstance),'field':("registerTime")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopUserInstance?.userLevelId)) {
printHtmlPart(40)
invokeTag('message','g',136,['code':("nideshopUser.userLevelId.label"),'default':("User Level Id")],-1)
printHtmlPart(41)
createTagBody(3, {->
expressionOut.print(nideshopUserInstance?.userLevelId?.encodeAsHTML())
})
invokeTag('link','g',138,['controller':("nideshopUserLevel"),'action':("show"),'id':(nideshopUserInstance?.userLevelId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(42)
createTagBody(2, {->
printHtmlPart(43)
createTagBody(3, {->
invokeTag('message','g',146,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',146,['class':("edit"),'action':("edit"),'resource':(nideshopUserInstance)],3)
printHtmlPart(44)
invokeTag('actionSubmit','g',147,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(45)
})
invokeTag('form','g',149,['url':([resource:nideshopUserInstance, action:'delete']),'method':("DELETE")],2)
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
public static final long LAST_MODIFIED = 1537152667000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
