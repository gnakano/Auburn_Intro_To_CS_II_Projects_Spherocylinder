import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;
import java.util.NoSuchElementException;

/** 
 * UseTaxList - provides methods for reading in data.
 * and generating reports.
 * utilizes inheritance and polymorphism
 *
 * Project 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
 */
public class UseTaxList {

// instance variables
   private String taxDistrict;
   private Vehicle[] vehicleList;
   private String[] excludedRecords; 

/**
* Cosnstructor of UseTaxList.
*
* initializes taxDistrict, vehicleList, excludeRecords
*/
   public UseTaxList() {
      taxDistrict = "not yet assigned";
      vehicleList = new Vehicle[0];
      excludedRecords = new String[0];
   }


/**
* readVehicleFile = Reads file for Vehicle list.
*
* @param fileName = file name to be read
* @throws FileNotFoundException = exception to be thrown.
*/
   public void readVehicleFile(String fileName) 
      throws FileNotFoundException {
   
      Scanner fileScan = new Scanner(new File(fileName));
   
   //first line is set to taxDistrict
      taxDistrict = fileScan.nextLine();  
      // System.out.println("The Tax District is: " + taxDistrict);
   // loop through the rest of the file
      
      while (fileScan.hasNext()) {
         
         String vehicleLine;
         vehicleLine = fileScan.nextLine();
         try {
         
         // System.out.println(vehicleLine);
            Scanner vehicleInfo = new Scanner(vehicleLine);
            vehicleInfo.useDelimiter(";");
         
            String vehicleType = vehicleInfo.next();
            String vehicleSwitch = vehicleType.toUpperCase();
            char vehicle = vehicleSwitch.charAt(0);
         
            String vehicleOwner = vehicleInfo.next().trim();
            String vehicleYearMakeModel = vehicleInfo.next().trim();
         
            double vehicleValue = Double.parseDouble(vehicleInfo.next().trim());
         
            boolean vehicleAltFuel = 
               Boolean.parseBoolean(vehicleInfo.next().trim());
         
            double vehicleTons = 0.0;
            int vehicleAxles = 0;
            int vehicleEngineSize = 0;
         
            if (vehicleInfo.hasNext()) {
            // System.out.println("There is another item!\n");
            
               if (vehicle == 'M') {
               
                  vehicleEngineSize 
                     = Integer.parseInt(vehicleInfo.next().trim());
               }
               
               if (vehicle == 'T' || vehicle == 'S') {
               // System.out.println("The item is either a Truck or Semi");
                  vehicleTons = Double.parseDouble(vehicleInfo.next().trim());
                  if (vehicleInfo.hasNext()) {
                  // System.out.println("There is another item!\n");
                     vehicleAxles = Integer.parseInt(vehicleInfo.next().trim());
                  }
               
               }                                       
            
                           
            }
         
         // Switch statement for the vehicles
         
            switch (vehicle) {
               case 'C':
               // System.out.println("Creating a car object");
                  Car c = new Car(vehicleOwner, vehicleYearMakeModel, 
                               vehicleValue, vehicleAltFuel);
                  // System.out.println("") 
                  addVehicle(c);
               // System.out.println(Arrays.toString(getVehicleList()));
                  break;
               
               case 'T':
               // System.out.println("It is a Truck object");
                  Truck t = new Truck(vehicleOwner, vehicleYearMakeModel, 
                                    vehicleValue, vehicleAltFuel, vehicleTons);
                  // System.out.println("");
                  addVehicle(t);
               // System.out.println(Arrays.toString(getVehicleList()));
               // System.out.println("");
                  break;
               
               case 'S':
               // System.out.println("It is a Semi object");
                  SemiTractorTrailer s = new SemiTractorTrailer(vehicleOwner, 
                     vehicleYearMakeModel, vehicleValue, vehicleAltFuel, 
                     vehicleTons, vehicleAxles);
                  // System.out.println("");
                  addVehicle(s);
               // System.out.println(Arrays.toString(getVehicleList()));
               // System.out.println("");
                  break;
               
               
               case 'M':
               // System.out.println("It is a Motorcylce object");
                  // System.out.println("");
                  Motorcycle m = new Motorcycle(vehicleOwner, 
                     vehicleYearMakeModel, 
                     vehicleValue, vehicleAltFuel, vehicleEngineSize);
                  // System.out.println("");
                  addVehicle(m);
               // System.out.println(Arrays.toString(getVehicleList()));
               // System.out.println("");
                  break;
                  
               default:
               
               // System.out.println("Excluded Car object");
               // System.out.println("");
                  String output = "Invalid Vehicle Category in:\n";
                  String vehicleExcluded = "";
                  vehicleExcluded += vehicleType + "; " 
                     + vehicleOwner + "; " + vehicleYearMakeModel + "; " 
                     + (int) vehicleValue + "; " + vehicleAltFuel;
                  while (vehicleInfo.hasNext()) {
                     vehicleExcluded += "; " + vehicleInfo.next().trim();
                  }
                  output += vehicleExcluded;
               // System.out.println("");
                  addExcludedRecord(output);
               // System.out.println(Arrays.toString(getVehicleList()));
               // System.out.println("");
            }  
         }
         catch (NegativeValueException e) {
            String output = e + " in:\n" + vehicleLine;
            // System.out.println(output);
            addExcludedRecord(output);
         }
         
         catch (NumberFormatException e) {
            String output = e + " in:\n" + vehicleLine;
            // System.out.println(output);
            addExcludedRecord(output);
         }
         
         catch (NoSuchElementException e) {
            String output = e + " in:\n" + vehicleLine;
            // System.out.println(output);
            addExcludedRecord(output);
         }
           
                    
      }
      
      
              
   
       
   }
   
   /**
   * getTaxDistrict = gets Tax District that on Vehicle File.
   * or set.
   *
   * @return taxDistrict = taxDistrict that is assigned
   */
   public String getTaxDistrict() {
      return taxDistrict;
   }
   
   /**
   * setTaxDistrict = sets Tax Disrict.
   *
   * @param taxDistrictIn = Tax Distrct to be set.
   */
   public void setTaxDistrict(String taxDistrictIn) {
      taxDistrict = taxDistrictIn;
   }
   
/**
* getVehicleList = gets vehicle array list.
*
* @return vehicleList = Vehicle list array
*/
   public Vehicle[] getVehicleList() {
      return vehicleList;
   }

/**
* getExcludedRecords = get excluded Records.
*
* @return excludedRecords = Excluded records. 
*/
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   
   /**
   * addVehicle = adds Vehicle to vehicle list.
   *
   * @param vehicleIn = vehicle to ve added.
   */
   public void addVehicle(Vehicle vehicleIn) {
      vehicleList = Arrays.copyOf(vehicleList, vehicleList.length + 1);
      vehicleList[vehicleList.length - 1] = vehicleIn;
   }
   
   /**
   * addExcludedRecord = add excludedRecord.
   *
   * @param excludedVehicleInfo = String of vehicle to be excluded
   */
   public void addExcludedRecord(String excludedVehicleInfo) {
      excludedRecords = Arrays.copyOf(excludedRecords, 
         excludedRecords.length + 1);
      excludedRecords[excludedRecords.length - 1] = excludedVehicleInfo;
   }
   
   /**
    * toString = String rep of List of Vehicles.
    *
    * @return output = string rep of vehicle.
    */
   public String toString() {
      String output = "";
      for (Vehicle vehicle : vehicleList) {
         output += "\n";
         output += vehicle.toString();
         output += "\n";
      }
      return output;
   }
   
   /** 
   * calculateTotalTax = total tax for all vehicles in array.
   *
   * @return totalTax = total tax for all vehicles in array
   */
   public double calculateTotalUseTax() {
      double totalTax = 0.0;
      // System.out.println("The initial tax is: " + totalTax);
      for (Vehicle vehicle : vehicleList) {
            // System.out.println("The tax to be added is " + vehicle.useTax());
      
         totalTax += vehicle.useTax();
      }
      return totalTax;
   }
   
   /**
   * calculateTotalValue = total value for all vehicles in array.
   *
   * @return totalValue = total value for all value in array
   */
   public double calculateTotalValue() {
      double totalValue = 0.0;
      // System.out.println("The initial value is: " + totalValue);
      for (Vehicle vehicle : vehicleList) {
         totalValue += vehicle.getValue();
      }
      return totalValue;
   }
   
   /**
   * summary = summary for the Tax District.
   * diff than string
   *
   * @return summary = summary of Tax District
   */
   public String summary() {
    
      DecimalFormat df = new DecimalFormat("##,###,##0.00");
   
      String summary = "------------------------------\n";
      summary += "Summary for " + taxDistrict + "\n";
      summary += "------------------------------";
      summary += "\nNumber of Vehicles: " + vehicleList.length;
      summary += "\nTotal Value: $" + df.format(calculateTotalValue());
      summary += "\nTotal Use Tax: $" 
         + df.format(calculateTotalUseTax()) + "\n";
      return summary;
   }
   
   /**
   * listByOwner = List of Vehicles ordered by owner (natural order).
   *
   * @return ownerList = list of Vehicle owners ordered
   */
   public String listByOwner() {
      String ownerList = "------------------------------\n";
      ownerList += "Vehicles by Owner";
      ownerList += "\n------------------------------";
      Arrays.sort(vehicleList);
      ownerList += "\n" + toString();
   
      return ownerList;
   }
   
   /**
   * listByUseTax = List of vehicles ordered by useTax (natural order).
   *
   * @return usTaxList = list of Vehicles ordered by useTax
   */
   public String listByUseTax() {
      String useTaxList = "------------------------------\n";
      useTaxList += "Vehicles by Use Tax";
      useTaxList += "\n------------------------------";
      Arrays.sort(vehicleList, new UseTaxComparator());
      useTaxList += "\n" + toString();
      return useTaxList;
   }
   
   /**
   * excludedRecordsList = Excluded records list.
   *
   * @return listExcludedRecords = excluded records list.
   */
   public String excludedRecordsList() {
      String listExcludedRecords = "------------------------------\n";
      listExcludedRecords += "Excluded Records";
      listExcludedRecords += "\n------------------------------\n";
      for (String exRec : excludedRecords) {
         listExcludedRecords += "\n" + exRec + "\n";
      }
      return listExcludedRecords;
   }
   
}