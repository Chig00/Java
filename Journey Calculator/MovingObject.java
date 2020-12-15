public class MovingObject {

  private double s;
  private double v;

  public MovingObject (double u, double t, double a) {
    s = u*t + a*t*t/2;
    v = u + a*t;
  }

  public void printDisplacement () {
    System.out.println("Displacement (s): " + s);
  }

  public void printFinalVelocity () {
    System.out.println("Final Velocity (v): " + v);
  }

}
