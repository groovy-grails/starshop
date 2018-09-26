import nideshop.NideshopCart
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopCart_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopCart/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopCartInstance, field: 'sessionId', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopCart.sessionId.label"),'default':("Session Id")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("sessionId"),'maxlength':("32"),'required':(""),'value':(nideshopCartInstance?.sessionId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCartInstance, field: 'goodsSn', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopCart.goodsSn.label"),'default':("Goods Sn")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("goodsSn"),'maxlength':("60"),'required':(""),'value':(nideshopCartInstance?.goodsSn)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCartInstance, field: 'goodsName', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopCart.goodsName.label"),'default':("Goods Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("goodsName"),'maxlength':("120"),'required':(""),'value':(nideshopCartInstance?.goodsName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCartInstance, field: 'goodsSpecifitionNameValue', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopCart.goodsSpecifitionNameValue.label"),'default':("Goods Specifition Name Value")],-1)
printHtmlPart(2)
invokeTag('textArea','g',37,['name':("goodsSpecifitionNameValue"),'cols':("40"),'rows':("5"),'maxlength':("8000"),'required':(""),'value':(nideshopCartInstance?.goodsSpecifitionNameValue)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCartInstance, field: 'goodsSpecifitionIds', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("nideshopCart.goodsSpecifitionIds.label"),'default':("Goods Specifition Ids")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("goodsSpecifitionIds"),'maxlength':("60"),'required':(""),'value':(nideshopCartInstance?.goodsSpecifitionIds)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCartInstance, field: 'checked', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("nideshopCart.checked.label"),'default':("Checked")],-1)
printHtmlPart(2)
invokeTag('field','g',55,['name':("checked"),'type':("number"),'value':(nideshopCartInstance.checked),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCartInstance, field: 'goodsId', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("nideshopCart.goodsId.label"),'default':("Goods Id")],-1)
printHtmlPart(2)
invokeTag('select','g',64,['id':("goodsId"),'name':("goodsId.id"),'from':(nideshop.NideshopGoods.list()),'optionKey':("id"),'required':(""),'value':(nideshopCartInstance?.goodsId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCartInstance, field: 'listPicUrl', 'error'))
printHtmlPart(10)
invokeTag('message','g',70,['code':("nideshopCart.listPicUrl.label"),'default':("List Pic Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',73,['name':("listPicUrl"),'required':(""),'value':(nideshopCartInstance?.listPicUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCartInstance, field: 'marketPrice', 'error'))
printHtmlPart(11)
invokeTag('message','g',79,['code':("nideshopCart.marketPrice.label"),'default':("Market Price")],-1)
printHtmlPart(2)
invokeTag('field','g',82,['name':("marketPrice"),'value':(fieldValue(bean: nideshopCartInstance, field: 'marketPrice')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCartInstance, field: 'number', 'error'))
printHtmlPart(12)
invokeTag('message','g',88,['code':("nideshopCart.number.label"),'default':("Number")],-1)
printHtmlPart(2)
invokeTag('field','g',91,['name':("number"),'type':("number"),'value':(nideshopCartInstance.number),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCartInstance, field: 'productId', 'error'))
printHtmlPart(13)
invokeTag('message','g',97,['code':("nideshopCart.productId.label"),'default':("Product Id")],-1)
printHtmlPart(2)
invokeTag('select','g',100,['id':("productId"),'name':("productId.id"),'from':(nideshop.NideshopProduct.list()),'optionKey':("id"),'required':(""),'value':(nideshopCartInstance?.productId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCartInstance, field: 'retailPrice', 'error'))
printHtmlPart(14)
invokeTag('message','g',106,['code':("nideshopCart.retailPrice.label"),'default':("Retail Price")],-1)
printHtmlPart(2)
invokeTag('field','g',109,['name':("retailPrice"),'value':(fieldValue(bean: nideshopCartInstance, field: 'retailPrice')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCartInstance, field: 'userId', 'error'))
printHtmlPart(15)
invokeTag('message','g',115,['code':("nideshopCart.userId.label"),'default':("User Id")],-1)
printHtmlPart(2)
invokeTag('select','g',118,['id':("userId"),'name':("userId.id"),'from':(nideshop.NideshopUser.list()),'optionKey':("id"),'required':(""),'value':(nideshopCartInstance?.userId?.id),'class':("many-to-one")],-1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537152281000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
