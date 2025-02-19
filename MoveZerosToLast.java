public class MoveZerosToLast {

    public static void main(String[] args) {
        int[] arr = {1,0,5,0,0,6};

        for(int i = 1; i < arr.length; i++){
            int j = i-1;
            if(arr[j] == 0 && arr[i] != 0){
                swap(i,j,arr);
                while( j > 0&&arr[j-1] == 0 ){
                    swap(j-1,j,arr);
                    j--;
                }
            }
        }

        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void swap(int i, int j, int[ ] arr){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}
