package lesson4;

public class TestThreads {

    public static void main(String[] args) {

        PrintABC printABC = new PrintABC();

        new Thread(() -> {
            try {
                printABC.printA();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                printABC.printB();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                printABC.printC();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }

}

