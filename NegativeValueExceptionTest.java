import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/** 
 * NegativeValueException - tests for Negative inputs.
 * 
 *
 * Project 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
 */

public class NegativeValueExceptionTest {

   /** test for negative exception. */
   @Test public void negativeValueExceptionTest() { 
      boolean thrown = false;
      try {
         Car car = new Car("Jackson, Bo", "2012 Toyota Camry", -25000, false); }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertTrue("Expected NegativeValueException to be thrown.",
         thrown); /* or alternatively: */
      Assert.assertEquals("Expected NegativeValueException to be thrown.", 
                           true, thrown);
   }


}
