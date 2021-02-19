package lesson4;

class PrintABC {

    final int COUNT = 5;

    public synchronized void printA() throws InterruptedException {

        for (int i = 0; i < COUNT; i++) {
            System.out.println("A");
            notifyAll();
            wait();
            wait();
        }
        notifyAll();
    }

    public synchronized void printB() throws InterruptedException {

        for (int i = 0; i < COUNT; i++) {
            System.out.println("В");
            notifyAll();
            wait();
            wait();
        }
        notifyAll();
    }

    public synchronized void printC() throws InterruptedException {

        for (int i = 0; i < COUNT; i++) {
            System.out.println("С");
            notifyAll();
            wait();
            wait();
        }
    }
}
