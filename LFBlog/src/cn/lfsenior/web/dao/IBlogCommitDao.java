package cn.lfsenior.web.dao;

import java.io.Serializable;
import java.util.List;

import cn.lfsenior.entity.BlogCommit;

/**
 * 博客评论相关操作
 * @author Administrator
 *
 */
public interface IBlogCommitDao {
	/**
	 * 根据文章内容id查找评论
	 * @param blogContentId 文章id
	 * @return 评论id
	 */
	List<BlogCommit> findCommitByBlogContentId(Integer blogContentId);
	
	/**
	 * 保存评论
	 * @param blogCommit
	 */
	Serializable saveCommit(BlogCommit blogCommit);
	
	
	/**
	 * 删除评论
	 * @param blogCommit
	 */
	void delCommit(BlogCommit blogCommit);
	
	
	/**
	 * 通过id查找对应的评论
	 * @param blogCommitId
	 * @return
	 */
	BlogCommit findCommitById(Integer blogCommitId);
}
