package nideshop

class NideshopOrderExpress {

	NideshopOrder orderId
	NideshopShipper shipperId
	String shipperName
	String shipperCode
	String logisticCode
	String traces
	Byte isFinish=0
	Integer requestCount=0
	Integer requestTime
	Integer addTime
	Integer updateTime

	static mapping = {
		version false
		orderId column: 'order_id'
		shipperId column: 'shipper_id'
	}

	static constraints = {
		shipperName maxSize: 120
		shipperCode maxSize: 60
		logisticCode maxSize: 20
		traces maxSize: 2000
		requestCount nullable: true
		requestTime nullable: true
	}
	public String toString() {
		return orderId+"-"+shipperId
	}
}
