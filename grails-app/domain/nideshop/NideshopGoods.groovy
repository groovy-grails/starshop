package nideshop

class NideshopGoods {

	NideshopCategory categoryId
	String goodsSn
	String name
	NideshopBrand brandId
	Integer goodsNumber
	String keywords
	String goodsBrief
	String goodsDesc
	Byte isOnSale=1
	Integer addTime
	Short sortOrder
	Byte isDelete=0
	NideshopAttributeCategory attributeCategory
	BigDecimal counterPrice
	BigDecimal extraPrice
	Byte isNew=0
	String goodsUnit
	String primaryPicUrl
	String listPicUrl
	BigDecimal retailPrice
	Integer sellVolume
	NideshopGoods primaryProductId
	BigDecimal unitPrice
	String promotionDesc
	String promotionTag
	BigDecimal appExclusivePrice
	Byte isAppExclusive
	Byte isLimited
	Byte isHot=0

	static mapping = {
		id generator: "assigned"
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
	}
	public String toString() {
		return name
	}
}
