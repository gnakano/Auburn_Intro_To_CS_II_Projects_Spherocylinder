/** 
 * Motorcycle -  Motorcyle class inherits Vehicle class.
 * 
 *
 * Project 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
 */

public class Motorcycle extends Vehicle {

// instance variables
   protected double engineSize;

/** Constant  TAX_RATE. */
   public static final double TAX_RATE = 0.005;
   
   /** Constant Alternative_FUEL_TAX_RATE. */
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.0025;
   /** Constant LARGE_BIKE_CC_THRESHOLD. */
   public static final double LARGE_BIKE_CC_THRESHOLD = 499;
   /** Constant LARGE_BIKE_TAX_RATE. */
   public static final double LARGE_BIKE_TAX_RATE = 0.015;
   
  /** 
  * Constructor = Motorcyle objects.
  *
  * @param ownerIn = Owner to be set.
  * @param yearMakeModelIn = yearMakeModel to be set.
  * @param valueIn = value to be set.
  * @param alternativeFuelIn = t / f for alternativeFuel.
  * @param engineSizeIn = engineSize to be set
  * @throws NegativeValueException - if negative number for
  * engineSizeIn
  */
   public Motorcycle(String ownerIn, String yearMakeModelIn,
      double valueIn, boolean alternativeFuelIn, 
      int engineSizeIn) 
      throws NegativeValueException {
      super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
      if (engineSizeIn < 0) {
         vehicleCount--;
         throw new NegativeValueException();
      }
      engineSize = engineSizeIn;
   }
  
  
  /**
  * getEngineSize = gets Engine Size.
  *
  * @return engineSize = engine size.
  */ 
   public double getEngineSize() {
      return engineSize;
   }
  
  /**
  * setEngineSize = sets Engine Size.
  *
  * @param engineSizeIn = engine size to be set.
  */
   public void setEngineSize(double engineSizeIn) {
      engineSize = engineSizeIn;
   } 
  
  /**
  * useTax = useTax for Motorcycle objects.
  *
  * @return appliedTax = use tax to be applied.
  */  
   public double useTax() {
      double appliedTax = 0.0;
   // if uses alt fuel
      if (alternativeFuel) {
         appliedTax = value * ALTERNATIVE_FUEL_TAX_RATE;
      } else {
         appliedTax = value * TAX_RATE;
      }
   
   // if engineSize exceeds LARGE_BIKE_CC_THRESHOLD
      if (engineSize > LARGE_BIKE_CC_THRESHOLD) {
         appliedTax += (value * LARGE_BIKE_TAX_RATE);
      
      }
   
   
      return appliedTax;
   }
   
   /**
   * toString = String rep of object.
   *
   * @return output = String rep of object.
   */
   public String toString() {
      String output = "";
      output = super.toString();
      
      // if uses Alt Fuel
      if (alternativeFuel) {
         output += "\nwith Tax Rate: " + ALTERNATIVE_FUEL_TAX_RATE;
      
      } else {
         output += "\nwith Tax Rate: " + TAX_RATE;
      }
      // if exceeds LARGE_BIKE_CC_THRESHOLD 
      if (engineSize > LARGE_BIKE_CC_THRESHOLD) {
         output += " Large Bike Tax Rate: " +  LARGE_BIKE_TAX_RATE;
      }
      
      return output;
   }
   
}