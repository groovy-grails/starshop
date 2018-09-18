package nideshop

class NideshopRelatedGoods {

	NideshopGoods goodsId
	NideshopGoods relatedGoodsId

	static mapping = {
		version false
		goodsId column: 'goods_id'
		relatedGoodsId column: 'related_goods_id'
	}
	public String toString() {
		return goodsId+"-"+relatedGoodsId
	}
}
