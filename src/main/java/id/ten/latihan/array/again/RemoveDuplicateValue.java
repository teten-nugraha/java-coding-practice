package id.ten.latihan.array.again;

public class RemoveDuplicateValue {
    public static void main(String[] args) {
        int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
        removeDuplicateValue(input);
    }

    private static void removeDuplicateValue(int[] input) {
        int current = input[0];
        boolean found = false;
        for (int i = 0; i < input.length; i++) {
            if(current == input[i] && !found) {
                found = true;
            }else if(current != input[i]) {
                System.out.print(" "+current);
                current = input[i];
                found = false;
            }

        }
    }
}
