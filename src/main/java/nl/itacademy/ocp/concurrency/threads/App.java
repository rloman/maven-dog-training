package nl.itacademy.ocp.concurrency.threads;

public class App {

    public static void main(String[] args) {
        demoRunnable();

    }

    public static void demoRunnable() {
        Thread runner = new Thread(new PrinterRunner("Francien"));
        runner.start();
    }

    public static void demoThread() {
        {
            Thread t = new CounterThread();

            t.start();
        }
        {
            Thread t = new CounterThread();

            t.start();
        }
        {
            Thread t = new CounterThread();

            t.start();
        }
    }
}

class CounterThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Printer {

}

class PrinterRunner extends Printer implements Runnable {


    private String name;

    public PrinterRunner(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Printing ... " + this.name);
    }
}