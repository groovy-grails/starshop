import nideshop.NideshopCoupon
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopCouponshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopCoupon/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'nideshopCoupon.label', default: 'NideshopCoupon'))],-1)
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
if(true && (nideshopCouponInstance?.name)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("nideshopCoupon.name.label"),'default':("Name")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(nideshopCouponInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCouponInstance?.maxAmount)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("nideshopCoupon.maxAmount.label"),'default':("Max Amount")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(nideshopCouponInstance),'field':("maxAmount")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCouponInstance?.minAmount)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("nideshopCoupon.minAmount.label"),'default':("Min Amount")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(nideshopCouponInstance),'field':("minAmount")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCouponInstance?.minGoodsAmount)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("nideshopCoupon.minGoodsAmount.label"),'default':("Min Goods Amount")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(nideshopCouponInstance),'field':("minGoodsAmount")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCouponInstance?.sendEndDate)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("nideshopCoupon.sendEndDate.label"),'default':("Send End Date")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(nideshopCouponInstance),'field':("sendEndDate")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCouponInstance?.sendStartDate)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("nideshopCoupon.sendStartDate.label"),'default':("Send Start Date")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(nideshopCouponInstance),'field':("sendStartDate")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCouponInstance?.sendType)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("nideshopCoupon.sendType.label"),'default':("Send Type")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(nideshopCouponInstance),'field':("sendType")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCouponInstance?.typeMoney)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("nideshopCoupon.typeMoney.label"),'default':("Type Money")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(nideshopCouponInstance),'field':("typeMoney")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCouponInstance?.useEndDate)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("nideshopCoupon.useEndDate.label"),'default':("Use End Date")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(nideshopCouponInstance),'field':("useEndDate")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCouponInstance?.useStartDate)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("nideshopCoupon.useStartDate.label"),'default':("Use Start Date")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',111,['bean':(nideshopCouponInstance),'field':("useStartDate")],-1)
printHtmlPart(16)
}
printHtmlPart(36)
createTagBody(2, {->
printHtmlPart(37)
createTagBody(3, {->
invokeTag('message','g',119,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',119,['class':("edit"),'action':("edit"),'resource':(nideshopCouponInstance)],3)
printHtmlPart(38)
invokeTag('actionSubmit','g',120,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(39)
})
invokeTag('form','g',122,['url':([resource:nideshopCouponInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',124,[:],1)
printHtmlPart(41)
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
