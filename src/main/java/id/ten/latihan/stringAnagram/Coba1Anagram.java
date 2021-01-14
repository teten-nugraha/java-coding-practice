package id.ten.latihan.stringAnagram;

import java.util.Arrays;

public class Coba1Anagram {
    public static void main(String[] args) {
        
        final String input1 = "baca";
        final String input2 = "acab";
        isAnagram(input1, input2);
        
    }

    private static void isAnagram(String input1, String input2) {
        final String s1 = input1.replaceAll("\\s","");
        final String s2 = input2.replaceAll("\\s","");
        boolean isAnagram = true;
        if(s1.length() != s2.length()) {
            isAnagram = false;
        }else{
            // size are same
            char[]chars1 = s1.toLowerCase().toCharArray();
            char[]chars2 = s2.toLowerCase().toCharArray();

            Arrays.sort(chars1);
            Arrays.sort(chars2);

            isAnagram = Arrays.equals(chars1, chars2);

        }

        if(isAnagram) {
            System.out.println(s1 +" & "+s2+" adalah anagram");
        }else {
            System.out.println(s1 +" & "+s2+" bukan anagram");
        }
    }
}
