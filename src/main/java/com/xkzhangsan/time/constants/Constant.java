package com.xkzhangsan.time.constants;

public class Constant {
	
	 /**
	  * 每天小时数
	  */
	 public static final int HOURS_PER_DAY = 24;
	 
	 /**
	  * 每小时分钟数
	  */
	 public static final int MINUTES_PER_HOUR = 60;
	 
	 /**
	  * 每分钟秒数
	  */
	 public static final int SECONDS_PER_MINUTE = 60;
	 
	 /**
	  * 每秒毫秒数
	  */
	 public static final int MILLISECOND_PER_SECONDS = 1000;
	 
	 /**
	  * 每天秒数
	  */
	 public static final int SECONDS_PER_DAY = HOURS_PER_DAY * MINUTES_PER_HOUR * SECONDS_PER_MINUTE;
	 
	 /**
	  * 每天毫秒数
	  */
	 public static final int MILLISECOND_PER_DAY = SECONDS_PER_DAY * MILLISECOND_PER_SECONDS;
	 
	 /**
	  * MonthDay 默认解析前缀
	  * 解析字符串需要加前缀，如"--12-03"
	  * @see java.time.MonthDay.parse(CharSequence)
	  */
	 public static final String MONTHDAY_FORMAT_PRE = "--";

}