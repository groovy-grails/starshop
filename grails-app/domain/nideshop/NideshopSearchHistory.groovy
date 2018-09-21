package nideshop

class NideshopSearchHistory {

	String keyword
	String from
	Integer addTime
	String userId

	static mapping = {
		version false
	}

	static constraints = {
		keyword maxSize: 50
		from  column : '`from`' ,maxSize: 45 
		userId nullable: true, maxSize: 45
	}
	public String toString() {
		return userId+"-"+keyword
	}
}
