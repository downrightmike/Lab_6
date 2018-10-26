/********************************************************************************************************************
* ClassSection.java
* Author: Downrightmike
* CIS 131
* 
* 
********************************************************************************************************************/
        
public class ClassSection{
    private int CRN;
    private int courseNumber;
    private int capacity;
    private int enrollment;
    private int instructorID;
    private String mode;
    private String campus;
    private String departmentCode;
    private String meetingDays;
    private String meetingTimes;

    public ClassSection(){ 
        //System.out.println("\nIn ClassSection() default constructor"); // Just to show we're here.

    CRN = 0;
    courseNumber = 0;
    capacity = 0;
    enrollment = 0;
    instructorID = 0;
    mode = "";
    campus = "";
    departmentCode = "";
    meetingDays = "";
    meetingTimes = "";
   
    }
    public ClassSection(int CRN, int courseNumber, int capacity, int enrollment, int instructorID, String mode, String campus, String departmentCode, String meetingDays, String meetingTimes){ 
        //System.out.println("\nIn ClassSection() all params constructor"); // Just to show we're here.
    // This constructor will assign (empty string) to String attributes, 0 to int attributes 
    // and 0.0 to double attributes, if any.
    }
          // Define "setter" a.k.a. mutator methods.
   public void setCRN( int CRN ){
    this.setCRN( CRN );  }
   public void setCourseNumber( int courseNumber ){
    this.setCourseNumber( courseNumber );  }
   public void setCapacity( int capacity ){
    this.setCapacity( capacity );  }
   public void setEnrollment( int enrollment ){
    this.setEnrollment( enrollment );  }
   public void setInstructorID( int instructorID ){
    this.setInstructorID( instructorID );  }
   public void setMode(String mode ){
    this.setMode( mode );  }
   public void setCampus(String campus ){
    this.setCampus( campus );  }
   public void setDepartmentCode(String departmentCode ){
    this.setDepartmentCode(  departmentCode);  }
   public void setMeetingDays(String meetingDays ){
    this.setMeetingDays(  meetingDays);  }
   public void setMeetingTimes(String meetingTimes ){
    this.setMeetingTimes( meetingTimes );  }
   
    // Define "getter" a.k.a. accessor methods.
    public int getCRN(){
        return this.CRN ;  }
       public int getCourseNumber(){
        return this.courseNumber ;  }
       public int getCapacity(){
        return this.capacity ;  }
       public int getEnrollment(){
        return this.enrollment ;  }
       public int getInstructorID(){
        return this.instructorID ;  }
       public String getMode(){
        return this.mode ;  }
       public String getCampus(){
        return this.campus ;  }
       public String getDepartmentCode(){
        return this.departmentCode;  }
       public String getMeetingDays(){
        return this.meetingDays;  }
       public String getMeetingTimes(){
        return this. meetingTimes ;  }
    
    

    public String toString(){
        StringBuffer strBuf = new StringBuffer("Class Section Data: \n");
        
        strBuf.append("***********************************\n\n");
        strBuf.append("CRN :                 ");
        strBuf.append(CRN) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Department :          ");
        strBuf.append(departmentCode) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Course Number :       ");
        strBuf.append(courseNumber) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Instructional Mode :  ");
        strBuf.append(mode) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Campus :              ");
        strBuf.append(campus) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Meeting Days :        ");
        strBuf.append(meetingDays) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Meeting Times :       ");
        strBuf.append(meetingTimes) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Capacity :            ");
        strBuf.append(capacity) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Enrollment :          ");
        strBuf.append(enrollment) ;
        strBuf.append( "\n\n") ;    
        strBuf.append("Instructor's ID :     ");
        strBuf.append(instructorID) ;
        strBuf.append( "\n\n") ;    
        strBuf.append( "***********************************") ;    
        
        return strBuf.toString() ;
     }
    
}