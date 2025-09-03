//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte clientOs = 1;
        switch (clientOs) {
            case 0:
                System.out.println("Установите версию приложения для Ios.");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android.");
                break;
        }
        System.out.println("Задача 2");
        short clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015) {
            switch (clientOs) {
                case 0:
                    System.out.println("Установите версию приложения для Ios.");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android.");
                    break;
            }
        } else {
            switch (clientOs) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для Iosпо ссылке.");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                    break;
            }
        }
    }
}
