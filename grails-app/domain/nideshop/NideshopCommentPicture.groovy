package nideshop

class NideshopCommentPicture {

	NideshopComment commentId
	String picUrl
	Byte sortOrder=5

	static mapping = {
		version false
		commentId column: 'comment_id'
	}
	public String toString() {
		return commentId+":"+picUrl
	}
}
