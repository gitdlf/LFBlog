package cn.lfsenior.web.service;

import java.util.List;

import cn.lfsenior.entity.BlogCategory;
import cn.lfsenior.entity.BlogUser;

/**
 * 分类相关的服务
 * @author Administrator
 *
 */
public interface IBlogCategoryService {
	/**
	 * 查找所有的类别信息
	 * @return
	 */
	List<BlogCategory> findBlogCategoryAll();
	
	
	/**
	 * 根据用户信息查找分类数据
	 * @param blogUser
	 * @return
	 */
	List<BlogCategory> findBlogCateGoryByBlogUser(BlogUser blogUser);
	
}
