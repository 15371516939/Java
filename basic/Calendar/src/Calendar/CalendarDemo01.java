package Calendar;

import java.util.Calendar;
import java.util.Date;


public class CalendarDemo01 {

    public static void main(String[] args) {
//        public int get(int field):返回给定日历字段的值
        demo01();
    }

    private static void demo01() {
        //public Date getTime():返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量)的Date对象
        //
        Calendar a = Calendar.getInstance();
        Date date = a.getTime();
        System.out.println(date);
    }

}