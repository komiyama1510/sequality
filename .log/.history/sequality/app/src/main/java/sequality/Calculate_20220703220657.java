package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sum_odd(int start, int end) {

    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 1) {
        sum = sum + i;
      }
    }
    return sum;
  }

  public int sum_even(int start, int end) {

    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 1) {
        sum = sum + i;
      }
    }
    return sum;
  }

  public double average(int sum, int n) {
    return sum / (double) (n);
  }

}
