<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<div class="am-u-md-4 blog-sidebar">
	<div class="am-panel-group">
		<section class="am-panel am-panel-default">
			<div class="am-panel-hd">关于我</div>
			<div class="am-panel-bd">
				<p>一枚热爱技术，热爱生活的96年生天秤座单身程序员。目前该博客主要用于记录学习、生活的点点滴滴</p>
				<!-- 按钮触发器， 需要指定 target -->
				<button class="am-btn am-btn-success"
					data-am-offcanvas="{target: '#doc-oc-demo3'}">查看更多 →</button>

				<!-- 侧边栏内容 -->
				<div id="doc-oc-demo3" class="am-offcanvas">
					<div class="am-offcanvas-bar am-offcanvas-bar-flip">
						<div class="am-offcanvas-content">
							<div class="am-offcanvas-item">
								<h1 class="am-offcanvas-year">存档</h1>
								<ul>
									<li>
										<c:forEach var="timeline" items="${timeLine}">
											<a href="${pageContext.request.contextPath }/datesec.action?searchDate=${timeline.time }"><span class="am-offcanvas-span">${timeline.time }(${timeline.count})</span></a>
										</c:forEach>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
		<section class="am-panel am-panel-default">
			<div class="am-panel-hd">文章目录</div>
			<ul class="am-list blog-list">
				<c:forEach var="article" items="${ARTICLELIST }">
					<li><a href="${pageContext.request.contextPath }/article.action?articleId=${article.contentId}">${article.contentTitle }</a></li>
				</c:forEach>
			</ul>
		</section>

		<section class="am-panel am-panel-default">
			<div class="am-panel-hd">联系我</div>
			<div class="am-panel-bd">
				<ul class="am-avg-sm-4 blog-team">
					<p>
		                <a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=1164764881&site=qq&menu=yes""><span class="am-icon-qq am-icon-fw am-primary blog-icon"></span></a>
		                <a target="_blank" href="https://github.com/gitdlf"><span class="am-icon-github am-icon-fw blog-icon"></span></a>
		                <a target="_blank" href="http://blog.sina.com.cn/u/5357487548"><span class="am-icon-weibo am-icon-fw blog-icon"></span></a>
		                <a target="_blank" href="http://blog.csdn.net/qq_35448976"><span class="am-icon-fw blog-icon">C</span></a>
            		</p>
				</ul>
			</div>
		</section>
	</div>
</div>

