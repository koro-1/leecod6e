import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {




    static Boolean jiaoyan(String s) {
        char a, b;

        a = s.charAt(0);
        b = s.charAt(1);
        int l = 0, f = s.length()-1;
        char c;
        while (l < f) {
            c = l % 2 == 0 ? a : b;
            if (!(s.charAt(l) == s.charAt(f)) ||! (s.charAt(f) == c)) {

                return false;

            }
            l++;
            f--;

        }
        return true;
    }
    public static Date GetNextDay(Date date) {
        //获取当前时间

        //日期格式化
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        //格式化日期
        String dateString = formatter.format(date);
        //打印：当前日期

        //创建日历类用于获取下一天
        Calendar calendar = new GregorianCalendar();
        //设置时间为当前时间
        calendar.setTime(date);
        //将天数加一
        calendar.add(Calendar.DATE, 1);
        //再次获取加一后的日期
        date = calendar.getTime();
        //日期格式化
        String nextDateString = formatter.format(date);
        //打印下一天


        return date;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextInt()+"";
        Date date = null;

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

        // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
        format.setLenient(false);
        try {
            date=format.parse(s);

        } catch (ParseException e) {
            e.printStackTrace();
        } int flag=0;
        while (true) {
            if (jiaoyan2(format.format(date))) {
             if (flag==0) {
                 System.out.println(format.format(date));
                 flag=1;
             }
                if (jiaoyan(format.format(date))) {
                    System.out.println(Integer.valueOf(format.format(date)));
                    break;

                }
            }

            date=GetNextDay(date);
        }



    }

    private static boolean jiaoyan2(String format) {

        int l=0,f=format.length()-1;
        while (l<=f){

            if (format.charAt(l)!=format.charAt(f)) return false;
            l++; f--;


        }

        return true;
    }
}



