package nideshop

class NideshopProduct {

	NideshopGoods goodsId
	String goodsSpecificationIds
	String goodsSn
	Integer goodsNumber
	BigDecimal retailPrice

	static mapping = {
		version false
		goodsId column: 'goods_id'
	}

	static constraints = {
		goodsSpecificationIds maxSize: 50
		goodsSn maxSize: 60
	}
	public String toString() {
		return goodsId+"-"+goodsSn
	}
}
