package id.ten.latihan.array.again;

public class RotateArrayLeft {
    public static void main(String[] args) {

        final int[]inputs = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        final int k = 4;

        int[]rotateArrayRight = rotateLeft(inputs, k);

    }

    private static int[] rotateLeft(int[] inputs, int count) {
        for(int i=0; i< count; i++) {
            int first = inputs[0];

            for (int j = 0; j < inputs.length-1; j++) {
                inputs[j] = inputs[j+1];
            }

            inputs[inputs.length-1] = first;
        }
        return inputs;
    }


//    private static int[] rotateLeft(int[] inputs, int count) {
//        for(int i=0; i < count; i++) {
//            int first = inputs[0];
//
//            for(int j=0; j < inputs.length-1; j++) {
//                inputs[j] = inputs[j+1];
//            }
//
//            inputs[inputs.length-1]  =first;
//        }
//
//        return inputs;
//    }
}
