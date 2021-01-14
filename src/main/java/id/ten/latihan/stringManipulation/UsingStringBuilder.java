package id.ten.latihan.stringManipulation;

/**
 *
 */
public class UsingStringBuilder {
    public static void main(String[] args) {
        final String input = "Coba";
        final String output = reverse(input);

        System.out.println("Input : " + input);
        System.out.println("Output : " + output);
    }

    private static String reverse(String input) {
        StringBuilder sb = new StringBuilder(input).reverse();
        return sb.toString();
    }
}
