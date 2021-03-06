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
        int i;
        //while(loop_counter <= number) {
        //    loop_counter++;
        //    System.out.println(loop_counter);
        //}
        for(loop_counter=1; loop_counter<number; loop_counter++){
            i = 1;
           //System.out.println(loop_counter);
        }
    }

    public static void main(String[] args) throws Exception {

        int loop_counter = 1;
        int count = 500000000;
        long start_time = System.currentTimeMillis();

        ParallelRun t1 = new ParallelRun(count/5);
        ParallelRun t2 = new ParallelRun(count/5);
        ParallelRun t3 = new ParallelRun(count/5);
        ParallelRun t4 = new ParallelRun(count/5);
        ParallelRun t5 = new ParallelRun(count/5);

        t1.start(); t2.start(); t3.start(); t4.start(); t5.start();

        t1.join(); t2.join(); t3.join(); t4.join(); t5.join();

        long end_time = System.currentTimeMillis();
        long diff_time = end_time - start_time;

        //Timeunit.MILLISECONDS.toSeconds(diff_time)
        System.out.println(diff_time);
    }
}

