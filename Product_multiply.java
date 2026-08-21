import java.util.Scanner;
public class Product_multiply {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a two value: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;

        System.out.println("Product value is: "+product);
        sc.close();
    }
}
