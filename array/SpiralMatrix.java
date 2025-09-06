import java.util.*;

public class SpiralMatrix {
public void spiralOrder(int[][] matrix) {
  int m = matrix.length, n = matrix[0].length;
  int top = 0, bottom = m - 1, left = 0, right = n - 1;
  int count = 0, total = m * n;

  while (count < total) {
    for (int j = left; j <= right && count < total; j++) {
      System.out.print(matrix[top][j] + " ");
      count++;
    }
    top++;
    for (int i = top; i <= bottom && count < total; i++) {
      System.out.print(matrix[i][right] + " ");
      count++;
    }
    right--;
    for (int j = right; j >= left && count < total; j--) {
      System.out.print(matrix[bottom][j] + " ");
      count++;
    }
    bottom--;
    for (int i = bottom; i >= top && count < total; i--) {
      System.out.print(matrix[i][left] + " ");
      count++;
}  
} 
}
}
