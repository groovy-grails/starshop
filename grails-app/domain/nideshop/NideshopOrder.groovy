package nideshop

class NideshopOrder {

	String orderSn
	NideshopUser userId
	Byte orderStatus=0
	Byte shippingStatus=0
	Byte payStatus=0
	String consignee
	Short country
	Short province
	Short city
	Short district
	String address
	String mobile
	String postscript
	BigDecimal shippingFee=0
	String payName
	Byte payId=0
	BigDecimal actualPrice=0
	Integer integral=0
	BigDecimal integralMoney=0
	BigDecimal orderPrice=0
	BigDecimal goodsPrice=0
	Integer addTime
	Integer confirmTime
	Integer payTime
	Integer freightPrice=0
	NideshopCoupon couponId
	NideshopOrder parentId
	BigDecimal couponPrice=0
	String callbackStatus

	static mapping = {
		version false
		userId column: 'user_id'
		couponId column: 'coupon_id'
		parentId column: 'parent_id'
	}

	static constraints = {
		orderSn maxSize: 20, unique: true
		consignee maxSize: 60
		mobile maxSize: 60
		payName maxSize: 120
		callbackStatus nullable: true, maxSize: 5
		parentId nullable:true,blank:true
	}
	public String toString() {
		return orderSn
	}
}
