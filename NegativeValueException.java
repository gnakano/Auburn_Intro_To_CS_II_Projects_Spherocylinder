/** 
 * NegativeValueException - NegativeValueException for Vehicle class.
 * cathes negaive values which would be invalid for value, tons, axles
 * and engin size
 *
 * Project 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
 */
public class NegativeValueException extends Exception {

// or yocan extends RuntimeException // this would be checked

/**
* NegativeValueException - exception to handle negative values.
*
*/
   public NegativeValueException() {
   // message for exception.
      super("Numeric values must be nonnegative");
   
   }

}