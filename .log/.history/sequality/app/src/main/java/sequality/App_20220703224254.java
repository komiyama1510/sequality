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

    Calculate calc = new Calculate();

    int sum1 = calc.sum(2, 3);
    double ave1 = calc.average(sum1, 2);
    System.out.println("Sum of 2 and 3 is " + sum1 + ".Average is " + ave1 + ".");

    int sum2 = calc.sum_all(1,10);
    double ave2 = calc.average(sum2, n);
    System.out.println("Sum of 1 to 10 is " + sum2 + ".Average is " + ave2 + ".");

    int start = 1;
    int end = 10;
    System.out.println(
        "Sum of odd of 1 to 10 is " + calc.sum_odd(start, end) + ".Sum of even is " + calc.sum_even(start, end) + ".");
  }

}
