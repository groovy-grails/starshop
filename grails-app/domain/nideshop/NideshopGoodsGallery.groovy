package nideshop

class NideshopGoodsGallery {

	NideshopGoods goodsId
	String imgUrl
	String imgDesc
	Integer sortOrder=5

	static mapping = {
		version false
		goodsId column: 'goods_id'
	}
	public String toString() {
		return goodsId+":"+imgUrl
	}
}
