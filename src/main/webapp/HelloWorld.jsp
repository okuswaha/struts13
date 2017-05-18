<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
<h1>Hi There !!</h1>
<div>
    <p><bean:write name="helloWorldForm" property="message"/> </p>
</div>
</body>
</html>