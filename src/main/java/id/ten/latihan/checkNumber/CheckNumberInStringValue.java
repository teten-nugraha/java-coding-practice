package id.ten.latihan.checkNumber;

import java.util.regex.Pattern;

public class CheckNumberInStringValue {
    public static void main(String[] args) {
        final String input = "123";
        checkNumber2(input);
    }

    private static void checkNumber(String input) {
        if(input == null || input.isEmpty()) {
            System.out.println("Value is empty");
        }

        Pattern pattern = Pattern.compile(".*[^0-9].*");
        System.out.println(input +" adalah number "+ !pattern.matcher(input).matches());
    }

    private static void checkNumber2(String input) {
        Pattern pattern = Pattern.compile(".*[^0-9].*");
        System.out.println(input+ " adalah number is "+ !pattern.matcher(input).matches());
    }
}
