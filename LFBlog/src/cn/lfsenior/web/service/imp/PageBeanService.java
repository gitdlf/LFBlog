package cn.lfsenior.web.service.imp;

import java.util.List;

import cn.lfsenior.entity.BlogContent;
import cn.lfsenior.entity.PageBean;
import cn.lfsenior.web.dao.IPageBeanDao;
import cn.lfsenior.web.service.IPageBeanService;

public class PageBeanService implements IPageBeanService {
	private IPageBeanDao pageBeanDao;

	public void setPageBeanDao(IPageBeanDao pageBeanDao) {
		this.pageBeanDao = pageBeanDao;
	}

	public List<BlogContent> nextPage(PageBean pageBean) {
		// TODO Auto-generated method stub
		pageBean.setCurrentPage(pageBean.getCurrentPage() + 1);
		return pageBeanDao.findBlogContentByPage(pageBean);
	}

	public List<BlogContent> upPage(PageBean pageBean) {
		// TODO Auto-generated method stub
		pageBean.setCurrentPage(pageBean.getCurrentPage() - 1);
		return pageBeanDao.findBlogContentByPage(pageBean);
	}

	public List<BlogContent> selectPage(PageBean pageBean) {
		// TODO Auto-generated method stub
		return pageBeanDao.findBlogContentByPage(pageBean);
	}

}
