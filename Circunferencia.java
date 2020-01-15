public class Circunferencia{
  public double raio=0;
  public double area=0;

  public double calculaArea(){
    area=Math.PI*Math.pow(this.raio,2);
    return area;
  }
}
