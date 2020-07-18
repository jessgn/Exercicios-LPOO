class Calculadora
{
  public static void main (String args[])
  {
    Float num1 = Float.parseFloat(args[0]);
    Float num2 = Float.parseFloat(args[1]);
    if(args[2].equals("+"))
      System.out.println (num1+num2);

    if(args[2].equals("-"))
      System.out.println (num1-num2);

    if(args[2].equals("x"))
      System.out.println (num1*num2);

    if(args[2].equals("/"))
      System.out.println (num1/num2);
  }
}
