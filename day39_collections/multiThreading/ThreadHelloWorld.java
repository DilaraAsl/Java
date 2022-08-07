package day39_collections.multiThreading;

public class ThreadHelloWorld extends Thread {
    int threadNumber;

    public ThreadHelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Hello World" + i + " from thread " + threadNumber);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
