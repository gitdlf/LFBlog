package cn.lfsenior.web.dao;

import java.util.List;

import cn.lfsenior.entity.BlogContent;
import cn.lfsenior.entity.PageBean;

/**
 * 分页相关的数据操作
 * @author Administrator
 *
 */
public interface IPageBeanDao {
	/**
	 * 根据分页数据查找博客对象的集合
	 * @param pageBean
	 * @return
	 */
	List<BlogContent> findBlogContentByPage(PageBean pageBean);
}
