<%@include file="Header.jsp" %>

<form action="perform_login" method="post">

<table class="table table-bordered"></table>
<tr>
<td colspan="2"><center> Sign In</center></td>
</tr>
<tr>

<td>UserName</td>

<td><input type="text"  name="username"/></td>
<td>Password</td>

<td><input type="password"  name="password"/></td>
</tr>

<tr>

<td colspan="2">
<center>
<input type="submit" value="Sign In" class="btn btn-info"/>
</center>


</td>

</tr>


</form>
</body>
</html>