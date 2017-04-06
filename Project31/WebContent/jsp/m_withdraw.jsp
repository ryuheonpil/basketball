<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>팀 조회</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

</head>
<body>


	<div class="container">
		<div class="row" style="text-align: center; font-size: 50px;">팀
			현황</div>

		<div class="row" style="text-align: right;">
			<form action="###" class="form-inline">
				<div class="form-group">
					<select class="form-control">
						<option>1</option>
						<option>2</option>
						<option>3</option>
						<option>4</option>
						<option>5</option>
					</select>
				</div>
				<div class="form-group">
					<input type="text" class="form-control" placeholder="팀명을 입력하세요"
						style="width: 200px;">
				</div>
				<button type="submit" class="btn btn-primary">확인</button>
			</form>

		</div>

		<div id="row">
			<table class="table table-hover">
				<tr>
					<th>No.</th>
					<th>팀 이름</th>
					<th>지역</th>
				</tr>
				<tr>
					<td>1</td>
					<td>1</td>
					<td>1</td>
				</tr>
				<tr>
					<td>2</td>
					<td>2</td>
					<td>2</td>
				</tr>
				<tr>
					<td>3</td>
					<td>3</td>
					<td>3</td>
				</tr>
			</table>

		</div>
	</div>



</body>
</html>