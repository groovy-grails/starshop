package nideshop


class NideshopTopic {

	String title
	String content
	String avatar
	String itemPicUrl
	String subtitle
	NideshopTopicCategory topicCategoryId
	BigDecimal priceInfo=0
	String readCount=0
	String scenePicUrl
	Integer topicTemplateId=0
	Integer topicTagId=0
	Integer sortOrder=100
	Byte isShow=1

	static mapping = {
		version false
		topicCategoryId column: 'topic_category_id'
	}

	static constraints = {
		content nullable: true, maxSize: 8000
	}
	public String toString() {
		return title
	}
}
