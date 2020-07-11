import java.text.DecimalFormat;
/** 
 * Vehicle - abstract Class for other Vehicle type objects.
 * utilizes inheritance
 *
 * Project 6
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version April 15, 2019
 */
public abstract class Vehicle implements Comparable<Vehicle> {

// instance variables 
   protected String owner;
   protected String yearMakeModel;
   protected double value;
   protected boolean alternativeFuel;
   
   // static variable 
   protected static int vehicleCount = 0;

/**
* Constructor for all vehicles.
* takes in and sets Owner, yearMakeModel, value, alternativeFuel
*
* @param ownerIn = sets owner.
* @param yearMakeModelIn = sets YearMakeModel.
* @param valueIn = sets value.
* @param alternativeFuelIn = t/f if vehicle uses alt fuel.
* @throws NegativeValueException - thrown if negative value input
* for constructor value
*/
   public Vehicle(String ownerIn, String yearMakeModelIn,
                  double valueIn, boolean alternativeFuelIn) 
                  throws NegativeValueException {
                  
      if (valueIn < 0) {
         throw new NegativeValueException();
      }               
      owner = ownerIn;
      yearMakeModel = yearMakeModelIn;
      value = valueIn;
      alternativeFuel = alternativeFuelIn;
      vehicleCount++;
   }

/**
* getOwner = gets Owner.
*
*@return owner = vehicle owner.
*/
   public String getOwner() {
      return owner;
   }

/**
* setOwner = sets Owner.
*
*@param ownerIn = owner to be set.
*/
   public void setOwner(String ownerIn) {
      owner = ownerIn;
   }
   
   /**
   * getYearMakeModel = gets yearMakeModel.
   *
   *@return yearMakeModel = vehicle yearMakeModel.
   */
   public String getYearMakeModel() {
      return yearMakeModel;
   }
   
   /**
   * setYearMakeModel = sets yearMakeModel.
   *
   *@param yearMakeModelIn = yearMakeModel to be set.
   */
   public void setYearMakeModel(String yearMakeModelIn) {
      yearMakeModel = yearMakeModelIn;
   }
   
   /**
   * getValue = gets value of vehicle.
   *
   *@return value = value of vehicle.
   */
   public double getValue() {
      return value;
   }
   
   /**
   * setValue = sets value of vehicle.
   *
   *@param valueIn = value of vehicle.
   */
   public void setValue(double valueIn) {
      value = valueIn;
   }
   
   /**
   * getAlternativeFuel = gets boolean if vehicle uses alternative fuel.
   *
   *@return alternativeFuel = t / f if vehicle uses alt fuel.
   */
   public boolean getAlternativeFuel() {
      return alternativeFuel;
   }
   
   /**
   * setAlternativeFuel = sets Alt fuel for vehicle.
   *
   *@param alternativeFuelIn = sets t / f if vehicle uese alt fuel.
   */
   public void setAlternativeFuel(boolean alternativeFuelIn) {
      alternativeFuel = alternativeFuelIn;
   }
   
   /**
   * getVehicleCount = gets hom many vehicles were created.
   * will be static and will be called by class name
   *
   *@return vehicleCount = number of vehicle objects created
   */
   public static int getVehicleCount() {
      return vehicleCount;
   }
   
   /**
   * resetVehicleCount = resets vehicle count to zero.
   *
   */
   public static void resetVehicleCount() {
      vehicleCount = 0;
   }
   
   /**
   * useTax = tax to be used by each vehicle.
   * abstract = all other inherited classes(child classes) need to define
   * on their own.
   *
   * @return tax = tax to be used.
   */
   public abstract double useTax();
   
   /**
   * toString = string rep of vehicle object.
   *
   *@return output = string rep of vehicle object.
   */
   public String toString() {
   
   
      DecimalFormat df = new DecimalFormat("##,##0.00");
   
      String output = "";
      
      output += owner + ": " + this.getClass().getName()
            + " " + yearMakeModel;
      if (alternativeFuel) {
         output += " (Alternative Fuel)";  
      }
   
      output += "\nValue: $" + df.format(value);
      output += " Use Tax: $" + df.format(useTax());
   
      return output;
   }
   
   /**
   * equals = checks to see if the vehicle object is true.
   * if this vehicle owner, yearMakeModel, and value are all equal
   * to the parameters owners, yearMakeModel, and value.
   * otherwise return false
   *
   * @param obj the other object
   * @return boolean
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof Vehicle)) {
         return false;
      }
      else {
         Vehicle other = (Vehicle) obj;
         return (owner + yearMakeModel + value).
            equals(other.owner + other.yearMakeModel
                  + other.value);
      }
   
   }
   
   /**
   * hashCode = overides the hashCode inherited from the Object class.
   *
   * @return 0 
   */
   public int hashCode() {
      return 0;
   }
   
   /**
   * compareTo = compares Vehicle objects.
   *
   * @param obj vehcle obj to compare
   * @return int = compares owner of Vehicle objects
   */
   public int compareTo(Vehicle obj) {
      return owner.toLowerCase()
            .compareTo(obj.getOwner()
            .toLowerCase());
   }
}