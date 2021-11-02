package Calendar;

import java.util.Calendar;

public class Demo03 {
    public static void main(String[] args) {
        //获取当前系统时间毫秒值
        long currenttime = System.currentTimeMillis();
        //获取当前日历类对象
        Calendar c = Calendar.getInstance();
        c.set(2000, 2, 14);
        long birth = c.getTime().getTime();
        //计算时间差
        int day = (int) ((currenttime - birth) / 1000 / 60 / 60 / 24);
        System.out.println("你已经是" + day + "天的小朋友了");
    }
}
