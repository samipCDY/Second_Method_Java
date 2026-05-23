import java.util.Scanner;
public class Demo{
    public static void main(String[] argus){
       // Area of triangle
        Scanner scanner = new Scanner(System.in);
        double base = 0;
        double height = 0;
        double area = 0;
        System.out.print("enter the base of the triangle: ");
         base = scanner.nextDouble();
         System.out.print("Enter the height of the triangele: ");
         height = scanner.nextDouble();
         area =0.5*base*height;
         System.out.println("The area of the triangle is: " + area);

       scanner.close();

    }
}