import java.util.Scanner;
public class ifsat {
public static void main(String[] argus){

    //IF statement
    Scanner scanner = new Scanner(System.in);
    String name;
    int age;
    Boolean isstudent;
    System.out.print("Enter your name: ");
    name =  scanner.nextLine();

    System.out.print("Enter your age: ");
    age = scanner.nextInt();
    System.out.print("Are you a student?(True/False): ");
    isstudent = scanner.nextBoolean();

    if(name.isEmpty()){
        System.out.println("you didnot Enter your name");
    }else{
        System.out.println("Lovely name ");
    }
    if(age >= 18){
        System.out.println("you are adult");
    }else if(age == 0){
        System.out.println("not born");
    }
    else{
        System.out.println("You are minor");
    }
    if(isstudent){
        System.out.println("He is student");
    }else{
        System.out.println("he is not a student");
    } 






    scanner.close();
}

    
}
