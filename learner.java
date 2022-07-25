import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
class learner
{
    public static void main(String[] args)
    {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----.","--..--",".-.-.-","/"};
        String[] latin = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9",",","."," "};
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < morse.length; i++)
        {
            System.out.println(latin[i]);
            int temp,temp2;
            for(;;)
            {
                temp = ThreadLocalRandom.current().nextInt(0, morse.length + 1);
                temp2 = ThreadLocalRandom.current().nextInt(0, 2 + 1);
                if(temp2 != temp) break;
            }
            if(temp2 == 0) System.out.println("> " + morse[temp] + "\n" + "> " + morse[i]);
            else System.out.println("> " + morse[i] + "\n" + "> " + morse[temp]);
            String in = keyboard.nextLine();
            if(!in.equals(morse[i]))
            {
                System.out.println(in + " is incorrect. Try: " + morse[i]);
                i--;
            }
        }
        keyboard.close();
    }
}