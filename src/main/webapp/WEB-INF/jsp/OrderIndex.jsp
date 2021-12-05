<%--
  Created by IntelliJ IDEA.
  User: han
  Date: 2021/11/16
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>座位预约</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <div>
        <nav class="navbar navbar-default navbar-static-top" role="navigation">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">座位预约</a>
                </div>
                <div>
                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                个人中心 <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#">个人信息</a></li>
                                <li class="divider"></li>
                                <li><a href="#">我的预约</a></li>
                                <li class="divider"></li>
                                <li><a href="#">退出登录</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
    <div style="padding-left: 250px;padding-right: 250px">
        <ul class="nav nav-tabs">
            <li class="active"><a href="#">今天</a></li>
            <li><a href="#">明天</a></li>
            <li style="float:right;"><a href="${pageContext.request.contextPath }/">使用规则</a></li>
        </ul>
        <div align="center" style="padding: 50px">
            <p style="font-size: 40px;font-family:'楷体';">图书馆</p>
            <p style="font-size: 30px;color: royalblue;font-family:'楷体';">${floor}楼 ${seatId}座</p>
            <p style="font-size: 20px;color: gray;font-family:'楷体';">（开放时间：8:00-22:00）</p>
            <p style="font-size: 20px;color: gray;font-family:'楷体';">距离最后入座时间还有：</p>
            <p style="font-size: 40px;font-family:'楷体';">${day}:${hour}:${minute}:00</p>
            <p style="font-size: 40px;font-family:'楷体';">状态：待入座</p>
        </div>
        <div>
            <div style="display: inline;width: 45%;float: left;padding-left: 25%;"><!-- 标准的按钮 -->
                <a href="${pageContext.request.contextPath }/SeatShow">
                    <button type="button" class="btn btn-default" style="height: 50px;width:200px;background-color: cornflowerblue;">座位预约</button>
                </a>
            </div>
            <div style="display: inline;width: 45%;float: right;padding-right: 25%">
                <button type="button" class="btn btn-default" style="float: right;height: 50px;width:200px;background-color: cornflowerblue;">取消预约</button>
            </div>
        </div>
    </div>
</body>
</html>
