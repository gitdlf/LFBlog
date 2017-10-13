package cn.lfsenior.entity;

/**
 * 分页数据对象
 * @author LFSenior
 *
 *上午11:02:14
 *
 */
public class PageBean {
	private Integer currentPage=1;//当前页
	private Integer allCount;//总记录数
	private Integer allPage;//总页面数
	private Integer count=6;//页面内容数量
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getAllCount() {
		return allCount;
	}
	public void setAllCount(Integer allCount) {
		this.allCount = allCount;
	}
	public Integer getAllPage() {
		return allPage;
	}
	public void setAllPage(Integer allPage) {
		this.allPage = allPage;
	}
	
}
