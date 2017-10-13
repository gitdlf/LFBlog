package cn.lfsenior.web.dao;

import java.sql.Date;
import java.util.List;

import cn.lfsenior.entity.BlogCategory;
import cn.lfsenior.entity.BlogContent;

/**
 * 博客内容对象的操作
 * @author Administrator
 *
 */
public interface IBlogContentDao {
	/**
	 * 更具文章id查找文章信息
	 * @param contentId文章的id
	 * @return 返回文章的封装对象
	 */
	BlogContent findBlogContentById(Integer contentId);
	
	
	/**
	 * 更具博客类别查找文章信息
	 * @param blogCategory 博客类别对象
	 * @return 返回文章的集合
	 */
	List<BlogContent> findBlogContentByCatagory(BlogCategory blogCategory);
	
	
	/**
	 * 根据关键词查找文章信息集合
	 * @param keyWord 关键字
	 * @return 返回文章的集合
	 */
	List<BlogContent> findBlogContentByKeyWord(String keyWord);
	
	/**
	 * 根据类别id查找文章信息集合
	 * @param categoryID类别id
	 * @return
	 */
	List<BlogContent> findBlogContentByCategoryId(Integer categoryId);
	
	
	/**
	 * 根据日期查询博客集合
	 * @param date 查询的日期
	 * @return
	 */
	List<BlogContent> findBlogContentByDate(Date date);
	
	/**
	 * 更新博客访问量
	 * @param blogContent
	 */
	void updateBlogContentVist(BlogContent blogContent);
	
}
