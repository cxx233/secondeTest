package com.learn.Utils;

import java.math.BigDecimal;

/**
 * 类名称：StringUtil
 * 创建人：cxx （从TG那学习得来）
 * @author cxx
 * 创建时间：2017-10-16 16:35
 *
 */
public class StringUtil {
	/**
	 * 过滤空NULL
	 * @param o
	 * @return
	 */
	public static String FilterNull(Object o) {
		return o != null && !"null".equals(o.toString()) ? o.toString().trim() : "";
	}
	
	/**
	 * 是否为空
	 * @param o 判断的对象
	 * @return 如果是空，则返回真，否则返回假
	 */
	public static boolean isEmpty(Object o) {
		if(o==null) {
			return true;
		}
		if("".equals(FilterNull(o))) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 是否为空
	 * @param o 判断的对象
	 * @return 如果是空，则返回真，否则返回假
	 */
	public static boolean isNotEmpty(Object o) {
		if(o==null) {
			return false;
		}
		if("".equals(FilterNull(o))) {
			return false;
		}else {
			return true;
		}
	}
	
	/**
	 * 是否可转化为数字
	 * 判断是否为数字，用new BigDecimal(o.toString());对象
	 * @param o 对象
	 * @return 如果是数字，则返回true，否则返回false；
	 */
	public static boolean isNum(Object o) {
		try {
			new BigDecimal(o.toString());
			return true;
		} catch (Exception e) {
		}
		return false;
	}
	
}
