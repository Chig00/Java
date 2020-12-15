public class Projectile {

  public static final double G = -9.80665;

  private double vertVel;
  private double horiVel;
  private double flightTime;
  private double horiDisp;
  private double vertDisp;

  public Projectile (double initVel, double initAng) {
    vertVel = initVel * Math.sin(Math.toRadians(initAng));
    horiVel = initVel * Math.cos(Math.toRadians(initAng));

    flightTime = -2 * vertVel / G;
    horiDisp = horiVel * flightTime;
    vertDisp = vertVel * flightTime/2 + G * Math.pow(flightTime/2, 2) / 2;

    System.out.println("Time of flight: " + flightTime);
    System.out.println("X axis recross: " + horiDisp);
    System.out.println("Max height: " + vertDisp);
  }

  public double [] getValues () {
    double [] values = {
      horiDisp,
      vertDisp,
      horiVel,
      vertVel,
      flightTime
    };

    return values;
  }

}
