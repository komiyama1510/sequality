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
  public void testSum2() {
    Calculate calculate = new Calculate();
    int expected = 55;
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum = calculate.sum(sum, i);
    }
    assertEquals(expected, sum);
  }

  @Test
  public void testSum_odd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, sum);
  }

  @Test
  public void testSum_even() {
    Calculate calculate = new Calculate();
    int expected = 30;
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        sum = calculate.sum(sum, i);
      }
    }
    assertEquals(expected, sum);
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(5, 2), 0);
  }
}
