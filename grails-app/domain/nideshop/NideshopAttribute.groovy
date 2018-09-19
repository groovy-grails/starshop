package nideshop

class NideshopAttribute {

	NideshopAttributeCategory attributeCategoryId
	String name
	Boolean inputType=1
	String values
	Byte sortOrder=0

	static mapping = {
		version false
		attributeCategoryId column: 'attribute_category_id'
	}

	static constraints = {
		name maxSize: 60
		values maxSize: 8000
	}
	public String toString() {
		return name
	}
}
