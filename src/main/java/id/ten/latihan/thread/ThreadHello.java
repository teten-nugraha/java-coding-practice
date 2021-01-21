package id.ten.latihan.thread;

import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadHello implements Runnable {

    private final String name;

    public ThreadHello(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + ": Hello");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ThreadHello hello = new ThreadHello(String.valueOf(i));
            Thread th=new Thread(hello);
            th.start();
        }
    }
}
