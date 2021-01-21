package id.ten.latihan.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    int pass=0;
    int current = 1;
    int fibonacci;
    private List<Integer> list=new ArrayList<>();

    public Fibonacci() {
        list.add(0);
        list.add(1);
    }

    public List<Integer> getFibonacci(int limit) {
        for (int i = 0; i < limit; i++) {
            fibonacci = current + pass;
            pass  =current;
            current = fibonacci;
            list.add(fibonacci);
            System.out.println();
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(30%4);
    }
}
