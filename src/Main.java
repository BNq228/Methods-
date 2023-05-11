public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int year2020 = 2020;
        printYearType(year2020);
        int year2023 = 2023;
        printYearType(year2023);
    }
    public static void printYearType(int year) {
        if (isLearYear(year)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
    public static boolean isLearYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
    public static void task2() {
        System.out.println("Задача 2");
        int os = 1;
        int clientDeviceYear = 2015;
        printInfoMessage(os, clientDeviceYear);
    }
    public static void printInfoMessage(int os, int year) {
        String message = getInfoMessage(os, year);
        System.out.println(message);
    }
    public static String getInfoMessage(int os, int year) {
        if (os == 0 && year >= 2015) {
            return "Установите версию приложения для iOS по ссылке";
        } else if (os == 1 && year >= 2015) {
            return "Установите версию приложения для Android по ссылке";
        } else if (os == 0 && year >= 2015) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        } else if (os == 1 && year >= 2015) {
            return "Установите облегченную версию приложения для Android по ссылке";
        } else {
            return "Не удалось определить версию приложения";
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        printDeliveryDays(deliveryDistance);
    }
    public static void printDeliveryDays (int deliveryDistance) {
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
       String message;
       if (deliveryDays != -1) {
           message = String.format("Потребуется дней: %s", deliveryDays);
       } else {
           message = "Доставки нет";
       }

        System.out.println(message);
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance < 100) {
            return 3;
        } else {
            return -1;
        }
    }
}
