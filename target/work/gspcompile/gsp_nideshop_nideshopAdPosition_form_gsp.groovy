import nideshop.NideshopAdPosition
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopAdPosition_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopAdPosition/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopAdPositionInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopAdPosition.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'maxlength':("60"),'required':(""),'value':(nideshopAdPositionInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdPositionInstance, field: 'desc', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopAdPosition.desc.label"),'default':("Desc")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("desc"),'required':(""),'value':(nideshopAdPositionInstance?.desc)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdPositionInstance, field: 'height', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopAdPosition.height.label"),'default':("Height")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['name':("height"),'type':("number"),'value':(nideshopAdPositionInstance.height),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdPositionInstance, field: 'width', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopAdPosition.width.label"),'default':("Width")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['name':("width"),'type':("number"),'value':(nideshopAdPositionInstance.width),'required':("")],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537152208000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
