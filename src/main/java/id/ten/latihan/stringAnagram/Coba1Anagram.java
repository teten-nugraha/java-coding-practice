package id.ten.latihan.stringAnagram;

import java.util.Arrays;

public class Coba1Anagram {
    public static void main(String[] args) {
        
        final String input1 = "bac1a";
        final String input2 = "acab";
        isAnagram2(input1, input2);
        
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

    private static void isAnagram2(String input1, String input2) {
        boolean isAnagram = false;

        // remove space
        String s1 = input1.replaceAll("\\s","");
        String s2 = input2.replaceAll("\\s","");

        if(s1.isEmpty() || s2.isEmpty()) {
            isAnagram = false;
        }else{
            char[] temp1 = s1.toLowerCase().toCharArray();
            char[] temp2 = s2.toLowerCase().toCharArray();

            Arrays.sort(temp1);
            Arrays.sort(temp2);

            isAnagram = Arrays.equals(temp1, temp2);
        }

        if(isAnagram) {
            System.out.println(input1+" & "+input2+" is anagram");
        }else{
            System.out.println(input1+" & "+input2+" is not anagram");
        }
    }
}
