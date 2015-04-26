// Time test for a sequential loop counter


import java.util.Date;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;


public class ParallelRun extends Thread{

    private long number;

    public ParallelRun(long number){
        this.number = number;
    }

    public void run() {

        int loop_counter = 1;
        System.out.println(number);
        while(loop_counter <= number) {
            loop_counter++;
        }
    }

    public static void main(String[] args) throws Exception {

        int loop_counter = 1;
        int count = 500000000;
        long start_time = System.currentTimeMillis();

        ParallelRun t1 = new ParallelRun(count/2);
        ParallelRun t2 = new ParallelRun(count/2);

        t1.start(); t2.start();

        t1.join(); t2.join();

        long end_time = System.currentTimeMillis();
        long diff_time = end_time - start_time;

        //Timeunit.MILLISECONDS.toSeconds(diff_time)
        System.out.println(diff_time);
        System.out.println(((diff_time)/1000)*60);
    }
}
