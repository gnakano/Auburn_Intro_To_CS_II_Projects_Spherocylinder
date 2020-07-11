public class testSphero {

   public static void main(String[] args) {
   
      Spherocylinder s1 = new Spherocylinder("Small Example", 0.5, 0.25);
      Spherocylinder s2 = new Spherocylinder("Medium Example", 10.8, 10.1);
      Spherocylinder s3 = new Spherocylinder("Large Example", 98.32, 99.0);
      Spherocylinder[] sa = {s1, s2, s3};
      SpherocylinderList sl  = new SpherocylinderList("TestList", sa, 
                  sa.length);
      sl.deleteSpherocylinder("Small Example");
      sl.deleteSpherocylinder("Medium Example");
      sl.deleteSpherocylinder("Large Example");            
      System.out.println(sl.findSpherocylinderWithLargestVolume());
      
     
   }

}