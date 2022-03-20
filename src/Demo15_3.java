import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Demo15_3 {
    public static void main(String args[]) {
        Date today;
        DateFormat f1, f2;
        String s1, s2;
        today = new Date(); // 获取系统当前日期
        System.out.println("字符串格式：" + today.toString());
        f1 = DateFormat.getInstance(); // 以默认格式生成格式化器
        s1 = f1.format(today); // 将日期转换为字符串
        System.out.println("系统格式：" + s1);
// 生成长格式的中国日期格式化器
        f1 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA);
// 生成长格式的中国时间格式化器
        f2 = DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA);
        s1 = f1.format(today); // 将日期转换为日期字符串
        s2 = f2.format(today); // 将日期转换为时间字符串
        System.out.println("中国格式：" + s1 + " " + s2);
    }
}