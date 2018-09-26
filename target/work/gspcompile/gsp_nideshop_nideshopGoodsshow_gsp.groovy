import nideshop.NideshopGoods
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_nideshop_nideshopGoodsshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/nideshopGoods/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'nideshopGoods.label', default: 'NideshopGoods'))],-1)
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
if(true && (nideshopGoodsInstance?.goodsSn)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("nideshopGoods.goodsSn.label"),'default':("Goods Sn")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(nideshopGoodsInstance),'field':("goodsSn")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.name)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("nideshopGoods.name.label"),'default':("Name")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(nideshopGoodsInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.goodsDesc)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("nideshopGoods.goodsDesc.label"),'default':("Goods Desc")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(nideshopGoodsInstance),'field':("goodsDesc")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.goodsUnit)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("nideshopGoods.goodsUnit.label"),'default':("Goods Unit")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(nideshopGoodsInstance),'field':("goodsUnit")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.promotionTag)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("nideshopGoods.promotionTag.label"),'default':("Promotion Tag")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(nideshopGoodsInstance),'field':("promotionTag")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.primaryProductId)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("nideshopGoods.primaryProductId.label"),'default':("Primary Product Id")],-1)
printHtmlPart(27)
createTagBody(3, {->
expressionOut.print(nideshopGoodsInstance?.primaryProductId?.encodeAsHTML())
})
invokeTag('link','g',75,['controller':("nideshopGoods"),'action':("show"),'id':(nideshopGoodsInstance?.primaryProductId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.addTime)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("nideshopGoods.addTime.label"),'default':("Add Time")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(nideshopGoodsInstance),'field':("addTime")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.appExclusivePrice)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("nideshopGoods.appExclusivePrice.label"),'default':("App Exclusive Price")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(nideshopGoodsInstance),'field':("appExclusivePrice")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.attributeCategory)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("nideshopGoods.attributeCategory.label"),'default':("Attribute Category")],-1)
printHtmlPart(33)
createTagBody(3, {->
expressionOut.print(nideshopGoodsInstance?.attributeCategory?.encodeAsHTML())
})
invokeTag('link','g',102,['controller':("nideshopAttributeCategory"),'action':("show"),'id':(nideshopGoodsInstance?.attributeCategory?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.brandId)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("nideshopGoods.brandId.label"),'default':("Brand Id")],-1)
printHtmlPart(35)
createTagBody(3, {->
expressionOut.print(nideshopGoodsInstance?.brandId?.encodeAsHTML())
})
invokeTag('link','g',111,['controller':("nideshopBrand"),'action':("show"),'id':(nideshopGoodsInstance?.brandId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.categoryId)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("nideshopGoods.categoryId.label"),'default':("Category Id")],-1)
printHtmlPart(37)
createTagBody(3, {->
expressionOut.print(nideshopGoodsInstance?.categoryId?.encodeAsHTML())
})
invokeTag('link','g',120,['controller':("nideshopCategory"),'action':("show"),'id':(nideshopGoodsInstance?.categoryId?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.counterPrice)) {
printHtmlPart(38)
invokeTag('message','g',127,['code':("nideshopGoods.counterPrice.label"),'default':("Counter Price")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',129,['bean':(nideshopGoodsInstance),'field':("counterPrice")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.extraPrice)) {
printHtmlPart(40)
invokeTag('message','g',136,['code':("nideshopGoods.extraPrice.label"),'default':("Extra Price")],-1)
printHtmlPart(41)
invokeTag('fieldValue','g',138,['bean':(nideshopGoodsInstance),'field':("extraPrice")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.goodsBrief)) {
printHtmlPart(42)
invokeTag('message','g',145,['code':("nideshopGoods.goodsBrief.label"),'default':("Goods Brief")],-1)
printHtmlPart(43)
invokeTag('fieldValue','g',147,['bean':(nideshopGoodsInstance),'field':("goodsBrief")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.goodsNumber)) {
printHtmlPart(44)
invokeTag('message','g',154,['code':("nideshopGoods.goodsNumber.label"),'default':("Goods Number")],-1)
printHtmlPart(45)
invokeTag('fieldValue','g',156,['bean':(nideshopGoodsInstance),'field':("goodsNumber")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.isAppExclusive)) {
printHtmlPart(46)
invokeTag('message','g',163,['code':("nideshopGoods.isAppExclusive.label"),'default':("Is App Exclusive")],-1)
printHtmlPart(47)
invokeTag('fieldValue','g',165,['bean':(nideshopGoodsInstance),'field':("isAppExclusive")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.isDelete)) {
printHtmlPart(48)
invokeTag('message','g',172,['code':("nideshopGoods.isDelete.label"),'default':("Is Delete")],-1)
printHtmlPart(49)
invokeTag('fieldValue','g',174,['bean':(nideshopGoodsInstance),'field':("isDelete")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.isHot)) {
printHtmlPart(50)
invokeTag('message','g',181,['code':("nideshopGoods.isHot.label"),'default':("Is Hot")],-1)
printHtmlPart(51)
invokeTag('fieldValue','g',183,['bean':(nideshopGoodsInstance),'field':("isHot")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.isLimited)) {
printHtmlPart(52)
invokeTag('message','g',190,['code':("nideshopGoods.isLimited.label"),'default':("Is Limited")],-1)
printHtmlPart(53)
invokeTag('fieldValue','g',192,['bean':(nideshopGoodsInstance),'field':("isLimited")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.isNew)) {
printHtmlPart(54)
invokeTag('message','g',199,['code':("nideshopGoods.isNew.label"),'default':("Is New")],-1)
printHtmlPart(55)
invokeTag('fieldValue','g',201,['bean':(nideshopGoodsInstance),'field':("isNew")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.isOnSale)) {
printHtmlPart(56)
invokeTag('message','g',208,['code':("nideshopGoods.isOnSale.label"),'default':("Is On Sale")],-1)
printHtmlPart(57)
invokeTag('fieldValue','g',210,['bean':(nideshopGoodsInstance),'field':("isOnSale")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.keywords)) {
printHtmlPart(58)
invokeTag('message','g',217,['code':("nideshopGoods.keywords.label"),'default':("Keywords")],-1)
printHtmlPart(59)
invokeTag('fieldValue','g',219,['bean':(nideshopGoodsInstance),'field':("keywords")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.listPicUrl)) {
printHtmlPart(60)
invokeTag('message','g',226,['code':("nideshopGoods.listPicUrl.label"),'default':("List Pic Url")],-1)
printHtmlPart(61)
invokeTag('fieldValue','g',228,['bean':(nideshopGoodsInstance),'field':("listPicUrl")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.primaryPicUrl)) {
printHtmlPart(62)
invokeTag('message','g',235,['code':("nideshopGoods.primaryPicUrl.label"),'default':("Primary Pic Url")],-1)
printHtmlPart(63)
invokeTag('fieldValue','g',237,['bean':(nideshopGoodsInstance),'field':("primaryPicUrl")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.promotionDesc)) {
printHtmlPart(64)
invokeTag('message','g',244,['code':("nideshopGoods.promotionDesc.label"),'default':("Promotion Desc")],-1)
printHtmlPart(65)
invokeTag('fieldValue','g',246,['bean':(nideshopGoodsInstance),'field':("promotionDesc")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.retailPrice)) {
printHtmlPart(66)
invokeTag('message','g',253,['code':("nideshopGoods.retailPrice.label"),'default':("Retail Price")],-1)
printHtmlPart(67)
invokeTag('fieldValue','g',255,['bean':(nideshopGoodsInstance),'field':("retailPrice")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.sellVolume)) {
printHtmlPart(68)
invokeTag('message','g',262,['code':("nideshopGoods.sellVolume.label"),'default':("Sell Volume")],-1)
printHtmlPart(69)
invokeTag('fieldValue','g',264,['bean':(nideshopGoodsInstance),'field':("sellVolume")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.sortOrder)) {
printHtmlPart(70)
invokeTag('message','g',271,['code':("nideshopGoods.sortOrder.label"),'default':("Sort Order")],-1)
printHtmlPart(71)
invokeTag('fieldValue','g',273,['bean':(nideshopGoodsInstance),'field':("sortOrder")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (nideshopGoodsInstance?.unitPrice)) {
printHtmlPart(72)
invokeTag('message','g',280,['code':("nideshopGoods.unitPrice.label"),'default':("Unit Price")],-1)
printHtmlPart(73)
invokeTag('fieldValue','g',282,['bean':(nideshopGoodsInstance),'field':("unitPrice")],-1)
printHtmlPart(16)
}
printHtmlPart(74)
createTagBody(2, {->
printHtmlPart(75)
createTagBody(3, {->
invokeTag('message','g',290,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',290,['class':("edit"),'action':("edit"),'resource':(nideshopGoodsInstance)],3)
printHtmlPart(76)
invokeTag('actionSubmit','g',291,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(77)
})
invokeTag('form','g',293,['url':([resource:nideshopGoodsInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(78)
})
invokeTag('captureBody','sitemesh',295,[:],1)
printHtmlPart(79)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1537796153055L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
