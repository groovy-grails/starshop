package nideshop

class NideshopProduct {

	NideshopGoods goodsId
	NideshopGoodsSpecification goodsSpecificationIds
	String goodsSn
	Integer goodsNumber=0
	BigDecimal retailPrice=0

	static mapping = {
		version false
		goodsId column: 'goods_id'
		goodsSpecificationIds column: 'goods_specification_ids'
	}

	static constraints = {
		goodsSn maxSize: 60
	}
	public String toString() {
		return goodsId
	}
}
