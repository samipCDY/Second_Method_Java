import java.util.Scanner;
public class Demo{
    public static void main(String[] argus){
        Scanner scanncer = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = scanncer.nextLine();
        System.out.print("Emter your age: ");
        int age =  scanncer.nextInt();
        
        System.out.println("hello " + name);
        System.out.println("Your age is " + age + " years old");



        scanncer.close();

    }
}