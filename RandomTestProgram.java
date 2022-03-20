import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomTestProgram {
    static RandomCharacter r1;

    @BeforeAll
    public static void setUp(){
        r1 = new RandomCharacter();
    }

    @Test
    void getRandomLowerCaseLetter(){
        char check = r1.getRandomLowerCaseLetter();
        assertTrue(Character.isLowerCase(check));
    }
    @Test
    void getRandomUpperCaseLetter(){
        char check = r1.getRandomUpperCaseLetter();
        assertTrue(Character.isUpperCase(check));
    }
    @Test
    void getRandomDigit(){
        char check = r1.getRandomDigitCharacter();
        assertTrue(Character.isDigit(check));
    }
    @Test
    void getPrime(){
        System.out.println("Generating and checking if it is prime number");
        int check = (int) r1.getRandomDigitCharacter() -'0';
        System.out.println("Generated number: " + check );
        boolean flag = false;
        for (int i = 2; i <= check/2 ; ++i) {
            if (check % i == 0) {
                flag = true;
                break;
            }
        }
        assertFalse(flag);
    }


    @Test
    void getRandomCharacter(){
        char check = r1.getRandomCharacter();
    }


}
