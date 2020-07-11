import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/** 
 * VehiclesPart1Test - tests VehiclesPart1Test class methods.
 * 
 *
 * Project 4
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 4, 2019
 */

public class VehiclesPart1Test {


   /** Test Vehicles objects. */
   @Test public void testVehiclesObj() {
   
      VehiclesPart1 vp1 = new VehiclesPart1(); 
      Vehicle.resetVehicleCount();
      VehiclesPart1.main(null); 
      Assert.assertEquals("Vehicle.vehicleCount should be 16. ",
                        16, Vehicle.getVehicleCount());
   }
}
