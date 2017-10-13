package cn.lfsenior.web.service;

import cn.lfsenior.entity.BlogUser;

/**
 * 用户相关服务
 * @author Administrator
 *
 */
public interface IBlogUserService {
	/**
	 * 更具用户信息查找用户
	 * @param blogUser 需要查找的用户信息
	 * @return 返回查找到封装好的用户信息数据
	 */
	BlogUser findBlogUser(BlogUser blogUser);
}
