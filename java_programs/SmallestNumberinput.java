import java.util.Scanner;

public class SmallestNumberinput{
  public static void main(String[] args){


  int a, b, c, smallest, temp;

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the first number");
  a = sc.nextInt();
  System.out.println("Enter the second number");
  b = sc.nextInt();
  System.out.println("Enter the third number");
  c = sc.nextInt();
  sc.close();

  temp = a<b ? a:b;

  smallest = c<temp ? c:temp;

  System.out.println("The smallest number is : "+ smallest);
  }
}