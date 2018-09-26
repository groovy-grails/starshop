import nideshop.NideshopTopic
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopTopic_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopTopic/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopTopicInstance, field: 'content', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopTopic.content.label"),'default':("Content")],-1)
printHtmlPart(2)
invokeTag('textArea','g',10,['name':("content"),'cols':("40"),'rows':("5"),'maxlength':("8000"),'value':(nideshopTopicInstance?.content)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopTopicInstance, field: 'avatar', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopTopic.avatar.label"),'default':("Avatar")],-1)
printHtmlPart(5)
invokeTag('textField','g',19,['name':("avatar"),'required':(""),'value':(nideshopTopicInstance?.avatar)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopTopicInstance, field: 'isShow', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("nideshopTopic.isShow.label"),'default':("Is Show")],-1)
printHtmlPart(5)
invokeTag('field','g',28,['name':("isShow"),'type':("number"),'value':(nideshopTopicInstance.isShow),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopTopicInstance, field: 'itemPicUrl', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("nideshopTopic.itemPicUrl.label"),'default':("Item Pic Url")],-1)
printHtmlPart(5)
invokeTag('textField','g',37,['name':("itemPicUrl"),'required':(""),'value':(nideshopTopicInstance?.itemPicUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopTopicInstance, field: 'priceInfo', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("nideshopTopic.priceInfo.label"),'default':("Price Info")],-1)
printHtmlPart(5)
invokeTag('field','g',46,['name':("priceInfo"),'value':(fieldValue(bean: nideshopTopicInstance, field: 'priceInfo')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopTopicInstance, field: 'readCount', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("nideshopTopic.readCount.label"),'default':("Read Count")],-1)
printHtmlPart(5)
invokeTag('textField','g',55,['name':("readCount"),'required':(""),'value':(nideshopTopicInstance?.readCount)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopTopicInstance, field: 'scenePicUrl', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("nideshopTopic.scenePicUrl.label"),'default':("Scene Pic Url")],-1)
printHtmlPart(5)
invokeTag('textField','g',64,['name':("scenePicUrl"),'required':(""),'value':(nideshopTopicInstance?.scenePicUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopTopicInstance, field: 'sortOrder', 'error'))
printHtmlPart(11)
invokeTag('message','g',70,['code':("nideshopTopic.sortOrder.label"),'default':("Sort Order")],-1)
printHtmlPart(5)
invokeTag('field','g',73,['name':("sortOrder"),'type':("number"),'value':(nideshopTopicInstance.sortOrder),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopTopicInstance, field: 'subtitle', 'error'))
printHtmlPart(12)
invokeTag('message','g',79,['code':("nideshopTopic.subtitle.label"),'default':("Subtitle")],-1)
printHtmlPart(5)
invokeTag('textField','g',82,['name':("subtitle"),'required':(""),'value':(nideshopTopicInstance?.subtitle)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopTopicInstance, field: 'title', 'error'))
printHtmlPart(13)
invokeTag('message','g',88,['code':("nideshopTopic.title.label"),'default':("Title")],-1)
printHtmlPart(5)
invokeTag('textField','g',91,['name':("title"),'required':(""),'value':(nideshopTopicInstance?.title)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopTopicInstance, field: 'topicCategoryId', 'error'))
printHtmlPart(14)
invokeTag('message','g',97,['code':("nideshopTopic.topicCategoryId.label"),'default':("Topic Category Id")],-1)
printHtmlPart(5)
invokeTag('select','g',100,['id':("topicCategoryId"),'name':("topicCategoryId.id"),'from':(nideshop.NideshopTopicCategory.list()),'optionKey':("id"),'required':(""),'value':(nideshopTopicInstance?.topicCategoryId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopTopicInstance, field: 'topicTagId', 'error'))
printHtmlPart(15)
invokeTag('message','g',106,['code':("nideshopTopic.topicTagId.label"),'default':("Topic Tag Id")],-1)
printHtmlPart(5)
invokeTag('field','g',109,['name':("topicTagId"),'type':("number"),'value':(nideshopTopicInstance.topicTagId),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopTopicInstance, field: 'topicTemplateId', 'error'))
printHtmlPart(16)
invokeTag('message','g',115,['code':("nideshopTopic.topicTemplateId.label"),'default':("Topic Template Id")],-1)
printHtmlPart(5)
invokeTag('field','g',118,['name':("topicTemplateId"),'type':("number"),'value':(nideshopTopicInstance.topicTemplateId),'required':("")],-1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537372837000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
