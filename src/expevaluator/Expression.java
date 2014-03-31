package expevaluator;

interface Expression<T> {

    T evaluate();
}

class Constant<T> implements Expression{

    private final T value;

    public Constant(T value) {
        this.value = value;
    }

    @Override
    public T evaluate() {
        return value;
    }

}

abstract class Operation<T> implements Expression {

    public T left;
    public T right;

    @Override
    public abstract T evaluate();

}

class Addition<T> extends Operation {

    public Addition(Constant left, Constant right) {
        super.left =  left.evaluate();
        super.right = right.evaluate();
    }

    @Override
    public T evaluate() {
        return (T) new IntIntAddition().evaluate((Integer)super.left,(Integer)super.right);
    }
    
}

class IntIntAddition {

    public IntIntAddition() {
    }

    public Integer evaluate(Integer left, Integer right) {
        return left + right;
    }

}

/*class Multiplication extends Operation{

 public Multiplication(Constant left, Constant right) {
 super.left = left;
 super.right = right;
 }

 @Override
 public Object evaluate() {
 return left.evaluate() * right.evaluate();
 }
 }*/
