package cn.lfsenior.web.service;

import java.util.List;

import cn.lfsenior.entity.TimeLineBean;

/**
 * 时间线管理服务
 * @author Administrator
 *
 */
public interface ITimeLineService {
	/**
	 * 操作博客的所有日期数据
	 * @return 返回日期数据封装的集合
	 */
	List<TimeLineBean> findAllTime();
}
