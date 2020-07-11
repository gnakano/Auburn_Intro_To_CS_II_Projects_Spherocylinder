import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/** 
 * VehiclesPart3Test - test for VehiclesPart3.
 *     
 * Project 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 19, 2019
 */

public class VehiclesPart3Test {



/** Test no command line args for file. */
   @Test public void testNoCommandLineArgsForReadVehicleFile() {
      Vehicle.resetVehicleCount();
      VehiclesPart3 vPart3Obj = new VehiclesPart3(); 
      String[] args = {};
      VehiclesPart3.main(args);
      Assert.assertEquals("Testing if nothing is entered in readVehicleFile() "
                     + "in UseTaxList",
                     0, Vehicle.getVehicleCount());
   }

/** Test valid file for readVehicleFile.  */
   @Test public void testValidFileForReadVehicleFile() {
      Vehicle.resetVehicleCount();
      VehiclesPart3 vPart3Obj = new VehiclesPart3(); 
      String[] args = {"vehicles2.txt"};
      VehiclesPart3.main(args);
      Assert.assertEquals("Testing if nothing is entered in readVehicleFile() "
                     + "in UseTaxList",
                     9, Vehicle.getVehicleCount());
   }

/** Test invalid file for readVehicleFile.  */
   @Test public void testInvalidFileForReadVehicleFile() {
      Vehicle.resetVehicleCount();
      VehiclesPart3 vPart3Obj = new VehiclesPart3(); 
      String[] args = {"vehicles3.txt"};
      VehiclesPart3.main(args);
      Assert.assertEquals("Testing if nothing is entered in readVehicleFile() "
                     + "in UseTaxList",
                     0, Vehicle.getVehicleCount());
   }


}
