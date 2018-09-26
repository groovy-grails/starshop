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
					<li class="controller"><a href="nideshopUserLevel/index"><g:message code="NideshopUserLevel.label" /></a></li>
					<li class="controller"><a href="nideshopUser/index"><g:message code="NideshopUser.label" /></a></li>
					<li class="controller"><a href="nideshopRegion/index"><g:message code="NideshopRegion.label" /></a></li>
					<li class="controller"><a href="nideshopAddress/index"><g:message code="NideshopAddress.label" /></a></li>
					<li class="controller"><a href="nideshopCategory/index"><g:message code="NideshopCategory.label" /></a></li>
					<li class="controller"><a href="nideshopChannel/index"><g:message code="NideshopChannel.label" /></a></li>
					<li class="controller"><a href="nideshopBrand/index"><g:message code="NideshopBrand.label" /></a></li>
					<li class="controller"><a href="nideshopAttributeCategory/index"><g:message code="NideshopAttributeCategory.label" /></a></li>
					<li class="controller"><a href="nideshopAttribute/index"><g:message code="NideshopAttribute.label" /></a></li>
					<li class="controller"><a href="nideshopKeywords/index"><g:message code="NideshopKeywords.label" /></a></li>
					<li class="controller"><a href="nideshopSpecification/index"><g:message code="NideshopSpecification.label" /></a></li>
					<li class="controller"><a href="nideshopShipper/index"><g:message code="NideshopShipper.label" /></a></li>
					<li class="controller"><a href="nideshopCoupon/index"><g:message code="NideshopCoupon.label" /></a></li>
					<li class="controller"><a href="nideshopTopicCategory/index"><g:message code="NideshopTopicCategory.label" /></a></li>
					<li class="controller"><a href="nideshopAdPosition/index"><g:message code="NideshopAdPosition.label" /></a></li>
					<li class="controller"><a href="nideshopAd/index"><g:message code="NideshopAd.label" /></a></li>
				</ul>
				
				<h2><a href="/">管理员界面:</a></h2>
				<h2><a href="/logout">退出登录</a></h2>
			</div>
		</div>
	</body>
</html>
