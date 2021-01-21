package id.ten.latihan.stack;

import java.util.Stack;

public class CobaStack {
    public static void main(String[] args) {

        Stack<Integer> stk  =new Stack<>();


        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);


        System.out.println(stk);

        stk.pop();

        System.out.println(stk);
    }
}
