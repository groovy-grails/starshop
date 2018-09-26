import nideshop.NideshopGoodsSpecification
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopGoodsSpecification_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopGoodsSpecification/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopGoodsSpecificationInstance, field: 'value', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopGoodsSpecification.value.label"),'default':("Value")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("value"),'maxlength':("50"),'required':(""),'value':(nideshopGoodsSpecificationInstance?.value)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopGoodsSpecificationInstance, field: 'goodsId', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopGoodsSpecification.goodsId.label"),'default':("Goods Id")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['id':("goodsId"),'name':("goodsId.id"),'from':(nideshop.NideshopGoods.list()),'optionKey':("id"),'required':(""),'value':(nideshopGoodsSpecificationInstance?.goodsId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopGoodsSpecificationInstance, field: 'picUrl', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopGoodsSpecification.picUrl.label"),'default':("Pic Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("picUrl"),'required':(""),'value':(nideshopGoodsSpecificationInstance?.picUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopGoodsSpecificationInstance, field: 'specificationId', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopGoodsSpecification.specificationId.label"),'default':("Specification Id")],-1)
printHtmlPart(2)
invokeTag('select','g',37,['id':("specificationId"),'name':("specificationId.id"),'from':(nideshop.NideshopSpecification.list()),'optionKey':("id"),'required':(""),'value':(nideshopGoodsSpecificationInstance?.specificationId?.id),'class':("many-to-one")],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537798182268L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
