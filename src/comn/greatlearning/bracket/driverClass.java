package comn.greatlearning.bracket;

import static comn.greatlearning.bracket.bracketValidation.BalanceChecker;
import java.util.*;
public class driverClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the input :");
        String expression = sc.nextLine(); // take bracket string input from user
        if(BalanceChecker(expression)) // invoke balancechecker function and get flag value as result
            System.out.println("The entered String has Balanced Brackets\n");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets");
    }
}
