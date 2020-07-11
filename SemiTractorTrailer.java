/** 
 * SemiTractorTrailer - SemiTractorTrailer class inherits Truck class.
 * 
 *
 * Project 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
 */
public class SemiTractorTrailer extends Truck {

// instance variable
   protected int axles;

/** Constant for PER_AXLE_TAX_RATE. */
   public static final double PER_AXLE_TAX_RATE = 0.005;

/**
* Constructor SemiTractorTrailer.
*
* @param ownerIn = owner to be set.
* @param yearMakeModelIn = yearMakeModel to be set.
* @param valueIn = value to be set.
* @param alternativeFuelIn = t / f if alternative fuel.
* @param tonsIn = tons to be set.
* @param axlesIn = axles to be set.
* @throws NegativeValueException - if negative number input
* for axlesIn
*/
   public SemiTractorTrailer(String ownerIn, String yearMakeModelIn,
               double valueIn, boolean alternativeFuelIn,
               double tonsIn, int axlesIn) 
               throws NegativeValueException {
      super(ownerIn, yearMakeModelIn, valueIn, alternativeFuelIn, tonsIn);
      if (axlesIn < 0) {
         vehicleCount--;
         throw new NegativeValueException();   
      }
      axles = axlesIn;
   } 
   
   
   /** 
   * getAxles = gets Axles for SemiTractorTrailer.
   *
   * @return axles = axles;
   */
   public int getAxles() {
      return axles;
   }
   
   /** setAxles = sets Axles.
   *
   * @param axlesIn = axles to be set.
   */
   public void setAxles(int axlesIn) {
      axles = axlesIn;
   }
   
   /** 
   * useTax = sets useTax. 
   *
   * @return useTax() for SemiTractorTrailer
   */
   public double useTax() {
       
      return super.useTax() + (value * PER_AXLE_TAX_RATE * axles);
   }
   
   /**
   * toString = string rep of SemiTractorTrailer.
   *
   * @return output = String rep of SemiTractorTrailer.
   */
   public String toString() {
      String output = "";
      output = super.toString();
      output += " Axle Tax Rate: " + (PER_AXLE_TAX_RATE * axles);
      return output;
   }
   
}