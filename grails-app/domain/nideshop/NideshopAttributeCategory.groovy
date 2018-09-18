package nideshop

class NideshopAttributeCategory {

	String name
	Byte enabled=1

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
