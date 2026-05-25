import java.util.Scanner;
public class shop {
    public static void main(String[] argus){
        Scanner scanner = new Scanner(System.in);

        String item;
        Double price;
        int quantity;
        char currency = '$';
        Double total;

        System.out.print("What item do you like to but? ");
        item = scanner.nextLine();

        System.out.print("How much does it cost? ");
        price = scanner.nextDouble();

        System.out.print("How much do you want? ");
        quantity = scanner.nextInt();

        total = price * quantity;
        

        System.out.println("The cost of the item is "+ currency +  price  + " and the quantity you take is "+ quantity + " . So the total amount will be "+ currency + total);






        scanner.close();
    }
    
}
