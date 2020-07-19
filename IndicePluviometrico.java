import java.util.Scanner;

public class IndicePluviometrico{
  public static void main (String args[]){
    int i;
    Double dado[] = new Double[7];
    Double maior=0.0;
    Double menor=0.0;
    Double soma=0.0;
    Scanner s = new Scanner (System.in);

    System.out.printf("Indice pluviometrico do dia 1: ");
    dado[0]=s.nextDouble();
    maior=dado[0];
    menor=dado[0];

    for(i=1;i!=7;i++){
      System.out.printf("Indice pluviometrico do dia %d: ",i+1);
      dado[i]=s.nextDouble();
      if(dado[i]>maior){
        maior=dado[i];
      }
      if(dado[i]<menor){
        menor=dado[i];
      }
    }

    for(i=0;i!=7;i++){
      soma+=dado[i];
    }

    System.out.printf("Media dos indices: %.2f\nMaior indice: %.2f\nMenor indice: %.2f\n",soma/7.0,maior,menor);
  }
}
