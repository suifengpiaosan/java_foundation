import java.util.Date;
public class Test_circl {
    public static void main(String[] args) {
        java.util.Date[] dates = new java.util.Date[10];
        System.out.println(dates[0]);
        dates[0] = new Date();
        System.out.println(dates[0].toString());
    }
}
