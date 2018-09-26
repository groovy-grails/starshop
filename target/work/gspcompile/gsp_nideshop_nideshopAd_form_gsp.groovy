import nideshop.NideshopAd
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopAd_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopAd/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopAdInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopAd.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'maxlength':("60"),'required':(""),'value':(nideshopAdInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdInstance, field: 'imageUrl', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopAd.imageUrl.label"),'default':("Image Url")],-1)
printHtmlPart(2)
invokeTag('textArea','g',19,['name':("imageUrl"),'cols':("40"),'rows':("5"),'maxlength':("255"),'required':(""),'value':(nideshopAdInstance?.imageUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdInstance, field: 'adPositionId', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopAd.adPositionId.label"),'default':("Ad Position Id")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['id':("adPositionId"),'name':("adPositionId.id"),'from':(nideshop.NideshopAdPosition.list()),'optionKey':("id"),'required':(""),'value':(nideshopAdInstance?.adPositionId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdInstance, field: 'content', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("nideshopAd.content.label"),'default':("Content")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("content"),'required':(""),'value':(nideshopAdInstance?.content)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdInstance, field: 'enabled', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("nideshopAd.enabled.label"),'default':("Enabled")],-1)
printHtmlPart(2)
invokeTag('field','g',46,['name':("enabled"),'type':("number"),'value':(nideshopAdInstance.enabled),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdInstance, field: 'endTime', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("nideshopAd.endTime.label"),'default':("End Time")],-1)
printHtmlPart(2)
invokeTag('field','g',55,['name':("endTime"),'type':("number"),'value':(nideshopAdInstance.endTime),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdInstance, field: 'link', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("nideshopAd.link.label"),'default':("Link")],-1)
printHtmlPart(2)
invokeTag('textField','g',64,['name':("link"),'required':(""),'value':(nideshopAdInstance?.link)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAdInstance, field: 'mediaType', 'error'))
printHtmlPart(10)
invokeTag('message','g',70,['code':("nideshopAd.mediaType.label"),'default':("Media Type")],-1)
printHtmlPart(2)
invokeTag('field','g',73,['name':("mediaType"),'type':("number"),'value':(nideshopAdInstance.mediaType),'required':("")],-1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537372703000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
