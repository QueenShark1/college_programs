import java.util.Scanner;
public class BinaryToOctal
{
   public static void main(String[] args)
   {
      int binnum, octDigit=0, i=0, m=1, c=1, rem;
      int[] octnum = new int[20];
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Binary Number: ");
      binnum = scan.nextInt();
      
      while(binnum!=0)
      {
         rem = binnum%10;
         octDigit = octDigit + (rem*m);
         if(c%3==0)
         {
            octnum[i] = octDigit;
            m = 1;
            c = 1;
            octDigit = 0;
            i++;
         }
         else
         {
            m = m*2;
            c++;
         }
         binnum = binnum/10;
      }
      
      if(c!=1)
         octnum[i] = octDigit;
      
      System.out.print("\nEquivalent Octal Value = ");
      for(i=1; i>=0; i--)
      {
        System.out.print(octnum[i]);
      }
         
   }
}