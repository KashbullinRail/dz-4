/**
 * SkyPro. My code dz#4
 *
 * @author RAIL
 * @version dated Apr 17, 2022
 */

public class ExampleFour {
    public static void main(String[] args) {

        System.out.println();
        // Задание 1
        System.out.println("Задание 1");
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i--; i > 0; i--) {
            System.out.print(i + " ");
        }

        // Задание 2
        System.out.println("\n");
        System.out.println("Задание 2");
        int d = 3, a = 0;
        while ( d <= 31) {
            if (a % 7 == 0) {
                System.out.println("Сегодня пятница," + d + "-е число");
            }
            d++;
            a++;
        }

        // Задание 3
        System.out.println();
        System.out.println("Задание 3");
        int year = 2021; // Для соответствия дат указанных в ДЗ необходимо ввести: 1975 or 2054.
        int z = year;
        for (int b = 0; b < 200; b++) {
           if (b %79 == 0) {
               System.out.println(z);
           } z--;
        } z = year;
        for (int c = 0; c < 100; c++) {
            if (c %79 == 0 & z != year) {
                System.out.println(z);
            } z++;
        }
    }
}