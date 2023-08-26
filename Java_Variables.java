// To be able to accept inputs from the user, it's necessary to import this library below, the java.util.Scanner
import java.util.Scanner;

public class Java_Variables {
    public static void main(String args[]) {
        // integer, numbers 'till 2_000_000_000 2Billion
        // Remember that theese types represent an specter of values, ranging from -2Gigabytes to 2Gigabytes in case of int, for example
        // int has 4 bytes, or 32 bits
        int my_int = 1_230_555_000;

        // long has 8 bytes, or 64 bits
        long my_long = 1_000_250_177;

        // short has 2 bytes, or 16 bits
        short my_short = 250; 

        // byte, has 1 byte, or 8 bits
        byte myByte = 3;

        // Operations with Integer are ONLY: division, addition, subtraction, multiplication and rest of division
        // division is floor division, the exact, the quotient, with the symbol /
        // the rest of the exact division is the symbol %

        int test1, test2, test3, test4;
        test1 = 20;
        test2 = 3;
        test3 = test1 / test2;
        test4 = test1 % test2;

        System.out.println(test3);
        System.out.println(test4);

        //Floating Points
        /* 
         Floats occupy 4 bytes (32 bits)
         Doubles occupy 8 bytes (64 bits)
        */
        float myflo1;
        double mydoub;
        myflo1 = 2.5f;
        mydoub = 4.9d;
        System.out.println(myflo1);
        System.out.println(mydoub);

        //Example of a division with the rest
        float x = 2.0f/5;
        System.out.println("O valor de x é = " + x);

        // Boolean type
        boolean mybool1, mybool2;
        mybool1 = true;
        mybool2 = false;
        System.out.println("O valor de mybool1 é = " + mybool1);
        System.out.println("O valor de mybool2 é = " + mybool2);

        // Text Types
        // String and char. Char is only 1 character while String is an array of chars.
        // String is defined with "" and char is defined with ''
        String greetingString = "Hello! How You're doing?";
        char theChar = 'M';
        System.out.println("My string value is: " + greetingString);
        System.out.println("The value of my char is: " + theChar);

        // Cleaning the terminal, adding one line with #####
        System.out.println("########################################################################");

        // Accepting inputs from the user using the java.util.Scanner library
        String theName;
        char yourLetter;
        int theAge;
        float yourNumber;

        // To be able to read, I need to create a variable using the type Scanner, ex:
        // The teclado receives the scanner in the System.in, for input of data
        Scanner teclado;
        teclado = new Scanner(System.in);

        // To facilitate the input from the user, print some messages indicating what to enter
        System.out.println("Please, enter your name: ");
        theName = teclado.nextLine();
        System.out.println("Enter your age: ");
        theAge = teclado.nextInt();
        System.out.println("Enter the number you like the most: ");
        yourNumber = teclado.nextFloat();
        System.out.println("Enter one letter: ");

        // To read a char, you read a string with nextLine, but adds the .charAt(position), with positino 0, you only reads the 1st letter
        yourLetter = teclado.nextLine().charAt(0);
        

        System.out.println("Your letter is: " + yourLetter);
        System.out.println("Your name is: " + theName);
        System.out.println("Your age is: " + theAge);
        System.out.println("You number is: " + yourNumber);
        


    }
}