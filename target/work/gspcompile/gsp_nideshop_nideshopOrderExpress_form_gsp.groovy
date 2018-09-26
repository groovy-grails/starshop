import nideshop.NideshopOrderExpress
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopOrderExpress_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopOrderExpress/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopOrderExpressInstance, field: 'shipperName', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopOrderExpress.shipperName.label"),'default':("Shipper Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("shipperName"),'maxlength':("120"),'required':(""),'value':(nideshopOrderExpressInstance?.shipperName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderExpressInstance, field: 'shipperCode', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopOrderExpress.shipperCode.label"),'default':("Shipper Code")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("shipperCode"),'maxlength':("60"),'required':(""),'value':(nideshopOrderExpressInstance?.shipperCode)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderExpressInstance, field: 'logisticCode', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopOrderExpress.logisticCode.label"),'default':("Logistic Code")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("logisticCode"),'maxlength':("20"),'required':(""),'value':(nideshopOrderExpressInstance?.logisticCode)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderExpressInstance, field: 'traces', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopOrderExpress.traces.label"),'default':("Traces")],-1)
printHtmlPart(2)
invokeTag('textArea','g',37,['name':("traces"),'cols':("40"),'rows':("5"),'maxlength':("2000"),'required':(""),'value':(nideshopOrderExpressInstance?.traces)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderExpressInstance, field: 'requestCount', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("nideshopOrderExpress.requestCount.label"),'default':("Request Count")],-1)
printHtmlPart(8)
invokeTag('field','g',46,['name':("requestCount"),'type':("number"),'value':(nideshopOrderExpressInstance.requestCount)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderExpressInstance, field: 'requestTime', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("nideshopOrderExpress.requestTime.label"),'default':("Request Time")],-1)
printHtmlPart(8)
invokeTag('field','g',55,['name':("requestTime"),'type':("number"),'value':(nideshopOrderExpressInstance.requestTime)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderExpressInstance, field: 'addTime', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("nideshopOrderExpress.addTime.label"),'default':("Add Time")],-1)
printHtmlPart(2)
invokeTag('field','g',64,['name':("addTime"),'type':("number"),'value':(nideshopOrderExpressInstance.addTime),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderExpressInstance, field: 'isFinish', 'error'))
printHtmlPart(11)
invokeTag('message','g',70,['code':("nideshopOrderExpress.isFinish.label"),'default':("Is Finish")],-1)
printHtmlPart(2)
invokeTag('field','g',73,['name':("isFinish"),'type':("number"),'value':(nideshopOrderExpressInstance.isFinish),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderExpressInstance, field: 'orderId', 'error'))
printHtmlPart(12)
invokeTag('message','g',79,['code':("nideshopOrderExpress.orderId.label"),'default':("Order Id")],-1)
printHtmlPart(2)
invokeTag('select','g',82,['id':("orderId"),'name':("orderId.id"),'from':(nideshop.NideshopOrder.list()),'optionKey':("id"),'required':(""),'value':(nideshopOrderExpressInstance?.orderId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderExpressInstance, field: 'shipperId', 'error'))
printHtmlPart(13)
invokeTag('message','g',88,['code':("nideshopOrderExpress.shipperId.label"),'default':("Shipper Id")],-1)
printHtmlPart(2)
invokeTag('select','g',91,['id':("shipperId"),'name':("shipperId.id"),'from':(nideshop.NideshopShipper.list()),'optionKey':("id"),'required':(""),'value':(nideshopOrderExpressInstance?.shipperId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderExpressInstance, field: 'updateTime', 'error'))
printHtmlPart(14)
invokeTag('message','g',97,['code':("nideshopOrderExpress.updateTime.label"),'default':("Update Time")],-1)
printHtmlPart(2)
invokeTag('field','g',100,['name':("updateTime"),'type':("number"),'value':(nideshopOrderExpressInstance.updateTime),'required':("")],-1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537372785000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
