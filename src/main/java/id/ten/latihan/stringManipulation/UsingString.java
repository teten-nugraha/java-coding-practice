package id.ten.latihan.stringManipulation;

public class UsingString {
    public static void main(String[] args) {
        final String input = "Coba";
        final String output = reverse(input);

        System.out.println("Input : " + input);
        System.out.println("Output : " + output);
    }

    private static String reverse(final String input) {
        char[] chars = input.toCharArray();
        int i=0;
        int j=chars.length-1;
        while (i < j) {
            swap(chars, i, j);
            i++;
            j--;
        }
        return new String(chars);
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }


}
