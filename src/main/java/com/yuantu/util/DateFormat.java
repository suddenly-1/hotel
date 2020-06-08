package com.yuantu.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

    public static Date StringConvertDate(String dateStr){
        return DateFormat.StringConvertDate(dateStr,"yyyy-MM-dd HH:mm");
    }
    public static Date StringConvertDate(String dateStr, String partten){
        try {
            return new SimpleDateFormat(partten).parse(dateStr);
        } catch (ParseException e) {
            System.out.println("日期格式转换错误！");
            return null;
        }
    }

    public static String DateConvertString(Date date){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm").format(date);
    }
    public static String DateConvertString(Date date, String partten){
        return new SimpleDateFormat(partten).format(date);
    }

}
