package cn.lfsenior.web.service.imp;

import java.util.List;

import cn.lfsenior.entity.BlogCategory;
import cn.lfsenior.entity.BlogUser;
import cn.lfsenior.web.dao.IBlogCategoryDao;
import cn.lfsenior.web.service.IBlogCategoryService;

public class BlogCategoryService implements IBlogCategoryService {
	private IBlogCategoryDao blogCategoryDao;
	public void setBlogCategoryDao(IBlogCategoryDao blogCategoryDao) {
		this.blogCategoryDao = blogCategoryDao;
	}
	public List<BlogCategory> findBlogCategoryAll() {
		// TODO Auto-generated method stub
		return blogCategoryDao.findBlogCategoryAll();
	}

	public List<BlogCategory> findBlogCateGoryByBlogUser(BlogUser blogUser) {
		// TODO Auto-generated method stub
		return blogCategoryDao.findBlogCateGoryByBlogUser(blogUser);
	}

}
