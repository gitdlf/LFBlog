package cn.lfsenior.entity;

import java.io.Serializable;

/**
 * 类别对象与用户表存在对一关系
 * @author LFSenior
 *
 *下午3:56:36
 *
 */
public class BlogCategory implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5011719314663189619L;
	private Integer categoryId;
	private String categoryName;
	private BlogUser blogUser;

	public BlogUser getBlogUser() {
		return blogUser;
	}
	
	public void setBlogUser(BlogUser blogUser) {
		this.blogUser = blogUser;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
