import java.io.FileNotFoundException;

/** 
 * VehiclesPart3 - provides methods for reading in data.
 * and generating reports.
 * utilizes try / catch exceptions    
 *
 * Project 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
 */


public class VehiclesPart3 {


/** 
 * main - provides methods for reading in data.
 * from command line.
 * utilizes try / catch exceptions    
 *
 * @param args - command line used for input of file
 */

   public static void main(String[] args) {
   
      String fileName = "";
      for (String file : args) {
         fileName = file;
      }
      
      
      // System.out.println("The file name is: " + fileName);
      UseTaxList utl = new UseTaxList();
      try {
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
      catch (FileNotFoundException e) {
         if (args.length == 0) {
            System.out.println("*** File name not provided by "
                     + "command line argument.\n"
                     + "Program ending.");
         }
         else {
            System.out.println("*** File not found.\n"
                     + "Program ending.");
         }
      
      }
      
      
    
      
   }

   
   
   


}