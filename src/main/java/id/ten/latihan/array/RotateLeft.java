package id.ten.latihan.array;

public class RotateLeft {
    public static void main(String[] args) {
        final int[]inputs = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        final int k = 4;

        int[]rotateArrayLeft = rotateLeft(inputs, 4);
        for(int i: rotateArrayLeft) {
            System.out.print(" "+i);
        }

    }

    private static int[] rotateLeft(int[] inputs, int numOfRotations) {
        for(int i=0; i < numOfRotations; i++) {
            int temp = inputs[0];
            for(int j=0; j < inputs.length-1; j++) {
                inputs[j] = inputs[j+1];
            }
            inputs[inputs.length-1]= temp;
        }
        return inputs;
    }
}
