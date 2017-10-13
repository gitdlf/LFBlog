package cn.lfsenior.web.service.imp;

import java.util.List;

import cn.lfsenior.entity.TimeLineBean;
import cn.lfsenior.web.dao.ITimeLineDao;
import cn.lfsenior.web.service.ITimeLineService;
public class TimeLineService implements ITimeLineService {
	private ITimeLineDao timeLineDao;
	public void setTimeLineDao(ITimeLineDao timeLineDao) {
		this.timeLineDao = timeLineDao;
	}

	public List<TimeLineBean> findAllTime() {
		return timeLineDao.findAllTime();
	}

}
