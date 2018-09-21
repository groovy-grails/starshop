package nideshop

class NideshopBrand {

	String name
	String listPicUrl
	String simpleDesc
	String picUrl
	Byte sortOrder=50
	Boolean isShow=1
	BigDecimal floorPrice=0
	String appListPicUrl
	Boolean isNew=0
	String newPicUrl
	Byte newSortOrder=10

	static mapping = {
		version false
	}
	public String toString() {
		return name
	}
}
