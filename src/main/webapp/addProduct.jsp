<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
<h1>Add Product</h1>
<br/>
<div>
    <bean:write name="productForm" property="productId"/>
    <p><c:out value="${ProductForm.productId}"/> </p>
    <p><c:out value="${productForm.productName}"/> </p>
    <p><c:out value="${productForm.productDesc}"/> </p>
    <p><c:out value="productForm.productId"/> </p>
    <p><c:out value="productId"/> </p>
    <p><c:out value="${productId}"/> </p>
</div>
</body>
</html>
