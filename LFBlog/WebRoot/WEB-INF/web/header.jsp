<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<header class="am-topbar">
  <h1 class="am-topbar-brand">
    <a href="${pageContext.request.contextPath }/blog.action">LFBlog</a>
  </h1>

  <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only"
          data-am-collapse="{target: '#doc-topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span
      class="am-icon-bars"></span></button>

  <div class="am-collapse am-topbar-collapse" id="doc-topbar-collapse">
    <ul class="am-nav am-nav-pills am-topbar-nav">
      <li class="am-active"><a href="${pageContext.request.contextPath }/blog.action">首页</a></li>
      <li><a href="${pageContext.request.contextPath }/project.action">项目</a></li>
      <li class="am-dropdown" data-am-dropdown>
        <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
          分类菜单 <span class="am-icon-caret-down"></span>
        </a>
        <ul class="am-dropdown-content">
        	<c:forEach var="cateTemp" items="${BLOGCATEGORY }">
	          <li><a href="${pageContext.request.contextPath }/cateesec.action?categoryId=${cateTemp.categoryId}">${cateTemp.categoryName}</a></li>
        	</c:forEach>
        </ul>
      </li>
    </ul>

    <form class="am-topbar-form am-topbar-left am-form-inline am-topbar-right" role="search" action="${pageContext.request.contextPath }/kwdsec.action" method="post">
      <div class="am-form-group">
        <input type="text" class="am-form-field am-input-sm" placeholder="搜索文章" name="keyWord">
      </div>
      <button type="submit" class="am-btn am-btn-default am-btn-sm">搜索</button>
    </form>

  </div>
</header>