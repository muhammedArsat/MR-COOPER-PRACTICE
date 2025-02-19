public class OddEvenAndEvenOddPosition {

    public static void main(String[] args) {
        int[] arr = {1,-3,5,6,-3,6,7,-4,9,10};

        for(int i = 0; i < arr.length;i++){

            if(arr[i] >= 0 && i % 2 == 1){

                for(int j = i+1; j < arr.length;j++){
                    if(arr[j] < 0 && j % 2 == 0){
                        swap(arr,i,j);
                        break;
                    }
                }

            }
            else if(arr[i] < 0 && i %2 ==0){
                for(int j = i+1; j < arr.length;j++){
                    if(arr[j]>=0 && j % 2 == 1){
                        swap(arr, i, j);
                        break;
                    }
                }
            }
        }

        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void swap(int[] arr, int positive, int negative){
        int temp = arr[positive];
        arr[positive] = arr[negative];
        arr[negative] = temp;
    }
}
