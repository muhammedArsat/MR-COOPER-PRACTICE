import java.util.*;

public class MaximumConsecutive {

    public static void main(String[] args) {
        int arr[] = {1,94,93,1000,92,78};
        Arrays.sort(arr);

        int max = 0;
        int count = 1;

        for(int i = 0; i < arr.length-1;i++){
            if( arr[i+1] == arr[i]+1){
                count++;

            }
            else{
                if(count > max) max = count;
                count = 1;
            }
        }

        max = Math.max(max,count);

        System.out.println(max);
        maxSumOfConsecutive(arr, arr.length);
    }

    public static void maxSumOfConsecutive(int arr[], int n){
            HashSet<Integer> set = new HashSet<>();
            for(int i = 0; i < n; i++){
                set.add(arr[i]);
            }


            int maxSum = 0;
            int maxCount = 0;
            for(int i = 0; i < n; i++){

                if(!set.contains(arr[i]-1)){
                    int currentNumber = arr[i];
                    int currenSum = currentNumber;
                    int count = 1;

                        while(set.contains(currentNumber+1)){
                            currentNumber++;
                            currenSum+=currentNumber;
                            count++;
                        }
                        if(count > maxCount){
                        maxSum = Math.max(currenSum,maxSum);
                        maxCount = count;
                        }

                }
            }
            System.out.println(maxSum);

    }

}
