import java.util.*;
public class SumOfLcm {


    static int lcmFind(int n1, int n2, int gcd){
        return (n1 * n2) / gcd;
    }

    static int gcdFind(int n1, int n2){

        while(n2 != 0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = 3;
        int sumOfLcm = 0;
        for(int i = 1; i <= N; i++){
            int gcd =gcdFind(i,N);
            int lcm = lcmFind(i,N,gcd);
            sumOfLcm += lcm;
        }

        System.out.println(sumOfLcm);
        sc.close();
    }
}
