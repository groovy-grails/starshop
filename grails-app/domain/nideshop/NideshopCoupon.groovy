package nideshop

class NideshopCoupon {

	String name
	BigDecimal typeMoney=0
	Byte sendType=0
	BigDecimal minAmount=0
	BigDecimal maxAmount=0
	Integer sendStartDate
	Integer sendEndDate
	Integer useStartDate
	Integer useEndDate
	BigDecimal minGoodsAmount=0

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
