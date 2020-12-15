import java.util.Scanner;

public class ProjectileMotion {

  public static void main (String [] args) {
    Scanner input = new Scanner (System.in);

    System.out.print("Initial Velocity: ");
    double initVel = input.nextDouble();

    System.out.print("Initial Angle: ");
    double initAng = input.nextDouble();

    if (initVel <= 0 || initAng >= 90 || initAng <= 0) {
      System.out.println("Invalid input.");
      return;
    }

    new Trajectory (new Projectile (initVel, initAng));
  }

}
