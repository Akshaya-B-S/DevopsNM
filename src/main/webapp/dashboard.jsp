<%@ page import="java.util.*" %>

<html>

<head>
<title>Bus Dashboard</title>
</head>

<body>

<h2>Bus Status</h2>

<table border="1">

<tr>
<th>Bus</th>
<th>Route</th>
<th>Passengers</th>
<th>Capacity</th>
</tr>

<%

List<String[]> list = (List<String[]>)request.getAttribute("busList");

for(String[] b : list){

%>

<tr>
<td><%=b[0]%></td>
<td><%=b[1]%></td>
<td><%=b[2]%></td>
<td><%=b[3]%></td>
</tr>

<% } %>

</table>

<br>

<div id="map" style="height:400px;"></div>

<script src="map.js"></script>

</body>

</html>