package nideshop

class NideshopSpecification {

	String name
	Byte sortOrder=0

	static mapping = {
		version false
	}

	static constraints = {
		name maxSize: 60
	}
	public String toString() {
		return name
	}
}
