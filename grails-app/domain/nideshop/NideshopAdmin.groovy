package nideshop

class NideshopAdmin {

	String username
	String password
	String passwordSalt
	String lastLoginIp
	Integer lastLoginTime
	Integer addTime
	Integer updateTime
	String avatar
	Integer adminRoleId

	static mapping = {
		version false
	}

	static constraints = {
		username maxSize: 10
		lastLoginIp maxSize: 60
	}
	public String toString() {
		return username
	}
}
