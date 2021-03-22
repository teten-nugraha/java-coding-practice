package id.ten.latihan.array.again;

public class MinMaxArrayValue {
    public static void main(String[] args) {
        printSmallAndBiggestArray(new int[]{100, 10, 1, 99, 800, 9000});
    }

    private static void printSmallAndBiggestArray(int[] ints) {
        if(ints== null || ints.length ==0) return;

        int largest = ints[0];
        int smallest = ints[0];

        for(int number: ints) {
            if(number > largest) {
                largest = number;
            }else if(number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Biggest is "+largest);
        System.out.println("Smallest is "+smallest);
    }

}
