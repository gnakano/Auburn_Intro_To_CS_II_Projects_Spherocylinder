import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/** 
 * UseTaxComparatorTest - tests for UseTaxComparator.
 * 
 *
 * Project 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
 */

public class UseTaxComparatorTest {

/** Test compare() and v1 is less than v2 and return -1. 
*
* @throws NegativeValueException - negatiae values for inputs
*/
   @Test public void compareLess() throws NegativeValueException {
      Car car2 = new Car("Nakano, Genji", "2018 Tesla X", 45000, true);
      Motorcycle bike4 = new Motorcycle("Moomb, Symba", "2018 Meowtercycle", 
                                      18000, true, 400);
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Symba, Mini-Moos", 
                                 "2012 MoomBamobile", 60000, true, 1.5, 7);
      Truck truck3 = new Truck("Christian, Nina", "2018 Chevy Colorado", 
                                 35000, true, 2.5);
                                 
      UseTaxComparator utc = new UseTaxComparator();
      Assert.assertEquals("Tests compare() by useTax",
                           -1, utc.compare(car2, semi1));
   }
   
   /** Test compare() v1 and v2 for greater return 1. 
   * 
   * @throws NegativeValueException - for negative input
   *
   */
   @Test public void compareGreater() throws NegativeValueException {
      Car car2 = new Car("Nakano, Genji", "2018 Tesla X", 45000, true);
      Motorcycle bike4 = new Motorcycle("Moomb, Symba", "2018 Meowtercycle", 
                                      18000, true, 400);
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Symba, Mini-Moos", 
                                 "2012 MoomBamobile", 60000, true, 1.5, 7);
      Truck truck3 = new Truck("Christian, Nina", "2018 Chevy Colorado", 
                                 35000, true, 2.5);
                                 
      UseTaxComparator utc = new UseTaxComparator();
      Assert.assertEquals("Tests compare() by useTax",
                           1, utc.compare(semi1, car2));
   }

   /** Test compare() v1 and v2 for equal return 0. 
   *
   * @throws NegativeValueException - for negative value input
   */
   @Test public void compareEqual() throws NegativeValueException {
      Car car2 = new Car("Nakano, Genji", "2018 Tesla X", 45000, true);
      Car car3 = new Car("Moomba, Symba", "2019 CatMobile", 45000, true);
      Motorcycle bike4 = new Motorcycle("Moomb, Symba", "2018 Meowtercycle", 
                                      18000, true, 400);
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Symba, Mini-Moos", 
                                 "2012 MoomBamobile", 60000, true, 1.5, 7);
      Truck truck3 = new Truck("Christian, Nina", "2018 Chevy Colorado", 
                                 35000, true, 2.5);
                                 
      UseTaxComparator utc = new UseTaxComparator();
      Assert.assertEquals("Tests compare() by useTax",
                           0, utc.compare(car3, car2));
   }

   
}
