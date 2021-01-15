package id.ten.latihan.stringPermutations;

public class Coba2 {
    public static void main(String[] args) {
        permutations("AB");
    }

    private static void permutations(String s) {
        doPermutations("", s);
    }

    private static void doPermutations(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                doPermutations(
                        perm + word.charAt(i),
                        word.substring(0, i) + word.substring(i + 1, word.length())
                );
            }
        }
    }
}
