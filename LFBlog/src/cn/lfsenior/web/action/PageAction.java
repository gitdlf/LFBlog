package cn.lfsenior.web.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.lfsenior.entity.BlogContent;
import cn.lfsenior.entity.PageBean;
import cn.lfsenior.web.service.IPageBeanService;

/**
 * page相关操作的action
 * 
 * @author LF.zero
 *
 */
public class PageAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9039081160992198628L;
	/*
	 * 页面请求数据的自动封装
	 */
	private PageBean page;

	public void setPage(PageBean page) {
		this.page = page;
	}

	public PageBean getPage() {
		return page;
	}
	/*
	 * IOC注入的实例
	 */

	private IPageBeanService pageBeanService;

	public void setPageBeanService(IPageBeanService pageBeanService) {
		this.pageBeanService = pageBeanService;
	}

	/**
	 * 下一页
	 * 
	 * @return
	 */
	public String nextPage() {
		/*
		 * 获取数据
		 */
		List<BlogContent> blogContents = pageBeanService.nextPage(page);
		/*
		 * 获取session实例
		 */
		ActionContext context = ActionContext.getContext();
		saveDate(context,blogContents);
		return SUCCESS;
	}

	/**
	 * 上一页
	 * 
	 * @return
	 */
	public String upPage() {
		/*
		 * 获取数据
		 */
		List<BlogContent> blogContents = pageBeanService.upPage(page);
		/*
		 * 获取session实例
		 */
		ActionContext context = ActionContext.getContext();
		saveDate(context,blogContents);
		return SUCCESS;
	}

	/**
	 * 选择页
	 * 
	 * @return
	 */
	public String selectPage() {
		/*
		 * 获取数据
		 */
		List<BlogContent> blogContents = pageBeanService.selectPage(page);
		/*
		 * 获取session实例
		 */
		ActionContext context = ActionContext.getContext();
		saveDate(context,blogContents);
		return SUCCESS;
	}
	
	/**
	 * 抽取保存数据方法
	 * @param context
	 */
	public void saveDate(ActionContext context,List<BlogContent> blogContents){
		Map<String, Object> request = context.getContextMap();
		request.put("BLOGCONTENT", blogContents);
		context.getSession().put("page", page);
	}

}
