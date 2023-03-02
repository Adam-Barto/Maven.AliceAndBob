import java.util.Objects;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        StringBuilder name = inputname();

        if (checkName(name))
            System.out.println("Hello there " + name + "!");
        else
            System.out.println("I am sorry I don't recognize you, "+ name);
    }

    static boolean checkName(StringBuilder name){
        return ("Alice".equals(name.toString())) || ("Bob".equals(name.toString()));
    }

    static StringBuilder inputname(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a name: ");
        // This method reads the number provided using keyboard
        StringBuilder name = new StringBuilder(scan.next());
        // Closing Scanner after the use, to prevent looping.
        scan.close();
        return name;
    }
}
