import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/** 
 * SemiTractorTrailer - tests SemiTractorTrailer class methods.
 * 
 *
 * Project 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
 */

public class SemiTractorTrailerTest {



     /** Test SemiTractorTrailer getVehicleCount() no objects. 
     * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testGetVehicleCountZero() throws NegativeValueException {
      SemiTractorTrailer.resetVehicleCount();
      Assert.assertEquals("Tests SemiTractorTrailer getVehicleCount() "
                           + "when no objects created",
                           0, SemiTractorTrailer.getVehicleCount());
   } 


   
   /** Test SemiTractorTrailer getVehicleCount() created. 
   * 4 SemiTractorTrailer objects. 
   * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testGetVehicleCountMultiple() 
      throws NegativeValueException {
      SemiTractorTrailer.resetVehicleCount();
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat", 
         "2012 International Big Boy", 45000, false, 5.0, 4);
      SemiTractorTrailer semi2 = new SemiTractorTrailer("Nakano, Genji", 
         "2018 Swiss Miss", 50000, false, 1.5, 5);
      SemiTractorTrailer semi3 = new SemiTractorTrailer("Christian, Nina", 
         "2018 FireTruck", 55000, true, 5.0, 6);
      SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
   
      
      Assert.assertEquals("Tests SemiTractorTrailer() after 4 "
                     + "SemiTractorTrailer objects created",
                     4, SemiTractorTrailer.getVehicleCount());  
   } 
   
   /** Test SemiTractorTrailer getAxles(). 
   * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testGetAxles() throws NegativeValueException {
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat", 
         "2012 International Big Boy", 45000, false, 5.0, 4);
      Assert.assertEquals("Tests SemiTractorTrailer getAxles() on "
                     + "SemiTractorTrailer object with 4 axles",
                     4, semi1.getAxles());
   
   }
   
   /** Test SemiTractorTrailer setAxles(). 
   * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testSetAxles() throws NegativeValueException {
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat", 
         "2012 International Big Boy", 45000, false, 5.0, 4);
      semi1.setAxles(6);
      Assert.assertEquals("Tests SemiTractorTrailer setAxles() on "
                     + "SemiTractorTrailer object with 4 axles first"
                     + " then gets axles set to 6",
                     6, semi1.getAxles());
   
   }

      /** tests SemiTractorTrailer class useTax() if SemiTractorTrailer. 
      * object does not uses Alt Fuel but exceeds LARGE_TRUCK_TAX_RATE. 
      * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testUseTaxNoAltFuelLargeTax() 
      throws NegativeValueException {
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat", 
         "2012 International Big Boy", 45000, false, 5.0, 4);
      Assert.assertEquals("Tests SemiTractorTrailer useTax() on "
                     + "SemiTractorTrailer object that does not use "
                     + "Alt Fuel but exceeds LARGE_TRUCK_TAX_RATE",
                     3150.00, semi1.useTax(), 0.001);
   
   }
   
   /** tests SemiTractorTrailer class useTax() if SemiTractorTrailer. 
   * object does not use Alt Fuel and does not exceeds LARGE_TRUCK_TAX_RATE. 
   * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testUseTaxNoAltFuelNoLargeTax() 
      throws NegativeValueException {
      SemiTractorTrailer semi2 = new SemiTractorTrailer("Nakano, Genji", 
         "2018 Swiss Miss", 50000, false, 1.5, 5);
      Assert.assertEquals("Tests SemiTractorTrailer getAxles() on "
                     + "SemiTractorTrailer object that does not use "
                     + "Alt Fuel and does not exceed LARGE_TRUCK_TAX_RATE",
                     2250.00, semi2.useTax(), 0.001);
   
   }
    
      
      /** tests SemiTractorTrailer class useTax() if SemiTractorTrailer. 
      * object uses Alt Fuel and does not exceeds LARGE_TRUCK_TAX_RATE. 
      * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testUseTaxAltFuelNoLargeTax() 
      throws NegativeValueException {
      SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      Assert.assertEquals("Tests SemiTractorTrailer getAxles() on "
                     + "SemiTractorTrailer object that does use "
                     + "Alt Fuel and does not exceed LARGE_TRUCK_TAX_RATE",
                     2700.00, semi4.useTax(), 0.001);
   
   }
   
      
      /** tests SemiTractorTrailer class useTax() if SemiTractorTrailer. 
      * object uses Alt Fuel and exceeds LARGE_TRUCK_TAX_RATE. 
      * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testUseTaxAltFuelLargeTax() throws NegativeValueException {
      SemiTractorTrailer semi3 = new SemiTractorTrailer("Christian, Nina", 
         "2018 FireTruck", 55000, true, 5.0, 6);
      Assert.assertEquals("Tests SemiTractorTrailer getAxles() on "
                     + "SemiTractorTrailer object that does use "
                     + "Alt Fuel and does not exceed LARGE_TRUCK_TAX_RATE",
                     3850.00, semi3.useTax(), 0.001);
   
   
   }
   
   /** Test SemiTractorTrailer class toString() if SemiTractorTrailer. 
   *object does not uses Alt Fuel but exceeds LARGE_TRUCK_TAX_RATE. 
   * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testToStringNoAltFuelLargeTruckTax() 
      throws NegativeValueException {
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat", 
         "2012 International Big Boy", 45000, false, 5.0, 4);
      Assert.assertEquals("Tests SemiTractorTrailer toStrign() on "
                     + "SemiTractorTrailer object that does not use "
                     + "Alt Fuel but exceeds LARGE_TRUCK_TAX_RATE",
                     "Williams, Pat: SemiTractorTrailer 2012 International "
                     + "Big Boy"
                     + "\nValue: $45,000.00 Use Tax: $3,150.00"
                     + "\nwith Tax Rate: 0.02 Large Truck Tax Rate: 0.03 "
                     + "Axle Tax Rate: 0.02", semi1.toString());
   }
   
   /** tests SemiTractorTrailer class toString() if SemiTractorTrailer. 
   * object does not use Alt Fuel and does not exceeds LARGE_TRUCK_TAX_RATE. 
   * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testToStringNoAltNoFuelLargeTruckTax() 
      throws NegativeValueException {
      SemiTractorTrailer semi2 = new SemiTractorTrailer("Nakano, Genji", 
         "2018 Swiss Miss", 50000, false, 1.5, 5);
      Assert.assertEquals("Tests SemiTractorTrailer toStrign() on "
                     + "SemiTractorTrailer object that does not use "
                     + "Alt Fuel but exceeds LARGE_TRUCK_TAX_RATE",
                     "Nakano, Genji: SemiTractorTrailer 2018 Swiss Miss"
                     + "\nValue: $50,000.00 Use Tax: $2,250.00"
                     + "\nwith Tax Rate: 0.02 Axle Tax Rate: 0.025",
                     semi2.toString());
   }     
         
   /** tests SemiTractorTrailer class toString() if SemiTractorTrailer. 
   * object uses Alt Fuel and exceeds LARGE_TRUCK_TAX_RATE. 
   * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testToStringAltFuelLargeTruckTax() 
      throws NegativeValueException {
      SemiTractorTrailer semi3 = new SemiTractorTrailer("Christian, Nina", 
         "2018 FireTruck", 55000, true, 5.0, 6);
      Assert.assertEquals("Tests SemiTractorTrailer toStrign() on "
                     + "SemiTractorTrailer object that does use "
                     + "Alt Fuel but exceeds LARGE_TRUCK_TAX_RATE",
                     "Christian, Nina: SemiTractorTrailer 2018 FireTruck "
                     + "(Alternative Fuel)"
                     + "\nValue: $55,000.00 Use Tax: $3,850.00"
                     + "\nwith Tax Rate: 0.01 Large Truck Tax Rate: 0.03 Axle "
                     + "Tax Rate: 0.03",
                     semi3.toString());
   }     


   /** tests SemiTractorTrailer class useTax() if SemiTractorTrailer. 
   * object uses Alt Fuel and does not exceeds LARGE_TRUCK_TAX_RATE. 
   * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testToStringNoAltFuelNoLargeTruckTax() 
      throws NegativeValueException {
      SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      Assert.assertEquals("Tests SemiTractorTrailer toStrign() on "
                     + "SemiTractorTrailer object that does use "
                     + "Alt Fuel but does not exceeds LARGE_TRUCK_TAX_RATE",
                     "Symba, Mini-Moos: SemiTractorTrailer 2012 MoomBamobile "
                     + "(Alternative Fuel)"
                     + "\nValue: $60,000.00 Use Tax: $2,700.00"
                     + "\nwith Tax Rate: 0.01 Axle Tax Rate: 0.035",
                     semi4.toString());
   }



   /** Test SemiTractorTrailer class equals() if two SemiTractorTrailer Objects.
   *  are the same. 
   * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testEqualsTrue() throws NegativeValueException {
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      SemiTractorTrailer semi2 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      Assert.assertEquals("Tests SemiTractorTrailer class equals() if two "
                          + "SemiTractorTrailer objects are the same",
                          true, semi1.equals(semi2));
   }
   
   /** Test SemiTractorTrailer class equals() if two SemiTractorTrailer Objects.
   *  are not the same. 
   * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testEqualsFalse() throws NegativeValueException {
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      SemiTractorTrailer semi2 = new SemiTractorTrailer("NAkano, Genji", 
         "2018 SwissMiss", 55000, true, 5.5, 7);
      Assert.assertEquals("Tests SemiTractorTrailer class equals() if two "
                          + "SemiTractorTrailer objects are not the same",
                          false, semi1.equals(semi2));
   }
   
   /** Test SemiTractorTrailer class equals() if another Objects is checked.
   * for equality. 
   * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testEqualsNotSameObj() throws NegativeValueException {
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      String semi2 = "Symba, Mini-Moos, 2012 MoomBamobile, 60000, true, 1.5, 7";
      Assert.assertEquals("Tests SemiTractorTrailer class equals() if  "
                          + "another object is checked instead of "
                          + "SemiTractorTrailer obj",
                          false, semi1.equals(semi2));
   }

   /** Test SemiTractorTrailer class hashCode() if SemiTractorTrailer obj.
   * are diff. 
   * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testHashCodeDiffSemiTractorTrailerObj() 
      throws NegativeValueException {
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      SemiTractorTrailer semi2 = new SemiTractorTrailer("NAkano, Genji", 
         "2018 SwissMiss", 55000, true, 5.5, 7);
      Assert.assertEquals("Tests SemiTractorTrailer class hasCode() if two "
                          + "SemiTractorTrailer objects are being passed",
                          true, semi1.hashCode() == semi2.hashCode());
   }
   
  /** Test SemiTractorTrailer class hashCode() if SemiTractorTrailer obj.
  * are same. 
  * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testHashCodeSameSemiTractorTrailerObj() 
      throws NegativeValueException {
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      SemiTractorTrailer semi2 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      Assert.assertEquals("Tests SemiTractorTrailer class hasCode() if two "
                          + "SemiTractorTrailer objects are being passed",
                          true, semi1.equals(semi2));
   }
   
   /** Test SemiTractorTrailer class hashCode() if SemiTractorTrailer obj.
  * are tested against an obj other than SemiTractorTrailer obj. 
  * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testHashCodeNonSemiTractorTrailerObj() 
      throws NegativeValueException {
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      String semi2 = "Symba, Mini-Moos, 2012 MoomBamobile, 60000, true, 1.5, 7";
      Assert.assertEquals("Tests SemiTractorTrailer class hasCode() if "
                          + "something other than an SemiTractorTrailer "
                          + "objects are being passed",
                          false, semi1.equals(semi2));
   }

   
   /** Test SemiTractorTrailer getOwner(). 
   * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testGetOwner() throws NegativeValueException {
      SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      Assert.assertEquals("Tests SemiTractorTrailer getOwner() ",
                           "Symba, Mini-Moos", semi4.getOwner());
   
   }
   
   /** Test SemiTractorTrailer setOwner(). 
   * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testSetOwner() throws NegativeValueException {
      SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      semi4.setOwner("Moombas, DJ");
      Assert.assertEquals("Tests SemiTractorTrailer setOwner() ",
                           "Moombas, DJ", semi4.getOwner());
   
   }
   
   /** Test SemiTractorTrailer getYearMakeModel(). 
   * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testGetYearMakeModel() throws NegativeValueException {
      SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      Assert.assertEquals("Tests SemiTractorTrailer getYearMakeModel() ",
                           "2012 MoomBamobile", semi4.getYearMakeModel());
   
   }

/** Test SemiTractorTrailer setYearMakeModel(). 
* 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testSetYearMakeModel() throws NegativeValueException {
      SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      semi4.setYearMakeModel("2018 Cat Cruiser");
      Assert.assertEquals("Tests SemiTractorTrailer setYearMakeModel() ",
                           "2018 Cat Cruiser", semi4.getYearMakeModel());
   
   }

/** Test SemiTractorTrailer getValue(). 
* 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testGetValue() throws NegativeValueException {
      SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      Assert.assertEquals("Tests SemiTractorTrailer getValue() ",
                           60000.00, semi4.getValue(), 0.001);
   
   }

/** Test SemiTractorTrailer setValue(). 
* 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testSetValue() throws NegativeValueException {
      SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      semi4.setValue(65000);
      Assert.assertEquals("Tests SemiTractorTrailer setValue() ",
                           65000.00, semi4.getValue(), 0.001);
   
   }
   
   /** Test SemiTractorTrailer getAlternativeFuel(). 
   * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testGetAlternativeFuel() throws NegativeValueException {
      SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      Assert.assertEquals("Tests SemiTractorTrailer getAlternativeFuel() ",
                           true, semi4.getAlternativeFuel());
   
   }
   

/** Test SemiTractorTrailer setAlternativeFuel() from true to false. 
* 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testSetAlternativeFuelTrueToFalse() 
      throws NegativeValueException {
      SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      semi4.setAlternativeFuel(false);
      Assert.assertEquals("Tests SemiTractorTrailer setAlternativeFuel() from"
                           + " true to false",
                           false, semi4.getAlternativeFuel());
   
   }

/** Test SemiTractorTrailer setAlternativeFuel() from false to true.
 * 
 * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
 */
   @Test public void testSetAlternativeFuelFalseToTrue() 
      throws NegativeValueException {
      SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, false, 1.5, 7);
      semi4.setAlternativeFuel(true);
      Assert.assertEquals("Tests SemiTractorTrailer setAlternativeFuel()from "
                           + "false to true ",
                           true, semi4.getAlternativeFuel());
   
   }
   
   /** tests SemiTractorTrailer object if negative valueIn is thrown in. 
   *
   * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
   */
   @Test public void testNegativeValueIn() throws NegativeValueException {
      boolean thrown = false;
      try {
         SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
            "2012 MoomBamobile", -60000, false, 1.5, 7); 
      }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertTrue("Expected NegativeValueException to be thrown.",
         thrown);
   }
   
   /** tests SemiTractorTrailer object if reg valueIn, tonsIn, and axliesIn. 
   * is thrown in. 
   *
   * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
   */
   @Test public void testValidValueIn() throws NegativeValueException {
      boolean thrown = false;
      try {
         SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
            "2012 MoomBamobile", 60000, false, 1.5, 7); 
      }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertEquals("Expected NegativeValueException to be thrown.",
         false, thrown);
   }

   
/** tests SemiTractorTrailer object if negative tonsIn is thrown in. 
*
   * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
   */
   @Test public void testNegativeTonsIn() throws NegativeValueException {
      boolean thrown = false;
      try {
         SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
            "2012 MoomBamobile", 60000, false, -1.5, 7); 
      }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertTrue("Expected NegativeValueException to be thrown.",
         thrown);
   }
   
   /** tests SemiTractorTrailer object if negative axlesIn is thrown in. 
   *
   * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
   */
   @Test public void testNegativeAxlesIn() throws NegativeValueException {
      boolean thrown = false;
      try {
         SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
            "2012 MoomBamobile", 60000, false, 1.5, -7); 
      }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertTrue("Expected NegativeValueException to be thrown.",
         thrown);
   }



   /** Tests SemiTractorTrailer class getVehicleCount() if.
   * invalid SemiTractorTrailer obj were.
   * created and tried to be added. 
   *
   * @throws NegativeValueException - for negative valueIn, tonsIn, or axlesIn
   */
   @Test public void testGetVehicleCountInvalidZero() 
      throws NegativeValueException {
      Vehicle.resetVehicleCount();
      boolean thrown = false;
      try {
         SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
            "2012 MoomBamobile", -60000, false, 1.5, 7); 
      }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertEquals("Tests Motorcycle class getVehicleCount() if no "
                           + "Motorcycle obj are created",
                     0, Motorcycle.getVehicleCount());
   }


   
}
