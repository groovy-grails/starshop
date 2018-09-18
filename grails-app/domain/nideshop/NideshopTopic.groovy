package nideshop


class NideshopTopic {

	String title
	String content
	String avatar
	String itemPicUrl
	String subtitle
	NideshopTopicCategory topicCategoryId
	BigDecimal priceInfo
	String readCount
	String scenePicUrl
	Integer topicTemplateId
	Integer topicTagId
	Integer sortOrder
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
