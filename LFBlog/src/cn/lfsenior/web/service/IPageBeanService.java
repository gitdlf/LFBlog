package cn.lfsenior.web.service;

import java.util.List;

import cn.lfsenior.entity.BlogContent;
import cn.lfsenior.entity.PageBean;

/**
 * 分页相关服务
 * @author Administrator
 *
 */
public interface IPageBeanService {
	/**
	 * 下一页
	 * @param pageBean 分页对象数据
	 * @return
	 */
	List<BlogContent> nextPage(PageBean pageBean);
	
	/**
	 * 上一页
	 * @param pageBean 分页对象数据
	 * @return
	 */
	List<BlogContent> upPage(PageBean pageBean);
	
	/**
	 * 选择页
	 * @param pageBean 分页对象数据
	 * @return
	 */
	List<BlogContent> selectPage(PageBean pageBean);
 
}
