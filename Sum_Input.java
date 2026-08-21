import java.util.Scanner;
public class Sum_Input {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b;

    System.out.println("sum is: "+a+b + " print string");
    System.out.println("Sum is: "+sum);

    sc.close();
    }
}
