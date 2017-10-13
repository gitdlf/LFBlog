package junit.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoreTest {
	@Test
	public void SpringHibernate(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		SessionFactory sf=(SessionFactory) ac.getBean("sessionFactory");
		sf.openSession();
	}
	
	@Test
	public void testCopy(){
		List<String> src=new ArrayList<String>();
		List<String> dec=new ArrayList<String>();
		src.add("zhangdsan");
		src.add("zhangdsan");
		src.add("zhangdsan");
		src.add("zhangdsan");
		dec.addAll(src);
		System.out.println(dec);
		System.out.println(src);
		src.remove(1);
		System.out.println(dec);
		System.out.println(src);
		
	}
}
