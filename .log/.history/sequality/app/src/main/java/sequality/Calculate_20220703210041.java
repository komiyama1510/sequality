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
    for (int i = 1; i < 55; i++) {
      sum2 = Calculate().sum(sum2, i);
    }


    System.out.println(new App().getGreeting());
  }

}