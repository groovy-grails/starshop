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
		
				<h2>超级管理员:</h2>
				<ul>
					<li class="controller"><a href="nideshopAdmin/index"><g:message code="NideshopAdmin.label" /></a></li>
					<li class="controller"><a href="nideshopSearchHistory/index"><g:message code="NideshopSearchHistory.label" /></a></li>
					<li class="controller"><a href="nideshopCart/index"><g:message code="NideshopCart.label" /></a></li>
					<li class="controller"><a href="nideshopCollect/index"><g:message code="NideshopCollect.label" /></a></li>
					<li class="controller"><a href="nideshopFootprint/index"><g:message code="NideshopFootprint.label" /></a></li>
					<li class="controller"><a href="nideshopCommentPicture/index"><g:message code="NideshopCommentPicture.label" /></a></li>
					<br><br>
					<li class="controller"><a href="sysRole/index">SysRole</a></li>
					<li class="controller"><a href="sysUser/index">SysUser</a></li>
					<li class="controller"><a href="sysUserSysRole/index">SysUserSysRole</a></li>
					<li class="controller"><a href="permission/index">Permission</a></li>
					<li class="controller"><a href="image/index">image</a></li>
				</ul>
				<h2><a href="/">管理员界面:</a></h2>
				<h2><a href="/superAdmin">超级管理员界面:</a></h2>
				<h2><a href="/logout">退出登录</a></h2>
			</div>
		</div>
	</body>
</html>
