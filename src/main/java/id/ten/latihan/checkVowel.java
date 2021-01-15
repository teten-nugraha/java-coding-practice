package id.ten.latihan;

public class checkVowel {
    public static void main(String[] args) {
        final String input= "Teten";
        checkVowelValue(input);
    }

    private static void checkVowelValue(String input) {
        if(input == null || input.isEmpty()) return;
        final char[] chars = input.toLowerCase().toCharArray();

        int counter = 0;

        for(char c: chars) {
            if(c == 'a' || c=='i' || c=='u' || c=='e' || c=='o') {
                counter++;
            }
        }

        System.out.println("ada "+ counter +" vowel");
    }
}
