package cn.lfsenior.web.action.converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

/**
 * 日期类型转换器
 * 
 * @author LF.zero
 *
 */
public class DateConverter extends StrutsTypeConverter {
	DateFormat[] df = { new SimpleDateFormat("yyyy-MM-dd"),
			new SimpleDateFormat("yyyy年MM月dd日"), new SimpleDateFormat("yyyy-MM"), new SimpleDateFormat("yyyy年MM月") };

	@SuppressWarnings("rawtypes")
	@Override
	/**
	 * 将String转换为指定类型
	 * 
	 * @param context
	 *            当前上下文环境
	 * @param values
	 *            jsp表单提交的字符串的值
	 * @param toClass
	 *            要转换为的目标类型
	 */
	public Object convertFromString(Map context, String[] values, Class toClass) {
		// TODO Auto-generated method stub
		//判断：内容部位空
		if(values==null||values.length==0){
			return null;
		}
		if(java.sql.Date.class!=toClass && java.util.Date.class!=toClass){
			return null;
		}
		
		/*
		 * 迭代转换器失败继续下一个格式转换，转换成功直接返回
		 */
		for(int i=0;i<df.length;i++){
			try {
				if(java.sql.Date.class!=toClass){
					return df[i].parse(values[0]);
				}else{
					return new java.sql.Date(df[i].parse(values[0]).getTime());
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				continue;
			}
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public String convertToString(Map context, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
