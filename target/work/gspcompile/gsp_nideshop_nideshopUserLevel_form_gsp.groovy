import nideshop.NideshopUserLevel
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopUserLevel_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopUserLevel/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopUserLevelInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopUserLevel.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'maxlength':("30"),'required':(""),'value':(nideshopUserLevelInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserLevelInstance, field: 'description', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopUserLevel.description.label"),'default':("Description")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("description"),'required':(""),'value':(nideshopUserLevelInstance?.description)],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537152691000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
