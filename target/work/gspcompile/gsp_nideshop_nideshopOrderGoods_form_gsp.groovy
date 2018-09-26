import nideshop.NideshopOrderGoods
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopOrderGoods_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopOrderGoods/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopOrderGoodsInstance, field: 'goodsName', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopOrderGoods.goodsName.label"),'default':("Goods Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("goodsName"),'maxlength':("120"),'required':(""),'value':(nideshopOrderGoodsInstance?.goodsName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderGoodsInstance, field: 'goodsSn', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopOrderGoods.goodsSn.label"),'default':("Goods Sn")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("goodsSn"),'maxlength':("60"),'required':(""),'value':(nideshopOrderGoodsInstance?.goodsSn)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderGoodsInstance, field: 'goodsSpecifitionNameValue', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopOrderGoods.goodsSpecifitionNameValue.label"),'default':("Goods Specifition Name Value")],-1)
printHtmlPart(2)
invokeTag('textArea','g',28,['name':("goodsSpecifitionNameValue"),'cols':("40"),'rows':("5"),'maxlength':("8000"),'required':(""),'value':(nideshopOrderGoodsInstance?.goodsSpecifitionNameValue)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderGoodsInstance, field: 'goodsId', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopOrderGoods.goodsId.label"),'default':("Goods Id")],-1)
printHtmlPart(2)
invokeTag('select','g',37,['id':("goodsId"),'name':("goodsId.id"),'from':(nideshop.NideshopGoods.list()),'optionKey':("id"),'required':(""),'value':(nideshopOrderGoodsInstance?.goodsId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderGoodsInstance, field: 'goodsSpecifitionIds', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("nideshopOrderGoods.goodsSpecifitionIds.label"),'default':("Goods Specifition Ids")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("goodsSpecifitionIds"),'required':(""),'value':(nideshopOrderGoodsInstance?.goodsSpecifitionIds)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderGoodsInstance, field: 'isReal', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("nideshopOrderGoods.isReal.label"),'default':("Is Real")],-1)
printHtmlPart(2)
invokeTag('field','g',55,['name':("isReal"),'type':("number"),'value':(nideshopOrderGoodsInstance.isReal),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderGoodsInstance, field: 'listPicUrl', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("nideshopOrderGoods.listPicUrl.label"),'default':("List Pic Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',64,['name':("listPicUrl"),'required':(""),'value':(nideshopOrderGoodsInstance?.listPicUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderGoodsInstance, field: 'marketPrice', 'error'))
printHtmlPart(10)
invokeTag('message','g',70,['code':("nideshopOrderGoods.marketPrice.label"),'default':("Market Price")],-1)
printHtmlPart(2)
invokeTag('field','g',73,['name':("marketPrice"),'value':(fieldValue(bean: nideshopOrderGoodsInstance, field: 'marketPrice')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderGoodsInstance, field: 'number', 'error'))
printHtmlPart(11)
invokeTag('message','g',79,['code':("nideshopOrderGoods.number.label"),'default':("Number")],-1)
printHtmlPart(2)
invokeTag('field','g',82,['name':("number"),'type':("number"),'value':(nideshopOrderGoodsInstance.number),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderGoodsInstance, field: 'orderId', 'error'))
printHtmlPart(12)
invokeTag('message','g',88,['code':("nideshopOrderGoods.orderId.label"),'default':("Order Id")],-1)
printHtmlPart(2)
invokeTag('select','g',91,['id':("orderId"),'name':("orderId.id"),'from':(nideshop.NideshopOrder.list()),'optionKey':("id"),'required':(""),'value':(nideshopOrderGoodsInstance?.orderId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderGoodsInstance, field: 'productId', 'error'))
printHtmlPart(13)
invokeTag('message','g',97,['code':("nideshopOrderGoods.productId.label"),'default':("Product Id")],-1)
printHtmlPart(2)
invokeTag('select','g',100,['id':("productId"),'name':("productId.id"),'from':(nideshop.NideshopProduct.list()),'optionKey':("id"),'required':(""),'value':(nideshopOrderGoodsInstance?.productId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopOrderGoodsInstance, field: 'retailPrice', 'error'))
printHtmlPart(14)
invokeTag('message','g',106,['code':("nideshopOrderGoods.retailPrice.label"),'default':("Retail Price")],-1)
printHtmlPart(2)
invokeTag('field','g',109,['name':("retailPrice"),'value':(fieldValue(bean: nideshopOrderGoodsInstance, field: 'retailPrice')),'required':("")],-1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537796198876L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
