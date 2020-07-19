import java.util.Scanner;

public class MediaSalarial{
  public static void main (String args[]){
    int i=0;
    int qtd=0;
    Double soma=0.0;
    Scanner s = new Scanner (System.in);
    System.out.printf("Informe a quantidade de funcionarios: ");
    qtd=s.nextInt();
    String nome[] = new String[qtd];
    Double salario[] = new Double[qtd];
    //System.out.printf("Vetor com %d indices criado\n",qtd);
    for(i=0;i!=qtd;i++){
      System.out.printf("Nome do funcionario %d ",i+1);
      nome[i]=s.nextLine();
      while(nome[i].length()<3){
        System.out.printf("(Minimo de 3 caracteres): ");
        nome[i]=s.nextLine();
      }
      System.out.printf("Salario do funcionario %d: ",i+1);
      salario[i]=s.nextDouble();
      while(salario[i]<0){
        System.out.printf("Salario Invalido. Digite novamente: ");
        salario[i]=s.nextDouble();
      }
    }
    for(i=0;i!=qtd;i++){
      soma+=salario[i];
    }
    System.out.printf("Media salarial: %.2f\n\n",soma/qtd);
    System.out.printf("Funcionarios com salario maior que a media salarial: \n\n");
    for(i=0;i!=qtd;i++){
      if(salario[i]>soma/qtd){
        System.out.printf("%50s%10.2f reais\n",nome[i],salario[i]);
      }
    }
  }
}
