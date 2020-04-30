import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {


    public static void main(String args[]) {

        String s = "madama";
        char sc[] = s.toCharArray();
        int i =0, n = s.length();
        while(i < sc.length/2){
            if(sc[i] != sc[n-i-1]){
                System.out.println("Not a palindrome");
                System.exit(1);
            }
            ++i;
        }
        System.out.println("Palindrome");


    }
}
N