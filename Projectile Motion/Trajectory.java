import java.util.Scanner;

public class Trajectory {

  private double projHoriDisp;
  private double projVertDisp;
  private double projHoriVel;
  private double projVertVel;
  private double projFlightTime;

  private double fixCoeff;
  private double xRecross;

  public Trajectory (Projectile proj) {
    double [] values = proj.getValues();
    projHoriDisp = values[0];
    projVertDisp = values[1];
    projHoriVel = values[2];
    projVertVel = values[3];
    projFlightTime = values[4];

    formulate();

    double horiDisp;

    while (true) {
      Scanner input = new Scanner (System.in);
      System.out.print("Horizontal Displacement: ");

      try {
        horiDisp = input.nextDouble();
      } catch (Exception error) {
        horiDisp = -1;
      }

      if (horiDisp == 0) {
        break;
      } else if (horiDisp < 0 || horiDisp >= xRecross) {
        System.out.println("Please use a legitimate number for input.");
      } else {
        printValues(horiDisp);
      }
    }
  }

  private void formulate () {
    xRecross = projHoriDisp;
    fixCoeff = -4*projVertDisp / Math.pow(xRecross, 2);
  }

  private void printValues (double horiDisp) {
    double vertDisp = fixCoeff * horiDisp * (horiDisp - xRecross);
    double totalDisp = Math.pow(Math.pow(horiDisp, 2) + Math.pow(vertDisp, 2), 0.5);
    double dispAng = Math.toDegrees(Math.atan(vertDisp / horiDisp));

    double horiVel = projHoriVel;
    double flightTime = horiDisp / horiVel;
    double vertVel = projVertVel + Projectile.G * flightTime;
    double totalVel = Math.pow(Math.pow(horiVel, 2) + Math.pow(vertVel, 2), 0.5);
    double velAng = Math.toDegrees(Math.atan(vertVel / horiVel));

    System.out.println("Vertical Displacement: " + vertDisp);
    System.out.println("Total Displacement: " + totalDisp);
    System.out.println("Displacement Angle: " + dispAng);
    System.out.println("Horizontal Velocity: " + horiVel);
    System.out.println("Vertical Velocity: " + vertVel);
    System.out.println("Total Velocity: " + totalVel);
    System.out.println("Velocity Angle: " + velAng);
    System.out.println("Time elapsed: " + flightTime);
  }

}
