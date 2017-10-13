package cn.lfsenior.web.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.ScrollableResults;
import org.hibernate.SessionFactory;

import cn.lfsenior.entity.BlogContent;
import cn.lfsenior.entity.PageBean;
import cn.lfsenior.web.dao.IPageBeanDao;

public class PageBeanDao implements IPageBeanDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<BlogContent> findBlogContentByPage(PageBean pageBean) {
		// TODO Auto-generated method stub
		/**
		 * 
		 */
		Query query = sessionFactory.getCurrentSession().createQuery("from BlogContent content order by content.contentDate desc");
		ScrollableResults scroll = query.scroll(); // 得到滚动的结果集
		scroll.last(); // 滚动到最后一行
		int allCount = scroll.getRowNumber() + 1;// 得到滚到的记录数，即总记录数
		pageBean.setAllCount(allCount);
		pageBean.setAllPage((int)Math.ceil(pageBean.getAllCount()/(pageBean.getCount()*1.0)));
		/**
		 * 判断数据是否正确
		 */
		if(pageBean.getCurrentPage()<=0){
			pageBean.setCurrentPage(1);
		}else if(pageBean.getCurrentPage()>pageBean.getAllPage()){
			pageBean.setCurrentPage(pageBean.getAllPage());
		}
		/**
		 * 当前页-1*count就是开始位置
		 */
		int firstIndex=(pageBean.getCurrentPage()-1)*pageBean.getCount();
		int maxResult=(firstIndex+pageBean.getCount())>=pageBean.getAllCount()?pageBean.getAllCount()-firstIndex:pageBean.getCount();
		/**
		 * 设置分页查询
		 */
		query.setFirstResult(firstIndex);
		query.setMaxResults(maxResult);
		return query.list();
	}

}
