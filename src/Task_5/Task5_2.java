package Task_5;

/**
 * Создать массив char, заполненный буквами своего имени в верном порядке.
 * Используя этот массив, вывести свое имя в консоль.
 * Не использовать переменную типа String.
 */
public class Task5_2 {
    public static void main(String[] args) {
        char[] nameArray = new char[]{'Е', 'г', 'о', 'р'};

        for (char ch : nameArray) {
            System.out.print(ch);
        }
    }
}
