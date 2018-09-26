import nideshop.NideshopOrder
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopOrdershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopOrder/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'nideshopOrder.label', default: 'NideshopOrder'))],-1)
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
if(true && (nideshopOrderInstance?.orderSn)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("nideshopOrder.orderSn.label"),'default':("Order Sn")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(nideshopOrderInstance),'field':("orderSn")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.consignee)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("nideshopOrder.consignee.label"),'default':("Consignee")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(nideshopOrderInstance),'field':("consignee")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.mobile)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("nideshopOrder.mobile.label"),'default':("Mobile")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(nideshopOrderInstance),'field':("mobile")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.payName)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("nideshopOrder.payName.label"),'default':("Pay Name")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(nideshopOrderInstance),'field':("payName")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.callbackStatus)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("nideshopOrder.callbackStatus.label"),'default':("Callback Status")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(nideshopOrderInstance),'field':("callbackStatus")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.parentId)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("nideshopOrder.parentId.label"),'default':("Parent Id")],-1)
printHtmlPart(27)
createTagBody(3, {->
expressionOut.print(nideshopOrderInstance?.parentId?.encodeAsHTML())
})
invokeTag('link','g',75,['controller':("nideshopOrder"),'action':("show"),'id':(nideshopOrderInstance?.parentId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.actualPrice)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("nideshopOrder.actualPrice.label"),'default':("Actual Price")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(nideshopOrderInstance),'field':("actualPrice")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.addTime)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("nideshopOrder.addTime.label"),'default':("Add Time")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(nideshopOrderInstance),'field':("addTime")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.address)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("nideshopOrder.address.label"),'default':("Address")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(nideshopOrderInstance),'field':("address")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.city)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("nideshopOrder.city.label"),'default':("City")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',111,['bean':(nideshopOrderInstance),'field':("city")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.confirmTime)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("nideshopOrder.confirmTime.label"),'default':("Confirm Time")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',120,['bean':(nideshopOrderInstance),'field':("confirmTime")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.country)) {
printHtmlPart(38)
invokeTag('message','g',127,['code':("nideshopOrder.country.label"),'default':("Country")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',129,['bean':(nideshopOrderInstance),'field':("country")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.couponId)) {
printHtmlPart(40)
invokeTag('message','g',136,['code':("nideshopOrder.couponId.label"),'default':("Coupon Id")],-1)
printHtmlPart(41)
createTagBody(3, {->
expressionOut.print(nideshopOrderInstance?.couponId?.encodeAsHTML())
})
invokeTag('link','g',138,['controller':("nideshopCoupon"),'action':("show"),'id':(nideshopOrderInstance?.couponId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.couponPrice)) {
printHtmlPart(42)
invokeTag('message','g',145,['code':("nideshopOrder.couponPrice.label"),'default':("Coupon Price")],-1)
printHtmlPart(43)
invokeTag('fieldValue','g',147,['bean':(nideshopOrderInstance),'field':("couponPrice")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.district)) {
printHtmlPart(44)
invokeTag('message','g',154,['code':("nideshopOrder.district.label"),'default':("District")],-1)
printHtmlPart(45)
invokeTag('fieldValue','g',156,['bean':(nideshopOrderInstance),'field':("district")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.freightPrice)) {
printHtmlPart(46)
invokeTag('message','g',163,['code':("nideshopOrder.freightPrice.label"),'default':("Freight Price")],-1)
printHtmlPart(47)
invokeTag('fieldValue','g',165,['bean':(nideshopOrderInstance),'field':("freightPrice")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.goodsPrice)) {
printHtmlPart(48)
invokeTag('message','g',172,['code':("nideshopOrder.goodsPrice.label"),'default':("Goods Price")],-1)
printHtmlPart(49)
invokeTag('fieldValue','g',174,['bean':(nideshopOrderInstance),'field':("goodsPrice")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.integral)) {
printHtmlPart(50)
invokeTag('message','g',181,['code':("nideshopOrder.integral.label"),'default':("Integral")],-1)
printHtmlPart(51)
invokeTag('fieldValue','g',183,['bean':(nideshopOrderInstance),'field':("integral")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.integralMoney)) {
printHtmlPart(52)
invokeTag('message','g',190,['code':("nideshopOrder.integralMoney.label"),'default':("Integral Money")],-1)
printHtmlPart(53)
invokeTag('fieldValue','g',192,['bean':(nideshopOrderInstance),'field':("integralMoney")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.orderPrice)) {
printHtmlPart(54)
invokeTag('message','g',199,['code':("nideshopOrder.orderPrice.label"),'default':("Order Price")],-1)
printHtmlPart(55)
invokeTag('fieldValue','g',201,['bean':(nideshopOrderInstance),'field':("orderPrice")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.orderStatus)) {
printHtmlPart(56)
invokeTag('message','g',208,['code':("nideshopOrder.orderStatus.label"),'default':("Order Status")],-1)
printHtmlPart(57)
invokeTag('fieldValue','g',210,['bean':(nideshopOrderInstance),'field':("orderStatus")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.payId)) {
printHtmlPart(58)
invokeTag('message','g',217,['code':("nideshopOrder.payId.label"),'default':("Pay Id")],-1)
printHtmlPart(59)
invokeTag('fieldValue','g',219,['bean':(nideshopOrderInstance),'field':("payId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.payStatus)) {
printHtmlPart(60)
invokeTag('message','g',226,['code':("nideshopOrder.payStatus.label"),'default':("Pay Status")],-1)
printHtmlPart(61)
invokeTag('fieldValue','g',228,['bean':(nideshopOrderInstance),'field':("payStatus")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.payTime)) {
printHtmlPart(62)
invokeTag('message','g',235,['code':("nideshopOrder.payTime.label"),'default':("Pay Time")],-1)
printHtmlPart(63)
invokeTag('fieldValue','g',237,['bean':(nideshopOrderInstance),'field':("payTime")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.postscript)) {
printHtmlPart(64)
invokeTag('message','g',244,['code':("nideshopOrder.postscript.label"),'default':("Postscript")],-1)
printHtmlPart(65)
invokeTag('fieldValue','g',246,['bean':(nideshopOrderInstance),'field':("postscript")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.province)) {
printHtmlPart(66)
invokeTag('message','g',253,['code':("nideshopOrder.province.label"),'default':("Province")],-1)
printHtmlPart(67)
invokeTag('fieldValue','g',255,['bean':(nideshopOrderInstance),'field':("province")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.shippingFee)) {
printHtmlPart(68)
invokeTag('message','g',262,['code':("nideshopOrder.shippingFee.label"),'default':("Shipping Fee")],-1)
printHtmlPart(69)
invokeTag('fieldValue','g',264,['bean':(nideshopOrderInstance),'field':("shippingFee")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.shippingStatus)) {
printHtmlPart(70)
invokeTag('message','g',271,['code':("nideshopOrder.shippingStatus.label"),'default':("Shipping Status")],-1)
printHtmlPart(71)
invokeTag('fieldValue','g',273,['bean':(nideshopOrderInstance),'field':("shippingStatus")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderInstance?.userId)) {
printHtmlPart(72)
invokeTag('message','g',280,['code':("nideshopOrder.userId.label"),'default':("User Id")],-1)
printHtmlPart(73)
createTagBody(3, {->
expressionOut.print(nideshopOrderInstance?.userId?.encodeAsHTML())
})
invokeTag('link','g',282,['controller':("nideshopUser"),'action':("show"),'id':(nideshopOrderInstance?.userId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(74)
createTagBody(2, {->
printHtmlPart(75)
createTagBody(3, {->
invokeTag('message','g',290,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',290,['class':("edit"),'action':("edit"),'resource':(nideshopOrderInstance)],3)
printHtmlPart(76)
invokeTag('actionSubmit','g',291,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(77)
})
invokeTag('form','g',293,['url':([resource:nideshopOrderInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(78)
})
invokeTag('captureBody','sitemesh',295,[:],1)
printHtmlPart(79)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537372770000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
