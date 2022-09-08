import java.util.*;
public class decimaltobinary{
    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);
        System.out.println("enter decimal number : ");
        int b = a.nextInt();
        String c = Integer.toBinaryString(b);
        System.out.println("Binary number is :  "+c);        
    }
}