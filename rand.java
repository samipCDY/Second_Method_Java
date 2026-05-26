import java.util.Random;
public class rand{
    public static void main(String[] argus){
        Random random = new Random();
        int number1;
        int number2;
        int number3;
          number1 = random.nextInt(1,6);
          number2 = random.nextInt(1,6);
          number3 = random.nextInt(1,6);
        System.out.print(number1);
         System.out.print(number2);
          System.out.print(number3);
      

    }
}