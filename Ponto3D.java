public class Ponto3D{
  public double x=0;
  public double y=0;
  public double z=0;
  public String intensidade="baixa";
  public String cor="preto";

  public double getx(){
    return this.x;
  }

  public double gety(){
    return this.y;
  }

  public double getz(){
    return this.z;
  }




  public void setx(double valor){
    this.x=valor;
  }

  public void sety(double valor){
    this.y=valor;
  }

  public void setz(double valor){
    this.z=valor;
  }



  public double calculaDistancia(Ponto3D p){
    double distX = p.x - x;
    double distY = p.y - y;
    double distZ = p.z - z;
    return(Math.sqrt(distX*distX + distY*distY + distZ*distZ));
  }
}
