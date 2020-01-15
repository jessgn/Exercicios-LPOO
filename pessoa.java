public class pessoa{
  public String nome="";
  public int idade=0;
  public String endereco="";

  public void atribuiNome(String novoNome){
    nome=novoNome;
  }

  public void atribuiIdade(int novaIdade){
    idade=novaIdade;
  }

  public void atribuiEndereco(String novoEndereco){
    endereco=novoEndereco;
  }

  public void fazAniversario(){
    this.idade++;
  }

  public void imprime(){
    System.out.printf("Informacoes:\nNome: %s\nIdade: %d\nEndereco: %s\n",nome,idade,endereco);
  }
}
