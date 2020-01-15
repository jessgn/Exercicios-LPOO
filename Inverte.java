class E8
{
  public static void main (String args[])
  {
    int tamanho = args.length-1;
    //System.out.println (tamanho);
    for (int i = tamanho; i >= 0; i--){
      System.out.println (args[i]);
    }
  }
}
/*O programa percorre o vetor de argumentos e imprime na tela
cada um dos argumentos em ordem inversa*/
