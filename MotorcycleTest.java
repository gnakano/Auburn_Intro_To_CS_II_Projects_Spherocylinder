import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/** 
 * Motorcylcle - tests Motorcycle class methods.
 * 
 *
 * Project 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
 */

public class MotorcycleTest {

   /** Tests Motorcycle class getVehicleCount if mult Motorcycle obj are.
   * created. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testMotorcycleGetVehicleCountMultiple() 
      throws NegativeValueException {
      Motorcycle.resetVehicleCount();
      Motorcycle bike1 = new Motorcycle("Brando, Marlon", 
                                       "1964 Harley-Davidson Sportster", 
                                       14000, false, 750);
      Motorcycle bike2 = new Motorcycle("Nakano, Genji", "2018 Honda Ninja", 
                                       15000, false, 400);
      Motorcycle bike3 = new Motorcycle("Christian, Nina", "2018 Mario Kart", 
                                       20000, true, 750);
      Motorcycle bike4 = new Motorcycle("Moomb, Symba", "2018 Meowtercycle", 
                                       18000, true, 400);
      Assert.assertEquals("Tests Motorcyle class getVehicleCount() if mutiple "
                        + "Motorcyle obj are created",
                        4, Motorcycle.getVehicleCount());
   }
   
   /** Tests Motorcycle class getVehicleCount() if no Motorcycle obj were.
   * created. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testGetVehicleCountZero() throws NegativeValueException {
      Motorcycle.resetVehicleCount();
      Assert.assertEquals("Tests Motorcycle class getVehicleCount() if no "
                           + "Motorcycle obj are created",
                     0, Motorcycle.getVehicleCount());
   }
   
   /** Tests Motorcycle class getEngineSize(). 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testGetEngineSize() throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomb, Symba", "2018 Meowtercycle", 
                                       18000, true, 400);
      Assert.assertEquals("Tests Motorcycle class getEngineSize()",
                     400.00, bike4.getEngineSize(), 0.001);
   }
   
   /** Tests Motorcycle class setEngineSize(). 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testSetEngineSize() throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomb, Symba", "2018 Meowtercycle", 
                                       18000, true, 400);
      bike4.setEngineSize(500);
      Assert.assertEquals("Tests Motorcycle class getEngineSize()",
                     500.00, bike4.getEngineSize(), 0.001);
   }



   /** Tests Motorcyle class useTax() if Motorcyle obj uses AltFuel and engine.
   * exceeds LARGE_BIKE_CC_THRESHOLD. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void useTaxAltFuelLargeBike() throws NegativeValueException {
      Motorcycle bike3 = new Motorcycle("Christian, Nina", "2018 Mario Kart", 
                                       20000, true, 750);
      Assert.assertEquals("Tests Motorcycle class useTax() if uses Alt Fuel "
                           + "and engine exceeds LARGE_BIKE_CC_THRESHOLD",
                        350.00, bike3.useTax(), 0.001);
   }

   
   /** Tests Motorcyle class useTax() if Motorcyle obj uses AltFuel and engine.
   * does not exceeds LARGE_BIKE_CC_THRESHOLD. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void useTaxAltFuelNoLargeBike() throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomb, Symba", "2018 Meowtercycle", 
                                       18000, true, 400);
      Assert.assertEquals("Tests Motorcycle class useTax() if uses Alt Fuel "
                           + "and engine does exceeds LARGE_BIKE_CC_THRESHOLD",
                        45.00, bike4.useTax(), 0.001);
   }

   
   /** Tests Motorcyle class useTax() if Motorcyle obj does not use AltFuel and.
   * engine exceeds LARGE_BIKE_CC_THRESHOLD. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void useTaxNoAltFuelLargeBike() throws NegativeValueException {
      Motorcycle bike1 = new Motorcycle("Brando, Marlon", 
                                       "1964 Harley-Davidson Sportster", 
                                       14000, false, 750);
      Assert.assertEquals("Tests Motorcycle class useTax() if doesn't use "
                           + "AltFuel and engine exceeds "
                           + "LARGE_BIKE_CC_THRESHOLDE",
                        280.00, bike1.useTax(), 0.001);
   }
   
   /** Tests Motorcyle class useTax() if Motorcyle obj does not use AltFuel and.
   * engine does not exceeds LARGE_BIKE_CC_THRESHOLD. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void useTaxNoAltFuelNoLargeBike() 
      throws NegativeValueException {
      Motorcycle bike2 = new Motorcycle("Nakano, Genji", "2018 Honda Ninja", 
                                           15000, false, 400);
      Assert.assertEquals("Tests Motorcycle class useTax() if doesn't use "
                           + "AltFuel and engine exceeds "
                           + "LARGE_BIKE_CC_THRESHOLDE",
                           75.00, bike2.useTax(), 0.001);
   }
   
   
   /** Tests Motorcyle class toString() if Motorcyle obj uses AltFuel.
   * and engine exceeds LARGE_BIKE_CC_THRESHOLD. 
  *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testToStringAltFuelLargeBike() 
      throws NegativeValueException {
      Motorcycle bike3 = new Motorcycle("Christian, Nina", "2018 Mario Kart", 
                                       20000, true, 750);
      Assert.assertEquals("Tests Motorcycle class toString() if uses Alt Fuel "
                           + "and engine exceeds LARGE_BIKE_CC_THRESHOLD",
                           "Christian, Nina: Motorcycle 2018 Mario Kart "
                           + "(Alternative Fuel)"
                           + "\nValue: $20,000.00 Use Tax: $350.00"
                           + "\nwith Tax Rate: 0.0025 Large Bike Tax "
                           + "Rate: 0.015",
                           bike3.toString());
   }


   /** Tests Motorcyle class toString() if Motorcyle obj uses AltFuel and. 
   * engine does not exceeds LARGE_BIKE_CC_THRESHOLD. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testToStringAltFuelNoLargeBike() 
      throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomb, Symba", "2018 Meowtercycle", 
                                       18000, true, 400);
      Assert.assertEquals("Tests Motorcycle class toString() if uses Alt Fuel "
                           + "and engine does exceeds LARGE_BIKE_CC_THRESHOLD",
                           "Moomb, Symba: Motorcycle 2018 Meowtercycle "
                           + "(Alternative Fuel)"
                           + "\nValue: $18,000.00 Use Tax: $45.00"
                           + "\nwith Tax Rate: 0.0025",
                           bike4.toString());
   }


   /** Tests Motorcyle class toString() if Motorcyle obj does not use.
   * AltFuel and engine exceeds LARGE_BIKE_CC_THRESHOLD. 
  *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testToStringNoAltFuelLargeBike() 
      throws NegativeValueException {
      Motorcycle bike1 = new Motorcycle("Brando, Marlon", 
                                       "1964 Harley-Davidson Sportster", 
                                       14000, false, 750);
      Assert.assertEquals("Tests Motorcycle class toString() if does not "
                           + "use Alt Fuel "
                           + "and engine  exceeds LARGE_BIKE_CC_THRESHOLD",
                           "Brando, Marlon: Motorcycle 1964 Harley-Davidson "
                           + "Sportster"
                           + "\nValue: $14,000.00 Use Tax: $280.00"
                           + "\nwith Tax Rate: 0.005 Large Bike "
                           + "Tax Rate: 0.015",
                           bike1.toString());
   }   
      /** Tests Motorcyle class toString() if Motorcyle obj does not.
      * use AltFuel and engine does not exceeds LARGE_BIKE_CC_THRESHOLD. 
      *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testToStringNoAltNoFuelLargeBike() 
      throws NegativeValueException {
      Motorcycle bike2 = new Motorcycle("Nakano, Genji", "2018 Honda Ninja", 
                                       15000, false, 400);
      Assert.assertEquals("Tests Motorcycle class toString() if does not "
                           + "use Alt Fuel "
                           + "and engine does not exceed "
                           + "LARGE_BIKE_CC_THRESHOLD",
                           "Nakano, Genji: Motorcycle 2018 Honda Ninja"
                           + "\nValue: $15,000.00 Use Tax: $75.00"
                           + "\nwith Tax Rate: 0.005",
                           bike2.toString());
   } 
   
   /** Tests Motorcycle class getOwner(). 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testGetOwner() throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, true, 400);
      Assert.assertEquals("Tests Motorcycle class getOwner()",
                     "Moomba, Symba", bike4.getOwner());
   }
   
   /** Tests Motorcycle class setOwner(). 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testSetOwner() throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, true, 400);
      bike4.setOwner("Andretti, Mario");
      Assert.assertEquals("Tests Motorcycle class setOwner()",
                     "Andretti, Mario", bike4.getOwner());
   }
   
   /** Tests Motorcycle class getYearMakeModel(). *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testGetYearMakeModel() throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, true, 400);
      Assert.assertEquals("Tests Motorcycle class getYearMakeModel()",
                     "2018 Meowtercycle", bike4.getYearMakeModel());
   }

   /** Tests Motorcycle class setYearMakeModel(). *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testSetYearMakeModel() throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, true, 400);
      bike4.setYearMakeModel("2018 BMW Motorcyle");
      Assert.assertEquals("Tests Motorcycle class setYearMakeModel()",
                     "2018 BMW Motorcyle", bike4.getYearMakeModel());
   }

   /** Tests Motorcycle class getValue(). *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testGetValue() throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, true, 400);
      Assert.assertEquals("Tests Motorcycle class getValue()",
                     18000.00, bike4.getValue(), 0.001);
   }

/** Tests Motorcycle class setValue(). *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testSetValue() throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, true, 400);
      bike4.setValue(17000);                                 
      Assert.assertEquals("Tests Motorcycle class setValue()",
                     17000.00, bike4.getValue(), 0.001);
   }
   
   /** Tests Motorcycle class getAlternativeFuel().
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testGetAlternativeFuel() throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, true, 400);
      Assert.assertEquals("Tests Motorcycle class getAlternativeFuel()",
                     true, bike4.getAlternativeFuel());
   }

/** Tests Motorcycle class setAlternativeFuel() from true to false. 
*
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testSetAlternativeFuelTrueToFalse() 
      throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, true, 400);
      bike4.setAlternativeFuel(false);                                 
      Assert.assertEquals("Tests Motorcycle class getAlternativeFuel()"
                           + " from true to false",
                     false, bike4.getAlternativeFuel());
   }

   /** Tests Motorcycle class setAlternativeFuel() from false to true. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testSetAlternativeFuelFalseToTrue() 
      throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, false, 400);
      bike4.setAlternativeFuel(true);                                 
      Assert.assertEquals("Tests Motorcycle class setAlternativeFuel() "
                           + "from false to true",
                           true, bike4.getAlternativeFuel());
   }

   /** Tests Motorcycle class equals() if Motorcycle obj are the same. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testEqualsSameMotorcycleObj() 
      throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, false, 400);
      Motorcycle bike3 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, false, 400);
      Assert.assertEquals("Tests Motorcycle class equasl() if Motorcycle "
                           + "objects are the equal",
                           true, bike4.equals(bike3));
   
   }
   
   /** Tests Motorcycle class equals() if Motorcycle obj are diff. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testEqualsDiffMotorcycleObj() 
      throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, false, 400);
      Motorcycle bike3 = new Motorcycle("Christian, Nina", "2018 Mario Kart", 
                                       20000, true, 750);
      Assert.assertEquals("Tests Motorcycle class equasl() if Motorcycle "
                           + "objects are the equal",
                           false, bike4.equals(bike3));
   
   }
   
   /** Tests Motorcycle class equals() if something other than. 
   * a Motorcycle object is compared to. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testEqualsDiffObj() throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, false, 400);
      String bike3 = "Christian, Nina, 2018 Mario Kart, 20000, true, 750";
      Assert.assertEquals("Tests Motorcycle class equals() if something "
                           + "other than a Motorcycle obj are compared to",
                           false, bike4.equals(bike3));
   
   }
   
   /**Tests Motorcycle Objects hashCode() if Motorcyle Objects are same. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testHashCodeSameObject() throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, false, 400);
      Motorcycle bike3 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, false, 400);
      Assert.assertEquals("Tests Motorcycle class hashCode() if Motorcycle "
                           + "objects are the equal",
                           true, bike4.hashCode() == bike3.hashCode());
   
   }
   
   /**Tests Motorcycle Objects hashCode() if Motorcyle Objects are diff. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testHashCodeDiffMotorcycleObj() 
      throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, false, 400);
      Motorcycle bike3 = new Motorcycle("Christian, Nina", "2018 Mario Kart", 
                                       20000, true, 750);
      Assert.assertEquals("Tests Motorcycle class hashCode() if Motorcycle "
                           + "objects are the not equal",
                           true, bike4.hashCode() == bike3.hashCode());
   
   }

   /**Tests Motorcycle Objects hashCode() if something other than.
   * Motorcycle objects compared to. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testHashCodeDiffObj() throws NegativeValueException {
      Motorcycle bike4 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, false, 400);
      String bike3 = ("Christian, Nina, 2018 Mario Kart, 20000, true, 750");
      Assert.assertEquals("Tests Motorcycle class hashCode() if something "
                           + "other than Motorcycle obj are compared to",
                           false, bike4.hashCode() == bike3.hashCode());
   
   }

   /** tests Motorcylcle object if negative valueIn is thrown in. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testNegativeValueIn() throws NegativeValueException {
      boolean thrown = false;
      try {
         Motorcycle bike4 = new Motorcycle("Moomb, Symba", "2018 Meowtercycle", 
                                       -18000, true, 400); 
      }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertTrue("Expected NegativeValueException to be thrown.",
         thrown);
   }
   
   /** tests Motorcylce object if reg valueIn and engineSize is thrown in. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testValidValueIn() throws NegativeValueException {
      boolean thrown = false;
      try {
         Motorcycle bike4 = new Motorcycle("Moomb, Symba", "2018 Meowtercycle", 
                                       18000, true, 400); 
      }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertEquals("Expected NegativeValueException to be thrown.",
         false, thrown);
   }

   
/** tests Motorcylcle object if negative EngineSizeIn is thrown in. 
*
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testNegativeEngineSizeIn() throws NegativeValueException {
      boolean thrown = false;
      try {
         Motorcycle bike4 = new Motorcycle("Moomb, Symba", "2018 Meowtercycle", 
                                       18000, true, -400); 
      }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertTrue("Expected NegativeValueException to be thrown.",
         thrown);
   }


   /** Tests Motorcycle class getVehicleCount() if invalid Motorcycle obj were.
   * created and tried to be added. 
   *
   * @throws NegativeValueException - for negative valueIn or engineSizeIn
   */
   @Test public void testGetVehicleCountInvalidZero() 
      throws NegativeValueException {
      Vehicle.resetVehicleCount();
      boolean thrown = false;
      try {
         Motorcycle bike4 = new Motorcycle("Moomb, Symba", "2018 Meowtercycle", 
                                       18000, true, -400); 
      }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertEquals("Tests Motorcycle class getVehicleCount() if no "
                           + "Motorcycle obj are created",
                     0, Motorcycle.getVehicleCount());
   }

   
}