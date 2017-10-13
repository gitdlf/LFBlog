package cn.lfsenior.web.service.imp;

import java.sql.Date;
import java.util.List;

import cn.lfsenior.entity.BlogCategory;
import cn.lfsenior.entity.BlogContent;
import cn.lfsenior.web.dao.IBlogContentDao;
import cn.lfsenior.web.service.IBlogContentService;

public class BlogContentService implements IBlogContentService {
	private IBlogContentDao blogContentDao;
	public void setBlogContentDao(IBlogContentDao blogContentDao) {
		this.blogContentDao = blogContentDao;
	}

	public BlogContent findBlogContentById(Integer contentId) {
		// TODO Auto-generated method stub
		return blogContentDao.findBlogContentById(contentId);
	}

	public List<BlogContent> findBlogContentByCatagory(BlogCategory blogCategory) {
		// TODO Auto-generated method stub
		return blogContentDao.findBlogContentByCatagory(blogCategory);
	}

	public List<BlogContent> findBlogContentByKeyWord(String keyWord) {
		// TODO Auto-generated method stub
		return blogContentDao.findBlogContentByKeyWord(keyWord);
	}

	public List<BlogContent> findBlogContentByCategoryId(Integer categoryId) {
		// TODO Auto-generated method stub
		return blogContentDao.findBlogContentByCategoryId(categoryId);
	}

	public List<BlogContent> findBlogContentByDate(Date date) {
		// TODO Auto-generated method stub
		return blogContentDao.findBlogContentByDate(date);
	}

	public void updateBlogContentVist(BlogContent blogContent) {
		// TODO Auto-generated method stub
		blogContentDao.updateBlogContentVist(blogContent);
	}

}
