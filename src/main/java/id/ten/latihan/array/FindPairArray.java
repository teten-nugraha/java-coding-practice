package id.ten.latihan.array;

public class FindPairArray {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        findPair(numbers, 7);
    }

    private static void findPair(int[] numbers, int target) {
        for(int i=0; i < numbers.length; i++) {
            int temp1 = numbers[i];
            for(int j=1; j < numbers.length; j++) {
                int temp2 = numbers[j];

                if(temp1 + temp2 == target) {
                    System.out.println(temp1 + " "+temp2);
                }
            }
        }
    }
}
