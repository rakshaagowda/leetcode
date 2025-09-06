/*You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation. */
public class RotateMatrix {
  public void rotate(int[][] matrix) {
    int n = matrix.length;

    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    for(int i=0;i<n;i++){
      int left=0;
      int right=n-1;
      while(left<right){
        int temp = matrix[i][left];
        matrix[i][left] = matrix[i][right];
        matrix[i][right] = temp;
        left++;
        right--;
      }
    }
  }
}
/*
 * To rotate a square matrix 90 degrees clockwise in-place, we can use a two-step transformation. First, we transpose the matrix by swapping elements across the main diagonal. Then, we reverse each row. This sequence of operations efficiently moves each element to its correct final position.


 */