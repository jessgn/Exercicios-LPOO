import java.util.ArrayList;

public class Diretor extends Funcionario{
  private ArrayList<String> depts = new ArrayList<String>();

  public double getBonus(){
    this.salario=(1000.0*4.0)+(3000.0*depts.size());
  }
}
