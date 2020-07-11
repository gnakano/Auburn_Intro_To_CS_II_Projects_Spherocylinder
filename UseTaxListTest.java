import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;
// import java.io.File;
import java.io.FileNotFoundException;
// import java.util.Scanner;
import java.util.Arrays;


/** 
 * UseTaxListTest - tests for UseTaxList.
 * 
 *
 * Project 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
 */

public class UseTaxListTest {

/** Test readVehicleFile for UseTaxLIst to set vehicle array.
* and excludedVehicle array from a text file. 
* takes data from file and creates valid vehicle objects or
* excluded vehicles into strings.
*
* @throws FileNotFoundException = throws excpetion.
*/
   @Test public void testReadFile() throws FileNotFoundException {
      UseTaxList utl = new UseTaxList();
      utl.readVehicleFile("vehicles2.txt");
      Assert.assertEquals("Tests Read File for title to be set.", 
                     "Tax District 52", utl.getTaxDistrict());
   }
   
   
   /** Tests setTaxDistrict for Tax District to be set. 
   *
   * @throws FileNotFoundException = throws excpetion.
   */
   @Test public void testSetTaxDistrct() throws FileNotFoundException {
      UseTaxList utl = new UseTaxList();
      utl.readVehicleFile("vehicles2.txt");
      utl.setTaxDistrict("Tax District 34");
      Assert.assertEquals("Tests Read File for title to be set using "
                           + "setTaxDistrict().", 
                     "Tax District 34", utl.getTaxDistrict());
   }
   
   /** Tests getVehicleList of UseTaxList. 
   *
   * @throws FileNotFoundException = throws excpetion.
   */
   @Test public void testGetVehicleList() throws FileNotFoundException {
      UseTaxList utl = new UseTaxList();
      utl.readVehicleFile("vehicles2.txt");
      Assert.assertEquals("Tests UseTaxList get VehicleList().", 
                     "[Jones, Sam: Car 2014 Honda Accord\n"
                     + "Value: $22,000.00 Use Tax: $220.00\n"
                     + "with Tax Rate: 0.01, Jones, Jo: Car 2014 "
                     + "Honda Accord (Alternative Fuel)\n"
                     + "Value: $22,000.00 Use Tax: $110.00\n"
                     + "with Tax Rate: 0.005, Smith, Pat: Car 2015 "
                     + "Mercedes-Benz Coupe\n"
                     + "Value: $110,000.00 Use Tax: $3,300.00"
                     + "\nwith Tax Rate: 0.01 Luxury Tax Rate: 0.02, "
                     + "Smith, Pop: Car 2015 Mercedes-Benz Coupe"
                     + "\nValue: $110,000.00 Use Tax: $3,300.00"
                     + "\nwith Tax Rate: 0.01 Luxury Tax Rate: 0.02, Smith, "
                     + "Jack: Car 2015 Mercedes-Benz Coupe (Alternative Fuel)\n"
                     + "Value: $110,000.00 Use Tax: $2,750.00\n"
                     + "with Tax Rate: 0.005 Luxury Tax Rate: 0.02, Williams, "
                     + "Jo: Truck 2012 Chevy Silverado\n"
                     + "Value: $30,000.00 Use Tax: $600.00\n"
                     + "with Tax Rate: 0.02, Williams, Sam: Truck 2010 Chevy "
                     + "Mack (Alternative Fuel)\n"
                     + "Value: $40,000.00 Use Tax: $1,600.00\n"
                     + "with Tax Rate: 0.01 Large Truck Tax Rate: 0.03, "
                     + "Williams, Pat: SemiTractorTrailer 2010 International "
                     + "Big Boy\n"
                     + "Value: $45,000.00 Use Tax: $3,150.00\n"
                     + "with Tax Rate: 0.02 Large Truck Tax Rate: 0.03 Axle "
                     + "Tax Rate: 0.02, Brando, Marlon: Motorcycle 1964 "
                     + "Harley-Davidson Sportster\n"
                     + "Value: $14,000.00 Use Tax: $280.00\n"
                     + "with Tax Rate: 0.005 Large Bike Tax Rate: 0.015]", 
                     Arrays.toString(utl.getVehicleList()));
   }
   
   
   /**
   * Test getExcludedRecords of UseTaxList. 
   * @throws FileNotFoundException = throws excpetion.
      */
   @Test public void testGetExcludedRecords() throws FileNotFoundException {
      UseTaxList utl = new UseTaxList();
      utl.readVehicleFile("vehicles2.txt"); 
      Assert.assertEquals("Tests getExcludedRecords",
                          "[NegativeValueException: Numeric values must be "
                          + "nonnegative in:"
                          + "\ncar; Jones, Pat; 2014 Honda Accord; -22000; "
                          + "true, Invalid Vehicle Category in:"
                          + "\nrace car; Zinc, Zed; 2013 Custom Hot Rod; "
                          + "61000; false, java.util.NoSuchElementException in:"
                          + "\nCar; Smith, Pet; 2015 Mercedes-Benz Coupe; "
                          + "110000, NegativeValueException: Numeric "
                          + "values must be nonnegative in:"
                          + "\nTruck; Williams, Alex; 2012 Chevy Silverado; "
                          + "30000; false; -3.0, Invalid Vehicle Category in:"
                          + "\nFiretruck; Body, Abel; 2015 GMC FE250; 55000; "
                          + "false; 2.5, java.lang.NumberFormatException: For "
                          + "input string: \"five\" in:"
                          + "\ntruck; Williams, Bam; 2010 Chevy Mack; 40000; "
                          + "true; five, NegativeValueException: Numeric "
                          + "values must be nonnegative in:"
                          + "\nSemi; Williams, Mat; 2012 Volvo Big Mack; "
                          + "35000; false; 5.0; -4, NegativeValueException: "
                          + "Numeric values must be nonnegative in:"
                          + "\nMotorcycle; Rider, Easy; 1967 Harley-Davidson "
                          + "Electra; 10000; false; -1200]",
                          Arrays.toString(utl.getExcludedRecords())); 
   }
   
   /** Tests addVehicle of UseTaxList. 
   *
   * @throws FileNotFoundException = throws excpetion.
   */
   @Test public void testAddVehicle() throws FileNotFoundException {
      UseTaxList utl = new UseTaxList();
      utl.readVehicleFile("vehicles2.txt");
      try {
         Car car2 = new Car("Nakano, Genji", "2018 Tesla X", 45000, true);
         Motorcycle bike4 = new Motorcycle("Moomb, Symba", "2018 Meowtercycle", 
                                       18000, true, 400);
         SemiTractorTrailer semi1 = new SemiTractorTrailer("Symba, Mini-Moos", 
            "2012 MoomBamobile", 60000, true, 1.5, 7);
         Truck truck3 = new Truck("Christian, Nina", "2018 Chevy Colorado", 
                                 35000, true, 2.5);                           
         utl.addVehicle(car2);
         utl.addVehicle(bike4);
         utl.addVehicle(semi1);
         utl.addVehicle(truck3);
      }
      catch (NegativeValueException e) {
         System.out.print(e);
      }
      Assert.assertEquals("Tests addVehicle car, truck, motorcylcle, semi",
                              "[Jones, Sam: Car 2014 Honda Accord"
         + "\nValue: $22,000.00 Use Tax: $220.00"
         + "\nwith Tax Rate: 0.01, Jones, Jo: "
         + "Car 2014 Honda Accord (Alternative Fuel)"
         + "\nValue: $22,000.00 Use Tax: $110.00"
         + "\nwith Tax Rate: 0.005, Smith, Pat: Car 2015 Mercedes-Benz Coupe"
         + "\nValue: $110,000.00 Use Tax: $3,300.00"
         + "\nwith Tax Rate: 0.01 Luxury Tax Rate: 0.02, Smith, Pop: "
         + "Car 2015 Mercedes-Benz Coupe"
         + "\nValue: $110,000.00 Use Tax: $3,300.00"
         + "\nwith Tax Rate: 0.01 Luxury Tax Rate: 0.02, Smith, Jack: "
         + "Car 2015 Mercedes-Benz Coupe (Alternative Fuel)"
         + "\nValue: $110,000.00 Use Tax: $2,750.00"
         + "\nwith Tax Rate: 0.005 Luxury Tax Rate: 0.02, Williams, Jo: "
         + "Truck 2012 Chevy Silverado"
         + "\nValue: $30,000.00 Use Tax: $600.00"
         + "\nwith Tax Rate: 0.02, Williams, Sam: Truck 2010 Chevy Mack "
         + "(Alternative Fuel)"
         + "\nValue: $40,000.00 Use Tax: $1,600.00"
         + "\nwith Tax Rate: 0.01 Large Truck Tax Rate: 0.03, "
         + "Williams, Pat: SemiTractorTrailer 2010 International Big Boy"
         + "\nValue: $45,000.00 Use Tax: $3,150.00"
         + "\nwith Tax Rate: 0.02 Large Truck Tax Rate: 0.03 "
         + "Axle Tax Rate: 0.02, Brando, Marlon: Motorcycle "
         + "1964 Harley-Davidson Sportster"
         + "\nValue: $14,000.00 Use Tax: $280.00"
         + "\nwith Tax Rate: 0.005 Large Bike Tax Rate: 0.015, "
         + "Nakano, Genji: Car 2018 Tesla X (Alternative Fuel)"
         + "\nValue: $45,000.00 Use Tax: $225.00"
         + "\nwith Tax Rate: 0.005, Moomb, Symba: Motorcycle 2018 "
         + "Meowtercycle (Alternative Fuel)"
         + "\nValue: $18,000.00 Use Tax: $45.00"
         + "\nwith Tax Rate: 0.0025, Symba, Mini-Moos: "
         + "SemiTractorTrailer 2012 MoomBamobile (Alternative Fuel)"
         + "\nValue: $60,000.00 Use Tax: $2,700.00"
         + "\nwith Tax Rate: 0.01 Axle Tax Rate: 0.035, "
         + "Christian, Nina: Truck 2018 Chevy Colorado (Alternative Fuel)"
         + "\nValue: $35,000.00 Use Tax: $1,400.00"
         + "\nwith Tax Rate: 0.01 Large Truck Tax Rate: 0.03]",
         Arrays.toString(utl.getVehicleList()));
   }
   
   
   
   
   /**
   * Test toString of UseTaxList. 
   * @throws FileNotFoundException = throws excpetion.
      */
   @Test public void testToString() throws FileNotFoundException {
      UseTaxList utl = new UseTaxList();
      utl.readVehicleFile("vehicles2.txt");
      Assert.assertEquals("Testing toString of UseTaxList object",
                        "\nJones, Sam: Car 2014 Honda Accord"
         + "\nValue: $22,000.00 Use Tax: $220.00"
         + "\nwith Tax Rate: 0.01"
         + "\n"
         + "\nJones, Jo: Car 2014 Honda Accord (Alternative Fuel)"
         + "\nValue: $22,000.00 Use Tax: $110.00"
         + "\nwith Tax Rate: 0.005"
         + "\n"
         + "\nSmith, Pat: Car 2015 Mercedes-Benz Coupe"
         + "\nValue: $110,000.00 Use Tax: $3,300.00"
         + "\nwith Tax Rate: 0.01 Luxury Tax Rate: 0.02"
         + "\n"
         + "\nSmith, Pop: Car 2015 Mercedes-Benz Coupe"
         + "\nValue: $110,000.00 Use Tax: $3,300.00"
         + "\nwith Tax Rate: 0.01 Luxury Tax Rate: 0.02"
         + "\n"
         + "\nSmith, Jack: Car 2015 Mercedes-Benz Coupe (Alternative Fuel)"
         + "\nValue: $110,000.00 Use Tax: $2,750.00"
         + "\nwith Tax Rate: 0.005 Luxury Tax Rate: 0.02"
         + "\n"
         + "\nWilliams, Jo: Truck 2012 Chevy Silverado"
         + "\nValue: $30,000.00 Use Tax: $600.00"
         + "\nwith Tax Rate: 0.02"
         + "\n"
         + "\nWilliams, Sam: Truck 2010 Chevy Mack (Alternative Fuel)"
         + "\nValue: $40,000.00 Use Tax: $1,600.00"
         + "\nwith Tax Rate: 0.01 Large Truck Tax Rate: 0.03"
         + "\n"
         + "\nWilliams, Pat: SemiTractorTrailer 2010 International Big Boy"
         + "\nValue: $45,000.00 Use Tax: $3,150.00"
         + "\nwith Tax Rate: 0.02 Large Truck Tax Rate: 0.03 "
         + "Axle Tax Rate: 0.02"
         + "\n"
         + "\nBrando, Marlon: Motorcycle 1964 Harley-Davidson Sportster"
         + "\nValue: $14,000.00 Use Tax: $280.00"
         + "\nwith Tax Rate: 0.005 Large Bike Tax Rate: 0.015"
         + "\n",
         utl.toString());
   }
   
   /** Test calculateTotalUseTax of all Vehicle obj in UseTaxList.
   * @throws FileNotFoundException 
   */
   @Test public void testCalculateTotalUseTax() throws FileNotFoundException {
      UseTaxList utl = new UseTaxList();
      utl.readVehicleFile("vehicles2.txt");
      Assert.assertEquals("Testing calculateTotalUseTax for all Vehicle "
                            + "obj in UseTaxList",
                            15310.00, utl.calculateTotalUseTax(), 0.01);
   
   }
   
   /** Test calculateTotalValue of all Vehicle obj in UseTaxList.
   * @throws FileNotFoundException 
   */
   @Test public void testTotalValue() throws FileNotFoundException {
      UseTaxList utl = new UseTaxList();
      utl.readVehicleFile("vehicles2.txt");
      Assert.assertEquals("Testing calculateTotalUseTax for all Vehicle "
                            + "obj in UseTaxList",
                            503000.00, utl.calculateTotalValue(), 0.01);
   
   }
   
   /** Test summary of UseTaxList object.
   * @throws FileNotFoundException 
   */
   @Test public void testSummary() throws FileNotFoundException {
      UseTaxList utl = new UseTaxList();
      utl.readVehicleFile("vehicles2.txt");
      Assert.assertEquals("Tests summary of UseTaxList obj",
                             "------------------------------"
                             + "\nSummary for Tax District 52"
                             + "\n------------------------------"
                             + "\nNumber of Vehicles: 9"
                             + "\nTotal Value: $503,000.00"
                             + "\nTotal Use Tax: $15,310.00\n",
                             utl.summary());
   
   }
   
   
   /** Test listByOwner of UseTaxList object.
   * @throws FileNotFoundException 
   */
   @Test public void testListByOwner() throws FileNotFoundException {
      UseTaxList utl = new UseTaxList();
      utl.readVehicleFile("vehicles2.txt");
      Assert.assertEquals("Tests listByOwner of UseTaxList obj",
                          "------------------------------\n"
                          + "Vehicles by Owner"
                          + "\n------------------------------"
                          + "\n"
                          + "\nBrando, Marlon: Motorcycle 1964 "
                          + "Harley-Davidson Sportster"
                          + "\nValue: $14,000.00 Use Tax: $280.00"
                          + "\nwith Tax Rate: 0.005 Large Bike Tax Rate: 0.015"
                          + "\n"
                          + "\nJones, Jo: Car 2014 Honda Accord "
                          + "(Alternative Fuel)"
                          + "\nValue: $22,000.00 Use Tax: $110.00"
                          + "\nwith Tax Rate: 0.005"
                          + "\n"
                          + "\nJones, Sam: Car 2014 Honda Accord"
                          + "\nValue: $22,000.00 Use Tax: $220.00"
                          + "\nwith Tax Rate: 0.01"
                          + "\n"
                          + "\nSmith, Jack: Car 2015 Mercedes-Benz "
                          + "Coupe (Alternative Fuel)"
                          + "\nValue: $110,000.00 Use Tax: $2,750.00"
                          + "\nwith Tax Rate: 0.005 Luxury Tax Rate: 0.02"
                          + "\n"
                          + "\nSmith, Pat: Car 2015 Mercedes-Benz Coupe"
                          + "\nValue: $110,000.00 Use Tax: $3,300.00"
                          + "\nwith Tax Rate: 0.01 Luxury Tax Rate: 0.02"
                          + "\n"
                          + "\nSmith, Pop: Car 2015 Mercedes-Benz Coupe"
                          + "\nValue: $110,000.00 Use Tax: $3,300.00"
                          + "\nwith Tax Rate: 0.01 Luxury Tax Rate: 0.02"
                          + "\n"
                          + "\nWilliams, Jo: Truck 2012 Chevy Silverado"
                          + "\nValue: $30,000.00 Use Tax: $600.00"
                          + "\nwith Tax Rate: 0.02"
                          + "\n"
                          + "\nWilliams, Pat: SemiTractorTrailer 2010 "
                          + "International Big Boy"
                          + "\nValue: $45,000.00 Use Tax: $3,150.00"
                          + "\nwith Tax Rate: 0.02 Large Truck Tax Rate: "
                          + "0.03 Axle Tax Rate: 0.02"
                          + "\n"
                          + "\nWilliams, Sam: Truck 2010 Chevy Mack "
                          + "(Alternative Fuel)"
                          + "\nValue: $40,000.00 Use Tax: $1,600.00"
                          + "\nwith Tax Rate: 0.01 Large Truck Tax Rate: 0.03"
                          + "\n",
                          utl.listByOwner());
   }
     
 /** Test listByUseTax of UseTaxList object.
   * @throws FileNotFoundException 
   */
   @Test public void testListByUseTax() throws FileNotFoundException {
      UseTaxList utl = new UseTaxList();
      utl.readVehicleFile("vehicles2.txt");
      Assert.assertEquals("Tests listByUseTax of UseTaxList obj",
                          "------------------------------\n"
                          + "Vehicles by Use Tax"
                          + "\n------------------------------"
                          + "\n"
                          + "\nJones, Jo: Car 2014 Honda Accord "
                          + "(Alternative Fuel)"
                          + "\nValue: $22,000.00 Use Tax: $110.00"
                          + "\nwith Tax Rate: 0.005"
                          + "\n"
                          + "\nJones, Sam: Car 2014 Honda Accord"
                          + "\nValue: $22,000.00 Use Tax: $220.00"
                          + "\nwith Tax Rate: 0.01"
                          + "\n"
                          + "\nBrando, Marlon: Motorcycle 1964 "
                          + "Harley-Davidson Sportster"
                          + "\nValue: $14,000.00 Use Tax: $280.00"
                          + "\nwith Tax Rate: 0.005 Large Bike Tax Rate: 0.015"
                          + "\n"
                          + "\nWilliams, Jo: Truck 2012 Chevy Silverado"
                          + "\nValue: $30,000.00 Use Tax: $600.00"
                          + "\nwith Tax Rate: 0.02"
                          + "\n"
                          + "\nWilliams, Sam: Truck 2010 Chevy Mack "
                          + "(Alternative Fuel)"
                          + "\nValue: $40,000.00 Use Tax: $1,600.00"
                          + "\nwith Tax Rate: 0.01 Large Truck Tax Rate: 0.03"
                          + "\n"
                          + "\nSmith, Jack: Car 2015 Mercedes-Benz Coupe "
                          + "(Alternative Fuel)"
                          + "\nValue: $110,000.00 Use Tax: $2,750.00"
                          + "\nwith Tax Rate: 0.005 Luxury Tax Rate: 0.02"
                          + "\n"
                          + "\nWilliams, Pat: SemiTractorTrailer "
                          + "2010 International Big Boy"
                          + "\nValue: $45,000.00 Use Tax: $3,150.00"
                          + "\nwith Tax Rate: 0.02 Large Truck Tax Rate:"
                          + " 0.03 Axle Tax Rate: 0.02"
                          + "\n"
                          + "\nSmith, Pat: Car 2015 Mercedes-Benz Coupe"
                          + "\nValue: $110,000.00 Use Tax: $3,300.00"
                          + "\nwith Tax Rate: 0.01 Luxury Tax Rate: 0.02"
                          + "\n"
                          + "\nSmith, Pop: Car 2015 Mercedes-Benz Coupe"
                          + "\nValue: $110,000.00 Use Tax: $3,300.00"
                          + "\nwith Tax Rate: 0.01 Luxury Tax Rate: 0.02"
                          + "\n",
                          utl.listByUseTax());
                           
   }
   
   /** Test excludedRecordsLIst of UseTaxList object.
   * @throws FileNotFoundException 
   */
   @Test public void testExcludedRecordsList() throws FileNotFoundException {
      UseTaxList utl = new UseTaxList();
      utl.readVehicleFile("vehicles2.txt");
      Assert.assertEquals("Tests listByUseTax of UseTaxList obj",
                             "------------------------------\n"
                             + "Excluded Records"
                             + "\n------------------------------"
                             + "\n"
                             + "\nNegativeValueException: Numeric values must "
                             + "be nonnegative in:"
                             + "\ncar; Jones, Pat; 2014 Honda Accord; "
                             + "-22000; true"
                             + "\n"
                             + "\nInvalid Vehicle Category in:"
                             + "\nrace car; Zinc, Zed; 2013 Custom Hot Rod; "
                             + "61000; false"
                             + "\n"
                             + "\njava.util.NoSuchElementException in:"
                             + "\nCar; Smith, Pet; 2015 Mercedes-Benz Coupe; "
                             + "110000"
                             + "\n"
                             + "\nNegativeValueException: Numeric values must "
                             + "be nonnegative in:"
                             + "\nTruck; Williams, Alex; 2012 Chevy Silverado; "
                             + "30000; false; -3.0"
                             + "\n"
                             + "\nInvalid Vehicle Category in:"
                             + "\nFiretruck; Body, Abel; 2015 GMC FE250; "
                             + "55000; false; 2.5"
                             + "\n"
                             + "\njava.lang.NumberFormatException: For input "
                             + "string: \"five\" in:"
                             + "\ntruck; Williams, Bam; 2010 Chevy Mack; "
                             + "40000; true; five"
                             + "\n"
                             + "\nNegativeValueException: Numeric values "
                             + "must be nonnegative in:"
                             + "\nSemi; Williams, Mat; 2012 Volvo Big Mack; "
                             + "35000; false; 5.0; -4"
                             + "\n"
                             + "\nNegativeValueException: Numeric values "
                             + "must be nonnegative in:"
                             + "\nMotorcycle; Rider, Easy; 1967 "
                             + "Harley-Davidson Electra; 10000; false; -1200"
                             + "\n",
                             utl.excludedRecordsList());
   }
}
