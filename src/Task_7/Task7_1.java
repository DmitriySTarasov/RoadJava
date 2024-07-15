package Task_7;

/**
 * Написать программу, которая объединяет любое количество строк,
 * объединяя их через пробел.
 * Реализацию конкатенации строк вынести в отдельный метод.
 */
public class Task7_1 {
    public static void main(String[] args) {
        String result = mergeStrings("a", "a", "a", "a", "a", "a", "a", "a", "a");

        System.out.println(result);
    }

    static String mergeStrings(String... strings) {
        if (strings.length == 0) {
            return "";
        }

        var result = "";

        for (String s : strings) {
            result += " " + s;
        }

        return result;
    }
}
