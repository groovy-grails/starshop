import nideshop.NideshopProduct
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopProduct_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopProduct/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopProductInstance, field: 'goodsSn', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopProduct.goodsSn.label"),'default':("Goods Sn")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("goodsSn"),'maxlength':("60"),'required':(""),'value':(nideshopProductInstance?.goodsSn)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopProductInstance, field: 'goodsId', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopProduct.goodsId.label"),'default':("Goods Id")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['id':("goodsId"),'name':("goodsId.id"),'from':(nideshop.NideshopGoods.list()),'optionKey':("id"),'required':(""),'value':(nideshopProductInstance?.goodsId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopProductInstance, field: 'goodsNumber', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopProduct.goodsNumber.label"),'default':("Goods Number")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['name':("goodsNumber"),'type':("number"),'value':(nideshopProductInstance.goodsNumber),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopProductInstance, field: 'goodsSpecificationIds', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopProduct.goodsSpecificationIds.label"),'default':("Goods Specification Ids")],-1)
printHtmlPart(2)
invokeTag('select','g',37,['id':("goodsSpecificationIds"),'name':("goodsSpecificationIds.id"),'from':(nideshop.NideshopGoodsSpecification.list()),'optionKey':("id"),'required':(""),'value':(nideshopProductInstance?.goodsSpecificationIds?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopProductInstance, field: 'retailPrice', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("nideshopProduct.retailPrice.label"),'default':("Retail Price")],-1)
printHtmlPart(2)
invokeTag('field','g',46,['name':("retailPrice"),'value':(fieldValue(bean: nideshopProductInstance, field: 'retailPrice')),'required':("")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537802710536L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
