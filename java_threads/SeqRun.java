// Time test for a sequential loop counter


import java.util.Date;


public class SeqRun {

    public static void main(String[] args){

        long loop_counter = 1;
        long count = 50000000;
        long start_time = System.currentTimeMillis();
        int i;

        while(loop_counter <= count) {
            loop_counter++;
        }
        //for(loop_counter=1; loop_counter<count; loop_counter++){
        //   i = 1; 
        //}

        long end_time = System.currentTimeMillis();
        long diff_time = end_time - start_time;

        System.out.println(diff_time);
    }
}

