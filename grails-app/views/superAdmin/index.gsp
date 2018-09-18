<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Welcome to starshop</title>
		<style type="text/css" media="screen">
			#status {
				background-color: #eee;
				border: .2em solid #fff;
				margin: 2em 2em 1em;
				padding: 1em;
				width: 12em;
				float: left;
				-moz-box-shadow: 0px 0px 1.25em #ccc;
				-webkit-box-shadow: 0px 0px 1.25em #ccc;
				box-shadow: 0px 0px 1.25em #ccc;
				-moz-border-radius: 0.6em;
				-webkit-border-radius: 0.6em;
				border-radius: 0.6em;
			}

			.ie6 #status {
				display: inline; /* float double margin fix http://www.positioniseverything.net/explorer/doubled-margin.html */
			}

			#status ul {
				font-size: 0.9em;
				list-style-type: none;
				margin-bottom: 0.6em;
				padding: 0;
			}

			#status li {
				line-height: 1.3;
			}

			#status h1 {
				text-transform: uppercase;
				font-size: 1.1em;
				margin: 0 0 0.3em;
			}

			#page-body {
				margin: 2em 1em 1.25em 18em;
			}

			h2 {
				margin-top: 1em;
				margin-bottom: 0.3em;
				font-size: 1em;
			}

			p {
				line-height: 1.5;
				margin: 0.25em 0;
			}

			#controller-list ul {
				list-style-position: inside;
			}

			#controller-list li {
				line-height: 1.3;
				list-style-position: inside;
				margin: 0.25em 0;
			}

			@media screen and (max-width: 480px) {
				#status {
					display: none;
				}

				#page-body {
					margin: 0 1em 1em;
				}

				#page-body h1 {
					margin-top: 0;
				}
			}
		</style>
	</head>
	<body>
		<a href="#page-body" class="skip"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		
		<div id="page-body" role="main">
			<h1>Welcome to starshop</h1>
			<p></p>

			<div id="controller-list" role="navigation">
				<h2>系统设置:</h2>
				<ul>
					<li class="controller"><a href="/nideshop/nideshopUserLevel/index">NideshopUserLevel.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopUser/index">NideshopUser.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopRegion/index">NideshopRegion.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopAddress/index">NideshopAddress.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopChannel/index">NideshopChannel.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopCategory/index">NideshopCategory.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopBrand/index">NideshopBrand.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopAttributeCategory/index">NideshopAttributeCategory.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopAttribute/index">NideshopAttribute.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopKeywords/index">NideshopKeywords.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopSpecification/index">NideshopSpecification.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopShipper/index">NideshopShipper.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopCoupon/index">NideshopCoupon.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopTopicCategory/index">NideshopTopicCategory.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopAdPosition/index">NideshopAdPosition.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopAd/index">NideshopAd.label</a></li>
				</ul>
				<h2>超级管理员:</h2>
				<ul>
					<li class="controller"><a href="/nideshop/nideshopAdmin/index">NideshopAdmin.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopSearchHistory/index">NideshopSearchHistory.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopCart/index">NideshopCart.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopCollect/index">NideshopCollect.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopFootprint/index">NideshopFootprint.label</a></li>
					<li class="controller"><a href="/nideshop/nideshopCommentPicture/index">NideshopCommentPicture.label</a></li>
					<br><br>
					<li class="controller"><a href="/nideshop/sysRole/index">SysRole.label</a></li>
					<li class="controller"><a href="/nideshop/sysUser/index">SysUser.label</a></li>
					<li class="controller"><a href="/nideshop/sysUserSysRole/index">SysUserSysRole.label</a></li>
					<li class="controller"><a href="/nideshop/permission/index">Permission.label</a></li>
				</ul>
			</div>
		</div>
	</body>
</html>
