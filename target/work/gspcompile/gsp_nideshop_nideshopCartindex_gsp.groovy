import nideshop.NideshopCart
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopCartindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopCart/index.gsp" }
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
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("sessionId"),'title':(message(code: 'nideshopCart.sessionId.label', default: 'Session Id'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("goodsSn"),'title':(message(code: 'nideshopCart.goodsSn.label', default: 'Goods Sn'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("goodsName"),'title':(message(code: 'nideshopCart.goodsName.label', default: 'Goods Name'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',33,['property':("goodsSpecifitionNameValue"),'title':(message(code: 'nideshopCart.goodsSpecifitionNameValue.label', default: 'Goods Specifition Name Value'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',35,['property':("goodsSpecifitionIds"),'title':(message(code: 'nideshopCart.goodsSpecifitionIds.label', default: 'Goods Specifition Ids'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',37,['property':("checked"),'title':(message(code: 'nideshopCart.checked.label', default: 'Checked'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( nideshopCartInstance in (nideshopCartInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: nideshopCartInstance, field: "sessionId"))
})
invokeTag('link','g',45,['action':("show"),'id':(nideshopCartInstance.id)],3)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: nideshopCartInstance, field: "goodsSn"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: nideshopCartInstance, field: "goodsName"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: nideshopCartInstance, field: "goodsSpecifitionNameValue"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: nideshopCartInstance, field: "goodsSpecifitionIds"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: nideshopCartInstance, field: "checked"))
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('paginate','g',62,['total':(nideshopCartInstanceCount ?: 0)],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(21)
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
