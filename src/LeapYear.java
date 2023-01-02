import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        task1();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int year = 2023;
        {
            Scanner scan = new Scanner(System.in);
            if ((year % 4 == 0) && year % 100 != 0) {
                System.out.println(year + " Высокостный.");
            } else if ((year % 4 == 0) && (year % 100 == 0)
                    && (year % 400 == 0)) {
                System.out.println(year + " Высокостный.");
            } else {
                System.out.println(year + " Не высокостный.");
            }
        }
    }
}