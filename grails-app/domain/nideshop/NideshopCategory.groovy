package nideshop

class NideshopCategory {

	String name
	String keywords
	String frontDesc
	NideshopCategory parentId
	Byte sortOrder=50
	Byte showIndex=0
	Byte isShow=1
	String bannerUrl
	String iconUrl
	String imgUrl
	String wapBannerUrl
	String level
	Integer type
	String frontName

	static mapping = {
		version false
		parentId column: 'parent_id'
	}

	static constraints = {
		name maxSize: 90
	}
	public String toString() {
		return name
	}
}
