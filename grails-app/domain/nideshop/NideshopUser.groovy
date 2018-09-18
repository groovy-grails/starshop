package nideshop

class NideshopUser {

	String username
	String password
	Byte gender=0
	Long birthday
	Long registerTime
	Long lastLoginTime
	String lastLoginIp
	NideshopUserLevel userLevelId
	String nickname
	String mobile
	String registerIp
	String avatar
	String weixinOpenid

	static mapping = {
		version false
		userLevelId  column: 'user_level_id'
	}

	static constraints = {
		username maxSize: 60, unique: true
		password maxSize: 32
		lastLoginIp maxSize: 15
		nickname maxSize: 60
		mobile maxSize: 20
		registerIp maxSize: 45
		weixinOpenid maxSize: 50
	}
	public String toString() {
		return username
	}
}
