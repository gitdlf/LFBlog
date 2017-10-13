package cn.lfsenior.web.dao.imp;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.SessionFactory;

import cn.lfsenior.entity.BlogCategory;
import cn.lfsenior.entity.BlogContent;
import cn.lfsenior.web.dao.IBlogContentDao;

public class BlogContentDao implements IBlogContentDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public BlogContent findBlogContentById(Integer contentId) {
		// TODO Auto-generated method stub
		return (BlogContent) sessionFactory.getCurrentSession().get(BlogContent.class, contentId);
	}

	/**
	 * 2017/10/11记暂时没找到好的解决办法
	 */
	public List<BlogContent> findBlogContentByCatagory(BlogCategory blogCategory) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<BlogContent> findBlogContentByKeyWord(String keyWord) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession()
				.createQuery("from BlogContent content where content.contentTitle like :keyWord")
				.setParameter("keyWord", "%" + keyWord + "%").list();
	}
	@SuppressWarnings("unchecked")
	public List<BlogContent> findBlogContentByCategoryId(Integer categoryId) {
		String sql="SELECT * FROM blog_content content WHERE content.content_Id IN (SELECT content_id FROM blog_content_category bcc WHERE bcc.category_id=:categoryId)";
		return sessionFactory
				.getCurrentSession()
				.createSQLQuery(sql)
				.addEntity(BlogContent.class)
				.setParameter("categoryId", categoryId)
				.list();
	}

	@SuppressWarnings("unchecked")
	public List<BlogContent> findBlogContentByDate(Date date) {
		String sql="SELECT * FROM blog_content content WHERE DATE_FORMAT(content.content_date,'%Y-%m') = DATE_FORMAT(:date,'%Y-%m')";
		return sessionFactory.
				getCurrentSession()
				.createSQLQuery(sql)
				.addEntity(BlogContent.class)
				.setParameter("date", new SimpleDateFormat("yyyy-MM-dd").format(date))
				.list();
	}

	public void updateBlogContentVist(BlogContent blogContent) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(blogContent);
	}
	
}
