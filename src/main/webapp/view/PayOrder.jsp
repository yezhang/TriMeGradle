<%--
  Created by IntelliJ IDEA.
  User: better
  Date: 15/3/20
  Time: 17:22
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
    <div>
        已成功选择接米<br/>
        订单有效时间将保留X小时，请您尽快完成支付。
    </div>
    <div>
        接机时间<br/>
        $time
    </div>
    <div style="overflow:hidden">
        <div style="float:left;width:50%">
            <div>接机方式</div>
            <div>$mode</div>
        </div>
        <div style="float:left;width:50%">
            <div>航班号</div>
            <div>$flightNum</div>
        </div>
    </div>
    <div>
        目的地<br/>
        $destination
    </div>
    <div style='overflow:hidden'>"
        <div style='float:left;width:33%'>"
            <div>人数</div>"
            <div>$personNum</div>"
        </div>"
        <div style='float:left;width:33%'>"
            <div>距离</div>"
            <div>$distance</div>"
        </div>"
        <div style='float:left;width:33%'>"
            <div>时间</div>"
            <div>$time</div>"
        </div>"
    </div>
    <div>支付</div>"
    <div>总价格      $price</div>
    <div>各种协议提示<a href="#">退款政策</a></div>
    <div><button>微信支付</button></div>
    <div><button>取消订单</button></div>
</body>
</html>
