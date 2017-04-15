<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/3/4 0004
  Time: 下午 1:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <h1>文件上传也页面</h1>
    <s:file action="FileUploadAction" method="post" enctype="multipart/from-date">
        <s:file name="file" label="选择文件上传"/>
        <s:textfield label="文件描述" name="description"/>
        <s:submit value="上传"/>
    </s:file>
</body>
</html>
