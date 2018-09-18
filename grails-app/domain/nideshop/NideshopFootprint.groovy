package nideshop

class NideshopFootprint {

	NideshopUser userId
	NideshopGoods goodsId
	Integer addTime

	static mapping = {
		version false
		userId column: 'user_id'
		goodsId column: 'goods_id'
	}
	public String toString() {
		return userId+"-"+goodsId
	}
}
