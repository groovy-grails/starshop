import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_superAdminindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/superAdmin/index.gsp" }
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
invokeTag('message','g',93,['code':("NideshopUserLevel.label")],-1)
printHtmlPart(7)
invokeTag('message','g',94,['code':("NideshopUser.label")],-1)
printHtmlPart(8)
invokeTag('message','g',95,['code':("NideshopRegion.label")],-1)
printHtmlPart(9)
invokeTag('message','g',96,['code':("NideshopAddress.label")],-1)
printHtmlPart(10)
invokeTag('message','g',97,['code':("NideshopCategory.label")],-1)
printHtmlPart(11)
invokeTag('message','g',98,['code':("NideshopChannel.label")],-1)
printHtmlPart(12)
invokeTag('message','g',99,['code':("NideshopBrand.label")],-1)
printHtmlPart(13)
invokeTag('message','g',100,['code':("NideshopAttributeCategory.label")],-1)
printHtmlPart(14)
invokeTag('message','g',101,['code':("NideshopAttribute.label")],-1)
printHtmlPart(15)
invokeTag('message','g',102,['code':("NideshopKeywords.label")],-1)
printHtmlPart(16)
invokeTag('message','g',103,['code':("NideshopSpecification.label")],-1)
printHtmlPart(17)
invokeTag('message','g',104,['code':("NideshopShipper.label")],-1)
printHtmlPart(18)
invokeTag('message','g',105,['code':("NideshopCoupon.label")],-1)
printHtmlPart(19)
invokeTag('message','g',106,['code':("NideshopTopicCategory.label")],-1)
printHtmlPart(20)
invokeTag('message','g',107,['code':("NideshopAdPosition.label")],-1)
printHtmlPart(21)
invokeTag('message','g',108,['code':("NideshopAd.label")],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',115,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537803323334L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
