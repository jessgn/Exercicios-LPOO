import java.util.Scanner;
public class UsaAluno{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    Aluno um = new Aluno("aluno1",10,"tads",3,24,2);
    um.fazMatricula("IA");
    um.fazMatricula("BD");
    um.fazMatricula("Linguica");
    um.imprime();
  }
}
