package learn1;

public class Feitu_rotatematrix {
	public void rotate(int[][] matrix) {
        int i,j;  int len=matrix[0].length; int hei=matrix.length;
        int temp;
        for (i=0;i<len;i++){
        	
        for(j=0;j<hei;j++) {
        	
        temp=matrix[i][j];
        
        matrix[i][j]=matrix[i][hei-i];
        
        matrix[i][hei-i]=temp;
        }
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
