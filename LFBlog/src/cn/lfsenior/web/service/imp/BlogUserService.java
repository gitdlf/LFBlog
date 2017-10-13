package cn.lfsenior.web.service.imp;

import cn.lfsenior.entity.BlogUser;
import cn.lfsenior.web.dao.IBlogUserDao;
import cn.lfsenior.web.service.IBlogUserService;

public class BlogUserService implements IBlogUserService {
	private IBlogUserDao blogUserDao;
	public void setBlogUserDao(IBlogUserDao blogUserDao) {
		this.blogUserDao = blogUserDao;
	}
	public BlogUser findBlogUser(BlogUser blogUser) {
		// TODO Auto-generated method stub
		return blogUserDao.findBlogUser(blogUser);
	}
	
}
