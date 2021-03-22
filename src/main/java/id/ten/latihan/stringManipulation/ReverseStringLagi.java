package id.ten.latihan.stringManipulation;

public class ReverseStringLagi {
    public static void main(String[] args) {

//        final String result = reverseWithSB("Teten");
        final String result = reverseWithoutSB("Teten");
        System.out.println(result);
    }

    private static String reverseWithoutSB(String value) {
        if(value == null || value.isEmpty()) return null;

        char[]chars = value.toCharArray();
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

    private static String reverseWithSB(String teten) {
        StringBuilder sb = new StringBuilder(teten);
        return sb.reverse().toString();
    }
}
