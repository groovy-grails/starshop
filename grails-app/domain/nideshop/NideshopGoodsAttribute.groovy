package nideshop

class NideshopGoodsAttribute {

	NideshopGoods goodsId
	NideshopAttribute attributeId
	String value

	static mapping = {
		version false
		goodsId column: 'goods_id'
		attributeId column: 'attribute_id'
	}

	static constraints = {
		value maxSize: 8000
	}
	public String toString() {
		return value
	}
}
