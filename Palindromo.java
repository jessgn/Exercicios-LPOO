import java.util.Scanner;
import java.lang.String;

public class E9{
  public static void main (String args[]){
    int i=0;
    Scanner s = new Scanner (System.in);
    String frase;
    Boolean verif=true;
    System.out.printf("Frase: ");
    frase=s.nextLine().toUpperCase();
    frase = frase.replaceAll("[^A-Z]","");
    for(i=0;i!=frase.length();i++){
      if(frase.charAt(i)!=frase.charAt((frase.length()-i)-1)){
        verif = false;
        break;
      }
    }
    if(verif==false){
      System.out.printf("A frase nao e palindromo\n");
    }
    else{
      System.out.printf("A frase e palindromo\n");
    }
  }
}
