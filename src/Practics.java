public class Practics {
    public static void main(String[] args) {

        System.out.println(Practics.makeItFunny("hello", 2));


    }

    public static String makeItFunny(String str, int n) {
        var i = 0;
        var result = "";
        while (i < str.length()) {
            var name = str.charAt(i);
            if ((i + 1) % n == 0) {
                result += Character.toUpperCase(name);
            }else {
                result += name;
            }
            i++;
        }
        return result;
    }
}
/*public static String filterString(String str, char ch) {
    var i = 0;
    String count = "";
    while (i < str.length()) {
        var name = str.charAt(i);
        if (name != ch) {
            count += name;
        }
        i++;
    }
    return count;
}*/

/*public static String joinNumbersFromRange(int start, int finish) {

        String result = "";
        int i = start;

        while (i <= finish) {
            result += start++;
            i++;
        }
        return result;
    }*/

/*LocalDate dateFrom = LocalDate.of(1988, Month.APRIL, 18);
// По дату
        LocalDate dateTo = LocalDate.of(2024, Month.JULY, 22);
// Количество дней между этими датами
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);*/

/*public static boolean isInternationalPhone(String string) {
        char simvol = string.charAt(0);
        if (simvol == '+') {
            return true;
        }else {
            return false;
        }
    }*/

    /*public static boolean isPalindrome(String name) {
        String name1 = new StringBuilder(name).reverse().toString();
        if (name.equalsIgnoreCase(name1)) {
            return true;
        }else {
            return false;
        }
    }*/
