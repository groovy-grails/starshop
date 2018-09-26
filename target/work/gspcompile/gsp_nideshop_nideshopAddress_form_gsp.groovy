import nideshop.NideshopAddress
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopAddress_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopAddress/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: nideshopAddressInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("nideshopAddress.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'maxlength':("50"),'required':(""),'value':(nideshopAddressInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAddressInstance, field: 'address', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("nideshopAddress.address.label"),'default':("Address")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("address"),'maxlength':("120"),'required':(""),'value':(nideshopAddressInstance?.address)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAddressInstance, field: 'mobile', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("nideshopAddress.mobile.label"),'default':("Mobile")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("mobile"),'maxlength':("60"),'required':(""),'value':(nideshopAddressInstance?.mobile)],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: nideshopAddressInstance, field: 'countryId', 'error'))
printHtmlPart(7)
invokeTag('message','g',36,['code':("nideshopAddress.countryId.label"),'default':("Country Id")],-1)
printHtmlPart(2)
invokeTag('select','g',39,['id':("countryId"),'name':("countryId.id"),'from':(nideshop.NideshopRegion.findAllByType(0)),'optionKey':("id"),'required':(""),'value':(nideshopAddressInstance?.countryId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAddressInstance, field: 'provinceId', 'error'))
printHtmlPart(8)
invokeTag('message','g',45,['code':("nideshopAddress.provinceId.label"),'default':("Province Id")],-1)
printHtmlPart(2)
invokeTag('select','g',48,['id':("provinceId"),'name':("provinceId.id"),'from':(nideshop.NideshopRegion.findAllByType(1)),'optionKey':("id"),'required':(""),'value':(nideshopAddressInstance?.provinceId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAddressInstance, field: 'cityId', 'error'))
printHtmlPart(9)
invokeTag('message','g',54,['code':("nideshopAddress.cityId.label"),'default':("City Id")],-1)
printHtmlPart(2)
invokeTag('select','g',57,['id':("cityId"),'name':("cityId.id"),'from':(nideshop.NideshopRegion.findAllByType(2)),'optionKey':("id"),'required':(""),'value':(nideshopAddressInstance?.cityId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAddressInstance, field: 'districtId', 'error'))
printHtmlPart(10)
invokeTag('message','g',63,['code':("nideshopAddress.districtId.label"),'default':("District Id")],-1)
printHtmlPart(2)
invokeTag('select','g',66,['id':("districtId"),'name':("districtId.id"),'from':(nideshop.NideshopRegion.findAllByType(3)),'optionKey':("id"),'required':(""),'value':(nideshopAddressInstance?.districtId?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: nideshopAddressInstance, field: 'isDefault', 'error'))
printHtmlPart(11)
invokeTag('message','g',72,['code':("nideshopAddress.isDefault.label"),'default':("Is Default")],-1)
printHtmlPart(2)
invokeTag('field','g',75,['name':("isDefault"),'type':("number"),'value':(nideshopAddressInstance.isDefault),'required':("")],-1)
printHtmlPart(6)
expressionOut.print(hasErrors(bean: nideshopAddressInstance, field: 'userId', 'error'))
printHtmlPart(12)
invokeTag('message','g',83,['code':("nideshopAddress.userId.label"),'default':("User Id")],-1)
printHtmlPart(2)
invokeTag('select','g',86,['id':("userId"),'name':("userId.id"),'from':(nideshop.NideshopUser.list()),'optionKey':("id"),'required':(""),'value':(nideshopAddressInstance?.userId?.id),'class':("many-to-one")],-1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537363689000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
