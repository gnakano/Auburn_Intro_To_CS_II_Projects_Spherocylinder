import org.junit.Assert;
// import static org.junit.Assert.*;
// import org.junit.Before;
import org.junit.Test;

/** 
 * SpherocylinderListTest - Tests SpherocylinderList objects.
 * Running  tests to test methods
 *
 * Project 3
 * @author Genji Nakano - CPSC 1223 - AO2
 * @version March 30, 2019
 */

public class SpherocylinderListTest {


/** tests getName if array is not null. */
   @Test public void testGetNameNotNull() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
                 
      Assert.assertEquals("Test getName if array is not null",
                           "TestList", sl.getName());
   }
   
         
   /** tests numSphero in list if != 0. */
   @Test public void testNumSpheroPlus() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertEquals("Tests numSphero if objects exist in list",
                              3, sl.numberOfSpherocylinders());
   
   }
   
   
   /** tests numSphero in list if == 0. */
   @Test public void testNumSpheroZero() {
      Spherocylinder[] sa = {};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertEquals("Tests numSphero if zero objects exist",
                        0, sl.numberOfSpherocylinders());
   }
   
   /** tests totalSurfaceArea if numSphero == 0. */
   @Test public void testTotalSurfaceAreaZero() {
      Spherocylinder[] sa = {};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertEquals("Tests totalSurfaceArea if numsphero is zero", 0.0,
                              sl.totalSurfaceArea(), 0.000001);
   }
   
   /** tests totalSurfaceArea if numSphero != 0. */
   @Test public void testTotalSurfaceAreaPlus() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertEquals("Testing TotalSurfaceArea if numsphero is not zero", 
                           184790.426, sl.totalSurfaceArea(), 0.001);      
   }
   
   /** tests volume if numSphero !=0. */
   @Test public void testTotalVolumePlus() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertEquals("Testing Total Volume if numsphero is not zero",
                              6996733.041, sl.totalVolume(), 0.001);
   }
   
   /** tests volume if numsphero is zero. */
   @Test public void testTotalVolumeZero() {
      Spherocylinder[] sa = {};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertEquals("Testing Total Volume if numSphero is zero",
                              0.0, sl.totalVolume(), 0.000001);
   }
   
   
   /** tests avgSurfaceArea if numSphero is zero. */
   @Test public void testAvgSurfaceAreaZero() {
      Spherocylinder[] sa = {};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertEquals("Testing avgSurfaceArea if numShero is zero",
                              0.0, sl.averageSurfaceArea(), 0.00001);
   }
   
   /** tests avgSurfaceArea if numSphero is not zero. */
   @Test public void testAvgSurfaceAreaPlus() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertEquals("Testing avgSurfaceArea if numSphero is not Zero",
                              61596.809, sl.averageSurfaceArea(), 0.001);
   }
   
   /** tests avgerageVolume if numSphero is not Zero. */
   @Test public void testAvgVolPlus() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertEquals("Testing avgVolume if numSphero is not Zero",
                              2332244.347, sl.averageVolume(), 0.001);
   }
   
   /** tests avgerageVolume if numSphero is Zero. */
   @Test public void testAvgVolZero() {
      Spherocylinder[] sa = {};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertEquals("Testing avgVolume if numSphero is Zero",
                              0.0, sl.averageVolume(), 0.0001);
   }
   
   /** tests toString. */
   @Test public void testToString() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("Test List", sa, 
         sa.length);
      Assert.assertEquals("Tests String output",
                              "----- Summary for Test List" 
                              + " -----\n"
                              + "Number of Spherocylinders: 3\n"
                              + "Total Surface Area: 184,790.426\n"
                              + "Total Volume: 6,996,733.041\n"
                              + "Average Surface Area: 61,596.809\n"
                              + "Average Volume: 2,332,244.347", sl.toString());
   }
   
   /** tests getList to get correct array. */
   @Test public void testGetList() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertArrayEquals("Tests getList for arrays",
                                sa, sl.getList());
   }
   
   
   /** Tests addSpherocylinder to list if full. */
   @Test public void testAddSpherocylinderfull() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder[] sa = {s1, s2};
      SpherocylinderList sl  = new SpherocylinderList("Test List", sa, 
         sa.length);
      sl.addSpherocylinder("Large Example", 98.32, 99.0);
      Assert.assertEquals("Tests String output",
                              "----- Summary for Test List"
                              + " -----\n"
                              + "Number of Spherocylinders: 3\n"
                              + "Total Surface Area: 184,790.426\n"
                              + "Total Volume: 6,996,733.041\n"
                              + "Average Surface Area: 61,596.809\n"
                              + "Average Volume: 2,332,244.347", sl.toString());
      
   
   } 
   
   
   /** tests addSpherocylinder if array is not full. */
   @Test public void testAddSpherocylinder() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Genji Example", 7.8, 18.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("Test List", sa, 
         sa.length);
      sl.deleteSpherocylinder("Genji Example");
      sl.addSpherocylinder("Medium Example", 10.8, 10.1);
      Assert.assertEquals("Tests String output",
                              "----- Summary for Test List"
                              + " -----\n"
                              + "Number of Spherocylinders: 3\n"
                              + "Total Surface Area: 184,790.426\n"
                              + "Total Volume: 6,996,733.041\n"
                              + "Average Surface Area: 61,596.809\n"
                              + "Average Volume: 2,332,244.347", sl.toString());
      
   
   
   }
   
   
   /** tests findSpherocylinder if object Found. */
   @Test public void testfindSpherocylinderFound() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("Test List", sa, 
         sa.length);
      Assert.assertEquals("Test for finding Spherocylinder", 
                          sl.getList()[1], 
                          sl.findSpherocylinder("Medium Example"));
   }
   
   /** tests findSpherocylinder if object not found. */
   @Test public void testFindSpherocylinderNotFound() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertEquals("Testing if object not Found", 
                           null, sl.findSpherocylinder("Genji Example"));
   }
   
   /** tests deleteSpherocylinder if object not found. */
   @Test public void testDeleteSpherocylinderNotFound() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertEquals("Test for delete if not found", 
                           null, sl.deleteSpherocylinder("Genji Example"));
   }
   
   /** tests deleteSpherocylinder if object is found. */
   @Test public void testDeleteSpherocylinderFound() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertEquals("Test deleteSpherocylinder if object is found",
                           s3, sl.deleteSpherocylinder("Large Example"));
   }
   
   /** tests deleteSpherocylinder list length if object found. */
   @Test public void testDeleteSpherocylinderListLength() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      sl.deleteSpherocylinder("Large Example");
      Assert.assertEquals("Tests list Length after deleted object",
                           2, sl.numberOfSpherocylinders());
   }
   
   /** tests deleteSpherocylinder last element is null if object is deleted. */
   @Test public void deleteSpherocylinderNullEnd() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      sl.deleteSpherocylinder("Large Example");
      Assert.assertEquals("Tests that last element is set to null "
                          + "in sucesful delete",
                           null, sl.getList()[2]);
   }
   
         
  /** Tests editSpherocylinder if object to be edited is found. */
   @Test public void testEditSpherocylinderTrue() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertEquals("tests editSpherocylinder returns True if found",
                           true, sl.editSpherocylinder("Small Example", 
                                                            0.7, 0.25));
   } 
   
   /** tests editSpherocylinder returns false if object is not found. */
   @Test public void editSpherocylinderFalse() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertEquals("Tests editSpherocylinder retursn false if not found",
                           false, 
                           sl.editSpherocylinder("Genji Example", 0.7, 0.25));
   }
   
   /** tests editSpherocylinder that object sets radius and cylinder. */
   @Test public void editSpherocylinderValues() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 1.7, 6.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      sl.editSpherocylinder("Small Example", 0.5, 0.25);
      Assert.assertEquals("Tests String output on edited lists",
                              "Spherocylinder \"Small Example\" with radius "
                              + "0.5 and cylinder height 0.25 has:\n"
                              + "\tcircumference = 3.142 units\n"
                              + "\tsurface area = 3.927 square units\n"
                              + "\tvolume = 0.72 cubic units", 
                              sl.getList()[0].toString());
      
   
   }
   
   /** Tests findSpherocylinderWithLargestVolume if not null. */
   @Test public void testFindSpherocylinderWithLargestVolumeFound() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 1.7, 6.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      Assert.assertEquals("Tests findSpherocylinderWithLargetsVolume "
                           + "if not null",
                        s3, sl.findSpherocylinderWithLargestVolume());
   }
   
   
   /** Tests findSpherocylinderWithLargestVolume if null. */
   @Test public void testFindSpherocylinderWithLargestVolumeNull() {
      Spherocylinder s1 = new Spherocylinder("Small Example", 1.7, 6.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
         sa.length);
      sl.deleteSpherocylinder("Large Example");
      sl.deleteSpherocylinder("Small Example");
      sl.deleteSpherocylinder("Medium Example");
      Assert.assertEquals("Tests if no sphero objects is in "
                           + "findSpherocylinderWithLargestVolume is",
                           null, sl.findSpherocylinderWithLargestVolume());
   }
}
