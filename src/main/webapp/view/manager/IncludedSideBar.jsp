<%--
  Created by IntelliJ IDEA.
  User: better
  Date: 15/3/17
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="navbar-default sidebar" role="navigation">
    <div class="sidebar-nav navbar-collapse">
        <ul class="nav" id="side-menu">
            <li class="sidebar-search">
                <div class="input-group custom-search-form">
                    <input type="text" class="form-control" placeholder="搜索...">
                                <span class="input-group-btn">
                                    <button class="btn btn-default" type="button">
                                        <i class="fa fa-search"></i>
                                    </button>
                                </span>
                </div>
                <!-- /input-group -->
            </li>
            <li>
                <a href="../admin/dashboard"><i class="fa fa-dashboard fa-fw"></i> 仪表盘</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-users fa-fw"></i> 用户管理</a>
            </li>
            <li>
                <a href="../admin/manageorder"><i class="fa fa-table fa-fw"></i> 订单管理</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-edit fa-fw"></i> 首页内容管理</a>
            </li>
            <li>
                <a href="#"><i class="fa fa-wrench fa-fw"></i> 应单管理</a>

            </li>
            <li>
                <a href="#"><i class="fa fa-credit-card fa-fw"></i> 支付<span class="fa arrow"></span></a>
                <ul class="nav nav-second-level">
                    <li>
                        <a href="#">计费方式</a>
                    </li>
                    <li>
                        <a href="#">支付状态</a>
                    </li>
                </ul>
                <!-- /.nav-second-level -->
            </li>
            <li>
                <a href="#"><i class="fa fa-gavel fa-fw"></i> 申诉管理</a>
            </li>
        </ul>
    </div>
    <!-- /.sidebar-collapse -->
</div>
<!-- /.navbar-static-side -->