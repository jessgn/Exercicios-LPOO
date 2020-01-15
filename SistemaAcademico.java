import java.util.ArrayList;
import java.util.Scanner;
public class SistemaAcademico{
  static ArrayList<Aluno> vetor = new ArrayList<Aluno>();
  static Scanner s1 = new Scanner(System.in); //numero
  static Scanner s2 = new Scanner(System.in); //nao numero

  public static void main(String args[]){
    int opt=0;

    System.out.printf("Sistema Academico\n\n");
    System.out.printf("Menu principal\n");
    System.out.printf("1.Cadastrar aluno\n2.Excluir aluno\n3.Listar Alunos\n4.Matricular aluno em uma disciplina\n5.Cancelar matricula de um aluno\n6.Sair\n\n");

    while(opt!=6){
      System.out.printf("Opcao: ");
      opt=s1.nextInt();
      System.out.printf("\n");

      if(opt>6||opt<1){
        System.out.printf("Opcao invalida");
      }
      if(opt==1){
        Aluno aluno = new Aluno("nome1", 10, "curso1", 10, 200, 1);
        cadastrarAluno(aluno);
      }
      if(opt==2){
        System.out.printf("Nome do aluno: ");
        excluirAluno(s2.nextLine());
      }
      if(opt==3){
        listarAlunos();
      }
      if(opt==4){
        System.out.printf("Nome da disciplina: ");
        matricularAluno(s2.nextLine());
      }
      if(opt==5){
        System.out.printf("Nome da disciplina: ");
        cancelarMatricula(s2.nextLine());
      }
    }
    System.out.printf("Programa encerrado\n");
  }

  public static void cadastrarAluno(Aluno aluno){

    System.out.printf("Nome: ");
    aluno.setNome(s2.nextLine());

    System.out.printf("Matricula: ");
    aluno.setMatricula(s1.nextInt());

    System.out.printf("Idade: ");
    aluno.setIdade(s1.nextInt());

    System.out.printf("Endereco: ");
    aluno.setEndereco(s2.nextLine());

    System.out.printf("Curso: ");
    aluno.setCurso(s2.nextLine());

    System.out.printf("Periodo: ");
    aluno.setPeriodo(s1.nextInt());

    System.out.printf("Maximo de disciplinas: ");
    aluno.setMaxDisciplinas(s1.nextInt());

    vetor.add(aluno);
  }

  public static void excluirAluno(String nomeAluno){
    int i=0;
    while(i!=vetor.size()){
      if( ( (vetor.get(i)).getNome() ).equals(nomeAluno) ){
        vetor.remove(i);
        System.out.printf("Aluno %s excluido no indice %d.\n",nomeAluno,i);
        break;
      }
      i++;
    }
  }

  public static void listarAlunos(){
    int i=0;
    while(i!=vetor.size()){
      (vetor.get(i)).imprime();
      i++;
    }
  }

  public static void matricularAluno(String disciplina){
    String nomeAluno;
    int i=0;
    System.out.printf("Informe o nome do aluno: ");
    nomeAluno=s2.nextLine();
    while(i!=vetor.size()){
      if( ( (vetor.get(i)).getNome() ).equals(nomeAluno) ){
        (vetor.get(i)).fazMatricula(disciplina);
        break;
      }
      i++;
    }
  }

  public static void cancelarMatricula(String disciplina){
    String nomeAluno;
    int i=0;
    System.out.printf("Informe o nome do aluno: ");
    nomeAluno=s2.nextLine();
    while(i!=vetor.size()){
      if( ( (vetor.get(i)).getNome() ).equals(nomeAluno) ){
        (vetor.get(i)).cancelarMatricula(disciplina);
        break;
      }
      i++;
    }
  }

}
