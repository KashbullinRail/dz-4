/**
 * SkyPro. My code dz#4
 *
 * @author ?????
 * @version dated Apr 17, 2022
 */

public class ExampleFour {
    public static void main(String[] args) {

        // Задание 1
        int i = 1;
        System.out.println();
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
        int year = 2021; // Для соответствия дат указанных в ДЗ необходимо ввести: 1975 or 2054.
        for (int b = 0; b < 200; b++) {
           if (b %79 == 0) {
               System.out.println(year);
           } year--;
        } year = 2021;
        for (int c = 0; c < 100; c++) {
            if (c %79 == 0 & year != 2021) {
                System.out.println(year);
            } year++;
        }
    }
}