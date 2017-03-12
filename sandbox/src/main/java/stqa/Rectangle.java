package stqa;

/**
 * Created by tatyanas on 3/10/17.
 */
public class Rectangle {

  public double a;
  public double b;

  public Rectangle(double a, double b){

    this.a = a;
    this.b = b;
  }

  public double area(){
    return this.a * this.b;
  }
}
