package cn.lfsenior.web.action;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.lfsenior.entity.BlogContent;
import cn.lfsenior.web.service.IBlogContentService;

/**
 * 搜索相关的action 
 * @author LF.zero
 *
 */
public class SearchAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1455660819196899343L;
	/*
	 * 自动填充
	 */
	private Date searchDate;
	private String keyWord;
	private Integer categoryId;
	/*
	 *ioc注入 
	 */
	private IBlogContentService blogContentService;
	
	/**
	 * 根据日期查询
	 * @return
	 */
	public String searchByDate(){
		/*
		 * 获取数据
		 */
		List<BlogContent> blogContents=blogContentService.findBlogContentByDate(searchDate);
		Map<String, Object> request = ActionContext.getContext().getContextMap();
		request.put("BLOGCONTENT", blogContents);
		request.put("DATESEARCH","根据日期查询'"+new SimpleDateFormat("yyyy年MM月").format(searchDate)+"'");
		return SUCCESS;
	}
	
	/**
	 * 根据关键字查询
	 * @return
	 */
	public String searchByKeyWord(){
		/*
		 * 获取数据
		 */
		List<BlogContent> blogContents=blogContentService.findBlogContentByKeyWord(keyWord);
		Map<String, Object> request = ActionContext.getContext().getContextMap();
		request.put("BLOGCONTENT", blogContents);
		request.put("KEYWORDSEARCH", "根据关键词查询'"+keyWord+"'");
		return SUCCESS;
	}
	
	/**
	 * 根据类别id查询
	 * @return
	 */
	public String searchByCategoryId(){
		/*
		 * 获取数据
		 */
		List<BlogContent> blogContents=blogContentService.findBlogContentByCategoryId(categoryId);
		Map<String, Object> request = ActionContext.getContext().getContextMap();
		request.put("BLOGCONTENT", blogContents);
		request.put("CATEGORYSEARCH", "根据类别查询");
		return SUCCESS;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Date getSearchDate() {
		return searchDate;
	}
	public void setSearchDate(Date searchDate) {
		this.searchDate = searchDate;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public IBlogContentService getBlogContentService() {
		return blogContentService;
	}
	public void setBlogContentService(IBlogContentService blogContentService) {
		this.blogContentService = blogContentService;
	}
	

}
