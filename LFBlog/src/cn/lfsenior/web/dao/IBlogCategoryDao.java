package cn.lfsenior.web.dao;

import java.util.List;

import cn.lfsenior.entity.BlogCategory;
import cn.lfsenior.entity.BlogUser;

/**
 * 类别相关操作
 * @author Administrator
 *
 */
public interface IBlogCategoryDao {
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
