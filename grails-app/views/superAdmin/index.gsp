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
					<li class="controller"><a href="/nideshop/nideshopUserLevel/index"><g:message code="NideshopUserLevel.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopUser/index"><g:message code="NideshopUser.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopRegion/index"><g:message code="NideshopRegion.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopAddress/index"><g:message code="NideshopAddress.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopCategory/index"><g:message code="NideshopCategory.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopChannel/index"><g:message code="NideshopChannel.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopBrand/index"><g:message code="NideshopBrand.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopAttributeCategory/index"><g:message code="NideshopAttributeCategory.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopAttribute/index"><g:message code="NideshopAttribute.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopKeywords/index"><g:message code="NideshopKeywords.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopSpecification/index"><g:message code="NideshopSpecification.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopShipper/index"><g:message code="NideshopShipper.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopCoupon/index"><g:message code="NideshopCoupon.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopTopicCategory/index"><g:message code="NideshopTopicCategory.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopAdPosition/index"><g:message code="NideshopAdPosition.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopAd/index"><g:message code="NideshopAd.label" /></a></li>
				</ul>
				<h2>超级管理员:</h2>
				<ul>
					<li class="controller"><a href="/nideshop/nideshopAdmin/index"><g:message code="NideshopAdmin.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopSearchHistory/index"><g:message code="NideshopSearchHistory.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopCart/index"><g:message code="NideshopCart.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopCollect/index"><g:message code="NideshopCollect.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopFootprint/index"><g:message code="NideshopFootprint.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopCommentPicture/index"><g:message code="NideshopCommentPicture.label" /></a></li>
					<br><br>
					<li class="controller"><a href="/nideshop/sysRole/index">SysRole</a></li>
					<li class="controller"><a href="/nideshop/sysUser/index">SysUser</a></li>
					<li class="controller"><a href="/nideshop/sysUserSysRole/index">SysUserSysRole</a></li>
					<li class="controller"><a href="/nideshop/permission/index">Permission</a></li>
				</ul>
				<h2><a href="/nideshop">管理员界面:</a></h2>
				<h2><a href="/nideshop/logout">退出登录</a></h2>
			</div>
		</div>
	</body>
</html>
