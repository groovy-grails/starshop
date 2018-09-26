
var regionArray=[];
<g:each in="${nideshopRegionInstanceList}" status="i" var="nideshopRegionInstance">
var regionObj={
	"id":"${nideshopRegionInstance.id}",
	"parentId":"${nideshopRegionInstance?.parentId?.id}",
	"name":"${nideshopRegionInstance.name}"
}
regionArray.push(regionObj);
</g:each>


