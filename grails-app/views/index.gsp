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
				<h2>功能设置:</h2>
				<ul>
					<li class="controller"><a href="/nideshop/nideshopGoods/index"><g:message code="NideshopGoods.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopGoodsSpecification/index"><g:message code="NideshopGoodsSpecification.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopGoodsAttribute/index"><g:message code="NideshopGoodsAttribute.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopGoodsGallery/index"><g:message code="NideshopGoodsGallery.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopGoodsIssue/index"><g:message code="NideshopGoodsIssue.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopRelatedGoods/index"><g:message code="NideshopRelatedGoods.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopProduct/index"><g:message code="NideshopProduct.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopTopic/index"><g:message code="NideshopTopic.label" /></a></li>
				</ul>
				<h2>数据查看:</h2>
				<ul>
					<li class="controller"><a href="/nideshop/nideshopOrder/index"><g:message code="NideshopOrder.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopOrderExpress/index"><g:message code="NideshopOrderExpress.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopOrderGoods/index"><g:message code="NideshopOrderGoods.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopUserCoupon/index"><g:message code="NideshopUserCoupon.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopFeedback/index"><g:message code="NideshopFeedback.label" /></a></li>
					<li class="controller"><a href="/nideshop/nideshopComment/index"><g:message code="NideshopComment.label" /></a></li>
				</ul>
				<h2><a href="/nideshop/superAdmin">超级管理员界面:</a></h2>
				<h2><a href="/nideshop/logout">退出登录</a></h2>
			</div>
		</div>
	</body>
</html>
