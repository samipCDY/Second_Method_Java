import java.util.Scanner;
public class area {
    public static void main(String[] argus){
        Scanner scanner = new Scanner(System.in);

        double radius;
        double cricumference;
        double area;
        double volume;

        System.out.println("Enter the radius of the circle:");
        radius = scanner.nextDouble();

        cricumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);
        System.out.println("Circumference of the circle: " + cricumference);
        System.out.println("Area of the circle: " + area);
        System.out.println("Volume of the sphere: " + volume);
        scanner.close();
    }
    
}
