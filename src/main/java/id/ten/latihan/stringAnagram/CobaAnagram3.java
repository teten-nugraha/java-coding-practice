package id.ten.latihan.stringAnagram;

import java.util.Arrays;

public class CobaAnagram3 {
    public static void main(String[] args) {
        final String input1 = "red";
        final String input2 = "rer";
        isAnagram(input1, input2);
    }

    private static void isAnagram(String input1, String input2) {
        if(input1.isEmpty() && input2.isEmpty()) return;
        boolean isAnagram = false;
        final String s1 =input1.replaceAll("\\s","");
        final String s2 =input2.replaceAll("\\s","");

        if(input1.length() != input2.length()) {
            isAnagram = false;
        }else{


            char[]c1 = s1.toLowerCase().toCharArray();
            char[]c2 = s2.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);

            isAnagram = Arrays.equals(c1, c2);
        }



        if(isAnagram) {
            System.out.println(s1+" dan "+s2+" adalah anagram");
        }else {
            System.out.println(s1+" dan "+s2+" bukan anagram");
        }
    }


}
