import java.time.LocalDate;

public class sad {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.now();
        System.out.println(date1);
        date1=date1.plusDays(1);
        System.out.println(date1);
        date1=date1.withYear(2020);
        System.out.println(date1);
    }
}
