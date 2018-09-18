package nideshop

class NideshopTopicCategory {

	String title
	String picUrl

	static mapping = {
		version false
	}
	public String toString() {
		return title
	}
}
