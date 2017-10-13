<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head lang="en">
<meta charset="UTF-8">
<title>Blog | 主页</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="format-detection" content="telephone=no">
<meta name="keywords" content="LFSenior 丁凌风 丁鲁攀" />
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="alternate icon" type="image/png"
	href="${pageContext.request.contextPath}/assets/i/favicon.png">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/amazeui.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/css/web.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/assets/css/app.css" />
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

.blog-content img,.blog-team img {
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
	<!-- 引入头部 -->
	<%@include file="header.jsp"%>

	<!-- 内容体 -->
	<div class="am-g am-g-fixed blog-g-fixed">
		<div class="am-u-md-8">
			<c:choose>
				<c:when test="${not empty DATESEARCH }">
					<h4 class="am-article-meta blog-meta">
						<a href="javascript:void;">${DATESEARCH }</a>
					</h4>
					<hr class="am-article-divider blog-hr">
				</c:when>
				<c:when test="${not empty KEYWORDSEARCH }">
					<h4 class="am-article-meta blog-meta">
						<a href="javascript:void;">${KEYWORDSEARCH }</a>
					</h4>
					<hr class="am-article-divider blog-hr">
				</c:when>
				<c:when test="${not empty CATEGORYSEARCH }">
					<h4 class="am-article-meta blog-meta">
						<a href="javascript:void;">${CATEGORYSEARCH }</a>
					</h4>
					<hr class="am-article-divider blog-hr">
				</c:when>
			</c:choose>
			<c:forEach var="article" items="${BLOGCONTENT }">
				<article class="blog-main">
					<h3 class="am-article-title blog-title">
						<a href="${pageContext.request.contextPath }/article.action?articleId=${article.contentId}">${article.contentTitle }</a>
					</h3>
					<h4 class="am-article-meta blog-meta">
						by <a href="">LFSenior</a> posted on ${article.contentDate } <a href="#">${article.contentLabel }</a>
					</h4>
	
					<div class="am-g blog-content">
						<!--内容体-->
						<!--文章摘要-->
						<div class="am-article-lead">
							<div>
								<div>
									${article.contentDescribe}
								</div>
							</div>
						</div>
					</div>
				</article>
				<hr class="am-article-divider blog-hr">
			</c:forEach>
			<!-- 分页 -->
			<c:choose>
				<c:when test="${(not empty DATESEARCH)||(not empty KEYWORDSEARCH)||(not empty CATEGORYSEARCH) }">
				</c:when>
				<c:otherwise>
					<label id="currentPage" style="display: none;">${page.currentPage }</label> 
					<label id="allPage" style="display: none;">${page.allPage }</label>
					<ul class="am-pagination am-pagination-centered blog-pagination">
						<li class="first-page"><a
							href="${pageContext.request.contextPath }/up.action?page.currentPage=${page.currentPage }">&laquo;</a></li>
						<li class="end-page"><a
							href="${pageContext.request.contextPath }/next.action?page.currentPage=${page.currentPage }">&raquo;</a></li>
					</ul>
				</c:otherwise>
			</c:choose>
		</div>
		<!-- 侧边框 -->
		<%@include file="blog-sidebar.jsp"%>
	</div>
	<!-- 引入页脚 -->
	<%@include file="fooder.jsp"%>
	<!--[if (gte IE 9)|!(IE)]><!-->
	<script
		src="${pageContext.request.contextPath }/assets/js/jquery.min.js"></script>
	<!--<![endif]-->
	<script
		src="${pageContext.request.contextPath }/assets/js/amazeui.min.js"></script>
	<script>
		var currentPage = $("#currentPage").text().trim();
		var allpage = $("#allPage").text().trim();
		var firstLl = $(".first-page");
		if (allpage > 5) {
			if ((allpage - currentPage) >= 5) {
				for (var i = currentPage; i < parseInt(currentPage) + 5; i++) {
					var li = $("<li ><a href='${pageContext.request.contextPath }/select.action?page.currentPage="
							+ i + "'>" + i + "</a></li>");
					firstLl.after(li);
					firstLl = li;
				}
				var li = $("<li ><a href='#'>...</a></li>");
				firstLl.after(li);
			}else{
				for (var i = currentPage; i < parseInt(allpage); i++) {
					var li = $("<li ><a href='${pageContext.request.contextPath }/select.action?page.currentPage="
							+ i + "'>" + i + "</a></li>");
					firstLl.after(li);
					firstLl = li;
				}
			}
		}else{
			for(var i=1;i<=allpage;i++){
				var li = $("<li ><a href='${pageContext.request.contextPath }/select.action?page.currentPage="
						+ i + "'>" + i + "</a></li>");
				firstLl.after(li);
				firstLl = li;
			}
		}
		var pageLi = $(".am-pagination-centered li");
		for (var i = 0; i < pageLi.size(); i++) {
			if ($(pageLi[i]).text().trim() == currentPage.trim()) {
				$(pageLi[i]).addClass("am-active");
				break;
			}
		}
		if(currentPage==1){
			$(".first-page").addClass("am-disabled");	
		}else{
			$(".first-page").removeClass("am-disabled");
		}
		if(currentPage==allpage){
			$(".end-page").addClass("am-disabled");
		}else{
			$(".end-page").removeClass("am-disabled");
		}
	</script>
</body>