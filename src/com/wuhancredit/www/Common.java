
package com.wuhancredit.www;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    static SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");

    static SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");

    static SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy.MM.dd");

    static SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy.MM");

    public static String sToDate(String s) {
        s = s.trim().replace(" ", "").replace("�", "");

        if (s.equals("长期")) {
            return "'2099-12-31'";
        }

        if (s.indexOf("-") == 2 || s.indexOf("/") == 2 || s.indexOf(".") == 2) {
            s = "20" + s;
        }

        try {
            Date date = new Date(sdf1.parse(s).getTime());
            return "'" + sdf1.format(date) + "'";
        } catch (Exception e) {

        }
        try {
            Date date = new Date(sdf2.parse(s).getTime());
            return "'" + sdf1.format(date) + "'";
        } catch (Exception e) {

        }
        try {
            Date date = new Date(sdf3.parse(s).getTime());
            return "'" + sdf1.format(date) + "'";
        } catch (Exception e) {

        }
        try {
            Date date = new Date(sdf4.parse(s).getTime());
            return "'" + sdf1.format(date) + "'";
        } catch (Exception e) {

        }
        System.out.println(s);
        return "null";
    }

    public static String toState(String s) {
        if (s.equals("正常") || s.equals("null") || s.equals("0")) {
            return "'0'";
        } else if (s.equals("撤销") || s.equals("1")) {
            return "'1'";
        } else if (s.equals("异议") || s.equals("2")) {
            return "'2'";
        }
        return "'3'";
    }
}
