package lesson4;

class PrintABC {

    final int COUNT = 100;

    public synchronized void printA() throws InterruptedException {

        for (int i = 0; i < COUNT; i++) {
            System.out.print("A");
            notifyAll();
            wait();
            wait();
        }
        notifyAll();
    }

    public synchronized void printB() throws InterruptedException {

        for (int i = 0; i < COUNT; i++) {
            System.out.print("В");
            notifyAll();
            wait();
            wait();
        }
        notifyAll();
    }

    public synchronized void printC() throws InterruptedException {

        for (int i = 0; i < COUNT; i++) {
            System.out.print("С");
            notifyAll();
            wait();
            wait();
        }
    }
}
