<%@ page import="nideshop.NideshopCoupon" %>



<div class="fieldcontain ${hasErrors(bean: nideshopCouponInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="nideshopCoupon.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="60" required="" value="${nideshopCouponInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCouponInstance, field: 'maxAmount', 'error')} required">
	<label for="maxAmount">
		<g:message code="nideshopCoupon.maxAmount.label" default="Max Amount" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="maxAmount" value="${fieldValue(bean: nideshopCouponInstance, field: 'maxAmount')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCouponInstance, field: 'minAmount', 'error')} required">
	<label for="minAmount">
		<g:message code="nideshopCoupon.minAmount.label" default="Min Amount" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="minAmount" value="${fieldValue(bean: nideshopCouponInstance, field: 'minAmount')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCouponInstance, field: 'minGoodsAmount', 'error')} required">
	<label for="minGoodsAmount">
		<g:message code="nideshopCoupon.minGoodsAmount.label" default="Min Goods Amount" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="minGoodsAmount" value="${fieldValue(bean: nideshopCouponInstance, field: 'minGoodsAmount')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCouponInstance, field: 'sendEndDate', 'error')} required">
	<label for="sendEndDate">
		<g:message code="nideshopCoupon.sendEndDate.label" default="Send End Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sendEndDate" type="number" value="${nideshopCouponInstance.sendEndDate}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCouponInstance, field: 'sendStartDate', 'error')} required">
	<label for="sendStartDate">
		<g:message code="nideshopCoupon.sendStartDate.label" default="Send Start Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sendStartDate" type="number" value="${nideshopCouponInstance.sendStartDate}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCouponInstance, field: 'sendType', 'error')} required">
	<label for="sendType">
		<g:message code="nideshopCoupon.sendType.label" default="Send Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sendType" type="number" value="${nideshopCouponInstance.sendType}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCouponInstance, field: 'typeMoney', 'error')} required">
	<label for="typeMoney">
		<g:message code="nideshopCoupon.typeMoney.label" default="Type Money" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="typeMoney" value="${fieldValue(bean: nideshopCouponInstance, field: 'typeMoney')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCouponInstance, field: 'useEndDate', 'error')} required">
	<label for="useEndDate">
		<g:message code="nideshopCoupon.useEndDate.label" default="Use End Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="useEndDate" type="number" value="${nideshopCouponInstance.useEndDate}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopCouponInstance, field: 'useStartDate', 'error')} required">
	<label for="useStartDate">
		<g:message code="nideshopCoupon.useStartDate.label" default="Use Start Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="useStartDate" type="number" value="${nideshopCouponInstance.useStartDate}" required=""/>

</div>

