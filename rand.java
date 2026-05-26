import java.util.Random;
public class rand{
    public static void main(String[] argus){
        //Random Number generator
        Random random = new Random();
        boolean isHeads;
        isHeads = random.nextBoolean();

        
        if(isHeads){
            System.out.println("It's Heads!");
        }else{
            System.out.println("It is Tails!");
        }
    
      

    }
}