import java.util.*;

public class MaximumConsecutive {

    public static void main(String[] args) {
        int arr[] = {1,94,96,1000,101,78};
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
    }

}
