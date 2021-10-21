import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;


public class MyDate extends Date {
    public void getGMT() {
        Calendar cd = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(" yyyy MMM d EEE HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+2"));
        System.out.println(simpleDateFormat.format(cd.getTime()));
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd ");
        return simpleDateFormat.format(this);
    }

    public static void main(String[] args) {
        MyDate date = new MyDate();
        System.out.println(date);
        date.getGMT();
    }
}