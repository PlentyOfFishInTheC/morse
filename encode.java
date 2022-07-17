import java.util.*;
class encode
{
    public static void main(String[] args)
    {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----."};
        String[] uppercase = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"};
        String[] lowercase = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] latin;
        String[] buffer = new String[100];
        for(String s: args)
        {
            for(int i = 0; i < s.length(); i++)
            {
                if(Arrays.stream(lowercase).anyMatch(s.split("")[i]::equals)) latin = lowercase;
                else latin = uppercase;
                buffer[i] = morse[Arrays.asList(latin).indexOf(s.split("")[i])];
                System.out.printf(buffer[i]);
                if(i + 1 != s.length()) System.out.printf(" ");
            }
            System.out.printf("/");
        }
    }
}