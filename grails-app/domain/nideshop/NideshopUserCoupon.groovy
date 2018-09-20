package nideshop

class NideshopUserCoupon {

	NideshopCoupon couponId
	String couponNumber
	NideshopUser userId
	Integer usedTime
	NideshopOrder orderId

	static mapping = {
		version false
		userId column: 'user_id'
		couponId column: 'coupon_id'
		orderId column: 'order_id'
	}

	static constraints = {
		couponNumber maxSize: 20
		orderId nullable:true,blank:true
	}
	public String toString() {
		return userId+"-"+couponId
	}
}
