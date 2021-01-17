package id.ten.latihan.array;

public class FindPairInArray {
    public static void main(String[] args) {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        findPair(numbers, 7);
    }

    private static void findPair(int[] numbers, int sum) {

        int sizeArray = numbers.length;

        for(int i=0; i < sizeArray; i++) {
            int first = numbers[i];
            for(int j=i+1; j < sizeArray; j++) {
                int second = numbers[j];

                if(first + second == sum) {
                    System.out.println(first + "&" + second);
                }
            }
        }

    }
}
