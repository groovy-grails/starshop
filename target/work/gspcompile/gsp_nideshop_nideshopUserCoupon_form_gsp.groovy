import nideshop.NideshopUserCoupon
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopUserCoupon_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopUserCoupon/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopUserCouponInstance, field: 'couponNumber', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopUserCoupon.couponNumber.label"),'default':("Coupon Number")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("couponNumber"),'maxlength':("20"),'required':(""),'value':(nideshopUserCouponInstance?.couponNumber)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserCouponInstance, field: 'couponId', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopUserCoupon.couponId.label"),'default':("Coupon Id")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['id':("couponId"),'name':("couponId.id"),'from':(nideshop.NideshopCoupon.list()),'optionKey':("id"),'required':(""),'value':(nideshopUserCouponInstance?.couponId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserCouponInstance, field: 'orderId', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopUserCoupon.orderId.label"),'default':("Order Id")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['id':("orderId"),'name':("orderId.id"),'from':(nideshop.NideshopOrder.list()),'optionKey':("id"),'required':(""),'value':(nideshopUserCouponInstance?.orderId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserCouponInstance, field: 'usedTime', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopUserCoupon.usedTime.label"),'default':("Used Time")],-1)
printHtmlPart(2)
invokeTag('field','g',37,['name':("usedTime"),'type':("number"),'value':(nideshopUserCouponInstance.usedTime),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopUserCouponInstance, field: 'userId', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("nideshopUserCoupon.userId.label"),'default':("User Id")],-1)
printHtmlPart(2)
invokeTag('select','g',46,['id':("userId"),'name':("userId.id"),'from':(nideshop.NideshopUser.list()),'optionKey':("id"),'required':(""),'value':(nideshopUserCouponInstance?.userId?.id),'class':("many-to-one")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537372822000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
