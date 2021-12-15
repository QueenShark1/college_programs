import java.util.Scanner;
public class initializecharacter{
public static void main(String args[]){
    char ch;//variable declaration
    Scanner scan = new Scanner(System.in);
    
System.out.println("Enter the character");
ch=scan.next().charAt(0);
if (ch>='A' && ch<='Z') {
    System.out.println(ch+" is upper case letter ");
}
else if(ch>='a' && ch<='z') {
    System.out.println(ch+" is a lower case letter ");
}
else{
    System.out.println(ch+" is a special symbol ");
}
}
}

