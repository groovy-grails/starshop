package nideshop

class NideshopGoods {

	NideshopCategory categoryId
	String goodsSn
	String name
	NideshopBrand brandId
	Integer goodsNumber=0
	String keywords
	String goodsBrief
	String goodsDesc
	Byte isOnSale=1
	Integer addTime
	Short sortOrder=100
	Byte isDelete=0
	NideshopAttributeCategory attributeCategory
	BigDecimal counterPrice=0
	BigDecimal extraPrice=0
	Byte isNew=0
	String goodsUnit
	String primaryPicUrl
	String listPicUrl
	BigDecimal retailPrice=0
	Integer sellVolume
	NideshopGoods primaryProductId
	BigDecimal unitPrice=0
	String promotionDesc
	String promotionTag
	BigDecimal appExclusivePrice=0
	Byte isAppExclusive=0
	Byte isLimited=0
	Byte isHot=0

	static mapping = {
		version false
		categoryId column: 'category_id'
		brandId column: 'brand_id'
		attributeCategory column: 'attribute_category'
		primaryProductId column: 'primary_product_id'
	}

	static constraints = {
		goodsSn maxSize: 60
		name maxSize: 120
		goodsDesc nullable: true, maxSize: 8000
		goodsUnit maxSize: 45
		promotionTag maxSize: 45
		primaryProductId nullable:true,blank:true
	}
	public String toString() {
		return name
	}
}
