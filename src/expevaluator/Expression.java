package expevaluator;

public class Expression {

    private char Operation;
    private double value;
    private Expression left;
    private Expression right;

    public Expression(char Operation, double value) {
        this.Operation = Operation;
        this.value = value;
    }

    public Expression(char Operation, Expression left, Expression right) {
        this.Operation = Operation;
        this.left = left;
        this.right = right;
    }
    
    
    
    public double evaluate() {
        switch (Operation) {
            case '#':
                return value;
            case '+':
                return left.evaluate() + right.evaluate();
            case '*':
                return left.evaluate() * right.evaluate();
        }
        return 0;
    }
}
