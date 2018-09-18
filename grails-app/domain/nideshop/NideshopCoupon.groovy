package nideshop

class NideshopCoupon {

	String name
	BigDecimal typeMoney
	Byte sendType
	BigDecimal minAmount
	BigDecimal maxAmount
	Integer sendStartDate
	Integer sendEndDate
	Integer useStartDate
	Integer useEndDate
	BigDecimal minGoodsAmount

	static mapping = {
		version false
	}

	static constraints = {
		name maxSize: 60
	}
	public String toString() {
		return name
	}
}
