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
		 * create-nideshopCategory bannerUrl iconUrl imgUrl wapBannerUrl
		 * create-nideshopBrand appListPicUrl listPicUrl newPicUrl picUrl
		 * create-nideshopTopicCategory picUrl
		 * create-nideshopAd imageUrl
		 * create-nideshopAdmin avatar
		 * create-nideshopGoods listPicUrl primaryPicUrl
		 * create-nideshopGoodsSpecification picUrl
		 * create-nideshopGoodsGallery imgUrl
		 * create-nideshopOrderGoods listPicUrl
		 * create-nideshopTopicCategory picUrl
		 * create-nideshopTopic itemPicUrl avatar scenePicUrl
		 * create-nideshopFeedback messageImg
		 */
		function showUploadPanel(){
			addOneUploadButton("#bannerUrl","bannerUrl");
			addOneUploadButton("#iconUrl","iconUrl");
			addOneUploadButton("#imgUrl","imgUrl");
			addOneUploadButton("#imageUrl","imageUrl");
			addOneUploadButton("#wapBannerUrl","wapBannerUrl");
			addOneUploadButton("#appListPicUrl","appListPicUrl");
			addOneUploadButton("#listPicUrl","listPicUrl");
			addOneUploadButton("#newPicUrl","newPicUrl");
			addOneUploadButton("#picUrl","picUrl");
			addOneUploadButton("#avatar","avatar");
			addOneUploadButton("#primaryPicUrl","primaryPicUrl");
			addOneUploadButton("#itemPicUrl","itemPicUrl");
			addOneUploadButton("#scenePicUrl","scenePicUrl");
			addOneUploadButton("#messageImg","messageImg");
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
			console.log(posObj);
			var projectName=getProjectName();
			var panelString="<div class='upload_panel' id='add_pic_pan_"+inputString+"' >";
				panelString+="<div class='close_pic_panel' >X</div>";
				panelString+="<div class='upload_frame' >";
				panelString+="<iframe scrolling='no' width='500' height='150' src='/"+projectName+"/p/create' ></iframe>";
				panelString+="</div></div>";
			var panel=$(panelString);
			if($(".upload_panel").length>0){
				$(".upload_panel").remove();
			}
			$("body").append(panel);
			panel.css({
				"position":"absolute",
				"width":"500px",
				"height":"170px",
				"left":posObj.x+"px",
				"top":(parseInt(posObj.y)-50)+"px",
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
				"height":"150px",
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
		/**
		 * change datetime value to long
		 * create-nideshopCoupon sendEndDate sendStartDate  useEndDate useStartDate
		 * create-nideshopAdmin addTime lastLoginTime updateTime
		 * create-nideshopUser birthday lastLoginTime registerTime
		 * 
		 */
		function changeDate2long(){
			changeDate2longOne("addTime");
			changeDate2longOne("lastLoginTime");
			changeDate2longOne("updateTime");
			changeDate2longOne("birthday");
			changeDate2longOne("registerTime");
			
			changeDate2longOne("sendEndDate");
			changeDate2longOne("sendStartDate");
			changeDate2longOne("useEndDate");
			changeDate2longOne("useStartDate");
			
		}
		/**
		 * change one datetime value to long 
		 */
		function changeDate2longOne(inputName){
			setHiddenAndAddPickerOne(inputName);
			computeChangedValue(inputName);
			$("#"+inputName+"_year , #"+inputName+"_month , #"+inputName+"_day").change(function(){
				computeChangedValue(inputName);
			});
		}
		/**
		 * compute changed value
		 */
		function computeChangedValue(inputName){
			console.log("date changed")
			var year=parseInt($("#"+inputName+"_year").val());
			var month=parseInt($("#"+inputName+"_month").val())-1;
			var day=parseInt($("#"+inputName+"_day").val());
			$("input[name='"+inputName+"']").val(parseInt(new Date(year,month,day)/1000));
		}
		/**
		 * set input hidden and add date picker
		 */
		function setHiddenAndAddPickerOne(inputName){
			if($("#"+inputName).length>0){
				var pickerString="\n"+makePickerDay(inputName+"_day")+"\n"+makePickerMonth(inputName+"_month")+"\n"+makePickYear(inputName+"_year");
				$("#"+inputName).hide().after(pickerString);
			}
		}
		function makePickerDay(selectName){
			var date=new Date();
			var Year=date.getFullYear();
			var Month=date.getMonth()+1;
			var Day=date.getDate();
			var isLeapYear=((Year % 4)==0) && ((Year % 100)!=0) || ((Year % 400)==0);
			var optionString='\n<option value="" selected="selected">-Choose-</option>';
			for(var i=1;i<=28;i++){
				if(i!=Day){
					optionString+='\n<option value="'+i+'">'+i+'</option>';
				}else{
					optionString+='\n<option value="'+i+'" selected="selected">'+i+'</option>';
				}
			}
			if(Month==2){
				if(isLeapYear){
					if(Day!=29){
						optionString+='\n<option value="29">29</option>';
					}else{
						optionString+='\n<option value="29" selected="selected">29</option>';
					}
				}
			}else{
				if(Day!=29){
					optionString+='\n<option value="29">29</option>';
				}else{
					optionString+='\n<option value="29" selected="selected">29</option>';
				}
				if(Day!=30){
					optionString+='\n<option value="30">30</option>';
				}else{
					optionString+='\n<option value="30" selected="selected">30</option>';
				}
				if(Month%2!=0){
					if(Day!=31){
						optionString+='\n<option value="31">31</option>';
					}else{
						optionString+='\n<option value="31" selected="selected">31</option>';
					}
				}
			}
			var selectString='<select name="'+selectName+'" id="'+selectName+'" >'+optionString+'</select>';
			return selectString;
		}
		function makePickerMonth(selectName){
			var date=new Date();
			var Month=date.getMonth();
			var monthArray=["January","Fabruary","March","April","May","June","July","August","September","October","November","December"];
			var optionString='\n<option value="" selected="selected">-Choose-</option>';
			for(var i=0;i<12;i++){
				if(Month!=i){
					optionString+='\n<option value="'+(i+1)+'">'+monthArray[i]+'</option>';
				}else{
					optionString+='\n<option value="'+(i+1)+'" selected="selected">'+monthArray[i]+'</option>';
				}
			}
			var selectString='<select name="'+selectName+'" id="'+selectName+'" >'+optionString+'</select>';
			return selectString;
		}
		function makePickYear(selectName){
			var date=new Date();
			var Year=date.getFullYear();
			var optionString='\n<option value="" selected="selected">-Choose-</option>';
			for(var i=1970;i<2030;i++){
				if(Year!=i){
					optionString+='\n<option value="'+i+'">'+i+'</option>';
				}else{
					optionString+='\n<option value="'+i+'" selected="selected">'+i+'</option>';
				}
			}
			var selectString='<select name="'+selectName+'" id="'+selectName+'" >'+optionString+'</select>';
			return selectString;
		}
		$(document).ready(function(){
			changeUrl2superAdmin();
			showUploadPanel();
			changeDate2long();
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
	$(obj).parent("body").find("#"+inputname).val(fileName);
	$(obj).remove();
}


