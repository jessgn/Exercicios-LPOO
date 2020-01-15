import java.util.Scanner;

public class E13{
  public static void main (String args[]){
    Scanner s = new Scanner (System.in);
    int qtd=0;
    System.out.printf("Numero de amostras: ");
    qtd=s.nextInt();
    double amostras[] = new double [qtd];
    int i=0;
    double soma=0.0;
    for(i=0;i!=qtd;i++){
      System.out.printf("Amostra [%d]: ",i+1);
      amostras[i]=s.nextFloat();
      soma+=amostras[i];
    }
    double media=(double)soma/qtd;
    soma=0.0;
    for(i=0;i!=qtd;i++){
      soma+=Math.pow(amostras[i]-media,2);
    }
    System.out.printf("Desvio padrao: %f\n",Math.sqrt(soma/(qtd-1)));
  }
}
