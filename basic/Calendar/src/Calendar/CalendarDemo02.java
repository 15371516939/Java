package Calendar;

import java.util.Calendar;
import java.util.Date;


public class CalendarDemo02 {

    public static void main(String[] args) {
//        public int get(int field):返回给定日历字段的值
        demo01();
    }

    private static void demo01() {
        //获取一个日历对象
        Calendar calendar = Calendar.getInstance();
        //获取年份
        int year = calendar.get(Calendar.YEAR);
        System.out.println("获取年份:"+year);

//获取月份(取值范围0-11，需要加一才是正常月份)
        int month = calendar.get(Calendar.MONTH) + 1;
        System.out.println("获取当前月份:"+month);

//获取日期（获取Calendar.DATA也是一样的）
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("天数："+day);

//获取星期几（默认周日是1。周六是7，获取的结果-1才是正确星期几）
        int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println("星期几："+week);

//表示当月的第几周
        int week_of_month = calendar.get(Calendar.WEEK_OF_MONTH);
        System.out.println("当前月第几周:"+week_of_month);

//表示今年第多少周
        int week_of_year = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("本年第多少周:"+week_of_year);

//表示今年第多少天
        int day_of_year = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("今年第多少天："+day_of_year);

        //获取小时数
        int hour = calendar.get(Calendar.HOUR);
        System.out.println("获取小时数(12小时制)："+hour);
        int hour_of_day = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println("获取小时数(24小时制)："+hour_of_day);
//获取分钟数
        int minute = calendar.get(Calendar.MINUTE);
        System.out.println("获取分钟数:"+minute);
//获取秒数
        int second = calendar.get(Calendar.SECOND);
        System.out.println("获取秒数:"+second);

//获取毫秒数
        int millisecond = calendar.get(Calendar.MILLISECOND);
        System.out.println("获取毫秒数:"+millisecond);



        System.out.println("天数："+day);					//21

        //将天数设置为15
        calendar.set(Calendar.DATE,15);

        int newDay = calendar.get(Calendar.DATE);
        System.out.println("新天数:"+newDay);//15



        System.out.println("天数："+day);				//21
        //在当前天数上加3
        calendar.add(Calendar.DATE,3);
        int addDay = calendar.get(Calendar.DATE);
        System.out.println("增加后天数:"+addDay);		//24
        //在当前天数上加-4
        calendar.add(Calendar.DATE,-4);
        int minusDay = calendar.get(Calendar.DATE);
        System.out.println("减少后天数:"+minusDay);		//20


//转化为Date对象
        Date date = calendar.getTime();


//转化为日历类对象
        calendar.setTime(date);
        System.out.println(calendar);









    }

}