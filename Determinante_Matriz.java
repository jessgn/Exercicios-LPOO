import java.util.Scanner;

public class E11{
  public static void main (String args[]){
    Scanner s = new Scanner (System.in);
    int m[][] = new int [3][3];
    int i=0;
    int j=0;
    int det=0;
    for(i=0;i!=3;i++){
      for(j=0;j!=3;j++){
        System.out.printf("Elemento [%d][%d]: ",i+1,j+1);
        m[i][j]=s.nextInt();
      }
    }
    det=( (m[0][0]*m[1][1]*m[2][2]) + (m[0][1]*m[1][2]*m[2][0]) + (m[0][2]*m[1][0]*m[2][1]) ) + ( (-1*(m[0][1]*m[1][0]*m[2][2])) + (-1*(m[0][0]*m[1][2]*m[2][1])) + (-1*(m[0][2]*m[1][1]*m[2][0])) );
    System.out.printf("Determinante: %d\n",det);
  }
}
