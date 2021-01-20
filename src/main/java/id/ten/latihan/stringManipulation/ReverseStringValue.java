package id.ten.latihan.stringManipulation;

import java.util.Objects;

public class ReverseStringValue {
    public static void main(String[] args) {
        final String value = "teten";
        String reverse= reverseWithoutSb(value);
        System.out.println(reverse);
    }

    private static String reverseWithSb(String value) {
        StringBuilder sb = new StringBuilder(value);
        value = sb.reverse().toString();
        return value;
    }

    private static String reverseWithoutSb(String value) {
        if(Objects.nonNull(value)|| value.isEmpty()) {
            System.out.println("Value is empty");
        }

        char[] temps = value.toCharArray();
        int i=0;
        int j = temps.length-1;
        while (i < j) {
            swap(temps, i, j);
            i++;
            j--;
        }

        return new String(temps);
    }

    private static void swap(char[] temps, int i, int j) {
        char temp = temps[i];
        temps[i] = temps[j];
        temps[j] = temp;
    }
}
