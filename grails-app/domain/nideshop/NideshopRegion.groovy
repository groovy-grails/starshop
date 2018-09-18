package nideshop

class NideshopRegion {

	NideshopRegion parentId
	String name
	Byte type=2
	Short agencyId

	static mapping = {
		version false
		parentId column: 'parent_id'
	}

	static constraints = {
		name maxSize: 120
		parentId nullable:true,blank:true
	}
	public String toString() {
		return name
	}
}
