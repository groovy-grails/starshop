import nideshop.NideshopCoupon
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopCoupon_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopCoupon/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopCouponInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopCoupon.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'maxlength':("60"),'required':(""),'value':(nideshopCouponInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCouponInstance, field: 'maxAmount', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopCoupon.maxAmount.label"),'default':("Max Amount")],-1)
printHtmlPart(2)
invokeTag('field','g',19,['name':("maxAmount"),'value':(fieldValue(bean: nideshopCouponInstance, field: 'maxAmount')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCouponInstance, field: 'minAmount', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopCoupon.minAmount.label"),'default':("Min Amount")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['name':("minAmount"),'value':(fieldValue(bean: nideshopCouponInstance, field: 'minAmount')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCouponInstance, field: 'minGoodsAmount', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopCoupon.minGoodsAmount.label"),'default':("Min Goods Amount")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['name':("minGoodsAmount"),'value':(fieldValue(bean: nideshopCouponInstance, field: 'minGoodsAmount')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCouponInstance, field: 'sendEndDate', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("nideshopCoupon.sendEndDate.label"),'default':("Send End Date")],-1)
printHtmlPart(2)
invokeTag('field','g',46,['name':("sendEndDate"),'type':("number"),'value':(nideshopCouponInstance.sendEndDate),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCouponInstance, field: 'sendStartDate', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("nideshopCoupon.sendStartDate.label"),'default':("Send Start Date")],-1)
printHtmlPart(2)
invokeTag('field','g',55,['name':("sendStartDate"),'type':("number"),'value':(nideshopCouponInstance.sendStartDate),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCouponInstance, field: 'sendType', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("nideshopCoupon.sendType.label"),'default':("Send Type")],-1)
printHtmlPart(2)
invokeTag('field','g',64,['name':("sendType"),'type':("number"),'value':(nideshopCouponInstance.sendType),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCouponInstance, field: 'typeMoney', 'error'))
printHtmlPart(10)
invokeTag('message','g',70,['code':("nideshopCoupon.typeMoney.label"),'default':("Type Money")],-1)
printHtmlPart(2)
invokeTag('field','g',73,['name':("typeMoney"),'value':(fieldValue(bean: nideshopCouponInstance, field: 'typeMoney')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCouponInstance, field: 'useEndDate', 'error'))
printHtmlPart(11)
invokeTag('message','g',79,['code':("nideshopCoupon.useEndDate.label"),'default':("Use End Date")],-1)
printHtmlPart(2)
invokeTag('field','g',82,['name':("useEndDate"),'type':("number"),'value':(nideshopCouponInstance.useEndDate),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCouponInstance, field: 'useStartDate', 'error'))
printHtmlPart(12)
invokeTag('message','g',88,['code':("nideshopCoupon.useStartDate.label"),'default':("Use Start Date")],-1)
printHtmlPart(2)
invokeTag('field','g',91,['name':("useStartDate"),'type':("number"),'value':(nideshopCouponInstance.useStartDate),'required':("")],-1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537520153000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
