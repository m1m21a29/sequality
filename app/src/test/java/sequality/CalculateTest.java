package sequality;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculateTest {
@Test
public void testSum() {
Calculate calculate = new Calculate();
int expected = 5;
assertEquals(expected, calculate.sum(2, 3));
}

@Test
public void testAve() {
Calculate calculate = new Calculate();
double expected1= 2.5;
assertEquals(expected1 calculate.ave(2, 3));
}

}
