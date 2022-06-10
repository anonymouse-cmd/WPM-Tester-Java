import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMProgram {

    public static String[] words = {"Please take your dog, Cali, out for a walk – he really needs some exercise!", "Rex Quinfrey, a renowned scientist, created plans for an invisibility machine.", "What a beautiful day it is on the beach, here in beautiful and sunny Hawaii.", "Do you know why all those chemicals are so hazardous to the environment?", "You never did tell me how many copper pennies where in that jar; how come?", "Max Joykner sneakily drove his car around every corner looking for his dog", "The two boys collected twigs outside, for over an hour, in the freezing cold!", "When do you think they will get back from their adventure in Cairo, Egypt?", "Trixie and Veronica, our two cats, just love to play with their pink ball of yarn.", "We climbed to the top of the mountain in just under two hours; isn’t that great?"};

    public static void main(String[] args) throws InterruptedException {

        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        Random rand = new Random();
        String typeThis = words[rand.nextInt(9)];

        for (int i = 0; i < 1; i++) {
            System.out.print(typeThis + " ");
        }
        System.out.println();

        double start = LocalTime.now().toNanoOfDay();

        Scanner scan = new Scanner(System.in);
        String typedWords = scan.nextLine();
        
        if (typeThis == typedWords) {
            System.out.println("You have typed it correctly");
        }
        else if(typeThis != typedWords) {
            System.out.println("You have  not typed it correctly");
            System.exit(0);
        }
        else {
            System.exit(0);
        }

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
