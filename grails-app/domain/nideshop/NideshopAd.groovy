package nideshop

class NideshopAd {

	NideshopAdPosition adPositionId
	Byte mediaType=0
	String name
	String link
	String imageUrl
	String content
	Integer endTime=0
	Byte enabled=1

	static mapping = {
		version false
		adPositionId column: 'ad_position_id'
	}

	static constraints = {
		name maxSize: 60
		imageUrl maxSize: 255
	}
	
	public String toString() {
		return name
	}
}
