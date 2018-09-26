import nideshop.NideshopGoodsIssue
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopGoodsIssue_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopGoodsIssue/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopGoodsIssueInstance, field: 'goodsId', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopGoodsIssue.goodsId.label"),'default':("Goods Id")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("goodsId"),'name':("goodsId.id"),'from':(nideshop.NideshopGoods.list()),'optionKey':("id"),'value':(nideshopGoodsIssueInstance?.goodsId?.id),'class':("many-to-one"),'noSelection':(['null': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopGoodsIssueInstance, field: 'question', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopGoodsIssue.question.label"),'default':("Question")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("question"),'value':(nideshopGoodsIssueInstance?.question)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopGoodsIssueInstance, field: 'answer', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopGoodsIssue.answer.label"),'default':("Answer")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("answer"),'maxlength':("45"),'value':(nideshopGoodsIssueInstance?.answer)],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537152450000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
