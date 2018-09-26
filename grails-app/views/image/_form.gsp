<%@ page import="nideshop.Image" %>



<div class="fieldcontain ${hasErrors(bean: imageInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="image.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<input type="file" name="name" size="25" />

</div>

