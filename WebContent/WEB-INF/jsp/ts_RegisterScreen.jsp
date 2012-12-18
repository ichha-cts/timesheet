<%@ page language="java"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.2.0/jquery.mobile-1.2.0.min.css" />
<script src="http://code.jquery.com/jquery-1.8.2.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.2.0/jquery.mobile-1.2.0.min.js"></script>
<script
	src="http://jquerymobile.com/demos/1.2.0-pre/js/jquery.mobile-1.2.0-pre.js"></script>

<!-- <script src="js/jqm-docs.js"></script>
<script src="js/jquery.min.js"></script>
<script src="js/jquery.mobile-1.1.0.min.js"></script> -->

</head>
<body>


	<div data-role="page">

		<div data-role="header">
			<h1>TIME SHEET</h1>
		</div>
		<!-- /header -->

		<div data-role="content">
			<form action = "" method = "POST">
				<div data-role="fieldcontain" style="width: 250px">
					<label for="name" style="padding-right: 100px">Name: </label> <input
						type="text" name="name" id="employeeName" value="" />
				</div>

				<div data-role="fieldcontain" style="width: 250px">
					<label for="name" style="padding-right: 100px">Email ID: </label> <input
						type="text" name="emailid" id="emailId" value="" />
				</div>

				<div data-role="fieldcontain" style="width: 250px">
					<label for="organization" style="padding-right: 100px">
						Choose: </label> <select id="organization" name="organization"
						data-theme="a">
						<option value="CTS">CTS</option>
						<option value="EE">EE</option>
					</select>
				</div>

				<div data-role="fieldcontain" style="width: 250px">
					<label for="name" style="padding-right: 100px">Scrum: </label> <input
						type="text" name="scrum" id="scrum" value="" />
				</div>

				<div data-role="fieldcontain" style="width: 250px">
					<label for="scrum" style="padding-right: 100px"> Choose: </label> <select
						id="scrum" name="scrum" data-theme="a">
						<option value="Alpha">Alpha</option>
						<option value="Beta">Beta</option>
					</select>
				</div>

				<div data-role="content">
					<input id="timesheet_login" type="submit" data-inline="true"
						data-theme="a" data-icon="arrow-r" data-iconpos="right"
						value="Submit">
				</div>


			</form>
		</div>
		<div data-role="footer">
			<h4>Page Footer</h4>
		</div>
		<!-- /footer -->
	</div>
	<!-- /page -->

</body>
</html>