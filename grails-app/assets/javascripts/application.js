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
		/**
		 * superAdmin page change url to superAdmin
		 */
		function changeUrl2superAdmin(){
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
		}
		/**
		 * uploadpic panel function
		 */
		function showUploadPanel(){
			addOneUploadButton("#create-nideshopBrand form input[name='appListPicUrl']","appListPicUrl");
		}
		/**
		 * add one upload button
		 */
		function addOneUploadButton(domString,inputString){
			if($(domString).length>0){
				$(domString).after("&nbsp;&nbsp;<input type='button' id='add_pic_btn_"+inputString+"' name='add_btn' value='addPicture.label' >");
				$("#add_pic_btn_"+inputString).bind("click",function(){
					bindOpenPanel(domString,inputString);
				});
			}
		}
		/**
		 * bind open panel function
		 */
		function bindOpenPanel(domString,inputString){
			var posObj=getElemPos($(domString)[0]);
			var projectName=getProjectName();
			var panelString="<div class='upload_panel' id='add_pic_pan_"+inputString+"' >";
				panelString+="<div class='close_pic_panel' >X</div>";
				panelString+="<div class='upload_frame' >";
				panelString+="<iframe scrolling='no' width='500' height='250' src='/"+projectName+"/p/create' >";
				panelString+="</div></div>";
			var panel=$(panelString);
			if($(".upload_panel").length>0){
				$(".upload_panel").remove();
			}
			$("body").append(panel);
			panel.css({
				"position":"absolute",
				"width":"500px",
				"height":"270px",
				"left":posObj.x+"px",
				"top":(parseInt(posObj.y)-100)+"px",
				"border":"1px solid #000"
			});
			$("#add_pic_pan_"+inputString+" .close_pic_panel").css({
				"position":"absolute",
				"width":"20px",
				"height":"20px",
				"left":"480px",
				"top":"0",
				"border":"1px solid #000",
				"border-radius":"10px",
				"background-color":"#ee2200",
				"text-align":"center",
				"cursor":"pointer"
			});
			$("#add_pic_pan_"+inputString+" .upload_frame").css({
				"position":"absolute",
				"width":"500px",
				"height":"250px",
				"left":"0",
				"top":"20px",
				"overflow":"hidden"
			});
			$("#add_pic_pan_"+inputString+" .close_pic_panel").bind("click",function(e){
				panel.remove();
			});
		}
		/**
		 * get dom absolute position
		 */
		function getElemPos(obj){
	        var pos = {"top":0, "left":0};
	         if (obj.offsetParent){
	           while (obj.offsetParent){
	             pos.top += obj.offsetTop;
	             pos.left += obj.offsetLeft;
	             obj = obj.offsetParent;
	           }
	         }else if(obj.x){
	           pos.left += obj.x;
	         }else if(obj.y){
	           pos.top += obj.y;
	         }
	         return {x:pos.left, y:pos.top};
		}
		/**
		 * get project name
		 */
		function getProjectName(){
			var url=location.pathname;
			var projectName="/";
			if(url.indexOf("/")!=-1){
				var temp=url.substring(url.indexOf("/")+1);
				if(temp&&temp.indexOf("/")!=-1){
					projectName=temp.substring(0,temp.indexOf("/"));
				}
			}
			return projectName;
		}

		$(document).ready(function(){
			changeUrl2superAdmin();
			showUploadPanel();
		});
		
	})(jQuery);
}

/**
 * after upload success process function
 */
function afterUploadSuccess(lastfileName){
	var fileName="http://a.g4f.cn/i/"+lastfileName;
	console.log(fileName);
	//out of frame must use top.document
	var obj=top.document.getElementsByClassName("upload_panel");
	console.log(obj);
	var inputname=$(obj).attr("id").substring(12);
	console.log(inputname);
	//out of frame must use top.document or exist dom
	$(obj).parent("body").find("input[name='"+inputname+"']").val(fileName);
	$(obj).remove();
}
