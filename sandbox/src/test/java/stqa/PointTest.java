package stqa;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by tatyanas on 3/31/17.
 */
public class PointTest {

  @Test
  public void testPointDistance1() {
    Point p1 = new Point(3, 3);
    Point p2 = new Point(6, 6);
    Assert.assertEquals(p1.distance(p2), 4.242640687119285);
  }

  @Test
   public void testPointDistance2() {
    Point p1 = new Point(4, 6);
    Point p2 = new Point(6, 8);
    Assert.assertEquals(p1.distance(p2), 2.8284271247461903);
    }

  @Test
  public void testPointDistance3(){
    Point p1 = new Point(8,8);
    Point p2 = new Point(9,9);
    Assert.assertEquals(p1.distance(p2), 1.4142135623730951);



  }
}
