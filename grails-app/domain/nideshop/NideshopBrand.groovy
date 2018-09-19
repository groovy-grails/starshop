package nideshop

class NideshopBrand {

	String name
	String listPicUrl
	String simpleDesc
	String picUrl
	Byte sortOrder=50
	Boolean isShow
	BigDecimal floorPrice=0
	String appListPicUrl
	Boolean isNew
	String newPicUrl
	Byte newSortOrder=10

	static mapping = {
		version false
	}
	public String toString() {
		return name
	}
}
