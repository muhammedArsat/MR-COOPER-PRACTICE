import java.util.Arrays;
import java.util.PriorityQueue;

public class NRopeSum {


    public static void main(String[] args) {

        int[] arr = {70,59,41,42,75};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i : arr){
            minHeap.add(i);
        }

        long minCost = 0;

        while(minHeap.size() > 1){
            int firstMin = minHeap.poll();
            int secondMin = minHeap.poll();
            int currentCost = firstMin + secondMin;
            minCost += currentCost;

            minHeap.add(currentCost);
        }
            System.out.println(minCost);
    }
}
