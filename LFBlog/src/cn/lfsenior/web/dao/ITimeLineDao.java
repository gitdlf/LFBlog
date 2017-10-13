package cn.lfsenior.web.dao;

import java.util.List;

import cn.lfsenior.entity.TimeLineBean;

public interface ITimeLineDao {
	/**
	 * 操作博客的所有日期数据
	 * @return 返回日期数据封装的集合
	 */
	List<TimeLineBean> findAllTime();
}
