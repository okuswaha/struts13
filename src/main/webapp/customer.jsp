<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html>
<head>
    <title>Customers</title>
</head>
<body>
<h1>Customer :</h1>
<br/>
<p><bean:write name="customerForm" property="customerId"/></p>
<p><bean:write name="customerForm" property="customerName"/></p>
<p><bean:write name="customerForm" property="customerAddress"/></p>
</body>
</html>
