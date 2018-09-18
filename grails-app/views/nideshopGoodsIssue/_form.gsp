<%@ page import="nideshop.NideshopGoodsIssue" %>



<div class="fieldcontain ${hasErrors(bean: nideshopGoodsIssueInstance, field: 'goodsId', 'error')} ">
	<label for="goodsId">
		<g:message code="nideshopGoodsIssue.goodsId.label" default="Goods Id" />
		
	</label>
	<g:select id="goodsId" name="goodsId.id" from="${nideshop.NideshopGoods.list()}" optionKey="id" value="${nideshopGoodsIssueInstance?.goodsId?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsIssueInstance, field: 'question', 'error')} ">
	<label for="question">
		<g:message code="nideshopGoodsIssue.question.label" default="Question" />
		
	</label>
	<g:textField name="question" value="${nideshopGoodsIssueInstance?.question}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopGoodsIssueInstance, field: 'answer', 'error')} ">
	<label for="answer">
		<g:message code="nideshopGoodsIssue.answer.label" default="Answer" />
		
	</label>
	<g:textField name="answer" maxlength="45" value="${nideshopGoodsIssueInstance?.answer}"/>

</div>

