package cn.lfsenior.web.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;

import cn.lfsenior.entity.TimeLineBean;
import cn.lfsenior.web.dao.ITimeLineDao;

public class TimeLineDao implements ITimeLineDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<TimeLineBean> findAllTime() {
		// TODO Auto-generated method stub
		List<TimeLineBean> resultValue=new ArrayList<TimeLineBean>();
		String sql="SELECT DATE_FORMAT(content.content_date,'%Y-%m') result,COUNT(*) FROM blog_content content GROUP BY result  ORDER BY result DESC";
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(sql);
		List<Object[]> list = query.list();
		for (Object[] objects : list) {
			TimeLineBean timeLineBean=new TimeLineBean();
			timeLineBean.setTime(String.valueOf(objects[0]));
			timeLineBean.setCount(String.valueOf(objects[1]));
			resultValue.add(timeLineBean);
		}
		return resultValue;
	}

}
