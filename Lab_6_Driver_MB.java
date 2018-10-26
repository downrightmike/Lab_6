        /********************************************************************************************************************
        * Lab_6_MB.java
        * Author: Downrightmike
        * CIS 131
        * 
        * 
        ********************************************************************************************************************/
        import java.util.Scanner;

public class Lab_6_Driver_MB {       
        public static void main(String[] args) {           
        // Create a ClassSection object using the default constructor
        ClassSection class1 = new ClassSection(20, 1, 30, 30, 6, "online", "East", "CIS", "N/A", "N/A" );
        ClassSection class3 = new ClassSection();
        // Create a ClassSection object using the default constructor
       /* ClassSection class2 = new ClassSection();
        class2.setCRN( 20008 );  
        class2.setCourseNumber( 131 );  
        class2.setCapacity( 30 );  
        class2.setEnrollment( 30 );  
        class2.setInstructorID( 654 );  
        class2.setMode( "online" );  
        class2.setCampus( "East" );  
        class2.setDepartmentCode("CIS");  
        class2.setMeetingDays(  "N/A");  
        class2.setMeetingTimes( "N/A" );  
*/
        System.out.println("\n------- ClassSection Objects -------");
        System.out.println("class1: \n" + class1.toString());
      //  System.out.println("class2: \n" + class2.toString());
      //  System.out.println("class3: \n" + class3.toString());
  }
}