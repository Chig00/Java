/**
 * Projectile Motion Script
 *
 * A projectile is created from user input (initial velocity and angle).
 *
 * Then the projectile is used to create a trajectory (a quadratic equation)
 * to use to find stats at every point in motion.
 */
 
import java.util.Scanner;

class ProjectileMotion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Initial Velocity:");
    double initVelocity = sc.nextDouble();
    
    System.out.println("Initial Angle:");
    double initAngle = sc.nextDouble();
    
    Projectile projectile = new Projectile(initVelocity, initAngle);
    Trajectory trajectory = new Trajectory(projectile);
    
    while (true) {
      System.out.println("Horizontal displacement:");
      double hDisplacement = sc.nextDouble();
      trajectory.showValues(hDisplacement);
    }
  }
}

class Projectile {
  double vVelocity;
  double hVelocity;
  double timeOfFlight; // Time until the projectile returns to base height.
  double vDisplacement; // Max height above the base point.
  double hDisplacement; /* Displacement of the projectile from the
                           base point when it returns to base height. */
  
  Projectile(double initVelocity, double initAngle) {
    vVelocity = Math.sin(Math.toRadians(initAngle)) * initVelocity;
    timeOfFlight = vVelocity / 4.903325;
    vDisplacement = vVelocity * timeOfFlight / 2
                - 4.903325 * Math.pow(timeOfFlight / 2, 2);
    
    hVelocity = Math.cos(Math.toRadians(initAngle)) * initVelocity;
    hDisplacement = hVelocity * timeOfFlight;
  }
}

class Trajectory {
  Projectile projectile;
  double fixCoefficient;
  
  Trajectory(Projectile projectileNew) {
    projectile = projectileNew;
    fixCoefficient = 4 * projectile.vDisplacement / Math.pow(projectile.hDisplacement, 2);
  }
    
  void showValues(double hDisplacement) {
    System.out.println("Vertical displacement: "
                       + fixCoefficient * hDisplacement * (projectile.hDisplacement - hDisplacement));
  }
}