import java.util.Scanner;
class distanciaDoisPontos
{
  public static void main (String args[])
  {
    Scanner scn = new Scanner (System.in);
    System.out.println("Ponto 1 X: ");
    double x1=scn.nextDouble();
    System.out.println("Ponto 1 Y: ");
    double y1=scn.nextDouble();
    System.out.println("Ponto 2 X: ");
    double x2=scn.nextDouble();
    System.out.println("Ponto 2 Y: ");
    double y2=scn.nextDouble();


    double res=Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));
    System.out.println("Distancia entre os pontos X e Y "+res);
  }
}
