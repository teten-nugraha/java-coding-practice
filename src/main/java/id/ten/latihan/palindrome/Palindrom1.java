package id.ten.latihan.palindrome;

public class Palindrom1 {

    public static void main(String[] args) {
        final String input = "never odd or even";
        boolean isPalindrom  = checkPalindrom(input);
        System.out.println(input+" palindrom is "+isPalindrom);
    }

    private static boolean checkPalindrom(String input) {
        double a = Double.POSITIVE_INFINITY;
        if(input == null || input.isEmpty()) {
            System.out.println("Empty input");
        }

        boolean isPalindrom = false;

        final String reverse = prosesReverse(input);

        if(input.equalsIgnoreCase(reverse)) {
            isPalindrom=true;
        }else{
            isPalindrom=false;
        }

        return isPalindrom;
    }

    private static String prosesReverse(String input) {
        char[]values = input.toCharArray();
        int i=0;
        int j=values.length-1;
        while(i < j) {
            swap(values, i, j);
            i++;
            j--;
        }
        return new String(values);
    }

    private static void swap(char[] values, int i, int j) {
        char temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }

}
