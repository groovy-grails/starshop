import nideshop.NideshopOrderExpress
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopOrderExpressshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopOrderExpress/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'nideshopOrderExpress.label', default: 'NideshopOrderExpress'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (nideshopOrderExpressInstance?.shipperName)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("nideshopOrderExpress.shipperName.label"),'default':("Shipper Name")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(nideshopOrderExpressInstance),'field':("shipperName")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderExpressInstance?.shipperCode)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("nideshopOrderExpress.shipperCode.label"),'default':("Shipper Code")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(nideshopOrderExpressInstance),'field':("shipperCode")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderExpressInstance?.logisticCode)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("nideshopOrderExpress.logisticCode.label"),'default':("Logistic Code")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(nideshopOrderExpressInstance),'field':("logisticCode")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderExpressInstance?.traces)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("nideshopOrderExpress.traces.label"),'default':("Traces")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(nideshopOrderExpressInstance),'field':("traces")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderExpressInstance?.requestCount)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("nideshopOrderExpress.requestCount.label"),'default':("Request Count")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(nideshopOrderExpressInstance),'field':("requestCount")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderExpressInstance?.requestTime)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("nideshopOrderExpress.requestTime.label"),'default':("Request Time")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(nideshopOrderExpressInstance),'field':("requestTime")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderExpressInstance?.addTime)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("nideshopOrderExpress.addTime.label"),'default':("Add Time")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(nideshopOrderExpressInstance),'field':("addTime")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderExpressInstance?.isFinish)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("nideshopOrderExpress.isFinish.label"),'default':("Is Finish")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(nideshopOrderExpressInstance),'field':("isFinish")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderExpressInstance?.orderId)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("nideshopOrderExpress.orderId.label"),'default':("Order Id")],-1)
printHtmlPart(33)
createTagBody(3, {->
expressionOut.print(nideshopOrderExpressInstance?.orderId?.encodeAsHTML())
})
invokeTag('link','g',102,['controller':("nideshopOrder"),'action':("show"),'id':(nideshopOrderExpressInstance?.orderId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderExpressInstance?.shipperId)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("nideshopOrderExpress.shipperId.label"),'default':("Shipper Id")],-1)
printHtmlPart(35)
createTagBody(3, {->
expressionOut.print(nideshopOrderExpressInstance?.shipperId?.encodeAsHTML())
})
invokeTag('link','g',111,['controller':("nideshopShipper"),'action':("show"),'id':(nideshopOrderExpressInstance?.shipperId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderExpressInstance?.updateTime)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("nideshopOrderExpress.updateTime.label"),'default':("Update Time")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',120,['bean':(nideshopOrderExpressInstance),'field':("updateTime")],-1)
printHtmlPart(16)
}
printHtmlPart(38)
createTagBody(2, {->
printHtmlPart(39)
createTagBody(3, {->
invokeTag('message','g',128,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',128,['class':("edit"),'action':("edit"),'resource':(nideshopOrderExpressInstance)],3)
printHtmlPart(40)
invokeTag('actionSubmit','g',129,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(41)
})
invokeTag('form','g',131,['url':([resource:nideshopOrderExpressInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(42)
})
invokeTag('captureBody','sitemesh',133,[:],1)
printHtmlPart(43)
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
