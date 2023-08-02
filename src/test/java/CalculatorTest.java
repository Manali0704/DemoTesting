import App.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		
			
			int exp = 30;
			Calculator cal = new Calculator();
			int act = cal.add(10, 20);
			Assert.assertEquals(exp, act);
	}

	@Test
	
	public void test1() {
		
		System.out.println("Di it method for a trial");
	}
	
	
}
