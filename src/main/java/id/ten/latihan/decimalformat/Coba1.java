package id.ten.latihan.decimalformat;

import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class Coba1 {
    public static void main(String[] args) {

        final Double input = -100000098D;
        System.out.printf("Nilai nya adalah "+ doFormat2(input));

//        String input = "baca";
//        System.out.println(input.substring(0,2));

    }

    private static String doFormat(Double input) {

        final String pattern = "###,###.00";
        DecimalFormat df = new DecimalFormat(pattern);

        return df.format(input);
    }

    private static String doFormat2(Double input) {
        String pattern = "###,###.00";
        DecimalFormat df = new DecimalFormat(pattern);

        return df.format(input);
    }
}
