<%@ page import="nideshop.NideshopAddress" %>



<div class="fieldcontain ${hasErrors(bean: nideshopAddressInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="nideshopAddress.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="50" required="" value="${nideshopAddressInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAddressInstance, field: 'address', 'error')} required">
	<label for="address">
		<g:message code="nideshopAddress.address.label" default="Address" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="address" maxlength="120" required="" value="${nideshopAddressInstance?.address}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAddressInstance, field: 'mobile', 'error')} required">
	<label for="mobile">
		<g:message code="nideshopAddress.mobile.label" default="Mobile" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="mobile" maxlength="60" required="" value="${nideshopAddressInstance?.mobile}"/>

</div>



<div class="fieldcontain ${hasErrors(bean: nideshopAddressInstance, field: 'countryId', 'error')} required">
	<label for="countryId">
		<g:message code="nideshopAddress.countryId.label" default="Country Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="countryId" name="countryId.id" from="${nideshop.NideshopRegion.findAllByType(0)}" optionKey="id" required="" value="${nideshopAddressInstance?.countryId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAddressInstance, field: 'provinceId', 'error')} required">
	<label for="provinceId">
		<g:message code="nideshopAddress.provinceId.label" default="Province Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="provinceId" name="provinceId.id" from="${nideshop.NideshopRegion.findAllByType(1)}" optionKey="id" required="" value="${nideshopAddressInstance?.provinceId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAddressInstance, field: 'cityId', 'error')} required">
	<label for="cityId">
		<g:message code="nideshopAddress.cityId.label" default="City Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="cityId" name="cityId.id" from="${nideshop.NideshopRegion.findAllByType(2)}" optionKey="id" required="" value="${nideshopAddressInstance?.cityId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAddressInstance, field: 'districtId', 'error')} required">
	<label for="districtId">
		<g:message code="nideshopAddress.districtId.label" default="District Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="districtId" name="districtId.id" from="${nideshop.NideshopRegion.findAllByType(3)}" optionKey="id" required="" value="${nideshopAddressInstance?.districtId?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: nideshopAddressInstance, field: 'isDefault', 'error')} required">
	<label for="isDefault">
		<g:message code="nideshopAddress.isDefault.label" default="Is Default" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="isDefault" type="number" value="${nideshopAddressInstance.isDefault}" required=""/>

</div>



<div class="fieldcontain ${hasErrors(bean: nideshopAddressInstance, field: 'userId', 'error')} required">
	<label for="userId">
		<g:message code="nideshopAddress.userId.label" default="User Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="userId" name="userId.id" from="${nideshop.NideshopUser.list()}" optionKey="id" required="" value="${nideshopAddressInstance?.userId?.id}" class="many-to-one"/>

</div>

