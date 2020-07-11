import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/** 
 * TruckTest - tests Truck class methods.
 * 
 *
 * Project 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
 */
public class TruckTest {


/** tests Truck Class getResetVehicleCount() when zero Truck.
* objects are created. 
*
* @throws NegativeValueException - for negative valueIn or tonsin
*/
   @Test public void testReset() throws NegativeValueException {
      Vehicle.resetVehicleCount();
      Assert.assertEquals("Test reset",
                     0, Truck.getVehicleCount());
   }

/** Test Truck class getTons. 
*
* @throws NegativeValueException - for negative valueIn or tonsIn
*/
   @Test public void testGetTons() throws NegativeValueException {
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverad0", 
                                 30000, false, 1.5);
      Assert.assertEquals("Tests Truck object getTons()",
                     1.5, truck1.getTons(), 0.01);
   }
   
   /** Test Truck class setTons.  
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testSetTons() throws NegativeValueException {
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverad0", 
                                 30000, false, 1.5);
      truck1.setTons(2.5);
      Assert.assertEquals("Tests Truck Object setTons()",
                           2.5, truck1.getTons(), 0.01);
   }
   
   /** tests Truck class useTax() if Truck object uses Alt Fuel.
   * and exceeds LARGE_TRUCK_TAX_RATE. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testUseTaxAltFuelLargeTruck() 
      throws NegativeValueException {
      Truck truck2 = new Truck("Williams, Sam", "2010 Chevy Mack",
                                  40000, true, 2.5);
      Assert.assertEquals("Tests Truck class useTax() if truck object uses Alt "
                           + "Fuel uses LARGE_TRUCK_TAX_RATE",
                           1600.00, truck2.useTax(), 0.001);
   }
   
   
   /**  tests Truck class useTax() if Truck object uses Alt Fuel.
   * and does not exceed LARGE_TRUCK_TAX_RATE. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testUseTaxAltFuelNoLargeTruck() 
      throws NegativeValueException {
      Truck truck4 = new Truck("Christian, Nina", "2018 Mercedes", 
                                 35000, true, 1.0);
      Assert.assertEquals("Tests Truck class useTax() if truck object "
                           + "uses Alt Fuel does not use LARGE_TRUCK_TAX_RATE",
                           350.00, truck4.useTax(), 0.001);
   }
   
   
/**  tests Truck class useTax() if Truck object doesn't use Alt Fuel.
   * and does not exceed LARGE_TRUCK_TAX_RATE. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testUseTaxNoAltFuelNoLargeTruck() 
      throws NegativeValueException {
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverad0", 
                                 30000, false, 1.5);
      Assert.assertEquals("Tests Truck class useTax() if doesn't use Alt Fuel "
                           + "and doesn't use LARGE_TRUCK_TAX_RATE",
                           600.00, truck1.useTax(), 0.001);
   }

/**  tests Truck class useTax() if Truck object doesn't use Alt Fuel.
   * and does exceed LARGE_TRUCK_TAX_RATE. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn*/
   @Test public void testUseTaxNoAltFuelLargeTruck() 
      throws NegativeValueException {
      Truck truck3 = new Truck("Nakano, Genij", "2018 GMC 1500", 
                           50000, false, 2.5);
      Assert.assertEquals("Tests Truck class useTax() if doesn't use Alt Fuel "
                           + "and does use LARGE_TRUCK_TAX_RATE",
                           2500.00, truck3.useTax(), 0.001);
   } 
   
   /** tests Truck class toSTring() if Truck object uses Alt Fuel.
   * and exceeds LARGE_TRUCK_TAX_RATE. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn*/
   @Test public void testToStringAltFuelLargeTruck() 
      throws NegativeValueException {
      Truck truck2 = new Truck("Williams, Sam", "2010 Chevy Mack", 
                           40000, true, 2.5);
      Assert.assertEquals("Tests Truck class toString() if truck object uses "
                           + "Alt Fuel and uses LARGE_TRUCK_TAX_RATE",
                           "Williams, Sam: Truck 2010 Chevy Mack "
                           + "(Alternative Fuel)\n"
                           + "Value: $40,000.00 Use Tax: $1,600.00\n"
                           + "with Tax Rate: 0.01 Large Truck Tax Rate: 0.03",
                           truck2.toString());
   
   }
   
   /**  tests Truck class toString() if Truck object uses Alt Fuel.
   * and does not exceed LARGE_TRUCK_TAX_RATE. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testToStringAltFuelNoLargeTruck() 
      throws NegativeValueException {
      Truck truck4 = new Truck("Christian, Nina", "2018 Mercedes", 
                           35000, true, 1.0);
      Assert.assertEquals("Tests Truck class toString() if truck object "
                           + "uses Alt Fuel does not use LARGE_TRUCK_TAX_RATE",
                           "Christian, Nina: Truck 2018 "
                           + "Mercedes (Alternative Fuel)\n"
                           + "Value: $35,000.00 Use Tax: $350.00\n"
                           + "with Tax Rate: 0.01",
                           truck4.toString());
   }
   
   /**  tests Truck class toString() if Truck object doesn't use Alt Fuel.
   * and does not exceed LARGE_TRUCK_TAX_RATE. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testToStringNoAltFuelNoLargeTruck() 
      throws NegativeValueException {
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado", 
                           30000, false, 1.5);
      Assert.assertEquals("Tests Truck class toString() "
                           + "if truck object does not use Alt Fuel "
                           + "does not use LARGE_TRUCK_TAX_RATE",
                           "Williams, Jo: Truck 2012 Chevy Silverado\n"
                           + "Value: $30,000.00 Use Tax: $600.00\n"
                           + "with Tax Rate: 0.02",
                           truck1.toString());
   }
   
   /**  tests Truck class toString() if Truck object doesn't use Alt Fuel.
   * and does exceed LARGE_TRUCK_TAX_RATE. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testToStringNoAltFuelLargeTruck() 
      throws NegativeValueException {
      Truck truck3 = new Truck("Nakano, Genij", "2018 GMC 1500", 
                           50000, false, 2.5);
      Assert.assertEquals("Tests Truck class toString() "
                           + "if truck object does not use Alt Fuel "
                           + "does use LARGE_TRUCK_TAX_RATE",
                           "Nakano, Genij: Truck 2018 GMC 1500\n"
                           + "Value: $50,000.00 Use Tax: $2,500.00\n"
                           + "with Tax Rate: 0.02 Large Truck Tax " 
                           + "Rate: 0.03",
                           truck3.toString());       
   
   }
   
   /** Tests Truck class getOwner(). 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testGetOwner() 
      throws NegativeValueException {
      Truck truck1 = new Truck("Nakano, Genji", "2012 Chevy Silverad0", 
                                 30000, false, 1.5);
      Assert.assertEquals("Tests Truck class getOwner().",
                        "Nakano, Genji",
                        truck1.getOwner());                              
                                 
   }
   
   /** Tests Truck class setOwner(). 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testSetOwner() throws NegativeValueException {
      Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, 1.5);
      truck1.setOwner("Larsson, Zara");
      Assert.assertEquals("Tests Truck class setOwner().",
                        "Larsson, Zara",
                        truck1.getOwner());                              
                                 
   }

   /** Tests Truck class getYearMakeModel(). 
   *
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testGetYearMakeModel() throws NegativeValueException {
      Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, 1.5);
      Assert.assertEquals("Tests Truck class getYearMakeModel().",
                        "2018 Toyota Tacoma",
                        truck1.getYearMakeModel()); 
   }
   
   /** Tests Truck class setYearMakeModel(). 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testSetYearMakeModel() 
      throws NegativeValueException {
      Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, 1.5);
      truck1.setYearMakeModel("2018 Chevy Colorado"); 
      Assert.assertEquals("Tests setYearMakeModel()",
                           "2018 Chevy Colorado",
                           truck1.getYearMakeModel());
   }
   
   /** Tests Truck class getValue(). 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testGetValue() throws NegativeValueException {
      Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, 1.5);
      Assert.assertEquals("Tests Truck class getValue().",
                        30000.00,
                        truck1.getValue(), 0.001); 
   }

   /** Tests Truck class setValue(). 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testSetValue() throws NegativeValueException {
      Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, 1.5);
      truck1.setValue(45000);
      Assert.assertEquals("Tests Truck class setValue().",
                        45000.00,
                        truck1.getValue(), 0.001);
   }

   /** Tests Truck class getAlternativeFuel() if false. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testGetAlternativeFuelFalse() 
      throws NegativeValueException {
      Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, 1.5);
      Assert.assertEquals("Tests Truck class getAlternativeFuel() if false.",
                        false, truck1.getAlternativeFuel());
   }
   
   /** Tests Truck class getAlternativeFuel() if true. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testGetAlternativeFuelTrue() 
      throws NegativeValueException {
      Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, true, 1.5);
      Assert.assertEquals("Tests Truck class getAlternativeFuel() if true",
                        true, truck1.getAlternativeFuel());
   }
   
   /** Tests Truck class setAlternativeFuel() from true to false.
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn 
   */
   @Test public void testSetAlternativeFuelTrueToFalse() 
      throws NegativeValueException {
      Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, true, 1.5);
      truck1.setAlternativeFuel(false);
      Assert.assertEquals("Tests Truck class setAlternativeFuel() "
                           + "from true to false.",
                        false, truck1.getAlternativeFuel()); 
   
   } 
   
   /** Tests Truck class setAlternativeFuel() from false to true. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testSetAlternativeFuelFalseToTrue() 
      throws NegativeValueException {
      Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, 1.5);
      truck1.setAlternativeFuel(true);
      Assert.assertEquals("Tests Truck class setAlternativeFuel() "
                           + "from false to true.",
                           true, truck1.getAlternativeFuel());
   
   } 
   
   /** Tests Truck Class vehicleCount() if zero objects. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testVehicleCountZero() throws NegativeValueException {
      Truck.resetVehicleCount();
   
      Assert.assertEquals("Tests Vehicle count when there is no objects",
                        0, Truck.getVehicleCount());
   } 
   
   /** Tests Truck Class getVehicleCount() if there are multiple .
   * truck objects. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testVehicleCountMultiple() throws NegativeValueException {
      Truck.resetVehicleCount();
      Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, 1.5);
      Truck truck3 = new Truck("Nakano, Genij", "2018 GMC 1500", 
                           50000, false, 2.5);
      Truck truck2 = new Truck("Williams, Sam", "2010 Chevy Mack", 
                           40000, true, 2.5);
      Truck truck4 = new Truck("Christian, Nina", "2018 Mercedes", 
                                 35000, true, 1.0);
      Assert.assertEquals("Tests Truck objects if 4 Truck objects were created",
                        4, Truck.getVehicleCount());
   
   }
   
   /** Tests Truck class resetVehicleCount() after.
   *  multiple Truck objects are created. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testVehicleCountReset() throws NegativeValueException {
      Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, 1.5);
      Truck truck3 = new Truck("Nakano, Genij", "2018 GMC 1500", 
                           50000, false, 2.5);
      Truck truck2 = new Truck("Williams, Sam", "2010 Chevy Mack", 
                           40000, true, 2.5);
      Truck truck4 = new Truck("Christian, Nina", "2018 Mercedes", 
                                 35000, true, 1.0);
      Truck.resetVehicleCount();
      Assert.assertEquals("Tests Truck class resetVehicleCount() "
                           + "resets to zero",
                           0, Truck.getVehicleCount());
   }
   
   
   /** Test Truck class equals() if Truck objects are same. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testEqualsSameObject() throws NegativeValueException {
      Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, 1.5);
      Truck truck3 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, 1.5);
   
      Assert.assertEquals("Tests Truck class equals() if Truck objects "
                           + "are the same.",
                           true, truck1.equals(truck3));
   }
   
    /** Test Truck class equals() if Truck objects are not the same. 
    *
    * @throws NegativeValueException - for negative valueIn or tonsIn
    */
   @Test public void testEqualsDiffTruckObject() throws NegativeValueException {
      Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, 1.5);
      Truck truck3 = new Truck("Christian, Nina", "2018 Chevy Colorado", 
                                 35000, true, 2.5);
   
      Assert.assertEquals("Tests Truck class equals() if Truck objects "
                           + "are the different.",
                           false, truck1.equals(truck3));
   }
   
    /** Test Truck class equals() if non Truck object passed in. 
    *
    * @throws NegativeValueException - for negative valueIn or tonsIn
    */
   @Test public void testEqualsDiffObjects() throws NegativeValueException {
      Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, 1.5);
      String truck3 = "Christian, Nina, 2018 Chevy Colorado," 
                                 + " 35000, true, 2.5";
   
      Assert.assertEquals("Tests Truck class equals() if Truck objects "
                           + "are the different.",
                           false, truck1.equals(truck3));
   }
   
   /** Tests Truck class hashCode() for Truck Objects. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testHashCodeTruckObj() throws NegativeValueException {
      Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, 1.5);
      Truck truck3 = new Truck("Christian, Nina", "2018 Chevy Colorado", 
                                 35000, true, 2.5);
      Assert.assertEquals("Tests Truck class hashCode() with Truck objects",
                        true, truck1.hashCode() == truck3.hashCode());
   }
   
   /** Tests truck class hashCode() for Truck Object and other Ojbect. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testHashCodeDiffObj() throws NegativeValueException {
      Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, 1.5);
      String truck3 = "Christian, Nina, 2018 Chevy Colorado," 
                                 + " 35000, true, 2.5";
      Assert.assertEquals("Tests Truck class hashCode() with truck obj"
                           + " and another object",
                        false, truck1.hashCode() == truck3.hashCode());
   
   }
   
   /** tests truck object if negative valueIn is thrown in. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testNegativeValueIn() throws NegativeValueException {
      boolean thrown = false;
      try {
         Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 -30000, false, 1.5);
      }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertTrue("Expected NegativeValueException to be thrown.",
         thrown);
   }
   
   /** tests Truck object if reg valueIn and tonsIn is thrown in. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testValidValueIn() throws NegativeValueException {
      boolean thrown = false;
      try {
         Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, 1.5); 
      }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertEquals("Does Not Expect NegativeValueException "
         + "to be thrown. "
                           + "All values are valid",
                           false, thrown);
   }

   
/** tests Truck object if negative tonsIn is thrown in. 
*
* @throws NegativeValueException - for negative valueIn or tonsIn
*/
   @Test public void testNegativeTonsIn() throws NegativeValueException {
      boolean thrown = false;
      try {
         Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, -1.5);
      }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertTrue("Expected NegativeValueException to be thrown.",
         thrown);
   }


   /** Tests Truck class getVehicleCount() if invalid truck obj were.
   * created and tried to be added. 
   *
   * @throws NegativeValueException - for negative valueIn or tonsIn
   */
   @Test public void testGetVehicleCountInvalidZero() 
      throws NegativeValueException {
      Vehicle.resetVehicleCount();
      boolean thrown = false;
      try {
         Truck truck1 = new Truck("Nakano, Genji", "2018 Toyota Tacoma", 
                                 30000, false, -1.5); 
      }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertEquals("Tests Truck class getVehicleCount() if no "
                           + "Truck obj are created",
                     0, Vehicle.getVehicleCount());
   }

   
   
}
