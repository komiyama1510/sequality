package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int average(int sum, int n) {
    return sum / n;
  }

  public static void main(String[] args) {

    int sum1 = new Calculate().sum(2, 3);
    int sum2 = 0;
    for (int i = 1; i <= 55; i++) {
      sum2 = new Calculate().sum(sum2, i);
    }

    int sum_odd = 0;
    int sum_even = 0;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        
      }
    }


    System.out.println(new App().getGreeting());
  }

}
