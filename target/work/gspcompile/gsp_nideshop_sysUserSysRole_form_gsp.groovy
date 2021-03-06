import nideshop.SysUserSysRole
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_sysUserSysRole_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/sysUserSysRole/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: sysUserSysRoleInstance, field: 'sysRole', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("sysUserSysRole.sysRole.label"),'default':("Sys Role")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("sysRole"),'name':("sysRole.id"),'from':(nideshop.SysRole.list()),'optionKey':("id"),'required':(""),'value':(sysUserSysRoleInstance?.sysRole?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: sysUserSysRoleInstance, field: 'sysUser', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("sysUserSysRole.sysUser.label"),'default':("Sys User")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['id':("sysUser"),'name':("sysUser.id"),'from':(nideshop.SysUser.list()),'optionKey':("id"),'required':(""),'value':(sysUserSysRoleInstance?.sysUser?.id),'class':("many-to-one")],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537177450000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
