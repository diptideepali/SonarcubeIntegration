package sonarcubeIntegration.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import sonarcubeIntegration.Calculator;

public class CalculatorJunitTest {

    Calculator calc = new Calculator();
    @Test
    public void add()
    {
        int resp=calc.add(2,3);
        Assert.assertEquals(5,resp);
    }
    @Ignore
    @Test
    public void multi()
    {
        int resp=calc.multi(2,5);
        Assert.assertEquals(10,resp);
    }

}
