import nideshop.NideshopGoodsAttribute
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopGoodsAttribute_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopGoodsAttribute/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopGoodsAttributeInstance, field: 'value', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopGoodsAttribute.value.label"),'default':("Value")],-1)
printHtmlPart(2)
invokeTag('textArea','g',10,['name':("value"),'cols':("40"),'rows':("5"),'maxlength':("8000"),'required':(""),'value':(nideshopGoodsAttributeInstance?.value)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopGoodsAttributeInstance, field: 'attributeId', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopGoodsAttribute.attributeId.label"),'default':("Attribute Id")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['id':("attributeId"),'name':("attributeId.id"),'from':(nideshop.NideshopAttribute.list()),'optionKey':("id"),'required':(""),'value':(nideshopGoodsAttributeInstance?.attributeId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopGoodsAttributeInstance, field: 'goodsId', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopGoodsAttribute.goodsId.label"),'default':("Goods Id")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['id':("goodsId"),'name':("goodsId.id"),'from':(nideshop.NideshopGoods.list()),'optionKey':("id"),'required':(""),'value':(nideshopGoodsAttributeInstance?.goodsId?.id),'class':("many-to-one")],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537857973729L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
