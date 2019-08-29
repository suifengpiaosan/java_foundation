import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter year");
        int year = input.nextInt();
        System.out.println("enter month");
        int month = input.nextInt();
        printMonth(year,month);

    }
    private static void printMonth(int year,int month){
        printMonthTitle(year,month);
        printMonthBody(year,month);

    }
    private static void printMonthTitle(int year,int month){
        System.out.printf("\t\t%s\t%d\n",getMonthName(month),year);
        System.out.println("----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

    }
    private static void printMonthBody(int year,int month){
        int startday = getStartDay(year,month);
        int TotalNumberOfDaysInMonth = getTotalNumberOfDaysInMonth(year,month);
        for(int i = 0;i<startday;i++){
            System.out.print("    ");
        }
        for(int i = 1;i<=TotalNumberOfDaysInMonth;i++){
            System.out.printf("%4d",i);
            if((i+startday)%7==0)
                System.out.println();

        }
    }
    private static String getMonthName(int month){
        String[] monthName = {"January","February","March","April","May",
        "June","July","August","September","October","November","December"};
        return monthName[month-1];


    }
    private static int getStartDay(int year,int month){
        final  int START_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year,month);
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800)%7;
    }
    private static int getTotalNumberOfDays(int year,int month){
        int total = 0;
        for (int i = 1800;i <year;i++){
            if (isLeapYear(i))
                total += 366;
            else
                total += 365;
        }

        for (int i =1;i < month;i++)
            total = total +getTotalNumberOfDaysInMonth(year,i);
        return total;
    }
    private static int getTotalNumberOfDaysInMonth(int year,int month){
        if(month == 1 || month == 3 || month == 5 || month ==7 ||
                month == 8 ||month ==10 ||month ==12)
            return 31;
        if(month == 4 || month == 6 || month == 9 || month ==11)
            return 30;
        if (month == 2)
            return isLeapYear(year) ?29:28;
        return 0;

    }
    private static boolean isLeapYear(int year){
        return year%400 ==0 ||(year%4 ==0 &&year%100!=0);
    }



}
