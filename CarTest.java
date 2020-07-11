import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;
 /** 
 * CarTest - tests Car class methods.
 * 
 *
 * Project 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
 */
public class CarTest {


/** tests useTax() for Cars that uses Alt Fuel and is not Luxury. 
*
* @throws NegativeValueException - for negative valueIn
*/
   @Test public void testUseTaxAltFuelNotLuxury() 
      throws NegativeValueException {
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      Assert.assertEquals("Tests useTax() for Car that uses Alt Fuel and "
                           + "is not Luxury",
                     110.00, car2.useTax(), 0.01);
   } 
   
   /** tests useTax() for Cars that uses Alt Fuel and is Luxury. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testUseTaxAltFuelLuxury() throws NegativeValueException {
      Car car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe",
                                    110000, true);
      Assert.assertEquals("Tests useTax() for Cars that uses Alt Fuel and "
                           + "is Luxury",
                           2750.00, car4.useTax(), 0.01);
   }
   
   /** tests useTax() for Cars that does not use Alt Fuel and is not Luxury. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testUseTaxNoAltFuelNoLuxury() 
      throws NegativeValueException {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Assert.assertEquals("Tests useTax() for Cars that does not use Alt "
                           + "Fuel and is not Luxury",
                        220.00, car1.useTax(), 0.01);
   }
   
   /** tests useTax() for Cars that does not use Alt Fuel and is Luxury. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testUseTaxNoAltFuelLuxury() throws NegativeValueException {
      Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
         110000, false);
      Assert.assertEquals("Test useTax() for Cars that does not use Alt Fuel "
                           + "and is Luxury", 3300.00, car3.useTax(), 0.01);
   }
   
   /** tests toString() for Cars that does not use Alt Fuel and is Luxury. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testToStringNoAltFuelLuxury() 
      throws NegativeValueException {
      Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
         110000, false);
      Assert.assertEquals("Tests toString() for cars that do not use Alt Fuel "
                        + "and is Luxury",
                        "Smith, Pat: Car 2015 Mercedes-Benz Coupe\n"
                        + "Value: $110,000.00 Use Tax: $3,300.00\n"
                        + "with Tax Rate: 0.01 Luxury Tax Rate: 0.02", 
                        car3.toString());
   }
   
   /** tests toString() for cars that does not use Alt. 
   * Fuel and is not Luxury. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testToStringNoAltFuelNotLuxury() 
      throws NegativeValueException {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Assert.assertEquals("Tests toString() for cars that do not use Alt Fuel "
                        + "and is not Luxury",
                        "Jones, Sam: Car 2017 Honda Accord\n"
                        + "Value: $22,000.00 Use Tax: $220.00\n"
                        + "with Tax Rate: 0.01",
                        car1.toString());
   }
   
   /** tests toString() for cars that use Alt Fuel and is Luxury. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testToStringAltFuelLuxury() throws NegativeValueException {
      Car car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe",
                                    110000, true);
      Assert.assertEquals("Tests toString() for cars that use Alt Fuel "
                        + "and is Luxury",
                        "Smith, Jack: Car 2015 Mercedes-Benz Coupe "
                        + "(Alternative Fuel)\n"
                        + "Value: $110,000.00 Use Tax: $2,750.00\n"
                        + "with Tax Rate: 0.005 Luxury Tax Rate: 0.02",
                        car4.toString());
   }
   
   /** Tests toString() for cars that use Alt Fuel and is not Luxury. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testToStringAltFuelNotLuxury() 
      throws NegativeValueException {
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      Assert.assertEquals("Tests toString() for cars that use Alt Fuel "
                           + "and is not Luxury",
                           "Jones, Jo: Car 2017 Honda Accord "
                           + "(Alternative Fuel)\n"
                           + "Value: $22,000.00 Use Tax: $110.00\n"
                           + "with Tax Rate: 0.005",
                           car2.toString());
   }
   
   
   /** tests Car objects getOwner(). 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testCarGetOwner() throws NegativeValueException {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Assert.assertEquals("Tests car objects getOwner() method",
                          "Jones, Sam", car1.getOwner());
   }
   
   /** test Car objects setOwner(). 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testCarSetOwner() throws NegativeValueException {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      car1.setOwner("Nakano, Genji");
      Assert.assertEquals("Tests car objects setOwner() method",
                          "Nakano, Genji", car1.getOwner());
   }
   
   /** tests Car objects getYearMakeModel(). 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testCarGetYearMakeModel() throws NegativeValueException {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Assert.assertEquals("Tests car objects getYearMakeModel() method",
                          "2017 Honda Accord", car1.getYearMakeModel());      
   }
   
   /** tests Car objects setYearMakeModel(). 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testCarSetYearMakeModel() throws NegativeValueException {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      car1.setYearMakeModel("2019 Tesla Model S");
      Assert.assertEquals("Tests car objects setYearMakeModel()",
                      "2019 Tesla Model S", car1.getYearMakeModel());
   }
   
   /** tests Car objects getValue(). 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testCarGetValue() throws NegativeValueException {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Assert.assertEquals("Tests car objects getValue()",
                        22000.00, car1.getValue(), 0.001);
   }
   
   /** tests Car objects setValue(). 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testSetValue() throws NegativeValueException {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      car1.setValue(25000);
      Assert.assertEquals("Test Car objects setValue()",
                        25000.00, car1.getValue(), 0.001);
   }
   
   /** tests Car objects getAlternativeFuel() for true. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testGetAlternativeFuelTrue() 
      throws NegativeValueException {
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      Assert.assertEquals("Test Car Objects getAlternativeFuel() for true",
                        true, car2.getAlternativeFuel());
   }
   
   /** tests Car Objects getAlternativeFuel() for false. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testGetAlternativeFuelFalse() 
      throws NegativeValueException {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Assert.assertEquals("Tests Car objects getAlternativeFuel() for false",
                        false, car1.getAlternativeFuel());
   }
   
   /** Test Car Objects setAlternativeFuel() from true to false. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testSetAlternativeFuelTrueToFalse() 
      throws NegativeValueException {
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      car2.setAlternativeFuel(false);
      Assert.assertEquals("Tests Car Objects setAlternativeFuel() from t to f",
                           false, car2.getAlternativeFuel());
   }
   
   /** Test Car Objects setAlternativeFuel() from false to true. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testSetAlternativeFuelFalseToTrue() 
      throws NegativeValueException {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      car1.setAlternativeFuel(true);
      Assert.assertEquals("Tests Car Objects setAlterntaive",
                           true, car1.getAlternativeFuel());
   }
   
   /** Tests Car Objects getVehicleCount() when 4 vehicles are produced. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testGetVehicleCountMultiple() 
      throws NegativeValueException {
      Car.resetVehicleCount();
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
         110000, false);
      Car car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe",
                                    110000, true);
   
      Assert.assertEquals("Tests Car object getVehicleCount when 4 vehicles "
                        + "are produced.",
                        4, Car.getVehicleCount()); 
   } 
   
   /** Tests Car Objects getVehicleCount() when 0 cars are produced. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testGetVehicleCountZero() throws NegativeValueException {
      Car.resetVehicleCount();
      Assert.assertEquals("Tests Car Objects getVehicleCount when zero "
                        + "vehicles are produced",
                        0, Car.getVehicleCount()); 
   } 
   
   /** Tests Car objects equals() method if Car objects are same. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testEqualsSame() throws NegativeValueException {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car2 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Assert.assertEquals("Tests Car Objects equals() if car objects are same",
                           true, car1.equals(car2));
   }
   
   /** Tests Car objects equals() method if Car objects are different. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testEqualsDifferent() throws NegativeValueException {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      Assert.assertEquals("Tests Car Object equals() if car objects are "
                           + "different",
                           false, car1.equals(car2));
   }
   
   /** Tests Car objects equals() method if a non Car object is compared. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testEqualsDiffObjectTypes() throws NegativeValueException {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      String car2 = ("Jones, Sam, 2017 Honda Accord, 22000, False");
      Assert.assertEquals("Tests Car Object equals() if a non Car object type "
                           + "is compared",
                           false, car1.equals(car2));
   }
   
   /** Test Car Objects hashCode() if Car objects are same. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testHashCodeSameCarObj() throws NegativeValueException {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car2 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
   
      Assert.assertEquals("Tests Car Objects hashcode() if Car objects "
                           + "are same",
                      true, car1.hashCode() == car2.hashCode());
                     
   }
   
   /** Test Car objects hashcode() if Car objects are different. 
  *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testHashCodeDiffCarObj() throws NegativeValueException {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car2 = new Car("Nakano, Genji", "2018 Lexus GS300", 45000, true);
   
      Assert.assertEquals("Tests Car Objects hashcode() if Car objects "
                           + "are same",
                      true, car1.hashCode() == car2.hashCode());
   }
   
   /** Test Car Objects hashcode() if objects are different. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testHashCodeDiffObj() throws NegativeValueException {
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      String car2 = ("Jones, Jo, 2017 Honda Accord, 22000, true");
      Assert.assertEquals("Tests Car objects hashcode if Car objects "
                           + "are different",
                           false, car1.hashCode() == car2.hashCode());
   }
   
   
   /** tests Car object if negative valueIn is thrown in. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testNegativeValueIn() throws NegativeValueException {
      boolean thrown = false;
      try {
         Car car = new Car("Jackson, Bo", "2012 Toyota Camry", -25000, false); }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertTrue("Expected NegativeValueException to be thrown.",
         thrown);
   }
   
   /** tests Car object if reg valueIn is thrown in. 
   *
   * @throws NegativeValueException - for negative valueIn
   */
   @Test public void testValidValueIn() throws NegativeValueException {
      boolean thrown = false;
      try {
         Car car = new Car("Jackson, Bo", "2012 Toyota Camry", 25000, false); }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertEquals("Expected NegativeValueException to be thrown.",
         false, thrown);
   }


  
}
