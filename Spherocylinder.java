import java.text.DecimalFormat;
/** 
 * Spherocylinder - creates a Spherocylinder.
 * Constructor takes 3 arguments(label, radius, cylinderHeight)
 * Calculates Surface Area, Volume, and Cicumference
 *
 * Project 3
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version March 14, 2019
 */


public class Spherocylinder implements Comparable<Spherocylinder> {

// instance variables
   private String label = "";
   private double radius = 0;
   private double cylinderHeight = 0;

// class variables
   private static int count = 0;

// constructor
/**
* Constructor: sets the initial Spherocylinder.
*
*@param labelIn = label argument
*@param radiusIn = radius argument
*@param cylinderHeightIn = cylinderHeigthIn argument
*/
   public Spherocylinder(String labelIn, double radiusIn, 
                           double cylinderHeightIn) {
      // Methods to implement - not created yet
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cylinderHeightIn);
      count++;
   }
   
   // methods
   /**
   * getLabel - gets label.
   *
   *@return label = label
   */
   public String getLabel() {
      return label;
   }
   
   /**
   * setLabel - sets label.
   *
   *@param labelIn = label to set
   *@return boolean = true if label is not null
   */

   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      return false;
   }
   
  /**
   * getRadius - gets radius.
   *
   *@return radius = radius of object
   */
   public double getRadius() {
      return radius;
   }
   
   /**
   * setRadius - sets radius.
   *
   *@param radiusIn = radius to be set
   *@return boolean = true if non-negative and radius is set
   */
   public boolean setRadius(double radiusIn) {
      if (radiusIn >= 0) {
         radius = radiusIn;
         return true; 
      }
      return false;
   }
   
   /**
   * getCylinderHeight - gets cylinder height.
   *
   *@return cylinderHeight = cylinderHeight
   */
   public double getCylinderHeight() {
      return cylinderHeight;
   }
   
   /**
   * setCylinderHeight - sets cylinder height.
   *
   *@param cylinderHeightIn = cylinderHeightIn to be set
   *@return boolean = true if non negative and cylinderheight is set
   */
   public boolean setCylinderHeight(double cylinderHeightIn) {
      if (cylinderHeightIn >= 0) {
         cylinderHeight = cylinderHeightIn;
         return true;
      }
      return false;
   }

/**
   * circumference - calculates and returns circumference.
   *
   *@return circumference = circumference
   */
   public double circumference() {
   // c = 2*pi*r
      double circumference =  2.0 * (Math.PI) * getRadius();
      return circumference;
   }
   
   /**
   * surfaceArea - calculates and returns surface area.
   *
   *@return surfaceArea = surfaceArea
   */
   public double surfaceArea() {
   //  SA = 2*pi*r(2*r + a) 
   // a = cylinder height 
      double surfaceArea = circumference()
         * (2 * getRadius() + getCylinderHeight());
      return surfaceArea;
   }
   /**
   * volume - calculates and returns volume.
   *
   *@return volume = volume
   */
   public double volume() {
      // V = pi * r^2 * (4/3 * r + a)
      // a = cylinder height
      double volume = Math.PI * Math.pow(getRadius(), 2)
         * (4.0 / 3.0 * getRadius() + getCylinderHeight());
      return volume;
   }
   
   
   /**
   * getCount - counts number of Spherocylinder objects created.
   *
   *@return count = count of objects created
   */
   public static int getCount() {
      return count;
   }
   
   
   /**
   * resetCount = resets count to zero.
   *
   */
   public static void resetCount() {
      count = 0;
   }
   
   
   /**
   * equals = checks to see object is Spherocylinder.
   *
   *@param obj = object to be checked
   *@return count = count of objects created
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof Spherocylinder)) {
         return false;
      } 
      else {
         Spherocylinder d = (Spherocylinder) obj;
         return (label.equalsIgnoreCase(d.getLabel())
               && Math.abs(radius - d.getRadius()) < .000001
               && Math.abs(cylinderHeight - d.getCylinderHeight())
                     < .000001);
      }
   
   }
   /**
   * hashcode = complement for the equals method.
   *
   *@return zero
   */

   public int hashCode() {
      int num = 0;
      return num;
   }
   
   /**
   *compareTo = compares volume of objects.
   *
   *@param obj = object to compare
   *@return int = 0 for equal, -1 for less, 1 for greater
   */
   public int compareTo(Spherocylinder obj) {
   
      if (Math.abs(this.volume() - obj.volume()) < .000001) {
         return 0;
      } else if (this.volume() < obj.volume()) {
         return -1;
      }
      
      return 1;
   }
   
   
   
   
   /**
   * toString = String rep of object.
   *
   *@return surfaceArea = surfaceArea
   */
   public String toString() {
      String output = "Spherocylinder \"" + label;
      output += "\" with radius " + radius;
      output += " and cylinder height " + cylinderHeight + " has:\n";
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      output += "\tcircumference = " + fmt.format(circumference()) 
                  + " units\n";
      output += "\tsurface area = " + fmt.format(surfaceArea())
                  + " square units\n";
      output += "\tvolume = " + fmt.format(volume())
                  + " cubic units";
      return output; 
   }
   

}