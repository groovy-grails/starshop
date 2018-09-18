package nideshop


class NideshopKeywords implements Serializable {

	String keyword
	Byte isHot=0
	Byte isDefault=0
	Byte isShow=1
	Integer sortOrder
	String schemeUrl
	Integer type


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
