import nideshop.NideshopAttribute
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopAttribute_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopAttribute/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopAttributeInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopAttribute.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'maxlength':("60"),'required':(""),'value':(nideshopAttributeInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAttributeInstance, field: 'values', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopAttribute.values.label"),'default':("Values")],-1)
printHtmlPart(2)
invokeTag('textArea','g',19,['name':("values"),'cols':("40"),'rows':("5"),'maxlength':("8000"),'required':(""),'value':(nideshopAttributeInstance?.values)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAttributeInstance, field: 'attributeCategoryId', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopAttribute.attributeCategoryId.label"),'default':("Attribute Category Id")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['id':("attributeCategoryId"),'name':("attributeCategoryId.id"),'from':(nideshop.NideshopAttributeCategory.list()),'optionKey':("id"),'required':(""),'value':(nideshopAttributeInstance?.attributeCategoryId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAttributeInstance, field: 'inputType', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopAttribute.inputType.label"),'default':("Input Type")],-1)
printHtmlPart(7)
invokeTag('checkBox','g',37,['name':("inputType"),'value':(nideshopAttributeInstance?.inputType)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAttributeInstance, field: 'sortOrder', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("nideshopAttribute.sortOrder.label"),'default':("Sort Order")],-1)
printHtmlPart(2)
invokeTag('field','g',46,['name':("sortOrder"),'type':("number"),'value':(nideshopAttributeInstance.sortOrder),'required':("")],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537796041665L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
