import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RandomMain {
    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_Cyan = "\033[0;96m";
    public static final String ANSI_GREEN = "\033[1;92m";
    public static final String ANSI_PURPLE = "\033[1;95m";
    public static final String ANSI_YELLOW = "\033[1;93m";
    public static  final int MaxValue = 15;
    public static void main(String[] args){
        RandomCharacter r = new RandomCharacter();


        //function 1 get Random lowerCase
        System.out.println(ANSI_Cyan + "1) Print Random Lower Case Characters" + ANSI_RESET);
        for(int i = 0; i < MaxValue; i++){
            System.out.print(ANSI_Cyan +r.getRandomLowerCaseLetter()+ ANSI_RESET);
        };

        //function 2 get Random Upper Case
        System.out.println("\n ");
        System.out.println(ANSI_GREEN + "2) Print Random Upper Case Characters" + ANSI_RESET);

        for(int i = 0; i < MaxValue; i++){
            System.out.print(ANSI_GREEN+r.getRandomUpperCaseLetter()+ANSI_RESET);
        };


        //function3 get Random Digits
        System.out.println("\n ");
        System.out.println(ANSI_PURPLE + "3) Print Random Digit Characters" + ANSI_RESET);
        for(int i = 0; i < MaxValue; i++){
            System.out.print(ANSI_PURPLE+r.getRandomDigitCharacter()+ANSI_RESET);
        };

        //function3 get Random Digits
        System.out.println("\n ");
        System.out.println(ANSI_YELLOW + "4) Print Random Characters" + ANSI_RESET);
        for(int i = 0; i < MaxValue; i++){
            System.out.print(ANSI_YELLOW+r.getRandomCharacter()+ANSI_RESET);
        };
    }
}
