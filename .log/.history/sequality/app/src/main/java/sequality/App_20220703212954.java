/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    Calculate calculate

    int sum1 = new Calculate().sum(2, 3);
    double ave1 = new Calculate().average(sum1, 2);
    System.out.println("Sum of 2 and 3 is " + sum1 + ".Average is " + ave1 + ".");

    int sum2 = 0;
    int n = 10;
    for (int i = 1; i <= n; i++) {
      sum2 = new Calculate().sum(sum2, i);
    }
    double ave2 = new Calculate().average(sum2, n);
    System.out.println("Sum of 1 to 10 is " + sum2 + ".Average is " + ave2 + ".");

    int sum_odd = 0;
    int sum_even = 0;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        sum_even = new Calculate().sum(sum_even, i);
      } else {
        sum_odd = new Calculate().sum(sum_odd, i);
      }
    }

    System.out.println("Sum of odd of 1 to 10 is " + sum_odd + ".Sum of even is " + sum_even + ".");
  }

}
