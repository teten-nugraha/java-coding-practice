package id.ten.latihan.decimalformat;

import java.text.DecimalFormat;

public class Coba1 {
    public static void main(String[] args) {

        final Double input = -100000098D;
        System.out.printf("Nilai nya adalah "+ doFormat(input));

    }

    private static String doFormat(Double input) {

        final String pattern = "###,###.00";
        DecimalFormat df = new DecimalFormat(pattern);

        return df.format(input);
    }
}
