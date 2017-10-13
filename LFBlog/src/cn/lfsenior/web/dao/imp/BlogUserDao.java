package cn.lfsenior.web.dao.imp;

import org.hibernate.SessionFactory;

import cn.lfsenior.entity.BlogUser;
import cn.lfsenior.web.dao.IBlogUserDao;

public class BlogUserDao implements IBlogUserDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public BlogUser findBlogUser(BlogUser blogUser) {
		/**
		 * 查找操作
		 */
		return (BlogUser) sessionFactory.getCurrentSession()
		.createQuery("from BlogUser user where user.userName=:name and user.userPwd=:pwd")
		.setParameter("name", blogUser.getUserName())
		.setParameter("pwd", blogUser.getUserPwd()).uniqueResult();
	}

}
