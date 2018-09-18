package nideshop

class NideshopComment {

	Byte typeId
	NideshopGoods valueId
	String content
	Long addTime
	Byte status
	NideshopUser userId
	String newContent

	static mapping = {
		version false
		userId column: 'user_id'
		valueId column: 'value_id'
	}

	static constraints = {
		content maxSize: 8000
		newContent maxSize: 8000
	}
	public String toString() {
		return userId+":"+content?content.substring(0,10):""
	}
}
