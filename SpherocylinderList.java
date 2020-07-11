import java.text.DecimalFormat;
/** 
 * SpherocylinderList - creates a SpherocylinderList.
 *
 * Project 3
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version March 30, 2019
 */


public class SpherocylinderList {
// instance variables (Fields)
   private String listName = "";
   private Spherocylinder[] spherocylinderArray;
   private int numSpherocylinder = 0;

/**
*Constructor = sets the list.
*
*@param listNameIn = sets listName
*@param spherocylinderArrayIn = sets array with objects
*@param numSpherocylinderIn = sets numSpherocylinder
*/
   public SpherocylinderList(String listNameIn, 
                           Spherocylinder[] spherocylinderArrayIn,
                           int numSpherocylinderIn) {
      listName = listNameIn;
      spherocylinderArray = spherocylinderArrayIn;                        
      numSpherocylinder = numSpherocylinderIn;
   }
   
   /**
   *getName = getsName of SpherocylinderList.
   *
   *@return listName = SpherocylinderList list name.
   */
   public String getName() {
      return listName;
   }

   /**
   *numberOfSpherocylinders = returns # of Spherocylinders.
   *
   *@return numSphero = number of Spherocylinders
   */
   public int numberOfSpherocylinders() {
      int numSphero = 0;
      if (numSpherocylinder != 0) {
         numSphero = numSpherocylinder;
      }
      return numSphero;
   }
   
   /**
   *totalSurfaceArea = Returns total Surface area of all objects in list.
   *returns zero if none.
   *@return totalSurfaceArea = total surface Area.
   */
   public double totalSurfaceArea() {
      double totalSurfaceArea = 0.0;
      if (numSpherocylinder != 0) {
         for (int i = 0; i < numSpherocylinder; i++) {
            totalSurfaceArea += spherocylinderArray[i].surfaceArea();
         }
         totalSurfaceArea = totalSurfaceArea;
      } 
      return totalSurfaceArea;
   }
   
   
   /**
   *totalVolume = total volume of all objects.
   *
   *@return totalVolume = total Volume.
   */
   public double totalVolume() {
      double totalVolume = 0.0;
   
      if (numSpherocylinder != 0) {
         for (int i = 0; i < numSpherocylinder; i++) {
            totalVolume += spherocylinderArray[i].volume();
         }
         
      }
      return totalVolume;
   }
   
   /** 
   *averageSurfaceArea = avg Surface Area of all objects in array.
   *
   *@return avgSurface = avg Surface Area.
   */
   public double averageSurfaceArea() {
   
      double avgSurfaceArea = 0.0;
      
      if (numSpherocylinder != 0) {
         avgSurfaceArea = totalSurfaceArea() / numSpherocylinder;
      }
      return avgSurfaceArea;
   } 
   
   /**
   *averageVolume = avg Volume of all objects in array.
   *
   *@return avgVol = average volume.
   */
   public double averageVolume() {
      double avgVol = 0.0;
   
      if (numSpherocylinder != 0) {
         avgVol = totalVolume() / numSpherocylinder;
      }
      return avgVol;
   }
   
   /**
   *toString = string rep of object.
   *
   *@return output = String rep of object.
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + getName()
                              + " -----\n";
      output += "Number of Spherocylinders: " + numSpherocylinder + "\n";
      output += "Total Surface Area: " + df.format(totalSurfaceArea()) + "\n";
      output += "Total Volume: " + df.format(totalVolume()) + "\n";
      output += "Average Surface Area: "  
                             + df.format(averageSurfaceArea()) + "\n";
      output += "Average Volume: " + df.format(averageVolume());
      return output;
   }
  
   /** 
   *getList = getsList of objects.
   *
   *@return spherocylinderArray = array of objects for the List
   */
   public Spherocylinder[] getList() {
      return spherocylinderArray;
   }
   
   /** 
   *addSpherocylinder = adds a Spherocylinder object.
   *
   *@param labelIn = label to be set.
   *@param radiusIn = radius to be set.
   *@param cylinderHeightIn = cylinderHeight to be set.
   */
   public void addSpherocylinder(String labelIn, double radiusIn,    
                                       double cylinderHeightIn) {
      Spherocylinder spheroAdd = new Spherocylinder(labelIn, radiusIn,
         cylinderHeightIn);                                    
   
      if (numSpherocylinder == spherocylinderArray.length) {
      
         Spherocylinder[] newArray = 
            new Spherocylinder[spherocylinderArray.length + 1];
         
         for (int i = 0; i < numSpherocylinder; i++) {
            newArray[i] = spherocylinderArray[i];
            
         }
         
         newArray[numSpherocylinder] = spheroAdd; 
         spherocylinderArray = newArray;
         numSpherocylinder++; 
      } else {
         getList()[numSpherocylinder] = spheroAdd;
         numSpherocylinder++;
      }
   
   }
                                       
   /**
   *findSpherocylinder = returns Spherocylinder if found or null.
   *
   *@param labelIn = label to locate
   *@return Spherocylinder = object if found or null.
   */   
   public Spherocylinder findSpherocylinder(String labelIn) {
      labelIn = labelIn.toLowerCase();
      
      for (int i = 0; i < numSpherocylinder; i++) {
         if (labelIn.equals(getList()[i].getLabel().toLowerCase())) {
            return getList()[i];
         } 
         
              
      }
     
      return null;
   }                       
                
   /**
   *deleteSpherocylinder = deletes if found or null if not in array.
   *
   *@param labelIn = label to search for delete.
   *@return Spherocylinder = if found or null if not.
   */
   public Spherocylinder deleteSpherocylinder(String labelIn) {
   
      labelIn = labelIn.toLowerCase();
      Spherocylinder delSphero;
      for (int i = 0; i < numSpherocylinder; i++) {
         if (labelIn.equals(getList()[i].getLabel().toLowerCase())) {
            // set the object to be deleted to delSphero
            delSphero = getList()[i];
            // System.out.println("We have a match");
            // System.out.println("The object to be delted is: " 
            // + getList()[i]);
            // System.out.println("The object for delSphero is: " + delSphero);
            for (int j = i; j < numSpherocylinder - 1; j++) {
            // copy each element by moving over by one
               getList()[j] = getList()[j + 1];
            }
         // set last element in array to null
            getList()[numSpherocylinder - 1] = null;
         // reduce numSpherocylinder by 1
            numSpherocylinder--;
            return delSphero;
         }
      
      }
      return null;
   }          
   
   /** 
   *editSpherocylinder = edits a spherocylinder object in array if found.
   *
   *@param labelIn = label to search for.
   *@param radiusIn = radius to set.
   *@param cylinderHeightIn to set.
   *@return boolean = true if found and edited or false if not found.
   */
   public boolean editSpherocylinder(String labelIn, double radiusIn, 
                                       double cylinderHeightIn) {
      boolean confirmEdit = false;
      labelIn = labelIn.toLowerCase();
      for (int i = 0; i < numSpherocylinder; i++) {
         if (labelIn.equals(getList()[i].getLabel().toLowerCase())) {
            getList()[i].setRadius(radiusIn);
            getList()[i].setCylinderHeight(cylinderHeightIn);
            confirmEdit = true;
         }
      
      }
      return confirmEdit;
   }

   /**
   *findSpherocylinderWithLargestVolume = goes through array.
   * finds the object with largest volume and returns it.
   *
   *@return Spherocylinder = biggest Spherocylinder if
   * found or null if no ojbects.
   */
   public Spherocylinder findSpherocylinderWithLargestVolume() {
      Spherocylinder biggestSphero = null;
   // if no spherocylinders in array
      if (numSpherocylinder == 0) {
         return biggestSphero;
      } 
   // if there then set the biggest sphere to the first object
      biggestSphero = getList()[0];
      // System.out.println("The biggest sphere volume is initially set to: " 
         //                   + biggestSphero.volume());
      for (int i = 0; i < numSpherocylinder; i++) {
         if (biggestSphero.volume() < getList()[i].volume()) {
            biggestSphero = getList()[i];
         }
      
      }
   
      return biggestSphero;
   }
   
   
         
   
   
}