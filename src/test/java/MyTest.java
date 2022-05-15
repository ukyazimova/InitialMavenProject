
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyTest {
    @DataProvider(name = "dataProviderForCalculations")
    public Object[][] dataProviderM(){
        Object[][] objects ={
                {5,5}
        };
        return objects;
    }
    @Test(groups = "incrementation", dataProvider ="dataProviderForCalculations" )
    public void calcIncrementation(int a, int b){
        System.out.println("The result after A+B is: "+ (a+b));
        Assert.assertEquals((a+b), 10,"Assertion for SUM equals 10");
    }

    @Test(groups = "decrement", dataProvider ="dataProviderForCalculations" )
    public void calcDecrement(int a, int b){
        System.out.println("The result after A-B is: "+ (a-b));
        Assert.assertEquals((a-b), 0,"Assertion for decremental equals 0");
    }
    @Test(groups = "multiply", dataProvider ="dataProviderForCalculations" )
    public void calcMultiply(int a, int b){
        System.out.println("The result after A*B is: "+ (a*b));
        Assert.assertEquals((a*b), 25,"Assertion for multiplying equals 25");
    }
    @Test(groups = "divide", dataProvider ="dataProviderForCalculations" )
    public void calcDivide(int a, int b){
        System.out.println("The result after A/B is: "+ (a/b));
        Assert.assertEquals((a/b), 1,"Assertion for divide equals 1");
    }
    @Test(groups = "module", dataProvider ="dataProviderForCalculations" )
    public void calcModule(int a, int b){
        System.out.println("The result after A%B is: "+ (a%b));
        Assert.assertEquals((a%b), 0,"Assertion for module equals 1");
    }
}
