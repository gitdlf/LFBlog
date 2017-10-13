package cn.lfsenior.web.service.imp;

import java.io.Serializable;
import java.util.List;

import cn.lfsenior.entity.BlogCommit;
import cn.lfsenior.web.dao.IBlogCommitDao;
import cn.lfsenior.web.service.IBlogCommitService;

public class BlogCommitService implements IBlogCommitService {
	private IBlogCommitDao blogCommitDao;
	public void setBlogCommitDao(IBlogCommitDao blogCommitDao) {
		this.blogCommitDao = blogCommitDao;
	}
	public List<BlogCommit> findCommitByBlogContentId(Integer blogContentId) {
		// TODO Auto-generated method stub
		return blogCommitDao.findCommitByBlogContentId(blogContentId);
	}

	public Serializable saveCommit(BlogCommit blogCommit) {
		// TODO Auto-generated method stub
		return blogCommitDao.saveCommit(blogCommit);
	}

	public void delCommit(BlogCommit blogCommit) {
		// TODO Auto-generated method stub
		blogCommitDao.delCommit(blogCommit);
	}

	public BlogCommit findCommitById(Integer blogCommitId) {
		// TODO Auto-generated method stub
		return blogCommitDao.findCommitById(blogCommitId);
	}

}
