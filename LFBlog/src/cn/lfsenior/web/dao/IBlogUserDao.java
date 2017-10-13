package cn.lfsenior.web.dao;

import cn.lfsenior.entity.BlogUser;

/**
 * 用户相关持久层操作
 * @author Administrator
 *
 */
public interface IBlogUserDao {
	/**
	 * 更具用户信息查找用户
	 * @param blogUser 需要查找的用户信息
	 * @return 返回查找到封装好的用户信息数据
	 */
	BlogUser findBlogUser(BlogUser blogUser);
}
