/** 
 * VehiclesPart1 - Driver for Vehicle Class and other inherited objects.
 * utilizes inheritance
 *
 * Project 4
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 4, 2019
 */
public class VehiclesPart1 {
             
   
   
   /** 
 * Main Driver to run and test Vehicle class.
 *
 \ @param args = command line arguments not used.
 */
   public static void main(String[] args) {
   
   
      System.out.println("The start of the Vehicles using Inheritance Program");
      System.out.println("");
      System.out.println("First I will create Car ojects!");
   
      System.out.println("Currently there are " + Vehicle.getVehicleCount()
                        + " Vehicle objects.");
   
      Car car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe",
                                 110000, true);
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
   
      Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
                                 110000, false);
         
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
   
      System.out.println("After creating 4 Car objects there are now: " 
                           + Vehicle.getVehicleCount()
                           + " Vehicle objects");
                           
      // System.out.println("I will reset the Car objects now!");
      // Car.resetVehicleCount();
      // System.out.println("Now there are " + Car.getVehicleCount()
         //                   + " Car objects");
                           
                           
      System.out.println("");
      System.out.println("I will now create Truck objects now!");
      // System.out.println("Before I create the Truck objects there are "
         //                  + Truck.getVehicleCount() + " Truck Objects");
                           
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverad0", 
                                 30000, false, 1.5);
      Truck truck2 = new Truck("Williams, Sam", "2010 Chevy Mack", 
                                 40000, true, 2.5);
      Truck truck3 = new Truck("Nakano, Genij", "2018 GMC 1500", 
                                 50000, false, 2.5);  
      Truck truck4 = new Truck("Christian, Nina", "2018 Mercedes", 
                                  35000, true, 1.0); 
      System.out.println("After creating 4 Truck objects, there are "
                           + Vehicle.getVehicleCount() 
                           + " Vehicle objects");
      System.out.println("");
   
   
   
   
      System.out.println("I will now create SemiTractorTrailer objects now!");
      // System.out.println("Before I create the SemiTractorTrailer .
      // objects there are "
         //        + Vehicle.getVehicleCount() + " Vehicle Objects");
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      SemiTractorTrailer semi2 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
      SemiTractorTrailer semi3 = new SemiTractorTrailer("Christian, Nina", 
         "2018 FireTruck", 55000, true, 5.0, 6);
      SemiTractorTrailer semi4 = new SemiTractorTrailer("Symba, Mini-Moos", 
         "2012 MoomBamobile", 60000, true, 1.5, 7);
         
      semi1.toString();
      semi2.toString();
      System.out.println("After creating 4 SemiTractorTrailer "
                           + "objects, there are "
                           + Vehicle.getVehicleCount() + " Vehicle objects");
            
                           
      System.out.println("");
      System.out.println("I will now create Motorcycle objects now!");
      Motorcycle bike1 = new Motorcycle("Brando, Marlon", 
                                       "1964 Harley-Davidson Sportster", 
                                       14000, false, 750);
      Motorcycle bike2 = new Motorcycle("Nakano, Genji", "2018 Honda Ninja", 
                                           15000, false, 400);
      Motorcycle bike4 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, false, 400);
      Motorcycle bike3 = new Motorcycle("Moomba, Symba", "2018 Meowtercycle", 
                                       18000, false, 400);
   
      System.out.println("After creating 4 Motorcycle objects, there are "
                           + Vehicle.getVehicleCount() + " Vehicle objects");
                           
                           
                           
   }  
   
   
   
   
}