<%--
  Created by IntelliJ IDEA.
  User: better
  Date: 15/3/19
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
</head>
<body>
    <div style="overflow:hidden">
        <div style="float:left;width:50%">
            <div>当前应单人</div>
            <div>$answerOrderNum</div>
        </div>
        <div style="float:left;width:50%">
            <div>剩余应单时间</div>
            <div>$time</div>
        </div>
    </div>
    <div>
        <div><a href="./answererDetail"><img src="$src"/></a></div>
        <div>$name  $age岁  $career</div>
        <div>$site</div>
    </div>
</body>
</html>
