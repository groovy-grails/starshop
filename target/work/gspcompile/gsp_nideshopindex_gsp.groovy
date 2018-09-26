import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshopindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',82,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('message','g',84,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(6)
invokeTag('message','g',93,['code':("NideshopGoods.label")],-1)
printHtmlPart(7)
invokeTag('message','g',94,['code':("NideshopGoodsSpecification.label")],-1)
printHtmlPart(8)
invokeTag('message','g',95,['code':("NideshopGoodsAttribute.label")],-1)
printHtmlPart(9)
invokeTag('message','g',96,['code':("NideshopGoodsGallery.label")],-1)
printHtmlPart(10)
invokeTag('message','g',97,['code':("NideshopGoodsIssue.label")],-1)
printHtmlPart(11)
invokeTag('message','g',98,['code':("NideshopRelatedGoods.label")],-1)
printHtmlPart(12)
invokeTag('message','g',99,['code':("NideshopProduct.label")],-1)
printHtmlPart(13)
invokeTag('message','g',100,['code':("NideshopTopic.label")],-1)
printHtmlPart(14)
invokeTag('message','g',104,['code':("NideshopOrder.label")],-1)
printHtmlPart(15)
invokeTag('message','g',105,['code':("NideshopOrderExpress.label")],-1)
printHtmlPart(16)
invokeTag('message','g',106,['code':("NideshopOrderGoods.label")],-1)
printHtmlPart(17)
invokeTag('message','g',107,['code':("NideshopUserCoupon.label")],-1)
printHtmlPart(18)
invokeTag('message','g',108,['code':("NideshopFeedback.label")],-1)
printHtmlPart(19)
invokeTag('message','g',109,['code':("NideshopComment.label")],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',115,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537609021164L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
