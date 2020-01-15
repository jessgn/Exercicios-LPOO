import java.util.Scanner;
public class usaPessoa{
public static  void main(String args[]){
    Scanner s=new Scanner(System.in);
    pessoa procopio=new pessoa();
    String st="a";
    int i=0;
    System.out.printf("Nome: ");
    st=s.nextLine();
    procopio.atribuiNome(st);

    System.out.printf("Idade: ");
    i=s.nextInt();
    s.nextLine();
    procopio.atribuiIdade(i);

    System.out.printf("Endereco: ");
    st=s.nextLine();
    procopio.atribuiEndereco(st);

    //System.out.printf("Informacoes:\nNome: %s\nIdade: %d\nEndereco: %s\n",procopio.nome,procopio.idade,procopio.endereco);
    procopio.fazAniversario();
    procopio.imprime();
  }
}
