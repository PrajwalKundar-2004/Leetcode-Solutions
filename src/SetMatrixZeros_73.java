import java.util.Arrays;

public class SetMatrixZeros_73 {
     static void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][]  newMatrix=new int[r][c];
        for(int i=0;i<r;i++){
            newMatrix[i]=matrix[i].clone();
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    int m=0,n=0;
                    while(m<c){
                        newMatrix[i][m]=0;
                        m++;
                    }
                    while(n<r){
                        newMatrix[n][j]=0;
                        n++;
                    }
                }
            }
        }
        for(int i=0;i<r;i++){
            matrix[i]=newMatrix[i].clone();
        }
    }

    public static void main(String[] args) {
        int[][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
    }
}
