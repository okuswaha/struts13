<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Update Product</title>
</head>
<body>
<h1>Update Product</h1>
<br/>
<div>
    <p><c:out value="${productId}"/> </p>
    <p><c:out value="${productName}"/> </p>
    <p><c:out value="${productDesc}"/> </p>
</div>
</body>
</html>
