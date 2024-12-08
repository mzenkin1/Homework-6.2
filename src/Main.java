import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        checkYear(2024);
        checkYear(2030);

        defineVersionOS(0, 2024);
        defineVersionOS(1, 2019);

        System.out.println("Количество дней доставки " + calculationDeliveryDay(20));
        System.out.println("Количество дней доставки " + calculationDeliveryDay(80));


    }

    public static void  checkYear(int year) {
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void defineVersionOS(int clientOS, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculationDeliveryDay(int deliveryDistance) {

        int deliveryDay;
        if (deliveryDistance <= 20) {
            deliveryDay = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDay = 2;
        } else  {
            deliveryDay = 3;
        }
        return deliveryDay;


    }




}


