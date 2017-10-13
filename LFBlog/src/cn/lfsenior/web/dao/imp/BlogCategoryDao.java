package cn.lfsenior.web.dao.imp;

import java.util.List;

import org.hibernate.SessionFactory;

import cn.lfsenior.entity.BlogCategory;
import cn.lfsenior.entity.BlogUser;
import cn.lfsenior.web.dao.IBlogCategoryDao;

public class BlogCategoryDao implements IBlogCategoryDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@SuppressWarnings("unchecked")
	public List<BlogCategory> findBlogCategoryAll() {
		return sessionFactory.getCurrentSession().createQuery("from BlogCategory").list();
	}

	@SuppressWarnings("unchecked")
	public List<BlogCategory> findBlogCateGoryByBlogUser(BlogUser blogUser) {
		return sessionFactory.getCurrentSession().createQuery("from BlogCategory category where category.blogUser.userId=:userid").setParameter("userid", blogUser.getUserId()).list();
	}

}
