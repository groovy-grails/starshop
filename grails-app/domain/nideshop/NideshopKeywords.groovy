package nideshop


class NideshopKeywords implements Serializable {

	String keyword
	Byte isHot=0
	Byte isDefault=0
	Byte isShow=1
	Integer sortOrder=100
	String schemeUrl
	Integer type=0


	static mapping = {
		id composite: ["keyword", "id"]
		version false
	}

	static constraints = {
		keyword maxSize: 90
	}
	public String toString() {
		return keyword
	}
}
