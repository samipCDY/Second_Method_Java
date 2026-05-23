import java.util.Scanner;
public class MADlib {
public static void main(String[] argus){
    Scanner scanner = new Scanner(System.in);

    String adjective1;
    String verb;
    String adjective2;
    String noun1;
    String adjective3;

    System.out.print("enter the first Adjective: ");
    adjective1 = scanner.nextLine();
    System.out.println("enter the verb");
    verb = scanner.nextLine();
    System.out.print("enter the 2md Adjectve: ");
    adjective2 = scanner.nextLine();
    System.out.print("Enter the Noun1: ");
    noun1 = scanner.nextLine();
    System.out.print("Enter the third Adjective: ");
    adjective3 = scanner.nextLine();


    System.out.println("i am " + adjective1 + " god");
    System.out.println("We are " + verb + " Ok to go");
    System.out.println("I am here " + adjective2 + " win the game");
    System.out.println("I am " + noun1 + " the hero");
    System.out.println("I am " + adjective3 + " here to come see the " + adjective1);

    scanner.close();
}
    
}
