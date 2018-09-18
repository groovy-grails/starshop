package nideshop

class NideshopChannel {

	String name
	String url
	String iconUrl
	Integer sortOrder=10

	static mapping = {
		version false
	}

	static constraints = {
		name maxSize: 45
	}
	public String toString() {
		return name
	}
}
