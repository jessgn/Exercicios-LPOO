public class usaPonto3D {

  public static void main(String[] args) {
    Ponto3D p1 = new Ponto3D();
    p1.x=4;
    p1.y=-8;
    p1.z=-9;
    Ponto3D p2 = new Ponto3D();
    p2.x=2;
    p2.y=-3;
    p2.z=-5;
    System.out.printf("Distancia = %.2f\n",p1.calculaDistancia(p2));
  }

}
