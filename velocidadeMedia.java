import java.util.Scanner;
class velocidadeMedia
{
  public static void main (String args[])
  {
    Scanner scn = new Scanner (System.in);
    System.out.println("Distancia: ");
    double distance=scn.nextDouble();
    System.out.println("Tempo ");
    double time=scn.nextDouble();
    double res=distance/time;
    System.out.println("Velocidade media: "+res);
  }
}
