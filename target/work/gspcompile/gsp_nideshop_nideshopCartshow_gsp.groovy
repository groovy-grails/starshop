import nideshop.NideshopCart
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopCartshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopCart/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'nideshopCart.label', default: 'NideshopCart'))],-1)
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
if(true && (nideshopCartInstance?.sessionId)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("nideshopCart.sessionId.label"),'default':("Session Id")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(nideshopCartInstance),'field':("sessionId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCartInstance?.goodsSn)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("nideshopCart.goodsSn.label"),'default':("Goods Sn")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(nideshopCartInstance),'field':("goodsSn")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCartInstance?.goodsName)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("nideshopCart.goodsName.label"),'default':("Goods Name")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(nideshopCartInstance),'field':("goodsName")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCartInstance?.goodsSpecifitionNameValue)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("nideshopCart.goodsSpecifitionNameValue.label"),'default':("Goods Specifition Name Value")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(nideshopCartInstance),'field':("goodsSpecifitionNameValue")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCartInstance?.goodsSpecifitionIds)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("nideshopCart.goodsSpecifitionIds.label"),'default':("Goods Specifition Ids")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(nideshopCartInstance),'field':("goodsSpecifitionIds")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCartInstance?.checked)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("nideshopCart.checked.label"),'default':("Checked")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(nideshopCartInstance),'field':("checked")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCartInstance?.goodsId)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("nideshopCart.goodsId.label"),'default':("Goods Id")],-1)
printHtmlPart(29)
createTagBody(3, {->
expressionOut.print(nideshopCartInstance?.goodsId?.encodeAsHTML())
})
invokeTag('link','g',84,['controller':("nideshopGoods"),'action':("show"),'id':(nideshopCartInstance?.goodsId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCartInstance?.listPicUrl)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("nideshopCart.listPicUrl.label"),'default':("List Pic Url")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(nideshopCartInstance),'field':("listPicUrl")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCartInstance?.marketPrice)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("nideshopCart.marketPrice.label"),'default':("Market Price")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',102,['bean':(nideshopCartInstance),'field':("marketPrice")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCartInstance?.number)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("nideshopCart.number.label"),'default':("Number")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',111,['bean':(nideshopCartInstance),'field':("number")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCartInstance?.productId)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("nideshopCart.productId.label"),'default':("Product Id")],-1)
printHtmlPart(37)
createTagBody(3, {->
expressionOut.print(nideshopCartInstance?.productId?.encodeAsHTML())
})
invokeTag('link','g',120,['controller':("nideshopProduct"),'action':("show"),'id':(nideshopCartInstance?.productId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCartInstance?.retailPrice)) {
printHtmlPart(38)
invokeTag('message','g',127,['code':("nideshopCart.retailPrice.label"),'default':("Retail Price")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',129,['bean':(nideshopCartInstance),'field':("retailPrice")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopCartInstance?.userId)) {
printHtmlPart(40)
invokeTag('message','g',136,['code':("nideshopCart.userId.label"),'default':("User Id")],-1)
printHtmlPart(41)
createTagBody(3, {->
expressionOut.print(nideshopCartInstance?.userId?.encodeAsHTML())
})
invokeTag('link','g',138,['controller':("nideshopUser"),'action':("show"),'id':(nideshopCartInstance?.userId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(42)
createTagBody(2, {->
printHtmlPart(43)
createTagBody(3, {->
invokeTag('message','g',146,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',146,['class':("edit"),'action':("edit"),'resource':(nideshopCartInstance)],3)
printHtmlPart(44)
invokeTag('actionSubmit','g',147,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(45)
})
invokeTag('form','g',149,['url':([resource:nideshopCartInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(46)
})
invokeTag('captureBody','sitemesh',151,[:],1)
printHtmlPart(47)
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
