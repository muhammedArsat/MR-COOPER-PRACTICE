import java.util.*;
public class MinimumConsecutiveMaximum {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2};
        Arrays.sort(arr);
        int result = 0;
        for(int i = 0; i < arr.length; i +=2)
        {
            int minimum = arr[i];
            result += minimum;
        }
        System.out.println(result);
    }
}
