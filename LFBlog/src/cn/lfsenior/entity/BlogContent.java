package cn.lfsenior.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 博客内容对象
 * @author LFSenior
 *
 *下午4:08:08
 *
 */
public class BlogContent implements Serializable {
	private static final long serialVersionUID = 6524389626638344542L;
	private Integer contentId;
	private String contentTitle;
	private Date contentDate;
	private String contentBody;
	private BlogUser blogUser;
	private String contentLabel;
	private String contentVisit;
	private Set<BlogCategory> blogCategorySet=new HashSet<BlogCategory>();
	private String contentDescribe;
	private Set<BlogCommit> blogCommitSet=new HashSet<BlogCommit>();
	/**
	 * 用于接收用户提交的l类别id
	 */
	private String[] blogCategoryIds;

	
	
	public String getContentDescribe() {
		return contentDescribe;
	}
	public void setContentDescribe(String contentDescribe) {
		this.contentDescribe = contentDescribe;
	}
	public Integer getContentId() {
		return contentId;
	}
	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}
	public String getContentTitle() {
		return contentTitle;
	}
	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}
	public Date getContentDate() {
		return contentDate;
	}
	public void setContentDate(Date contentDate) {
		this.contentDate = contentDate;
	}
	public String getContentBody() {
		return contentBody;
	}
	public void setContentBody(String contentBody) {
		this.contentBody = contentBody;
	}
	public BlogUser getBlogUser() {
		return blogUser;
	}
	public void setBlogUser(BlogUser blogUser) {
		this.blogUser = blogUser;
	}
	public String getContentLabel() {
		return contentLabel;
	}
	public void setContentLabel(String contentLabel) {
		this.contentLabel = contentLabel;
	}
	public String getContentVisit() {
		return contentVisit;
	}
	public void setContentVisit(String contentVisit) {
		this.contentVisit = contentVisit;
	}
	public Set<BlogCategory> getBlogCategorySet() {
		return blogCategorySet;
	}
	public void setBlogCategorySet(Set<BlogCategory> blogCategorySet) {
		this.blogCategorySet = blogCategorySet;
	}
	public String[] getBlogCategoryIds() {
		return blogCategoryIds;
	}
	public void setBlogCategoryIds(String[] blogCategoryIds) {
		this.blogCategoryIds = blogCategoryIds;
	}
	public Set<BlogCommit> getBlogCommitSet() {
		return blogCommitSet;
	}
	public void setBlogCommitSet(Set<BlogCommit> blogCommitSet) {
		this.blogCommitSet = blogCommitSet;
	}
	
}
