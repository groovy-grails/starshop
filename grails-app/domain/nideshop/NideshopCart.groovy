package nideshop

class NideshopCart {

	NideshopUser userId
	String sessionId
	NideshopGoods goodsId
	String goodsSn
	NideshopProduct productId
	String goodsName
	BigDecimal marketPrice
	BigDecimal retailPrice
	Short number
	String goodsSpecifitionNameValue
	String goodsSpecifitionIds
	Byte checked=1
	String listPicUrl

	static mapping = {
		version false
		userId column: 'user_id'
		goodsId column: 'goods_id'
		productId column: 'product_id'
	}

	static constraints = {
		sessionId maxSize: 32
		goodsSn maxSize: 60
		goodsName maxSize: 120
		goodsSpecifitionNameValue maxSize: 8000
		goodsSpecifitionIds maxSize: 60
	}
	public String toString() {
		return userId+"-"+goodsId+"-"+id
	}
}
