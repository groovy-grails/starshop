package nideshop

class NideshopAddress {

	String name
	NideshopUser userId
	NideshopRegion countryId
	NideshopRegion provinceId
	NideshopRegion cityId
	NideshopRegion districtId
	String address
	String mobile
	Byte isDefault=0

	static mapping = {
		version false
		userId column: 'user_id'
		countryId column: 'country_id'
		provinceId column: 'province_id'
		cityId column: 'city_id'
		districtId column: 'district_id'
	}

	static constraints = {
		name maxSize: 50
		address maxSize: 120
		mobile maxSize: 60
	}
	public String toString() {
		return name
	}
}
