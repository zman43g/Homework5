//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");
        short clientDeviceYear = 2012;
        clientOs = 0;
        String operationSystem;
        if (clientOs == 0) {
            operationSystem = "iOS";
        } else {
            operationSystem = "Android";
        }
        boolean newDevice = clientDeviceYear >= 2015;
        if (newDevice) {
            System.out.println("Установите версию приложения для " + operationSystem + " по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для " + operationSystem + " по ссылке.");

        }


        System.out.println("Задача 3");
        short year = 1705;
        boolean leapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (year > 1584) {
            if (leapYear) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        }

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        byte deliveryTime;
        if (deliveryDistance < 20) {
            deliveryTime = 1;
        } else if (deliveryDistance < 60) {
            deliveryTime = 2;
        } else if (deliveryDistance < 100) {
            deliveryTime = 3;
        } else {
            deliveryTime = 4;
        }
        if (deliveryTime <= 3) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }

        System.out.println("Задача 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца нет");
                break;
        }
    }


}

