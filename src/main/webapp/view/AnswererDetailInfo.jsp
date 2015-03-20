<%--
  Created by IntelliJ IDEA.
  User: better
  Date: 15/3/20
  Time: 17:10
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
    <script>
        function confirm_it(){
            if(confirm("确定选择该接米接机？确定后将不能更改其他接米"))
                location.href="./pay";
        }
    </script>
</head>
<body>
    <div><img src="$src"/></div>
    <div>$name</div>
    <div>$age $career</div>
    <div>$site</div>
    <div style="overflow:hidden">
        <div style="float:left;width:50%">
            <div>接机方式</div>
            <div>$m1 $m2 $m3</div>
        </div>
        <div style="float:left;width:50%">
            <div>语言</div>
            <div>$l1 $l2</div>
        </div>
    </div>
    <div>
        关于Peggy<br/>
        $introduce
    </div>
    <div>
        学校<br/>
        $school<br/>
        工作<br/>
        $job
    </div>
    <div>
        $num条评价
    </div>
    <div>
        <button type="button">返回</button>
        <button type="button" onclick="confirm_it()">选择该接米接机</button>
        <button type="button">其他</button>
    </div>
</body>
</html>
