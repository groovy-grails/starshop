<%@ page import="nideshop.NideshopUserCoupon" %>



<div class="fieldcontain ${hasErrors(bean: nideshopUserCouponInstance, field: 'couponNumber', 'error')} required">
	<label for="couponNumber">
		<g:message code="nideshopUserCoupon.couponNumber.label" default="Coupon Number" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="couponNumber" maxlength="20" required="" value="${nideshopUserCouponInstance?.couponNumber}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserCouponInstance, field: 'couponId', 'error')} required">
	<label for="couponId">
		<g:message code="nideshopUserCoupon.couponId.label" default="Coupon Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="couponId" name="couponId.id" from="${nideshop.NideshopCoupon.list()}" optionKey="id" required="" value="${nideshopUserCouponInstance?.couponId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserCouponInstance, field: 'orderId', 'error')} required">
	<label for="orderId">
		<g:message code="nideshopUserCoupon.orderId.label" default="Order Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="orderId" type="number" value="${nideshopUserCouponInstance.orderId}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserCouponInstance, field: 'usedTime', 'error')} required">
	<label for="usedTime">
		<g:message code="nideshopUserCoupon.usedTime.label" default="Used Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="usedTime" type="number" value="${nideshopUserCouponInstance.usedTime}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopUserCouponInstance, field: 'userId', 'error')} required">
	<label for="userId">
		<g:message code="nideshopUserCoupon.userId.label" default="User Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="userId" name="userId.id" from="${nideshop.NideshopUser.list()}" optionKey="id" required="" value="${nideshopUserCouponInstance?.userId?.id}" class="many-to-one"/>

</div>

