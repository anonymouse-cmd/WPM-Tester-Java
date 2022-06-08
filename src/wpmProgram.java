import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMProgram {

    public static String[] words = {"envelope", "can", "cap", "Devon", "super", "boy", "girl", "Women", "Men", "code"};

    public static void main(String[] args) throws InterruptedException {

        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(words[rand.nextInt(9)] + " ");
        }
        System.out.println();

        double start = LocalTime.now().toNanoOfDay();

        Scanner scan = new Scanner(System.in);
        String typedWords = scan.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        double elapsedTime = end - start;
        double seconds = elapsedTime / 1000000000.0;
        System.out.println(seconds);
        int numChars = typedWords.length();

        // Formula to calculate WPM: (x chars / 5) / 1min = y WPM
        int wpm = (int) ((((double) numChars / 5) / seconds) * 60);

        System.out.println("Your WPM is: " + wpm);

    }

}
