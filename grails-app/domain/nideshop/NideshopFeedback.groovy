package nideshop

class NideshopFeedback {

	NideshopFeedback parentId
	NideshopUser userId
	String userName
	String userEmail
	String msgTitle
	Byte msgType=0
	Byte msgStatus=0
	String msgContent
	Integer msgTime
	String messageImg
	Integer orderId
	Byte msgArea=0

	static mapping = {
		id column: "msg_id"
		version false
		parentId column: 'parent_id'
		userId column: 'user_id'
	}

	static constraints = {
		userName maxSize: 60
		userEmail maxSize: 60
		msgTitle maxSize: 200
		msgContent maxSize: 8000
	}
	public String toString() {
		return userName+":"+msgContent?msgContent.substring(0,10):""
	}
}
