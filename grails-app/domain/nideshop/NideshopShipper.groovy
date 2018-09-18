package nideshop

class NideshopShipper {

	String name
	String code
	Integer sortOrder

	static mapping = {
		version false
	}

	static constraints = {
		name maxSize: 20
		code maxSize: 10
	}
	public String toString() {
		return name
	}
}
