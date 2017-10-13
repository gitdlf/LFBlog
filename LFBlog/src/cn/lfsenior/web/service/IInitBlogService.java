package cn.lfsenior.web.service;

import java.util.Map;

/**
 * 
 * @author Administrator
 *
 */
public interface IInitBlogService {
	/**
	 * 初始化博客数据
	 * @param session 会话对象
	 */
	void initBlog(Map<String, Object>  session);
}
