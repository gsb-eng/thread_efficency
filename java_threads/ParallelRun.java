// Time test for a sequential loop counter


import java.util.Date;
import java.lang.Thread;


public class ParallelRun extends Thread{

    private long number;

    public ParallelRun(long number){
        this.number = number;
    }

    public void run() {

        int loop_counter = 1;
        
        while(loop_counter <= number) {
            loop_counter--;
        }
    }

    public static void main(String[] args) throws Exception {

        int loop_counter = 1;
        int count = 50000000;
        long start_time = System.currentTimeMillis();

        ParallelRun t1 = new ParallelRun(count/2);
        ParallelRun t2 = new ParallelRun(count/2);

        t1.start(); t2.start();

        t1.join(); t2.join();

        long end_time = System.currentTimeMillis();
        long diff_time = end_time - start_time;

        System.out.println("Time taken in milli seconds " + diff_time);
    }
}

