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
        function select_vehicle(type){
            $.ajax({
                url: "../map/evaluatePrice",
                data: {
                    type: type
                },
                success: function(data) {
                    if(type==1) //专车
                        $("#showPrice").html("<input type='hidden' name='distance' value=''/>"
                                            +"<input type='hidden' name='time' value=''/>"
                                            +"<input type='hidden' name='price' value=''/>"
                                            +"<div>价格</div>"
                                            +"<div>距离</div>"
                                            +"<div>时间</div>"
                                            +"<div>价格</div>"
                                            +"<div>打车参考价格 为您节省</div>");
                    else if(type==2) //公共交通
                        $("#showPrice").html("<input type='hidden' name='time' value=''/>"
                                            +"<input type='hidden' name='walkTime' value=''/>"
                                            +"<input type='hidden' name='transportMode' value=''/>"
                                            +"<input type='hidden' name='price' value=''/>"
                                            +"<div>价格</div>"
                                            +"<div>时间</div>"
                                            +"<div>步行时间</div>"
                                            +"<div>交通方式</div>"
                                            +"<div>价格</div>"
                                            +"<div>此价格不包含公共交通乘车费用<br/>（到达目的地后接米会指导您购买交通卡）</div>");
                    else if(type==3) //租车
                        $("#showPrice").html("<input type='hidden' name='price' value=''/>"
                                            +"<div>价格</div>"
                                            +"<div>此价格不包含租车费用<br/>到达目的地后接米会带您租好车辆，可以提前和接米沟通关于租车的问题。</div>");
                }
            });
        }

        function show_more(){
            $("#moreDiv").hide();
            $("#moreCondition").show();
        }

        function confirm_order(){
            $("#editOrder").hide();
            $("#confirmOrder").html("<div>接机时间</div>"
                                  +"<div>$time</div>"
                                  +"<div style='overflow:hidden'>"
                                    +"<div style='float:left;width:50%'>"
                                        +"<div>接机方式</div>"
                                        +"<div>$mode</div>"
                                    +"</div>"
                                    +"<div style='float:left;width:50%'>"
                                        +"<div>航班号</div>"
                                        +"<div>$flightNum</div>"
                                    +"</div>"
                                  +"</div>"
                                  +"<div>目的地</div>"
                                  +"<div>$destination</div>"
                                  +"<div style='overflow:hidden'>"
                                    +"<div style='float:left;width:33%'>"
                                        +"<div>人数</div>"
                                        +"<div>$personNum</div>"
                                    +"</div>"
                                    +"<div style='float:left;width:33%'>"
                                        +"<div>距离</div>"
                                        +"<div>$distance</div>"
                                    +"</div>"
                                    +"<div style='float:left;width:33%'>"
                                        +"<div>时间</div>"
                                        +"<div>$time</div>"
                                    +"</div>"
                                  +"</div>"
                                  +"<div>支付</div>"
                                  +"<div>总价格      $price</div>"
                                  +"<div><button type='button' onclick='edit_order()'>修改订单</button></div>"
                                  +"<div><br/>各种协议提示</div>"
                                  +"<div><input></a></div>");
        }

        function edit_order(){
            $("#editOrder").show();
            $("#confirmOrder").html("");
        }
    </script>
</head>
<body>
    <form action="./order/confirm" method="post">
        <div id="editOrder">
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
                <img src="../static/img/special.png" onclick="select_vehicle(1)"/>
                <img src="../static/img/public.png" onclick="select_vehicle(2)"/>
                <img src="../static/img/rent.png" onclick="select_vehicle(3)"/>
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
                <button type="button" onclick="confirm_order()">下一步</button>
            </div>
        </div>
        <div id="confirmOrder">
        </div>
    </form>
</body>
</html>
