import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner wybor = new Scanner(System.in);  
    System.out.println("1 - Policz pole prostokta. 2- Policz pole ");
    int i = wybor.nextByte();
    
    switch(i)
      {
        case 1:
          {
            int a,b;
            System.out.println("Wpisz a");
            a = wybor.nextByte();
            System.out.println("Wpisz b");
            b = wybor.nextByte();
            int pole = a*b;
            System.out.println("Pole prostokata o bokach "+ a +","+ b + " wynosi: " + pole);
          }
        case 2:
          {
            double a,h;
            System.out.println("Wpisz a");
            a = wybor.nextByte();
            System.out.println("Wpisz h");
            h = wybor.nextByte();
            double pole = 0.5*a*h;
            System.out.println("Pole trojkata wynosi: " + pole);
          }
        default:
          {
            System.out.println("Podales zla liczbe.");
          }
      }
  }
}