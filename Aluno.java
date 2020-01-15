import java.util.ArrayList;
public class Aluno{
  private String nome=null;
  private int matricula=0;
  private String curso=null;
  private int periodo=0;
  private int maxDisciplinas=0;
  ArrayList<String> disciplinasMatriculadas = new ArrayList<String>();
  private String endereco=null;
  private int idade=0;

  public  Aluno(String  nome,  int  matricula,  String  curso,  int  periodo,  int  idade, int maxDisciplinas){
    this.nome=nome;
    this.matricula=matricula;
    this.curso=curso;
    this.periodo=periodo;
    this.idade=idade;
    this.maxDisciplinas=maxDisciplinas;
  }

  public void fazMatricula(String disciplina){
    int i=0;
    if(this.maxDisciplinas==0){
      System.out.printf("Esse aluno nao pode ser matriculado em nenhuma disciplina. Por favor, fale com a secretaria.\n");
    }
    if(disciplinasMatriculadas.size()<this.maxDisciplinas){
      disciplinasMatriculadas.add(disciplina);
      System.out.printf("Matricula na disciplina %s efetuada.\n", disciplina);
    }
    else{
      System.out.printf("Quantidade de disciplinas excedida. O limite de disciplinas para este aluno é de %d disciplina(s). Se  desejar, cancele a matrícula de uma das disciplinas e faça a nova matrícula.\n", this.maxDisciplinas);
    }
  }

  public void cancelarMatricula(String disciplina){
    int i=0;
    int verif=0;
    for(i=0;i!=disciplinasMatriculadas.size();i++){
      if((disciplinasMatriculadas.get(i)).equals(disciplina)){
        disciplinasMatriculadas.remove(i);
        System.out.printf("Matricula na disciplina %s cancelada.\n", disciplina);
      }
      else{
        verif++;
      }
    }
    if(verif>0){
      System.out.printf("Aluno nao matriculado na disciplina %s\n", disciplina);
    }
  }

  public void imprime(){
    System.out.printf("-------------\nNome: %s\nMatricula: %d\nCurso: %s\nPeriodo: %d\nDisciplinas matriculadas: ",this.nome,this.matricula,this.curso,this.periodo);
    int i=0;
    for(i=0;i!=disciplinasMatriculadas.size();i++){
      if(i==0){
        System.out.printf("%s",disciplinasMatriculadas.get(i));
      }
      else{
        System.out.printf("; %s",disciplinasMatriculadas.get(i));
      }
    }
    System.out.printf("\n-------------\n\n");
  }

  public int getMaxDisciplinas(){
    return this.maxDisciplinas;
  }

  public String getNome(){
    return this.nome;
  }

  public void setNome(String nome){
    this.nome=nome;
  }
  public void setMatricula(int matricula){
    this.matricula=matricula;
  }
  public void setCurso(String curso){
    this.curso=curso;
  }
  public void setPeriodo(int periodo){
    this.periodo=periodo;
  }
  public void setMaxDisciplinas(int maxDisciplinas){
    this.maxDisciplinas=maxDisciplinas;
  }
  public void setEndereco(String endereco){
    this.endereco=endereco;
  }
  public void setIdade(int idade){
    this.idade=idade;
  }
}
