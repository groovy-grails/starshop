<%@ page import="nideshop.NideshopOrder" %>



<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'orderSn', 'error')} required">
	<label for="orderSn">
		<g:message code="nideshopOrder.orderSn.label" default="Order Sn" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="orderSn" maxlength="20" required="" value="${nideshopOrderInstance?.orderSn}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'consignee', 'error')} required">
	<label for="consignee">
		<g:message code="nideshopOrder.consignee.label" default="Consignee" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="consignee" maxlength="60" required="" value="${nideshopOrderInstance?.consignee}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'mobile', 'error')} required">
	<label for="mobile">
		<g:message code="nideshopOrder.mobile.label" default="Mobile" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="mobile" maxlength="60" required="" value="${nideshopOrderInstance?.mobile}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'payName', 'error')} required">
	<label for="payName">
		<g:message code="nideshopOrder.payName.label" default="Pay Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="payName" maxlength="120" required="" value="${nideshopOrderInstance?.payName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'callbackStatus', 'error')} ">
	<label for="callbackStatus">
		<g:message code="nideshopOrder.callbackStatus.label" default="Callback Status" />
		
	</label>
	<g:textField name="callbackStatus" maxlength="5" value="${nideshopOrderInstance?.callbackStatus}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'actualPrice', 'error')} required">
	<label for="actualPrice">
		<g:message code="nideshopOrder.actualPrice.label" default="Actual Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="actualPrice" value="${fieldValue(bean: nideshopOrderInstance, field: 'actualPrice')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'addTime', 'error')} required">
	<label for="addTime">
		<g:message code="nideshopOrder.addTime.label" default="Add Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="addTime" type="number" value="${nideshopOrderInstance.addTime}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'address', 'error')} required">
	<label for="address">
		<g:message code="nideshopOrder.address.label" default="Address" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="address" required="" value="${nideshopOrderInstance?.address}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'city', 'error')} required">
	<label for="city">
		<g:message code="nideshopOrder.city.label" default="City" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="city" type="number" value="${nideshopOrderInstance.city}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'confirmTime', 'error')} required">
	<label for="confirmTime">
		<g:message code="nideshopOrder.confirmTime.label" default="Confirm Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="confirmTime" type="number" value="${nideshopOrderInstance.confirmTime}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'country', 'error')} required">
	<label for="country">
		<g:message code="nideshopOrder.country.label" default="Country" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="country" type="number" value="${nideshopOrderInstance.country}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'couponId', 'error')} required">
	<label for="couponId">
		<g:message code="nideshopOrder.couponId.label" default="Coupon Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="couponId" name="couponId.id" from="${nideshop.NideshopCoupon.list()}" optionKey="id" required="" value="${nideshopOrderInstance?.couponId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'couponPrice', 'error')} required">
	<label for="couponPrice">
		<g:message code="nideshopOrder.couponPrice.label" default="Coupon Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="couponPrice" value="${fieldValue(bean: nideshopOrderInstance, field: 'couponPrice')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'district', 'error')} required">
	<label for="district">
		<g:message code="nideshopOrder.district.label" default="District" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="district" type="number" value="${nideshopOrderInstance.district}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'freightPrice', 'error')} required">
	<label for="freightPrice">
		<g:message code="nideshopOrder.freightPrice.label" default="Freight Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="freightPrice" type="number" value="${nideshopOrderInstance.freightPrice}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'goodsPrice', 'error')} required">
	<label for="goodsPrice">
		<g:message code="nideshopOrder.goodsPrice.label" default="Goods Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="goodsPrice" value="${fieldValue(bean: nideshopOrderInstance, field: 'goodsPrice')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'integral', 'error')} required">
	<label for="integral">
		<g:message code="nideshopOrder.integral.label" default="Integral" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="integral" type="number" value="${nideshopOrderInstance.integral}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'integralMoney', 'error')} required">
	<label for="integralMoney">
		<g:message code="nideshopOrder.integralMoney.label" default="Integral Money" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="integralMoney" value="${fieldValue(bean: nideshopOrderInstance, field: 'integralMoney')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'orderPrice', 'error')} required">
	<label for="orderPrice">
		<g:message code="nideshopOrder.orderPrice.label" default="Order Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="orderPrice" value="${fieldValue(bean: nideshopOrderInstance, field: 'orderPrice')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'orderStatus', 'error')} required">
	<label for="orderStatus">
		<g:message code="nideshopOrder.orderStatus.label" default="Order Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="orderStatus" type="number" value="${nideshopOrderInstance.orderStatus}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'parentId', 'error')} required">
	<label for="parentId">
		<g:message code="nideshopOrder.parentId.label" default="Parent Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="parentId" name="parentId.id" from="${nideshop.NideshopOrder.list()}" optionKey="id" required="" value="${nideshopOrderInstance?.parentId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'payId', 'error')} required">
	<label for="payId">
		<g:message code="nideshopOrder.payId.label" default="Pay Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="payId" type="number" value="${nideshopOrderInstance.payId}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'payStatus', 'error')} required">
	<label for="payStatus">
		<g:message code="nideshopOrder.payStatus.label" default="Pay Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="payStatus" type="number" value="${nideshopOrderInstance.payStatus}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'payTime', 'error')} required">
	<label for="payTime">
		<g:message code="nideshopOrder.payTime.label" default="Pay Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="payTime" type="number" value="${nideshopOrderInstance.payTime}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'postscript', 'error')} required">
	<label for="postscript">
		<g:message code="nideshopOrder.postscript.label" default="Postscript" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="postscript" required="" value="${nideshopOrderInstance?.postscript}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'province', 'error')} required">
	<label for="province">
		<g:message code="nideshopOrder.province.label" default="Province" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="province" type="number" value="${nideshopOrderInstance.province}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'shippingFee', 'error')} required">
	<label for="shippingFee">
		<g:message code="nideshopOrder.shippingFee.label" default="Shipping Fee" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="shippingFee" value="${fieldValue(bean: nideshopOrderInstance, field: 'shippingFee')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'shippingStatus', 'error')} required">
	<label for="shippingStatus">
		<g:message code="nideshopOrder.shippingStatus.label" default="Shipping Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="shippingStatus" type="number" value="${nideshopOrderInstance.shippingStatus}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopOrderInstance, field: 'userId', 'error')} required">
	<label for="userId">
		<g:message code="nideshopOrder.userId.label" default="User Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="userId" name="userId.id" from="${nideshop.NideshopUser.list()}" optionKey="id" required="" value="${nideshopOrderInstance?.userId?.id}" class="many-to-one"/>

</div>

