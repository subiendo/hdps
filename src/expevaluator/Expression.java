package expevaluator;

interface Expression {

    double evaluate();
}

class Constant implements Expression {

    private double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }

}

class Operation implements Expression {

    private char operation;
    private Expression left;
    private Expression right;

    @Override
    public double evaluate() {
        switch (operation) {
            case '+':
                return left.evaluate() + right.evaluate();
            case '*':
                return left.evaluate() * right.evaluate();
        }
        return 0;
    }

}
