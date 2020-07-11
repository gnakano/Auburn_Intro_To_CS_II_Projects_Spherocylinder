   /** 
 * Car - Car class inherits Vehicle class.
 * 
 *
 * Project 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
 */
public class Car extends Vehicle {
 
 // instance variables
 // constants
 
 /** Constant for TAX_Rate. */
   public static final double TAX_RATE = 0.01;
   
   /** Constant for ALTERNATIVE_FUEL_TAX_RATE. */
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.005;
   
   /** Constant for LUXURY_THRESHOLD. */
   public static final double LUXURY_THRESHOLD = 50000;
   
   /** Constant for LUXURY_TAX_RATE. */
   public static final double LUXURY_TAX_RATE = 0.02;
 
 /**
 * constructor = creates car object using super to use.
 * vehicle constructor
 *
 * @param ownerIn = owner to be set.
 * @param yearMakeModelIn = yearMakeModel to be set.
 * @param valueIn = value to be set.
 * @param alternativeFuelIn = t/f if vehicle uses alt fuel.
 * @throws NegativeValueException - thrown if negative number
 * is input for values
 */
   public Car(String ownerIn, String yearMakeModelIn, 
               double valueIn, boolean alternativeFuelIn) 
               throws NegativeValueException {
      super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn);
   }
   
   /**
   * useTax = tax to be calculated.
   *
   * @return tax to be calculted;
   */
   public double useTax() {
   // tax to be applied
      double taxApplied;
      taxApplied = value * TAX_RATE;
   
      if (alternativeFuel) {
         taxApplied = value * ALTERNATIVE_FUEL_TAX_RATE;
      } 
   
      if (LUXURY_THRESHOLD < value) {
         taxApplied += (value * LUXURY_TAX_RATE);
      }
      return taxApplied;
   }
   
   /**
   * toString = override inherited toString.
   * adds the Tax Rate.
   *
   * @return output = overidden String with the tax rate.
   */
   public String toString() {
      String output = "";
      output = super.toString() + "\n";
      output += "with Tax Rate: ";
      if (LUXURY_THRESHOLD < value) {
         output += (((useTax() - (value * LUXURY_TAX_RATE)) / value));
         output += " Luxury Tax Rate: " + LUXURY_TAX_RATE;
      } else {
         output += (useTax() / value);
      }
   
       
      return output;
   
   }
}
