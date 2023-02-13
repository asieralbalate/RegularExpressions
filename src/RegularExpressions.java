public class RegularExpressions {
    public static boolean iTrueOrYes(String s) {
        return s.matches("[tT]rue|[yY]es");
    }

    public static boolean containsTrue(String s) {
        return s.matches(".*true.*");
    }

    public static boolean isThreeLetters(String s) {
        return s.matches("[a-zA-Z]{3}");
    }

    public static boolean noNumberAtBeg(String s) {
        return s.matches("^[^\\d].");
    }

    public static boolean isIntersection(String s) {
        return s.matches("([\\w&&[^b]])*");
    }

    public static boolean lessThanThreeHund(String s) {
        return s.matches("[^0-9]*[12]?[0-9]{1,2}[^0-9]*");
    }

    public static void main(String[] args) {
        if (isThreeLetters("a")) {
            System.out.println("Match");
        } else {
            System.out.println("NO match");
        }
    }
}
