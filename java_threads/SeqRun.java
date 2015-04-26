// Time test for a sequential loop counter


import java.util.Date;


public class SeqRun {

    public static void main(String[] args){

        int loop_counter = 1;
        int count = 50000000;
        long start_time = System.currentTimeMillis();

        while(loop_counter <= count) {
            loop_counter++;
        }

        long end_time = System.currentTimeMillis();
        long diff_time = end_time - start_time;

        System.out.println(diff_time);
    }
}

