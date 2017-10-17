package com.learn.Utils;

import java.math.BigDecimal;

/**
 * �����ƣ�StringUtil
 * �����ˣ�cxx ����TG��ѧϰ������
 * @author cxx
 * ����ʱ�䣺2017-10-16 16:35
 *
 */
public class StringUtil {
	/**
	 * ���˿�NULL
	 * @param o
	 * @return
	 */
	public static String FilterNull(Object o) {
		return o != null && !"null".equals(o.toString()) ? o.toString().trim() : "";
	}
	
	/**
	 * �Ƿ�Ϊ��
	 * @param o �жϵĶ���
	 * @return ����ǿգ��򷵻��棬���򷵻ؼ�
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
	 * �Ƿ�Ϊ��
	 * @param o �жϵĶ���
	 * @return ����ǿգ��򷵻��棬���򷵻ؼ�
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
	 * �Ƿ��ת��Ϊ����
	 * �ж��Ƿ�Ϊ���֣���new BigDecimal(o.toString());����
	 * @param o ����
	 * @return ��������֣��򷵻�true�����򷵻�false��
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
