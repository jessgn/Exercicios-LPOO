import java.util.Scanner;
import java.lang.String;
import java.util.*;

public class E3{
  public static void main (String args[]){
    int i;
    Scanner s = new Scanner (System.in);
    int elemento[]=new int[5];
    for(i=0;i!=5;i++){
      System.out.printf("Informe o elemento %d: ",i);
      try{
        elemento[i]=Integer.parseInt(s.next());
      }
      catch(Exception e){
        System.out.printf("Dado invalido. ");
        i--;
      }
    }
    int soma=0;
    for(i=0;i!=elemento.length;i++){
      if(elemento[i]%2==0){
        soma+=elemento[i];
      }
    }
    System.out.printf("Soma dos valores pares: %d\n",soma);
  }
}
