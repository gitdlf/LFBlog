package cn.lfsenior.web.intercept;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import cn.lfsenior.util.SpringUtil;
import cn.lfsenior.web.service.IInitBlogService;

public class InitIntercept implements Interceptor{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3407896292601964696L;

	public void destroy() {
		
	}

	public void init() {
		
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		/**
		 * 判断是否存在一个名叫INITSESSION的session属性
		 */
		ActionContext ac = invocation.getInvocationContext();
		Object obj = ac.getSession().get("BLOGCONTENT");
		if(obj==null){
			//执行初始化
			((IInitBlogService)SpringUtil.getApplicationContext().getBean("initBlogService")).initBlog(ac.getSession());
		}
		return invocation.invoke();
	}
}
