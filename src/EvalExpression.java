import java.util.LinkedList;

public class EvalExpression extends Operators {


    //Evaluate the expression with array of input string

    public Double evalexpr(String[] tokens) throws IllegalArgumentException
    {
        LinkedList<Double> list = new LinkedList<Double>();
        for(String token : tokens)
        {
            if (isOperator(token))
            {

                if(token.equals("%")|token.equals("!")) //for unary operators
                {
                    list.push(Calculate.calculate(token, list.pop(),0.0));
                }
                else if(list.size() > 1){	//for binary operators
                    list.push(Calculate.calculate(token, list.pop(), list.pop()));
                }else
                {
                    System.out.println("Not enough operands");
                    throw new IllegalArgumentException("Invalid Expression...Please restart the program");
                }
            }
            else if(token.matches(".*\\d")){ //check whether input is a digit or invalid operator
                list.push(Double.parseDouble(token));
            }else
            {
                System.out.println("Unsupported data found.");
                throw new IllegalArgumentException("Aborted...Please restart the program");
            }

        }
        if(list.size() > 1){
            System.out.println("Not enough or Invalid operators");
            throw new IllegalArgumentException("Invalid Expression...Please restart the program");
        }
        return list.pop();
    }

}
