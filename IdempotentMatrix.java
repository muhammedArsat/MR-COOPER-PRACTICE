public class IdempotentMatrix {
    public static void main(String[] args) {
        int mat[][] = {{1,0},{0,1}};
        int row = mat.length;
		int col = mat[0].length;

		int res[][] = new int[row][col];


		for(int i =0; i < row;i++)
		{
			for(int j = 0; j < col; j++){
				res[i][j] = 0;
				for(int k = 0; k < col; k++){
				res[i][j] += mat[i][k] * mat[k][j];
				}

			}
		}


		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				if(mat[i][j] != res[i][j]){
                    System.out.println( false);
                    return;
    			}
		}
        System.out.println( true);
        return;
    }
}}
