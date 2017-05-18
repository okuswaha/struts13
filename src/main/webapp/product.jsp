<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html>
<head>
    <title>Products</title>
</head>
<body>
<h1>Product :</h1>
<br/>
<p><bean:write name="productForm" property="productId"/></p>
<p><bean:write name="productForm" property="productName"/></p>
<p><bean:write name="productForm" property="productDesc"/></p>
</body>
</html>
