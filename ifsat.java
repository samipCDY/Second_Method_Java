import java.util.Scanner;
public class ifsat {
public static void main(String[] argus){

    //IF statement
    Scanner scanner = new Scanner(System.in);
    String name;

    int age;
    System.out.print("Enter your name: ");
    name =  scanner.nextLine();

    System.out.println("Enter your age: ");
    age = scanner.nextInt();
    if(age >= 18){
        System.out.println("you are adult");
    }else if(age == 0){
        System.out.println("not born");
    }
    else{
        System.out.println("You are minor");
    }







    scanner.close();
}

    
}
