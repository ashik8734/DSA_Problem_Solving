class RotateMatrix {
    public static void rotate(int[][] matrix) {
      for(int i=0;i<matrix.length;i++){
          for(int j=i;j<matrix[0].length;j++){
              int temp=matrix[i][j];
              matrix[i][j]=matrix[j][i];
              matrix[j][i]=temp;
          }
      } 

      for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length/2;j++){

              int temp=matrix[i][j];
              matrix[i][j]=matrix[i][matrix.length-j-1];
              matrix[i][matrix.length-j-1]=temp;
          }
      } 
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}