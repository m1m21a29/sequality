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
public void testsumall() {
Calculate calculate = new Calculate();
int expected = 56;
assertEquals(expected, calculate.sumall(1, 10));
}

}
