<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="Header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 align="center">Manage Supplier</h3>

<form action="<c:url value="/insertSupplier"/>" method="post">
<div class="table-responsive">
<table align="center" class="table table-bordered">
<tr>
<td>Supplier Name</td>
<td><input type="text" name="supName"/></td>
</tr>
<tr>
<td>Supplier Addr</td>
<td><textarea cols="40" rows="5" name="supAddr"></textarea></td>
</tr>
<tr>
<td colspan="2">
<center>
<input type="submit" value="Insert Supplier" class="btn btn-info"/>
</center>
</td>
</tr>
</table>
</div>
</form>

<div class="table-responsive">
<table align="center" class="table table-bordered">
<tr class="success">
<td>Supplier ID</td>
<td>Supplier Name</td>
<td>Supplier Addr</td>
<td>Operation</td>
</tr>
<c:forEach items="${supplierList}" var="supplier">
<tr>
<td>${supplier.supplierId}</td>
<td>${supplier.supplierName}</td>
<td>${supplier.supplierAddr}</td>
<td>
<a href="<c:url value="/deleteSupplier/${supplier.supplierId}"/>" class="btn btn-danger">DELETE</a>
<a href="<c:url value="/editsupplier/${supplier.supplierId}"/>" class="btn btn-info">EDIT</a>
</td>
</tr>
</c:forEach>

</table>
</div>

</div>

</body>
</html>