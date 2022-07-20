import java.util.Arrays;
class encode
{
    public static void main(String[] args)
    {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----.","--..--",".-.-.-","/"};
        String[] latin = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9",",","."," "};
        String buffer = new String();
        for(String s: args)
        {
            for(int i = 0; i < s.length(); i++)
            {
                buffer = morse[Arrays.asList(latin).indexOf(s.split("")[i])];
                System.out.printf(buffer);
                if(i + 1 != s.length()) System.out.printf(" ");
            }
            System.out.printf(" / ");
        }
    }
}