import nideshop.Permission
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_permission_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/permission/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: permissionInstance, field: 'permission', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("permission.permission.label"),'default':("Permission")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("permission"),'required':(""),'value':(permissionInstance?.permission)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: permissionInstance, field: 'user', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("permission.user.label"),'default':("User")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['id':("user"),'name':("user.id"),'from':(nideshop.SysUser.list()),'optionKey':("id"),'required':(""),'value':(permissionInstance?.user?.id),'class':("many-to-one")],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537177421000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
