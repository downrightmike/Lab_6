/********************************************************************************************************************
* ClassSection.java
* Author: Downrightmike
* CIS 131
* 
* 
********************************************************************************************************************/
        
public class ClassSection{
    private Integer CRN;
    private Integer courseNumber;
    private Integer capacity;
    private Integer enrollment;
    private Integer instructorID;
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
    public ClassSection(Integer newCRN, Integer newCourseNumber, Integer newCapacity, Integer newEnrollment, Integer newInstructorID, String newMode, String newCampus, String newDepartmentCode, String newMeetingDays, String newMeetingTimes){ 
        //System.out.println("\nIn ClassSection() all params constructor"); // Just to show we're here.
    
        CRN = newCRN;
        courseNumber = newCourseNumber;
        capacity = newCapacity;
        enrollment = newEnrollment;
        instructorID = newInstructorID;
        mode = newMode;
        campus = newCampus;
        departmentCode = newDepartmentCode;
        meetingDays = newMeetingDays;
        meetingTimes = newMeetingTimes;
    }
          // Define "setter" a.k.a. mutator methods.
   public void setCRN( Integer newCRN ){
     CRN = newCRN ;  }
   public void setCourseNumber( Integer newCourseNumber ){
     courseNumber = newCourseNumber ;  }
   public void setCapacity( Integer newCapacity ){
    capacity = newCapacity ;  }
   public void setEnrollment( Integer newEnrollment ){
    enrollment = newEnrollment ;  }
   public void setInstructorID( Integer newInstructorID ){
    instructorID = newInstructorID ;  }
   public void setMode(String newMode ){
    mode = newMode ;  }
   public void setCampus(String newCampus ){
    campus = newCampus ;  }
   public void setDepartmentCode(String newDepartmentCode ){
    departmentCode =  newDepartmentCode;  }
   public void setMeetingDays(String newMeetingDays ){
    meetingDays =  newMeetingDays;  }
   public void setMeetingTimes(String newMeetingTimes ){
    meetingTimes = newMeetingTimes ;  }
   
    // Define "getter" a.k.a. accessor methods.
    public Integer getCRN(){
        return this.CRN ;  }
       public Integer getCourseNumber(){
        return this.courseNumber ;  }
       public Integer getCapacity(){
        return this.capacity ;  }
       public Integer getEnrollment(){
        return this.enrollment ;  }
       public Integer getInstructorID(){
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
        
        strBuf.append("***********************************\n");
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
        strBuf.append( "\n") ;    
        strBuf.append( "***********************************") ;    
        
        return strBuf.toString() ;
     }
    
}