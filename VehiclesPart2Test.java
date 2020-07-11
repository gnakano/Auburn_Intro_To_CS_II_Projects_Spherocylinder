import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;
// import java.io.File;
import java.io.FileNotFoundException;

/** 
 * VehiclesPart2Test - tests VehiclesPart2Test driver.
 * 
 *
 * Project 5
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 10, 2019
 */

public class VehiclesPart2Test {


/** Tests VehiclesPart2Main. 
* 
* @throws FileNotFoundException - File Not Found exception.
*/
   @Test public void testVehiclesPart2Main() throws FileNotFoundException {
   // test constructor Vehicle.resetVehicleCount();
      VehiclesPart2 vPart2Obj = new VehiclesPart2(); 
      Vehicle.resetVehicleCount();
      String[] args = {"vehicles1.txt"}; 
      VehiclesPart2.main(args);
      Assert.assertEquals(8, Vehicle.getVehicleCount());
   }


}
