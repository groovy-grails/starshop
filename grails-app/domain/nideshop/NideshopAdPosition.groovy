package nideshop

class NideshopAdPosition {

	String name
	Short width
	Short height
	String desc

	static mapping = {
		version false
		desc column:'`desc`'
	}

	static constraints = {
		name maxSize: 60
	}
	public String toString() {
		return name
	}
}
