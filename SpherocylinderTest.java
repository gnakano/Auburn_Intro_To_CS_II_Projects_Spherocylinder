import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/** 
 * SpherocylinderTest - Tests Spherocylinder objects.
 * Running 8 tests to test methods
 *
 * Project 3
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version March 14, 2019
 */
public class SpherocylinderTest {

   /**  tests that label gets set. */
   @Test public void testLabel() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      s1.toString();
      Assert.assertEquals("Testing label gets set", 
                        "Small Example", s1.getLabel());
   }

      /**  tests that radius gets set. */
   @Test public void testRadius() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals("Tesing radius gets Set", 
                           0.5, s1.getRadius(), .000001);
   }
   /** Tests to see if cylinderHeight gets set. */
   @Test public void testCylinderHeight() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals("Testing cylinderHeight gets set", 
                           0.25, s1.getCylinderHeight(), .000001);
   }
   
   /** Tests to see if circumference gets calculated correctly. */
   @Test public void testCircumference() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals("Testing circumference", 
                              3.142, s1.circumference(), .001);
   }
   
   /** Tests to see if surface gets calculated correctly. */
   @Test public void testSurfaceArea() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals("Testing surfaceArea", 
                              3.927, s1.surfaceArea(), .00001);  
   }
   
   /** Tests to see if volume gets calculated correctly. */
   @Test public void testVolume() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals("Testing volume",
                              0.72, s1.volume(), .0001);      
   }
   
   /** Tests getCount. */
   @Test public void testGetCount() {
      Spherocylinder.resetCount();
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals("Testing getCount", 1, Spherocylinder.getCount());
   }
   
   /** Tests resetCount. */
   @Test public void testResetCount() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder.resetCount();
      Assert.assertEquals("Testing resetCount", 0, Spherocylinder.getCount());
   }
   
   /** Tests setLabel. */
   @Test public void testSetLabel() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      s1.setLabel("Extra Small Example");
      Assert.assertEquals("Testing setLabel",
         "Extra Small Example", s1.getLabel());       
   }
   
   
   /** Tests setRadius. */
   @Test public void testSetRadius() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      s1.setRadius(0.2);
      Assert.assertEquals("Testing setRadius",
                        0.2, s1.getRadius(), .000001);
   }
   
   /** Tests setCylinderHeight. */
   @Test public void testSetCylinderHeight() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      s1.setCylinderHeight(0.15);
      Assert.assertEquals("Testing setCylinderHeight",
                        0.15, s1.getCylinderHeight(), .000001);
   }
   
   /** Tests equals.*/
   @Test public void testEquals() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals("Testing equals",
                              true, s1.equals(s2));
   }
   
   /** tests hashCode. */
   @Test public void testHashCode() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals("Test hashCode",
                           0, s1.hashCode());
   
   }
   
   
   /** tests compareTo equal. */
   @Test public void testCompareToEqual() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals("Testing compareTo is equal",
                              0, s1.compareTo(s2));
   }
   
   /** tests compareTo lessThan. */
   @Test public void testCompareToLess() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Assert.assertEquals("Testing compareTo is less",
                              -1, s1.compareTo(s2));
   }
   
   /** tests compareTo greaterThan. */
   @Test public void testCompareToGreater() {
      Spherocylinder s1 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s2 = new Spherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals("Testing compareTo greater",
                           1, s1.compareTo(s2));
   }
   
   /** tests labelIn for null. */
   @Test public void setLabelNull() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      s1.setLabel(null);
      Assert.assertEquals("Testing setLabel is null",
         "Small Example", s1.getLabel());
   }
   
   /** tests setRadius in for less than Zero. */
   @Test public void setRadiusLessZero() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      s1.setRadius(-1);
      Assert.assertEquals("Testing for setRadius for Zero",
                              0.5, s1.getRadius(), .000001);
   }
   
   /** tests setCylinderHeight for less than zero. */
   @Test public void setCylinderHeight() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      s1.setCylinderHeight(-1);
      Assert.assertEquals("Testing for setRadius for Zero",
                              0.25, s1.getCylinderHeight(), .000001);
   }

   
   /** Tests not same object.*/
   @Test public void testNotEquals() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      String s2 = new String("Small Example");
      Assert.assertEquals("Testing equals",
                              false, s1.equals(s2));
   }

   /** Tests same object but not equal in label.*/
   @Test public void testEqualsButNot1() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Assert.assertEquals("Testing equals",
                              false, s1.equals(s2));
   
   }
   
   /** Tests same object but not equal in radius.*/
   @Test public void testEqualsButNot2() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Small Example", 10.8, 10.1);
      Assert.assertEquals("Testing equals",
                              false, s1.equals(s2));
   
   }

   /** Tests same object but not equal in cylinder.*/
   @Test public void testEqualsButNot3() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Small Example", 0.5, 10.1);
      Assert.assertEquals("Testing equals",
                              false, s1.equals(s2));
   
   }

   
}
