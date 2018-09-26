import nideshop.NideshopAttribute
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopAttributeindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopAttribute/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'nideshopAttribute.label', default: 'NideshopAttribute'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("name"),'title':(message(code: 'nideshopAttribute.name.label', default: 'Name'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("values"),'title':(message(code: 'nideshopAttribute.values.label', default: 'Values'))],-1)
printHtmlPart(14)
invokeTag('message','g',31,['code':("nideshopAttribute.attributeCategoryId.label"),'default':("Attribute Category Id")],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',33,['property':("inputType"),'title':(message(code: 'nideshopAttribute.inputType.label', default: 'Input Type'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',35,['property':("sortOrder"),'title':(message(code: 'nideshopAttribute.sortOrder.label', default: 'Sort Order'))],-1)
printHtmlPart(16)
loop:{
int i = 0
for( nideshopAttributeInstance in (nideshopAttributeInstanceList) ) {
printHtmlPart(17)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(18)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: nideshopAttributeInstance, field: "name"))
})
invokeTag('link','g',43,['action':("show"),'id':(nideshopAttributeInstance.id)],3)
printHtmlPart(19)
expressionOut.print(fieldValue(bean: nideshopAttributeInstance, field: "values"))
printHtmlPart(19)
expressionOut.print(fieldValue(bean: nideshopAttributeInstance, field: "attributeCategoryId"))
printHtmlPart(19)
invokeTag('formatBoolean','g',49,['boolean':(nideshopAttributeInstance.inputType)],-1)
printHtmlPart(19)
expressionOut.print(fieldValue(bean: nideshopAttributeInstance, field: "sortOrder"))
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
invokeTag('paginate','g',58,['total':(nideshopAttributeInstanceCount ?: 0)],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',61,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537796041431L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
