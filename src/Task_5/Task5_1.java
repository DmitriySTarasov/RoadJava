package Task_5;

/**
 * Создать массив char, заполненный буквами своего имени в верном порядке.
 * Используя этот массив, вывести свое имя в консоль.
 * Предварительно собрать значения массива в переменную типа String.
 */
public class Task5_1 {
    public static void main(String[] args) {
        char[] nameArray = new char[]{'Е', 'г', 'о', 'р'};
        String name = "";

        for (char ch : nameArray) {
            name += ch;
        }

        System.out.print(name);
    }
}
