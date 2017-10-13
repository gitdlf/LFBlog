package cn.lfsenior.web.dao.imp;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;

import cn.lfsenior.entity.BlogCommit;
import cn.lfsenior.web.dao.IBlogCommitDao;

public class BlogCommitDao implements IBlogCommitDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@SuppressWarnings("unchecked")
	public List<BlogCommit> findCommitByBlogContentId(Integer blogContentId) {
		return sessionFactory.getCurrentSession().createQuery("from BlogCommit commit where commit.blogContent.contentId=:contentId").setParameter("contentId", blogContentId).list();
	}

	public Serializable saveCommit(BlogCommit blogCommit) {
		return sessionFactory.getCurrentSession().save(blogCommit);
	}

	public void delCommit(BlogCommit blogCommit) {
		sessionFactory.getCurrentSession().delete(blogCommit);
	}
	public BlogCommit findCommitById(Integer blogCommitId) {
		return (BlogCommit) sessionFactory.getCurrentSession().createQuery("from BlogCommit commit where commit.commitId=:id").setParameter("id", blogCommitId).uniqueResult();
	}
	

}
