package nideshop

class NideshopGoodsIssue {

	NideshopGoods goodsId
	String question
	String answer

	static mapping = {
		version false
		goodsId column: 'goods_id'
	}

	static constraints = {
		goodsId nullable: true
		question nullable: true
		answer nullable: true, maxSize: 45
	}
	public String toString() {
		return question
	}
}
