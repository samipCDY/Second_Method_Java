import java.util.Scanner;
public class Demo{
    public static void main(String[] argus){
        Scanner scanner = new Scanner(System.in); 
        // System.out.print("Enter thhe Number of a:");
        // int a = scanner.nextInt();
        // System.out.print("Enter the number of b:");
        // int b = scanner.nextInt();  
        // if(a>b){
        //     System.out.println("a is greater than b");
        // }else if(b>a)
        //     {
        //         System.out.println("b is grater than a ");
        //     }else{
        //         System.out.println("They are both Equal");
                
        //     }    
        System.out.println("Are you Student ? (true/false) :");
        boolean student = scanner.nextBoolean();
        System.out.println("you are a student :" + student);
        if(student){
            System.out.println("he is a topper");
        }
        else{
            System.out.println("He is God ");
        }



        scanner.close();

    }
}