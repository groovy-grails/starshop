import nideshop.NideshopAddress
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopAddressshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopAddress/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'nideshopAddress.label', default: 'NideshopAddress'))],-1)
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
if(true && (nideshopAddressInstance?.name)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("nideshopAddress.name.label"),'default':("Name")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(nideshopAddressInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopAddressInstance?.address)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("nideshopAddress.address.label"),'default':("Address")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(nideshopAddressInstance),'field':("address")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopAddressInstance?.mobile)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("nideshopAddress.mobile.label"),'default':("Mobile")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(nideshopAddressInstance),'field':("mobile")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopAddressInstance?.cityId)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("nideshopAddress.cityId.label"),'default':("City Id")],-1)
printHtmlPart(23)
createTagBody(3, {->
expressionOut.print(nideshopAddressInstance?.cityId?.encodeAsHTML())
})
invokeTag('link','g',57,['controller':("nideshopRegion"),'action':("show"),'id':(nideshopAddressInstance?.cityId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopAddressInstance?.countryId)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("nideshopAddress.countryId.label"),'default':("Country Id")],-1)
printHtmlPart(25)
createTagBody(3, {->
expressionOut.print(nideshopAddressInstance?.countryId?.encodeAsHTML())
})
invokeTag('link','g',66,['controller':("nideshopRegion"),'action':("show"),'id':(nideshopAddressInstance?.countryId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopAddressInstance?.districtId)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("nideshopAddress.districtId.label"),'default':("District Id")],-1)
printHtmlPart(27)
createTagBody(3, {->
expressionOut.print(nideshopAddressInstance?.districtId?.encodeAsHTML())
})
invokeTag('link','g',75,['controller':("nideshopRegion"),'action':("show"),'id':(nideshopAddressInstance?.districtId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopAddressInstance?.isDefault)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("nideshopAddress.isDefault.label"),'default':("Is Default")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(nideshopAddressInstance),'field':("isDefault")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopAddressInstance?.provinceId)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("nideshopAddress.provinceId.label"),'default':("Province Id")],-1)
printHtmlPart(31)
createTagBody(3, {->
expressionOut.print(nideshopAddressInstance?.provinceId?.encodeAsHTML())
})
invokeTag('link','g',93,['controller':("nideshopRegion"),'action':("show"),'id':(nideshopAddressInstance?.provinceId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopAddressInstance?.userId)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("nideshopAddress.userId.label"),'default':("User Id")],-1)
printHtmlPart(33)
createTagBody(3, {->
expressionOut.print(nideshopAddressInstance?.userId?.encodeAsHTML())
})
invokeTag('link','g',102,['controller':("nideshopUser"),'action':("show"),'id':(nideshopAddressInstance?.userId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(34)
createTagBody(2, {->
printHtmlPart(35)
createTagBody(3, {->
invokeTag('message','g',110,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',110,['class':("edit"),'action':("edit"),'resource':(nideshopAddressInstance)],3)
printHtmlPart(36)
invokeTag('actionSubmit','g',111,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(37)
})
invokeTag('form','g',113,['url':([resource:nideshopAddressInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(38)
})
invokeTag('captureBody','sitemesh',115,[:],1)
printHtmlPart(39)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537152171000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
