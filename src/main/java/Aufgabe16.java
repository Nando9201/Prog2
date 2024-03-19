import java.io.IOException;
import java.util.Date;

public class Aufgabe16 implements Runnable{

Boolean isRunning = true;
static Date start;
static Date end;

public static void main(String[] args) throws IOException {
    System.in.read();
    start = new Date();
    System.out.println("Start: " + start);
    System.out.println("Press Enter to stop");
    Thread t = new Thread(new Aufgabe16());
    t.start();
    System.in.read();
    t.interrupt();
    System.out.println("End: " + new Date());
    System.out.println("Duration: " + (end.getTime() - start.getTime()) + "ms");
}

    @Override
    public void run() {
        while (true) {
            System.out.println(new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                end = new Date();
                return;
            }
        }
    }


}
