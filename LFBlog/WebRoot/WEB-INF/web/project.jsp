<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Blog | 项目</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"
          content="width=device-width, initial-scale=1">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="alternate icon" type="image/png" href="../${pageContext.request.contextPath }/assets/i/favicon.png">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/amazeui.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/web.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/app.css"/>
    <style>
        @media only screen and (min-width: 1200px) {
            .blog-g-fixed {
                max-width: 1200px;
            }
        }

        @media only screen and (min-width: 641px) {
            .blog-sidebar {
                font-size: 1.4rem;
            }
        }

        .blog-main {
            padding: 20px 0;
        }

        .blog-title {
            margin: 10px 0 20px 0;
        }

        .blog-meta {
            font-size: 14px;
            margin: 10px 0 20px 0;
            color: #222;
        }

        .blog-meta a {
            color: #27ae60;
        }

        .blog-pagination a {
            font-size: 1.4rem;
        }

        .blog-team li {
            padding: 4px;
        }

        .blog-team img {
            margin-bottom: 0;
        }

        .blog-content img,
        .blog-team img {
            max-width: 100%;
            height: auto;
        }

        .blog-footer {
            padding: 10px 0;
            text-align: center;
        }
    </style>
</head>
<body>
<%@include file="header.jsp" %>
<div class="am-g am-g-fixed blog-g-fixed">
    <div class="am-u-md-8 am-u-sm-12">
        <article class="blog-main">
            <h3 class="am-article-title blog-title">
                <a href="javascript:void;">项目还未总结，打包.^v^</a>
            </h3>
        </article>
        <hr class="am-article-divider blog-hr">

    </div>

	<%@include file="blog-sidebar.jsp" %>

</div>

<%@include file="fooder.jsp" %>

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="${pageContext.request.contextPath }/assets/js/jquery.min.js"></script>
<!--<![endif]-->
<script src="${pageContext.request.contextPath }/assets/js/amazeui.min.js"></script>

</body>
</html>
