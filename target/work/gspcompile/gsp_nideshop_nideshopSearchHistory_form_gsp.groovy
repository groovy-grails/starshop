import nideshop.NideshopSearchHistory
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopSearchHistory_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopSearchHistory/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopSearchHistoryInstance, field: 'keyword', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopSearchHistory.keyword.label"),'default':("Keyword")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("keyword"),'maxlength':("50"),'required':(""),'value':(nideshopSearchHistoryInstance?.keyword)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopSearchHistoryInstance, field: 'from', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopSearchHistory.from.label"),'default':("From")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("from"),'maxlength':("45"),'required':(""),'value':(nideshopSearchHistoryInstance?.from)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopSearchHistoryInstance, field: 'userId', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopSearchHistory.userId.label"),'default':("User Id")],-1)
printHtmlPart(6)
invokeTag('textField','g',28,['name':("userId"),'maxlength':("45"),'value':(nideshopSearchHistoryInstance?.userId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopSearchHistoryInstance, field: 'addTime', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("nideshopSearchHistory.addTime.label"),'default':("Add Time")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['name':("addTime"),'type':("number"),'value':(nideshopSearchHistoryInstance.addTime),'required':("")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537152605000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
