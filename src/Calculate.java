
public class Calculate {

    // performs the desired mathematical operation based on operator

    public static Double calculate(String op, Double e1, Double e2) throws IllegalArgumentException {

        double result = 0.0;

        //using switch case
        switch (op) {
            case "+":
                result = e1 + e2;
                break;

            case "-":
                result = e2 - e1;
                break;

            case "*":
                result = e1 * e2;
                break;

            case "/":
                result = e2 / e1;
                break;

            case "^":
                result = Math.pow(e2, e1);
                break;

            case "%":
                result = e1/100;
                break;

            case "!":
                if(e1==0){
                    result= 1.0;
                    break;
                }
                if(e1 < 0){
                    System.out.println("Negative numbers not allowed for factorial operator");
                    throw new IllegalArgumentException("Program Aborted...");

                }

                double fact=1.0;
                for(double i=1;i<=e1;i++)
                {
                    fact=fact*i;
                }
                result= fact;
                break;

            default:
                System.out.println("Invalid operator");

        }
        return result;

    }

//using if else statements

        /*if(op.equals("+")) {
            return e1 + e2;
        }
        else if(op.equals("-")) {
            return e2 - e1;
        }
        else if(op.equals("*")) {
            return e1 * e2;
        }
        else if(op.equals("/")) {
            return e2 / e1;
        }
        else if(op.equals("^")) {
            return Math.pow(e2, e1);
        }
        else if(op.equals("%")) {
            return e1/100;
        }
        else if(op.equals("!")) {

            if(e1==0){
                return 1.0;
            }
            if(e1 < 0){
                System.out.println("Negative numbers not allowed for factorial operator");
                throw new IllegalArgumentException("Program Aborted...");

            }
            double fact=1.0;
            for(double i=1;i<=e1;i++)
            {
                fact=fact*i;
            }
            return fact;
        }
        return 0.0;*/

}
