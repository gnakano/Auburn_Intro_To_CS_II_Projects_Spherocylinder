// import java.io.File;
import java.io.FileNotFoundException;

/** 
 * VehiclesPart2 - test Driver for Vehicles using.
 * UseTaxList() and UseTaxComparator()
 * 
 *
 * Project 5
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 10, 2019
 */

public class VehiclesPart2 {

/**
* main - driver to run Vehicles2.
*
* @param args - command line args not used.
* @throws FileNotFoundException - File Not Found Exception
*/
   public static void main(String[] args) throws FileNotFoundException {
      
      String fileName = "";
      for (String file : args) {
         fileName = file;
      }
      // System.out.println("The file name is: " + fileName);
      UseTaxList utl = new UseTaxList();
      utl.readVehicleFile(fileName);
      System.out.println(utl.summary());
      System.out.println("");
      System.out.println(utl.listByOwner());
      System.out.println("");
      System.out.println(utl.listByUseTax());
      System.out.println("");
      System.out.println(utl.excludedRecordsList());
      System.out.println("");
   }
}