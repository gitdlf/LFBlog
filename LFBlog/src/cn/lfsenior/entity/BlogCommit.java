package cn.lfsenior.entity;

import java.sql.Date;

/**
 * 评论主题
 * @author LFSenior
 *
 *上午10:34:09
 *
 */
public class BlogCommit {
	private Integer commitId;
	private String commitName;
	private String commitEmail;
	private String commitContent;
	private Date commitDate;
	private BlogContent blogContent;
	public Integer getCommitId() {
		return commitId;
	}
	public void setCommitId(Integer commitId) {
		this.commitId = commitId;
	}
	public String getCommitName() {
		return commitName;
	}
	public void setCommitName(String commitName) {
		this.commitName = commitName;
	}
	public String getCommitEmail() {
		return commitEmail;
	}
	public void setCommitEmail(String commitEmail) {
		this.commitEmail = commitEmail;
	}
	public String getCommitContent() {
		return commitContent;
	}
	public void setCommitContent(String commitContent) {
		this.commitContent = commitContent;
	}
	public BlogContent getBlogContent() {
		return blogContent;
	}
	public void setBlogContent(BlogContent blogContent) {
		this.blogContent = blogContent;
	}
	public Date getCommitDate() {
		return commitDate;
	}
	public void setCommitDate(Date commitDate) {
		this.commitDate = commitDate;
	}
}
