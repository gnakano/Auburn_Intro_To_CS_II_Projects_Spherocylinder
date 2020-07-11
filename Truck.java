/** 
 * Truck - Truck class inherits Vehicle class.
 * 
 *
 * Project 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
 */
public class Truck extends Vehicle {

// instance variable 
   protected double tons; 

// constants
/** Constant for Tax Rate. */
   public static final double TAX_RATE = 0.02;

/** Constant for Alternative Fuel Tax Rate. */
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.01;

/** Constant for Large Truck Tons Threshold. */
   public static final double LARGE_TRUCK_TONS_THRESHOLD = 2.0;

/** Constant for Large Truck Tax Rate. */
   public static final double LARGE_TRUCK_TAX_RATE = 0.03;

/**
* Constructor for Truck Object.
* inherits from Vehicle and takes in 5 parameters
* with 4 from vehicle and 1 to set its own variable
*
* @param ownerIn = owner to be set.
* @param yearMakeModelIn = year, make, Model to be set.
* @param valueIn = value to be set.
* @param alternativeFuelIn = t / f if uses alternative fuel.
* @param tonsIn = tons to be set.
* @throws NegativeValueException - thrown if non-negative 
* number is input
*/
   public Truck(String ownerIn, String yearMakeModelIn,
               double valueIn, boolean alternativeFuelIn,
               double tonsIn) 
               throws NegativeValueException {
               
      super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
      if (tonsIn < 0) {
         vehicleCount--;
         throw new NegativeValueException();
      }
      tons = tonsIn;
   }


/** 
* getTons = gets tons that was set.
*
* @return tons = tons that was set.
*/
   public double getTons() {
      return tons;
   }

/**
* setTons = sets tons to truck object.
*
* @param tonsIn = tons to be set.
*/
   public void setTons(double tonsIn) {
      tons = tonsIn;
   } 

/**
* useTax = tax to be set for truck. 
*
* @return taxApplied = tax to be applied.
*/
   public double useTax() {
   // tax to be applied
      double taxApplied;
      
      taxApplied = value * TAX_RATE;
   
   // alternativeFuel tax
      if (alternativeFuel) {
         taxApplied = value * ALTERNATIVE_FUEL_TAX_RATE;
      }
   
   // tax for tons usage
      if (LARGE_TRUCK_TONS_THRESHOLD < tons) {
         taxApplied += (value * LARGE_TRUCK_TAX_RATE);
      } 
   
      return taxApplied;
   }

   /**
   * toString = String rep of truck object.
   *
   * @return output = String rep of truck object. 
   */
   public String toString() {
      String output = "";
      output += super.toString() + "\n";
      output += "with Tax Rate: ";
      
      if (alternativeFuel) {
         output += ALTERNATIVE_FUEL_TAX_RATE;
      } else {
         output += TAX_RATE;
      }
      
      if (LARGE_TRUCK_TONS_THRESHOLD < tons) {
         output += " Large Truck Tax Rate: " + LARGE_TRUCK_TAX_RATE;
      }
      
      
      return output;
   }

}