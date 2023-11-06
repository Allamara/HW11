public class HW11 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    //TASK_1
    public static void checkYears(int year) {
        boolean result = true;
        if (year < 1584) {
            return;
        }
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            printResult(year, result);
        } else {
            result = false;
            printResult(year, result);
        }
    }

    public static void printResult(int year, boolean res) {
        if (res) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - не високосный год");
        }
    }

    public static void task1() {
        int year = 1760;
        System.out.println("Задача № 1");
        checkYears(year);

    }
//TASK_2
    public static void installApps(int os, int year) {
        int currentYear = localDate.now().getYear();
        boolean oldDevice = year < currentYear;
        String clientOs = os == 1 ? "Android" : "iOS";
        String versionApp = oldDevice ? "облегченную" : "";
        System.out.println("Установите " + versionApp + " версию приложения для " + clientOs + " по ссылке");
    }

    public static void task2() {
        int clientOs = 1;
        int deviceYear = 2016;
        System.out.println("Задача № 2");
        installApps(clientOs, deviceYear);
    }
//TASK_3
    public static int daysForDelivery(int dist) {
        int daysForDelivery = 1;
        if (dist > 20) {
            daysForDelivery++;
        }
        if (dist > 60) {
            daysForDelivery++;
        }
        return daysForDelivery;
    }

    public static void task3() {
        System.out.println("Задача № 3");
        int distance = 25;
        if (distance > 100 || distance < 0) {
            System.out.println("Доставки нет");
        } else {
            daysForDelivery(distance);
            int totalDays = daysForDelivery(distance);
            System.out.println("Дней на доставку: " + totalDays);
        }
    }

}
