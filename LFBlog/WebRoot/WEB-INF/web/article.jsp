<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Blog | 文章</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"
          content="width=device-width, initial-scale=1">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <link rel="alternate icon" type="image/png" href="${pageContext.request.contextPath}/assets/i/favicon.png">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/amazeui.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/web.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/app.css"/>
    <link type="text/css"  rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/blue.css"/>
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
        <article class="am-article blog-article-p">
            <div class="am-article-hd">
                <h1 class="am-article-title blog-text-center">${articleValue.contentTitle }</h1>
                <p class="am-article-meta blog-text-center">
                    <span><a href="#" class="blog-color">${articleValue.contentLabel } &nbsp;</a></span>-
                    <span><a href="#">@LFSenior &nbsp;</a></span>-
                    <span><a href="#">${articleValue.contentDate }</a></span>
                    <span><a href="#">&nbsp;${articleValue.contentVisit }人访问</a></span>
                </p>
            </div>
            <div class="am-article-bd">
                	${articleValue.contentBody }
            </div>
        </article>

        <div class="am-g blog-article-widget blog-article-margin">
            <div class="am-u-lg-4 am-u-md-5 am-u-sm-7 am-u-sm-centered blog-text-center">
                <span class="am-icon-tags"> &nbsp;</span>
                <c:forEach var="label" items="${articleValue.blogCategorySet }">
                <a href="${pageContext.request.contextPath }/cateesec.action?categoryId=${label.categoryId }">&nbsp; &nbsp; ${label.categoryName }</a>  
                </c:forEach>
            </div>
        </div>

		<c:if test="${not empty articleValue.blogCommitSet}">
			<hr>
	        <div class="am-g blog-author blog-article-margin">
	            <ul class="am-comments-list am-comments-list-flip">
	            	<c:forEach var="commitTemp" items="${articleValue.blogCommitSet }">
		            	<li class="am-comment">
		                    <article class="am-comment">
		                        <a href="#link-to-user-home">
		                            <img src="${pageContext.request.contextPath }/assets/img/bw-2014-06-19.jpg" alt="" class="am-comment-avatar" width="48" height="48"/>
		                        </a>
		
		                        <div class="am-comment-main">
		                            <header class="am-comment-hd">
		                                <!--<h3 class="am-comment-title">评论标题</h3>-->
		                                <div class="am-comment-meta">
		                                    <a href="#link-to-user" class="am-comment-author">${commitTemp.commitName }</a>
		                                    评论于 <time datetime="2013-07-27T04:54:29-07:00" title="2013年7月27日 下午7:54 格林尼治标准时间+0800">${commitTemp.commitDate }</time>
		                                </div>
		                            </header>
		
		                            <div class="am-comment-bd">
		                            	${commitTemp.commitContent }
		                            </div>
		                        </div>
		                    </article>
		                </li>
	            	</c:forEach>
	            </ul>
	        </div>
		</c:if>
        <hr>

		<!-- 评论 -->
        <form class="am-form am-g" action="${pageContext.request.contextPath }/commit.action" method="post">
        	<input type="hidden" name="articleId" value="${articleValue.contentId }">
            <h3 class="blog-comment">评论</h3>
            <fieldset>
                <div class="am-form-group am-u-sm-4 blog-clear-left">
                    <input type="text" class="lfblog-commit-name" placeholder="名字" name="blogCommit.commitName">
                </div>
                <div class="am-form-group am-u-sm-4">
                    <input type="email" class="" placeholder="邮箱" name="blogCommit.commitEmail">
                </div>

                <div class="am-form-group">
                    <textarea class="lfblog-commit-textarea" rows="5" placeholder="一字千金" name="blogCommit.commitContent"></textarea>
                </div>
				<!-- 可以评论am-btn-success -->
                <p><button type="submit" class="am-btn am-btn-success lfblog-commit-btn">发表评论</button></p>
            </fieldset>
        </form>

        <hr>
    </div>

	<%@include file="blog-sidebar.jsp" %>
</div>

<%@include file="fooder.jsp" %>

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<!--<![endif]-->
<script src="${pageContext.request.contextPath}/assets/js/amazeui.min.js"></script>
<script>
	$(function(){
		$(".lfblog-commit-btn").on('click',function(){
			if($(".lfblog-commit-name")[0].value.trim()==""){
				return false;
			}
			if($(".lfblog-commit-textarea")[0].value.trim()==""){
				return false;
			}
		});
		
	});
</script>
</body>
</html>

