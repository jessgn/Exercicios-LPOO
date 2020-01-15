import java.util.Scanner;
class E13
{
  public static void main (String args[])
  {
    Scanner scn = new Scanner (System.in);
    System.out.printf("Apresentar os numeros da serie fibonacci ate ser maior que: ");
    int n=scn.nextInt();

    int primeiro=0;
    int segundo=1;
    int terceiro=0;

    if(n==0)
      System.out.printf("%d, %d\n",primeiro,segundo);

    else if(n==1)
      System.out.printf("%d, %d, %d, %d\n",primeiro,segundo,primeiro+segundo,segundo*2);
    else{
      System.out.printf("%d, %d",primeiro,segundo);
      do{
        terceiro=primeiro+segundo;
        System.out.printf(", %d",terceiro);
        primeiro=segundo;
        segundo=terceiro;
      }while(terceiro<n);
    }
    if(terceiro==n){
      terceiro=primeiro+segundo;
      System.out.printf(", %d",terceiro);
    }
    System.out.printf("\n");
  }
}
