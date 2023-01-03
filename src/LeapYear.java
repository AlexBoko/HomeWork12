import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        printlsLeapYear(2023);
        recomnendApplicationVersion(0, 2020);
        calculateDeliveryDays(6);
    }


    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        System.out.println("Задача 1");
        if (yearIsLeap) {
            System.out.println(year + " высокосный");
        } else {
            System.out.println(year + " не высокосны");

        }
    }

    public static void printlsLeapYear(int year) {
        printIsLeapYearResult(year, isLeap(year));
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void recomnendApplicationVersion(int clietOS, int deviceYear) {
        System.out.println("Задача 2");
        boolean deviceIsOld = isDeviceOld(deviceYear);
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

    private static boolean isDeviceOld(int deviceYear) {
        int currentyear = LocalDate.now().getYear();
        return deviceYear <= currentyear;
    }

    public static String calculateDeliveryDays(int deliveryDistance) {
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