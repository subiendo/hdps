package expevaluator;

import junit.framework.Assert;
import org.junit.Test;

public class ExpEvaluatorTest {
    
    @Test
    public void testMain() {
        Assert.assertEquals(1.5, new Constant(1.5).evaluate());
        Assert.assertEquals(1, new Constant(1).evaluate());
        Assert.assertEquals(6, new Addition(new Constant(3), new Constant(3)).evaluate());
        Assert.assertEquals(6.0, new Addition(new Constant(3), new Constant(3.0)).evaluate());
        Assert.assertEquals(6.0, new Addition(new Constant(3.0), new Constant(3)).evaluate());
        Assert.assertEquals(6.0, new Addition(new Constant(3.0), new Constant(3.0)).evaluate());
        //Assert.assertEquals(9.0, new Multiplication(new Constant(3.0), new Constant(3.0)).evaluate());
    }
}
