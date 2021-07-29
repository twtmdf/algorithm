package geek.leetcode.week02;

//https://leetcode-cn.com/problems/range-sum-query-2d-immutable/
//lc304
//二维区域和检索——矩阵不可变
public class Lc304NumMatrix {
    int[][] s;
//    去掉方法的void
    public void NumMatrix(int[][] matrix) {
        s = matrix;
        for (int i =0;i<matrix.length;i++) {
            for (int j = 0;j<matrix[0].length;j++) {
                // s[i][j] = s[i-1][j]+s[i][j-1]-s[i-1][j-1]+matrix[i][j];
                s[i][j] = getSum(i-1,j)+getSum(i,j-1)-getSum(i-1,j-1)+matrix[i][j];
            }
        }

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        // if不对
        // if (col1>0 && row1>0) {
        //     return s[row2][col2] - s[row2][col1 - 1] - s[row1 - 1][col2] + s[row1 - 1][col1 - 1];
        // }
        // return s[row2][col2];
        return getSum(row2,col2) - getSum(row1-1,col2) - getSum(row2,col1-1) +getSum(row1-1,col1-1);
    }

    private int getSum(int i,int j) {
        if(i>=0 && j>=0) return s[i][j];
        return 0;
    }
}
