import java.util.ArrayList;

public class Gerente extends Funcionario{
  private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

  public double getBonus(){
    this.salario=(1000.0*2.0)+(100.0*funcionarios.size());
  }
}
