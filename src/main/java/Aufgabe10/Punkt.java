package Aufgabe10;

public class Punkt {

    private double x;

    public int getX() {
        return (int) x;
    }

    public int getY() {
        return (int) y;
    }

    private double y;

   Punkt (double x, double y){
    this.x = x;
    this.y = y;
   }

   void drehen(double phi){
       this.x = x * Math.cos(phi) - y * Math.sin(phi);
       this.y = x * Math.sin(phi) + y * Math.cos(phi);
   }


}
