<%--
  Created by IntelliJ IDEA.
  User: zhanglu
  Date: 2015/3/15
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <script src="http://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
    <script>
        function special_car(type){
            $.ajax({
                url: "./map/evaluatePrice",
                data: {
                    type: type
                },
                success: function(data) {
                    $("#showPrice").html(data);
                }
            });
        }

        function show_more(){
            $("#moreDiv").hide();
            $("#moreCondition").show();
        }
    </script>
</head>
<body>
    <form action="./order/confirm" method="post">
        <div style="overflow:hidden">
            <div style="float:left;width:50%">
                <div>抵达日期</div>
                <div><input type="date" name="arrivalDate"/></div>
            </div>
            <div style="float:left;width:50%">
                <div>抵达时间</div>
                <div><input type="time" name="arrivalTime"/></div>
            </div>
        </div>
        <div style="overflow:hidden">
            <div style="float:left;width:50%">
                <div>人数</div>
                <div><input type="number" name="personNum" min="1"/></div>
            </div>
            <div style="float:left;width:50%">
                <div>航班号</div>
                <div><input type="text" name="flightNum"/></div>
            </div>
        </div>
        <div>
            接机类型
        </div>
        <div>
            <img src="../static/img/zhuan.png" onclick="special_car(1)"/>
            <img src="../static/img/gong.png" onclick="special_car(2)"/>
            <img src="../static/img/zu.png" onclick="special_car(3)"/>
        </div>
        <div>
            <a href="./map/inputDestination">送达目的地</a>
        </div>
        <div id="showPrice"></div>
        <div>
            为了能够让更多的接米来应单<br/>
            您可以简单介绍一下自己
        </div>
        <div>
            <textarea rows="5" cols="50"></textarea>
        </div>
        <div id="moreDiv">
            <a href="javascript:void(0)" onclick="show_more()">更多筛选条件></a>
        </div>
        <div id="moreCondition" style="display:none">
            <div>接机人性别</div>
            <div>
                <img src="../static/img/male.png"/>
                <img src="../static/img/female.png"/>
            </div>
            <div>年龄</div>
            <div>
                <input type="number" name="minAge" min="20" max="80">
                ——
                <input type="number" name="maxAge" min="20" max="80">
            </div>
            <div>设定筛选条件后我们会优先给您推荐符合条件的接米</div>
        </div>
        <div>
            <input type="submit" title="下一步"/>
        </div>
    </form>
</body>
</html>
