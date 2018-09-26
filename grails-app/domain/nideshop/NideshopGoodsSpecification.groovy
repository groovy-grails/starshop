package nideshop

class NideshopGoodsSpecification {

	NideshopGoods goodsId
	NideshopSpecification specificationId
	String value
	String picUrl

	static mapping = {
		version false
		goodsId column: 'goods_id'
		specificationId column: 'specification_id'
	}

	static constraints = {
		value maxSize: 50
	}
	public String toString() {
		return value
	}
}
