
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        task1();
        recomnendApplicationVersion(3, 2015);
        calculateDeliveryDays (3);


    }

    public static void task1() {
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

    public static void recomnendApplicationVersion(int clietOS, int deviceYear) {
        System.out.println("Задача 2");
        boolean deviceIsOld;
        deviceIsOld = deviceIsOld(deviceYear);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print("Lite ");
        }
        System.out.print("Версию для ");
        if (clietOS == 0) {
            System.out.println("IOS");
        } else {
            System.out.println("Android");
        }
    }

    private static boolean deviceIsOld(int deviceYear) {
        return false;
    }



        public static String calculateDeliveryDays ( int deliveryDistance) {
            System.out.println("Задача 3");
            int deliveryDays = 1;
            if (deliveryDays > 20) {
                deliveryDays++;
            }
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                deliveryDays++;
            } else if (deliveryDistance > 100) {
                return "Не возможно расчитать срок доставки ";
            }
            return "Потребуется дней: " + deliveryDays;
        }
    }


