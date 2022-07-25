import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
class learner
{
    static String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----.","--..--",".-.-.-"};
    static String[] latin = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9",",","."};
    static Boolean hard = false;
    static int number = morse.length;
    public static void main(String[] args)
    {
        if(Arrays.asList(args).contains("-h"))
        {
            System.out.println("Enter -d for difficult mode.\n"+
            "Enter -n and specify a number to only learn a certain amount of characters.\n"+
            "Enter -h for this prompt.");
            System.exit(0);
        }
            if(Arrays.asList(args).contains("-d")) hard = true;
        if(Arrays.asList(args).contains("-n"))
        {
            if(Arrays.asList(args).indexOf("-n") < args.length-1) 
            {
                try
                {
                    number = Integer.parseInt(args[Arrays.asList(args).indexOf("-n") + 1]);
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Please enter a integer number after \"-n\"");
                }
            }
            else
            {
                System.out.println("Please enter a integer number after \"-n\"");
                System.exit(1);
            }
        }
        String buffer;
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < number; i++)
        {
            System.out.println(latin[i]);
            int[] temp = new int[2];
            for(;;)
            {
                temp[0] = ThreadLocalRandom.current().nextInt(0, morse.length -1);
                temp[1] = ThreadLocalRandom.current().nextInt(0, 1 + 1);
                if(temp[1] != temp[0]) break;
            }
            if(temp[1] == 0) buffer = morse[temp[0]] + "\n" + morse[i];
            else buffer = morse[i] + "\n" + morse[temp[0]];
            if(!hard) System.out.printf(buffer + "\n>");
            String in = keyboard.nextLine();
            if(!in.equals(morse[i]))
            {
                System.out.printf(in + " is incorrect.");
                if(!hard) System.out.printf("Try: " + morse[i] + "\n");
                else System.out.printf("\n");
                i--;
            }
        }
        keyboard.close();
    }
}