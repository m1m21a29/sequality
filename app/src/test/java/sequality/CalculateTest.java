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
public void testAve() {
Calculate calculate = new Calculate();
double expected = 6;
assertEquals(expected, calculate.ave(2, 3));
}
}
