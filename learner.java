import java.util.Scanner;
class learner
{
    public static void main(String[] args)
    {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----.","--..--",".-.-.-","/"};
        String[] latin = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9",",","."," "};
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < morse.length; i++)
        {
            System.out.printf(latin[i] + " - ");
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