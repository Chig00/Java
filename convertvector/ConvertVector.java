import java.util.Scanner;

public class ConvertVector {
  public static void main(String[] args) {
    double x;
    double y;
    double r;
    double t;
    String mode;
    while (true) {
      System.out.print("Rectangular to polar (p), polar to rectangular (r), or quit (any other input)? ");
      mode = new Scanner(System.in).nextLine();
      if (mode.equals("p")) {
        System.out.print("x = ");
        x = new Scanner(System.in).nextDouble();
        System.out.print("y = ");
        y = new Scanner(System.in).nextDouble();
        r = Math.sqrt(x * x + y * y);
        t = Math.toDegrees(Math.atan(y / x));
        System.out.print("r = ");
        System.out.println(r);
        System.out.print("t = ");
        System.out.println(t);
      }
      else if (mode.equals("r")) {
        System.out.print("r = ");
        r = new Scanner(System.in).nextDouble();
        System.out.print("t = ");
        t = new Scanner(System.in).nextDouble();
        x = r * Math.cos(Math.toRadians(t));
        y = r * Math.sin(Math.toRadians(t));
        System.out.print("x = ");
        System.out.println(x);
        System.out.print("y = ");
        System.out.println(y);
      }
      else {
        break;
      }
    }
  }
}
