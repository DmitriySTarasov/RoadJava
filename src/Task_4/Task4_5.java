package Task_4;

import java.util.Scanner;

/**
 * Выводить на экран "Не угадал!" до тех пор,
 * пока с клавиатуры не будет введено число 1.
 * Запрашивать число с клавиатуры перед выводом на экран "Не угадал!"
 */
public class Task4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.nextInt() != 1) {//Перед каждым выводом фразы будет запрашиваться число
            System.out.println("Не угадал!");
        }

        scanner.close();
    }
}
