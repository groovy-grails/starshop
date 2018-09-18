// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better 
// to create separate JavaScript files as needed.
//
//= require jquery
//= require_tree .
//= require_self

if (typeof jQuery !== 'undefined') {
	(function($) {
		$('#spinner').ajaxStart(function() {
			$(this).fadeIn();
		}).ajaxStop(function() {
			$(this).fadeOut();
		});
		
		$(document).ready(function(){
			var url=location.pathname;
			var filter="superAdmin,nideshopAdmin,nideshopSearchHistory,nideshopCart,nideshopCollect,nideshopFootprint,nideshopCommentPicture,nideshopUserLevel,nideshopUser,nideshopRegion,nideshopAddress,nideshopChannel,nideshopCategory,nideshopBrand,nideshopAttributeCategory,nideshopAttribute,nideshopKeywords,nideshopSpecification,nideshopShipper,nideshopCoupon,nideshopTopicCategory,nideshopAdPosition,nideshopAd,permission,sysRole,sysUser,sysUserSysRole";
			var pathArray=filter.split(",");
			if(url.indexOf("/")!=-1){
				var temp=url.substring(url.indexOf("/")+1);
				if(temp&&temp.indexOf("/")!=-1){
					var home_link=temp.substring(0,temp.indexOf("/"));
					console.log(home_link);
					var flag=false;
					for(i=0;i<pathArray.length;i++){
						if(url.indexOf("/"+home_link+"/"+pathArray[i])==0){
							flag=true;
						}
					}
					if(flag){
						$("#home_link").attr("href","/"+home_link+"/superAdmin");
						$(".nav .home").attr("href","/"+home_link+"/superAdmin");
					}else{
						$("#home_link").attr("href","/"+home_link);
					}
					
				}
			}
		});
		
	})(jQuery);
}
