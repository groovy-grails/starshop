import nideshop.NideshopAdmin
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopAdminshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopAdmin/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'nideshopAdmin.label', default: 'NideshopAdmin'))],-1)
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
if(true && (nideshopAdminInstance?.username)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("nideshopAdmin.username.label"),'default':("Username")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(nideshopAdminInstance),'field':("username")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopAdminInstance?.lastLoginIp)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("nideshopAdmin.lastLoginIp.label"),'default':("Last Login Ip")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(nideshopAdminInstance),'field':("lastLoginIp")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopAdminInstance?.addTime)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("nideshopAdmin.addTime.label"),'default':("Add Time")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(nideshopAdminInstance),'field':("addTime")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopAdminInstance?.adminRoleId)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("nideshopAdmin.adminRoleId.label"),'default':("Admin Role Id")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(nideshopAdminInstance),'field':("adminRoleId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopAdminInstance?.avatar)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("nideshopAdmin.avatar.label"),'default':("Avatar")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(nideshopAdminInstance),'field':("avatar")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopAdminInstance?.lastLoginTime)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("nideshopAdmin.lastLoginTime.label"),'default':("Last Login Time")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(nideshopAdminInstance),'field':("lastLoginTime")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopAdminInstance?.password)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("nideshopAdmin.password.label"),'default':("Password")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(nideshopAdminInstance),'field':("password")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopAdminInstance?.passwordSalt)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("nideshopAdmin.passwordSalt.label"),'default':("Password Salt")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(nideshopAdminInstance),'field':("passwordSalt")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopAdminInstance?.updateTime)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("nideshopAdmin.updateTime.label"),'default':("Update Time")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(nideshopAdminInstance),'field':("updateTime")],-1)
printHtmlPart(16)
}
printHtmlPart(34)
createTagBody(2, {->
printHtmlPart(35)
createTagBody(3, {->
invokeTag('message','g',110,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',110,['class':("edit"),'action':("edit"),'resource':(nideshopAdminInstance)],3)
printHtmlPart(36)
invokeTag('actionSubmit','g',111,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(37)
})
invokeTag('form','g',113,['url':([resource:nideshopAdminInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(38)
})
invokeTag('captureBody','sitemesh',115,[:],1)
printHtmlPart(39)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537152194000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
