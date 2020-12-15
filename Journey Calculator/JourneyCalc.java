import java.util.Scanner;

public class JourneyCalc {

  public static void main (String [] args) {
    Scanner input = new Scanner (System.in);

    System.out.print("Initial Velocity (u): ");
    double u = input.nextDouble();

    System.out.print("Time of Travel (t): ");
    double t = input.nextDouble();

    System.out.print("Acceleration (a): ");
    double a = input.nextDouble();

    MovingObject object = new MovingObject (u, t, a);

    object.printDisplacement();
    object.printFinalVelocity();
  }

}
