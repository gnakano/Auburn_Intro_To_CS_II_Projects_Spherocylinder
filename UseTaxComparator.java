import java.util.Comparator;

/** 
 * UseTaxComparator - UseTaxComparator to compare Vehicle objects.
 * for natural ordering.
 * 
 *
 * Project 5
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 10, 2019
 */
public class UseTaxComparator implements Comparator<Vehicle> {

/**
* compare = compare vehicle objects for natural ordering.
*
* @param v1 = vehicle1 object to compare
* @param v2 = vehicle2 object to compare
* @return int = for comparable.
*/
   public int compare(Vehicle v1, Vehicle v2) {
   
      if (v1.useTax() < v2.useTax()) {
         return -1;
      }
      
      else if (v1.useTax() > v2.useTax()) {
         return 1;
      }
      
      else {
         return 0;
      }
   
   }

}