import nideshop.NideshopKeywords
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopKeywords_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopKeywords/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopKeywordsInstance, field: 'keyword', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopKeywords.keyword.label"),'default':("Keyword")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("keyword"),'maxlength':("90"),'required':(""),'value':(nideshopKeywordsInstance?.keyword)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopKeywordsInstance, field: 'isDefault', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopKeywords.isDefault.label"),'default':("Is Default")],-1)
printHtmlPart(2)
invokeTag('field','g',19,['name':("isDefault"),'type':("number"),'value':(nideshopKeywordsInstance.isDefault),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopKeywordsInstance, field: 'isHot', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopKeywords.isHot.label"),'default':("Is Hot")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['name':("isHot"),'type':("number"),'value':(nideshopKeywordsInstance.isHot),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopKeywordsInstance, field: 'isShow', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopKeywords.isShow.label"),'default':("Is Show")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['name':("isShow"),'type':("number"),'value':(nideshopKeywordsInstance.isShow),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopKeywordsInstance, field: 'schemeUrl', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("nideshopKeywords.schemeUrl.label"),'default':("Scheme Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("schemeUrl"),'required':(""),'value':(nideshopKeywordsInstance?.schemeUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopKeywordsInstance, field: 'sortOrder', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("nideshopKeywords.sortOrder.label"),'default':("Sort Order")],-1)
printHtmlPart(2)
invokeTag('field','g',55,['name':("sortOrder"),'type':("number"),'value':(nideshopKeywordsInstance.sortOrder),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopKeywordsInstance, field: 'type', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("nideshopKeywords.type.label"),'default':("Type")],-1)
printHtmlPart(2)
invokeTag('field','g',64,['name':("type"),'type':("number"),'value':(nideshopKeywordsInstance.type),'required':("")],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537372647000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
