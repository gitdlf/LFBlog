package cn.lfsenior.web.action;

import java.sql.Date;
import java.util.Map;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.lfsenior.entity.BlogCommit;
import cn.lfsenior.entity.BlogContent;
import cn.lfsenior.web.service.IBlogCommitService;
import cn.lfsenior.web.service.IBlogContentService;

/**
 * 文章相关action
 * @author LF.zero
 *
 */
public class ArticleAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1199343505548176858L;
	/*
	 * 自动封装数据
	 */
	private Integer articleId;
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	public Integer getArticleId() {
		return articleId;
	}
	
	private BlogCommit blogCommit;
	public void setBlogCommit(BlogCommit blogCommit) {
		this.blogCommit = blogCommit;
	}
	public BlogCommit getBlogCommit() {
		return blogCommit;
	}
	
	/*
	 * IOC注入
	 */
	private IBlogContentService blogContentService;
	public void setBlogContentService(IBlogContentService blogContentService) {
		this.blogContentService = blogContentService;
	}
	
	private IBlogCommitService blogCommitService;
	public void setBlogCommitService(IBlogCommitService blogCommitService) {
		this.blogCommitService = blogCommitService;
	}
	public String getArticle(){
		
		/*
		 * 获取文章资源
		 */
		BlogContent article = blogContentService.findBlogContentById(articleId);
		/*
		 * 更新博客访问量
		 */
		article.setContentVisit(String.valueOf(Integer.valueOf(article.getContentVisit())+1));
		blogContentService.updateBlogContentVist(article);
		/*
		 * 获取request对象
		 */
		Map<String, Object> request = ActionContext.getContext().getContextMap();
		request.put("articleValue", article);
		return SUCCESS;
	}
	
	public String commitArticle(){
		/*
		 *获取BlogContent对象 
		 */
		if(!"".equals(blogCommit.getCommitName().trim())&&blogCommit.getCommitName()!=null){
			/*
			 * 这里表示有用户名
			 */
			if(!"".equals(blogCommit.getCommitContent().trim())&&blogCommit.getCommitContent()!=null){
				/*
				 * 表示有评论内容
				 */
				BlogContent blogContent = blogContentService.findBlogContentById(articleId);
				blogCommit.setBlogContent(blogContent);
				blogCommit.setCommitDate(new Date(System.currentTimeMillis()));
				/*
				 * 添加评论
				 */
				blogCommitService.saveCommit(blogCommit);
			}
			
		}
		/*
		 * 保存articleId，等会需要跳转
		 */
		ActionContext.getContext().getContextMap().put("articleId", articleId);
		return "article";
	}
}
