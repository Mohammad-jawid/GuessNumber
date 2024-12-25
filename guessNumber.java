
import java.util.Scanner;
import java.util.Random;

public class Project004 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();          
        int target = random.nextInt(100) + 1;
        int guess = 0;
        
        while (guess != target){
            System.out.print("guess a number between 1 and 100; ");
            guess = scanner.nextInt();
            if (guess < target)
                System.out.println("too low");
            else if (guess > target)
                System.out.println("too high");
            else 
                System.out.println("congratulations! you guessed the number.");
                    
        }scanner.close();

    }
}
