package id.ten.latihan.checkNumber;

import java.util.regex.Pattern;

public class Coba1 {
    public static void main(String[] args) {
        final String input = "123a";
        isNumber(input);
    }

    private static void isNumber(String input) {
        Pattern pattern = Pattern.compile(".*[^0-9].*");

        System.out.println("does " + input + " is number : "
                + !pattern.matcher(input).matches());
    }
}
