package Task_1;

public class Task1_2 {
    public static void main(String[] args) {
//        Объявляем переменную типа char и инициализируем ее первой буквой имени
        char ch = 'Е';
//        Выводим значение переменной ch в консоль
        System.out.print(ch);
//        Используя управляющий символ '\n' переводим курсор на новую строку
        System.out.print('\n');

//        Присваиваем переменной ch следующую букву имени
//        Повторяем действия до тех пор, пока буквы в имени не кончатся
        ch = 'г';
        System.out.print(ch);
        System.out.print('\n');

        ch = 'о';
        System.out.print(ch);
        System.out.print('\n');

        ch = 'р';
        System.out.print(ch);
    }

    /*
     * Примечание: также можно было выводить не символы, а строки вида "" + ch + '\n', например:
     * System.out.print("" + ch + '\n');
     *
     * Однако на данном этапе конкатенация строк не была пройдена
     * */
}
