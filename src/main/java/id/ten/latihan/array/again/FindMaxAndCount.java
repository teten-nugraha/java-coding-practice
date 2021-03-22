package id.ten.latihan.array.again;

public class FindMaxAndCount {
    public static void main(String[] args) {

        int[] numbers = { 2, 9, 3, 5, 7, 8, 9 };
        findMax(numbers);
    }

    private static void findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for(int value: numbers) {
            if(value > max) {
                max = value;
            }
        }
        int count=0;
        for(int value: numbers) {
            if(value == max) {
                count ++;
            }
        }

        System.out.println("Nilai "+max+ " ada "+count+" biji ");
    }
}
