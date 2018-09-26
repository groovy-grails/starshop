import nideshop.NideshopCollect
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopCollect_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopCollect/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopCollectInstance, field: 'addTime', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopCollect.addTime.label"),'default':("Add Time")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['name':("addTime"),'type':("number"),'value':(nideshopCollectInstance.addTime),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCollectInstance, field: 'isAttention', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopCollect.isAttention.label"),'default':("Is Attention")],-1)
printHtmlPart(2)
invokeTag('field','g',19,['name':("isAttention"),'type':("number"),'value':(nideshopCollectInstance.isAttention),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCollectInstance, field: 'typeId', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopCollect.typeId.label"),'default':("Type Id")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['name':("typeId"),'type':("number"),'value':(nideshopCollectInstance.typeId),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCollectInstance, field: 'userId', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopCollect.userId.label"),'default':("User Id")],-1)
printHtmlPart(2)
invokeTag('select','g',37,['id':("userId"),'name':("userId.id"),'from':(nideshop.NideshopUser.list()),'optionKey':("id"),'required':(""),'value':(nideshopCollectInstance?.userId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopCollectInstance, field: 'valueId', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("nideshopCollect.valueId.label"),'default':("Value Id")],-1)
printHtmlPart(2)
invokeTag('select','g',46,['id':("valueId"),'name':("valueId.id"),'from':(nideshop.NideshopGoods.list()),'optionKey':("id"),'required':(""),'value':(nideshopCollectInstance?.valueId?.id),'class':("many-to-one")],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537152327000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
