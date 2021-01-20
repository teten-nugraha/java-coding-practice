package id.ten.latihan.stringManipulation;

public class ReverseWithoutStringBuilder {
    public static void main(String[] args) {
        final String value = "teten";
        String reverse= reverseWithoutSb(value);
        System.out.println(reverse);
    }

    private static String reverseWithoutSb(String value) {
        if(value == null || value.isEmpty()) {
            System.out.println("Value is empty");
        }

        char[] chars = value.toCharArray();
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
