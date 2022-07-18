import java.util.*;
class decode
{
    public static void main(String[] args)
    {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----.","--..--",".-.-.-","/"};
        String[] latin = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9",",","."," "};
        String buffer = new String();
        for(String s: args)
        {
            if(s != "decode")
            buffer = latin[Arrays.asList(morse).indexOf(s)];
            System.out.printf(buffer);
        }
    }
}