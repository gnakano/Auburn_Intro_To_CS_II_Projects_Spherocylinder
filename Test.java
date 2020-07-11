// import java.io.File;
import java.io.FileNotFoundException;
// import java.util.Scanner;
import java.util.Arrays;
// import java.lang.Throwable;

/** Test. */
public class Test {

/** 
* main - test.
* @param args -command line args not used.
* @throws FileNotFoundException - file not found exception
*/
   public static void main(String[] args) throws FileNotFoundException {
      UseTaxList gen = new UseTaxList();
      // gen.getTaxDistrict();
      // System.out.println(gen.getTaxDistrict());
      Vehicle.resetVehicleCount();
      gen.readVehicleFile("vehicles2.txt");
      
      // Car car2 = new Car("Nakano, Genji", "2018 Tesla X", 45000, true);
      // Motorcycle bike4 = new Motorcycle("Moomb, Symba", "2018 Meowtercycle", 
         //                               18000, true, 400);
      // SemiTractorTrailer semi1 = new SemiTractorTrailer("Symba, Mini-Moos", 
         // "2012 MoomBamobile", 60000, true, 1.5, 7);
      // Truck truck3 = new Truck("Christian, Nina", "2018 Chevy Colorado", 
         //                         35000, true, 2.5);
      try {                          
         Car car2 = new Car("Nakano, Genji", "2018 Tesla X", 45000, true);
         Motorcycle bike4 = new Motorcycle("Moomb, Symba", "2018 Meowtercycle", 
                                       18000, true, 400);
         SemiTractorTrailer semi1 = new SemiTractorTrailer("Symba, Mini-Moos", 
            "2012 MoomBamobile", 60000, true, 1.5, 7);
         Truck truck3 = new Truck("Christian, Nina", "2018 Chevy Colorado", 
                                 35000, true, 2.5);                           
         gen.addVehicle(car2);
         gen.addVehicle(bike4);
         gen.addVehicle(semi1);
         gen.addVehicle(truck3);
      } 
      catch (NegativeValueException e) {
         System.out.println("You have an error");
      }                   
      // gen.addExcludedRecord("Hybrid Bycicle; Machado, 
      // Manny; 2019 Tesla Bike T; 2000; true");
      // gen.addVehicle(car2);
      // gen.addVehicle(bike4);
      // gen.addVehicle(semi1);
      // gen.addVehicle(truck3);
      // System.out.println("");
      // System.out.println(gen.getTaxDistrict());
      // System.out.println(gen.summary());
      // System.out.println(Arrays.toString(gen.getVehicleList()));
      // Vehicle vehicle1 = gen.getVehicleList()[0];
      System.out.println(Vehicle.getVehicleCount());
      // System.out.println(vehicle1);
      // System.out.println(gen.listByOwner());
      // System.out.println(gen.listByUseTax());
      // gen.addExcludedRecord("Hybrid Bycicle; Machado, Manny; "
         //                   + "2019 Tesla Bike T; 2000; true");
   
      // System.out.println(gen.excludedRecordsList());
      // System.out.println(Arrays.toString(gen.getExcludedRecords()));
   
      System.out.println(Arrays.toString(gen.getVehicleList()));
      // System.out.println(Arrays.toString(gen.getExcludedRecords()));
      
      // System.out.println(gen.toString());
      // System.out.println(gen.calculateTotalUseTax());
      // System.out.println(gen.calculateTotalValue());
   
      // System.out.println(gen.listByUseTax());
      // System.out.println(gen.toString());
      /* try {
         Car car2 = new Car("Nakano, Genji", "2018 Tesla X", -45000, true);
         Motorcycle bike4 = new Motorcycle("Moomb, Symba", "2018 Meowtercycle", 
                                      18000, true, 400);
         SemiTractorTrailer semi1 = new SemiTractorTrailer("Symba, Mini-Moos", 
                                 "2012 MoomBamobile", 60000, true, 1.5, 7);
         Truck truck3 = new Truck("Christian, Nina", "2018 Chevy Colorado", 
                                 35000, true, 2.5);
         System.out.println("The vehicle tax for: " 
            +  car2.getYearMakeModel() + " and the use tax is: " 
            + car2.useTax());
         System.out.println("The vehicle tax for: " 
            +  bike4.getYearMakeModel() + " and the use tax is: " 
            + bike4.useTax());
         System.out.println("The vehicle tax for: " 
            +  semi1.getYearMakeModel() 
            + " and the use tax is: " 
            + semi1.useTax());
         System.out.println("The vehicle tax for: " 
            +  truck3.getYearMakeModel() 
            + " and the use tax is: " 
            + truck3.useTax());
         UseTaxComparator utc = new UseTaxComparator();
         // System.out.println(utc.compare(car2, semi1));
         // System.out.println(utc.compare(car2, bike4));
         // System.out.println(utc.compare(car2, car2));
         // System.out.println(utc.compare(semi1, car2));
         // System.out.println(utc.compare(bike4, car2));
      }
      catch (NegativeValueException nve) {
         String output = nve + " in:\n";
         System.out.print(output);
         
         // System.out.println(nve);
      } */
      
      // System.out.println("The vehicles created is: " 
      // + Vehicle.getVehicleCount());
   }

}