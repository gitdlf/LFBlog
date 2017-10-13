package cn.lfsenior.web.service.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.lfsenior.entity.BlogCategory;
import cn.lfsenior.entity.BlogContent;
import cn.lfsenior.entity.PageBean;
import cn.lfsenior.entity.TimeLineBean;
import cn.lfsenior.web.dao.IBlogCategoryDao;
import cn.lfsenior.web.dao.IPageBeanDao;
import cn.lfsenior.web.dao.ITimeLineDao;
import cn.lfsenior.web.service.IInitBlogService;

public class InitBlogService implements IInitBlogService {
	private IPageBeanDao pageBeanDao;
	public void setPageBeanDao(IPageBeanDao pageBeanDao) {
		this.pageBeanDao = pageBeanDao;
	}
	
	private ITimeLineDao timeLineDao;
	public void setTimeLineDao(ITimeLineDao timeLineDao) {
		this.timeLineDao = timeLineDao;
	}
	
	private IBlogCategoryDao blogCategoryDao;
	public void setBlogCategoryDao(IBlogCategoryDao blogCategoryDao) {
		this.blogCategoryDao = blogCategoryDao;
	}
	public void initBlog(Map<String, Object> session) {
		// TODO Auto-generated method stub
		/*
		 *初始化pagebean 
		 */
		PageBean pageBean=new PageBean();
		/*
		 * 获取第一页initBlogContent
		 */
		List<BlogContent> initBlogContent =pageBeanDao.findBlogContentByPage(pageBean);
		
		/*
		 * 获取文章列表,复制initBlogContent就好了
		 */
		
		List<BlogContent> initArticleList=new ArrayList<BlogContent>();
		initArticleList.addAll(initBlogContent);
		/*
		 * 获取时间线数据
		 */
		
		List<TimeLineBean> timeLine=timeLineDao.findAllTime();
		
		/*
		 * 获取所有分类数据
		 */
		List<BlogCategory> initBlogCategory = blogCategoryDao.findBlogCategoryAll();
		
		/*
		 * 保存数据
		 */
		
		session.put("BLOGCONTENT", initBlogContent);
		session.put("ARTICLELIST", initArticleList);
		session.put("BLOGCATEGORY", initBlogCategory);
		session.put("timeLine", timeLine);
		session.put("page", pageBean);
	}

}
