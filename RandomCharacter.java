import java.util.ArrayList;
import java.util.Random;

public class RandomCharacter {
    Random r = new Random();

    public char getRandomLowerCaseLetter(){
        char c = (char) (r.nextInt(26) + 'a');
        return c;
    }

    public char getRandomUpperCaseLetter(){
        char c = (char) (r.nextInt(26) + 'A');
        return c;
    }
    
    public char getRandomDigitCharacter(){
       int i = r.nextInt(10);
       char c = Character.forDigit(i,10);
       return c;
    }

    public char getRandomCharacter(){
        int selected=0;
        selected=r.nextInt(3);
        if(selected==0){
            return getRandomLowerCaseLetter();
        }
        else if(selected==1){
            return getRandomUpperCaseLetter();
        }
        else if(selected==2){
            return getRandomDigitCharacter();
        }
        else
            return '1'; //
    }


    
}
