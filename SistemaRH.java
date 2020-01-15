import java.util.ArrayList
public class SistemaRH{
  Gerente manager = new Gerente();
  Analista bob = new Analista();

  public static void main(String[] args) {
    manager.funcionarios.add(bob);
  }
}
