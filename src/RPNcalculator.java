
/* Program for Basic Reverse Polish Notation(RPN) Calculator  */

import java.util.Scanner;

//Driving Code

public class RPNcalculator
{

    public static void main(String args[]) {

        //Take the input postfix expression from user and display result

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Basic RPN Calc Supported Operators are:(+ - * / ^ % !)");
            System.out.println("Please Enter the RPN expression with a space between each value:");
            while (sc.hasNext()) {
                String input = sc.nextLine();
                EvalExpression e1 = new EvalExpression();
                System.out.println("Answer = " + e1.evalexpr(input.trim().split("\\s+")));
                System.out.println("You can continue here:");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}