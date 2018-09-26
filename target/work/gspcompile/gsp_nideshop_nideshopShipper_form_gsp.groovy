import nideshop.NideshopShipper
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopShipper_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopShipper/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopShipperInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopShipper.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'maxlength':("20"),'required':(""),'value':(nideshopShipperInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopShipperInstance, field: 'code', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopShipper.code.label"),'default':("Code")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("code"),'maxlength':("10"),'required':(""),'value':(nideshopShipperInstance?.code)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopShipperInstance, field: 'sortOrder', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopShipper.sortOrder.label"),'default':("Sort Order")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['name':("sortOrder"),'type':("number"),'value':(nideshopShipperInstance.sortOrder),'required':("")],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537372663000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
