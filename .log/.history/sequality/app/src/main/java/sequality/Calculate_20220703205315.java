package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int average(int sum, int n) {
    return sum / n;
  }

  public static void main(String[] args) {

    int sum1 = sum(2, 3);

    System.out.println(new App().getGreeting());
  }

}
