
public class Operators {
    // List of supported operators
    public static final String[] Operators = { "+", "-", "*", "/","^","%","!"};

    // Check if a token is operator
    public Boolean isOperator(String token) {
        for(String op : Operators) {
            if(op.equals(token)) {
                return true;
            }
        }
        return false;
    }

}
