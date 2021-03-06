import nideshop.NideshopOrderGoods
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopOrderGoodsshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopOrderGoods/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'nideshopOrderGoods.label', default: 'NideshopOrderGoods'))],-1)
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
if(true && (nideshopOrderGoodsInstance?.goodsName)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("nideshopOrderGoods.goodsName.label"),'default':("Goods Name")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(nideshopOrderGoodsInstance),'field':("goodsName")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderGoodsInstance?.goodsSn)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("nideshopOrderGoods.goodsSn.label"),'default':("Goods Sn")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(nideshopOrderGoodsInstance),'field':("goodsSn")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderGoodsInstance?.goodsSpecifitionNameValue)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("nideshopOrderGoods.goodsSpecifitionNameValue.label"),'default':("Goods Specifition Name Value")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(nideshopOrderGoodsInstance),'field':("goodsSpecifitionNameValue")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderGoodsInstance?.goodsId)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("nideshopOrderGoods.goodsId.label"),'default':("Goods Id")],-1)
printHtmlPart(23)
createTagBody(3, {->
expressionOut.print(nideshopOrderGoodsInstance?.goodsId?.encodeAsHTML())
})
invokeTag('link','g',57,['controller':("nideshopGoods"),'action':("show"),'id':(nideshopOrderGoodsInstance?.goodsId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderGoodsInstance?.goodsSpecifitionIds)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("nideshopOrderGoods.goodsSpecifitionIds.label"),'default':("Goods Specifition Ids")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(nideshopOrderGoodsInstance),'field':("goodsSpecifitionIds")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderGoodsInstance?.isReal)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("nideshopOrderGoods.isReal.label"),'default':("Is Real")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(nideshopOrderGoodsInstance),'field':("isReal")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderGoodsInstance?.listPicUrl)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("nideshopOrderGoods.listPicUrl.label"),'default':("List Pic Url")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(nideshopOrderGoodsInstance),'field':("listPicUrl")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderGoodsInstance?.marketPrice)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("nideshopOrderGoods.marketPrice.label"),'default':("Market Price")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(nideshopOrderGoodsInstance),'field':("marketPrice")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderGoodsInstance?.number)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("nideshopOrderGoods.number.label"),'default':("Number")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(nideshopOrderGoodsInstance),'field':("number")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderGoodsInstance?.orderId)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("nideshopOrderGoods.orderId.label"),'default':("Order Id")],-1)
printHtmlPart(35)
createTagBody(3, {->
expressionOut.print(nideshopOrderGoodsInstance?.orderId?.encodeAsHTML())
})
invokeTag('link','g',111,['controller':("nideshopOrder"),'action':("show"),'id':(nideshopOrderGoodsInstance?.orderId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderGoodsInstance?.productId)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("nideshopOrderGoods.productId.label"),'default':("Product Id")],-1)
printHtmlPart(37)
createTagBody(3, {->
expressionOut.print(nideshopOrderGoodsInstance?.productId?.encodeAsHTML())
})
invokeTag('link','g',120,['controller':("nideshopProduct"),'action':("show"),'id':(nideshopOrderGoodsInstance?.productId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopOrderGoodsInstance?.retailPrice)) {
printHtmlPart(38)
invokeTag('message','g',127,['code':("nideshopOrderGoods.retailPrice.label"),'default':("Retail Price")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',129,['bean':(nideshopOrderGoodsInstance),'field':("retailPrice")],-1)
printHtmlPart(16)
}
printHtmlPart(40)
createTagBody(2, {->
printHtmlPart(41)
createTagBody(3, {->
invokeTag('message','g',137,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',137,['class':("edit"),'action':("edit"),'resource':(nideshopOrderGoodsInstance)],3)
printHtmlPart(42)
invokeTag('actionSubmit','g',138,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(43)
})
invokeTag('form','g',140,['url':([resource:nideshopOrderGoodsInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(44)
})
invokeTag('captureBody','sitemesh',142,[:],1)
printHtmlPart(45)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537796198164L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
