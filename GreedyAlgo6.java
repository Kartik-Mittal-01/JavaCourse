
import java.util.*;

public class GreedyAlgo6 {

    // static class Job{
    //     int deadline;
    //     int profit;
    //     int id;
    //     Job(int i , int d , int p){
    //         id = i;
    //         deadline =d;
    //         profit=p;
    //     }
    // }
    public static void main(String[] args) {

        // JOB SEQUENCING PROBLEM (MEHTOD 1)
        int JOB[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
        int jobinfo[][] = new int[JOB.length][3];

        for (int i = 0; i < jobinfo.length; i++) {
            jobinfo[i][0] = i;
            jobinfo[i][1] = JOB[i][0];         // jbinfo -> idx deadline profit
            jobinfo[i][2] = JOB[i][1];
        }

        Arrays.sort(jobinfo, Comparator.comparingDouble(o -> o[2]));    // sorterd in asc order based on profit ( MAX PROFIT IS IN LAST ROW)

        int time = 0;
        int profit = 0;
        for (int i = jobinfo.length - 1; i >= 0; i--) {
            if (jobinfo[i][1] > time) {
                profit += jobinfo[i][2];
                time++;
                System.out.print("J" + jobinfo[i][0] + " ");

            }
        }
        System.out.println();
        System.out.println("TOTAL TIME TAKEN IS: " + time);
        System.out.println("MAX TOTAL PROFIT IS: " + profit);

        // JOB SEQUENCING PROBLEM MEHTOD 2(USING CLASS)
        // ArrayList<Job> jobs = new ArrayList<>();
        // Job jobs[] = new Job[JOB.length];
        // for(int i = 0 ; i <JOB.length;i++){
        //     jobs[i] = new Job(i, JOB[i][0] , JOB[i][1]);
        // }
        // Collections.sort(jobs , (o1,o2) -> (o2.profit-o1.profit));  // sorting in desc order based on profit 
        // ArrayList<Integer> seq = new ArrayList<>();
        // int time = 0;
        // for(int i =0 ; i<jobs.length;i++){
        //     Job curr = jobs[i];
        //     if(curr.deadline >time){
        //         seq.add(curr.id);
        //         time++;
        //     }
        // }
        // System.out.println(seq);
        // System.out.println("Max Profit is:" + pr);
    }
}
