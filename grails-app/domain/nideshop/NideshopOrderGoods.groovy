package nideshop

class NideshopOrderGoods {

	NideshopOrder orderId
	NideshopGoods goodsId
	String goodsName
	String goodsSn
	NideshopProduct productId
	Short number=1
	BigDecimal marketPrice=0
	BigDecimal retailPrice=0
	String goodsSpecifitionNameValue
	Byte isReal=0
	String goodsSpecifitionIds
	String listPicUrl

	static mapping = {
		version false
		orderId column: 'order_id'
		goodsId column: 'goods_id'
		productId column: 'product_id'
	}

	static constraints = {
		goodsName maxSize: 120
		goodsSn maxSize: 60
		goodsSpecifitionNameValue maxSize: 8000
	}
	public String toString() {
		return goodsName
	}
}
