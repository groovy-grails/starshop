package nideshop

class NideshopCollect {

	NideshopUser userId
	NideshopGoods valueId
	Integer addTime
	Byte isAttention=0
	Integer typeId

	static mapping = {
		version false
		userId column: 'user_id'
		valueId column: 'value_id'
	}
	public String toString() {
		return userId+"-"+valueId
	}
}
