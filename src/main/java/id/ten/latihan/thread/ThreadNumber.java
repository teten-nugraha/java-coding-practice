package id.ten.latihan.thread;

public class ThreadNumber extends Thread {

    private final NumberGenerator ng;

    public ThreadNumber(NumberGenerator ng) {
        this.ng = ng;
    }

    @Override
    public void run() {
        callGenerator();
    }

    private void callGenerator() {
        synchronized (ng) {
            for (int i = 0; i < 3; i++) {
                System.out.println(getName() + " " + ng.randomNumber());

            }
        }
    }

    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator(1000, 2000);
        for (int i = 0; i < 3; i++) {
            new ThreadNumber(generator).start();
        }
    }
}
