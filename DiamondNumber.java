public class DiamondNumber {
    public static void main(String[] args) {
        int n = 3;

        for(int i = 1; i <= n;i++){
            for(int j = 1; j <=n-i; j++){
                System.out.print("__");
            }

            int count = i;
            for(int j = 1; j <= (2 * i)-1; j++){
                if(j <= ((2*i)-1) / 2)
                {
                    System.out.print(count+" ");
                    count--;
                }else{
                    System.out.print(count+" ");
                    count++;

                }
            }
            for(int j = n-i; j >= 1;j--){
                System.out.print("__");

            }
        System.out.println();
        }
        for(int i = n-1;  i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print("__");
            }
            int count = i;
            for(int j = 1; j <= (2*i)-1 ; j++){
                if(j <= ((2*i)-1)/2){
                    System.out.print(count+" ");
                    count--;

                }else{
                    System.out.print(count+" ");
                    count++;
                }
            }
            for(int j = 1 ; j <=n-i;j++){
                System.out.print("__");
            }
        System.out.println();

        }



    }
    }
