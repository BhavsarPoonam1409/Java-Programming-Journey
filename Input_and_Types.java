import java.util.*;
public class Input_and_Types {
    public static void main(String[]args){
        //object create a Scanner class for input for user
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a n ");
        String n = scan.next();
        System.out.println("Not count space and new line: "+n);


        System.out.println("Enter Your name: ");
        String name = scan.nextLine();
        System.out.println("Your name is: "+name);

        System.out.print("Enter your favouirte number: ");
        int number = scan.nextInt();
        System.out.println("Your favourit number is: "+number);

        System.out.print("Enter your Pen Price: ");
        float price = scan.nextFloat();
        System.out.println("Your pen price is: "+price);

        //boolen
        System.out.print("Enter a value: ");
        boolean b = scan.nextBoolean();
        System.out.println("Enter boolean value: "+b);

        //short
        System.out.print("Enter a short value: ");
        short s = scan.nextShort();
        System.out.println("your short value is: "+s);

        //long
        System.out.print("Enter your long value: ");
        long l = scan.nextLong();
        System.out.println("your long value is: "+l);

        scan.close();
    }
}
