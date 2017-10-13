package cn.lfsenior.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 和Spring操作相关的工具类
 * @author Administrator
 *
 */
public class SpringUtil {
	/**
	 * 获得ApplicationContext类，主要可以手动获取bean
	 */
	private static ApplicationContext ac;
	
	private SpringUtil(){
		
	}
	
	/**
	 * 获取
	 * @returnApplicationContext
	 */
	public static ApplicationContext getApplicationContext(){
		if(ac==null){
			return new ClassPathXmlApplicationContext("bean.xml");
		}else{
			return ac;
		}
	}
}
