import java.util.Scanner;

public class Matriz{
  public static void main (String args[]){
    Scanner s = new Scanner (System.in);
    int tamanho=0;
      System.out.printf("Numero de linhas e colunas da matriz quadrada: ");
      tamanho=s.nextInt();

    int m[][] = new int [tamanho][tamanho];
    preencher(m,tamanho);
    somas(m,tamanho);
  }

  public static void preencher(int[][] matriz,int tamanho){
    Scanner s = new Scanner (System.in);
    int i=0;
    int j=0;
    for(i=0;i!=tamanho;i++){
      for(j=0;j!=tamanho;j++){
        System.out.printf("Elemento [%d][%d]: ", i+1,j+1);
        matriz[i][j]=s.nextInt();
      }
    }
  }

  public static void somas (int[][] matriz,int tamanho){
    int soma=0;
    int i=0;
    int j=0;
    for(i=0;i!=tamanho;i++){
      soma+=matriz[i][i];
    }
    System.out.printf("Soma da diagonal principal: %d\n ",soma);
    soma=0;
    for(i=0,j=tamanho-1;i!=tamanho;i++,j--){
      soma+=matriz[i][j];
    }
    System.out.printf("Soma da diagonal secundaria: %d\n ",soma);
  }
}
