package com.yuantu.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

    public static Date StringConvertDate(String dateStr) {
        return DateFormat.StringConvertDate(dateStr, "yyyy-MM-dd HH:mm");
    }

    public static Date StringConvertDate(String dateStr, String partten) {
        try {
            return new SimpleDateFormat(partten).parse(dateStr);
        } catch (ParseException e) {
            System.out.println("日期格式转换错误！");
            return null;
        }
    }

    public static String DateConvertString(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm").format(date);
    }

    public static String DateConvertString(Date date, String partten) {
        return new SimpleDateFormat(partten).format(date);
    }

    /**
     * @param time
     * @desc 字符串转时间戳
     * @example time="2019-04-19 00:00:00"
     **/
    public Long getTimestamp(String time) {
        Long timestamp = null;
        try {
            timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return timestamp;
    }

    /*
     * 将时间戳转换为时间
     */
    public static String stampToDate(String stap) {
        String time;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(stap);
        Date date = new Date(lt);
        time = simpleDateFormat.format(date);
        return time;
    }


}
