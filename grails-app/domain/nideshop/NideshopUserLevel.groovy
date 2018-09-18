package nideshop

class NideshopUserLevel {

	String name
	String description

	static mapping = {
		version false
	}

	static constraints = {
		name maxSize: 30
	}
	public String toString() {
		return name
	}
}
