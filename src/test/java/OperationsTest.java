import calculatorOOP.operations.Operations;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperationsTest {

    private Operations oper ;
    private float num1;
    private float num2;

    @Before
    public void beforeTest() {
        oper = new Operations();
        num1 = 1;
        num2 = 2;
        oper.setVar1(num1);
        oper.setVar2(num2);
    }

    @Test
    public void operSumTest(){
        Assert.assertEquals(num1+num2, oper.sum(), 0);
    }

    @Test
    public void operSubTest(){
        Assert.assertEquals(num1-num2, oper.sub(), 0);
    }

    @Test
    public void operMultTest(){
        Assert.assertEquals(num1*num2, oper.mult(), 0);
    }

    @Test
    public void operDivTest(){
        Assert.assertEquals(num1/num2, oper.div(), 0);
    }
}