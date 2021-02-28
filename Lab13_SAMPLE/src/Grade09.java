import java.util.ArrayList;


public class Grade09 extends AbstractHighSchool
{
   private ArrayList<Student> students;
   
   public Grade09()
   {
      students = new ArrayList<Student>();
   }
    
   public void addStudents(Student[] s)
   {
      for (int k = 0; k < temp.length; k+=4)
      {
         Student student = new Student(s[k],s[k+1],s[k+2],s[k+3]);
         students.add(student);
      }
   } 
   
   
   public void register()     
   { System.out.println("Register 9TH GRADER"); }  
   
   public void orientation()  
   { System.out.println("Organize 9TH GRADE orientation"); }  
   
   public void fundRaising()  
   { System.out.println("Explain 9TH GRADE fund raising"); }  
   
   public void socialEvents() 
   { System.out.println("Organize 9TH GRADE social events"); }  
   
   public void parking()      
   { System.out.println("9TH GRADE students have no parking lot"); }  
   
   public String toString()
   {
      String temp = "";
      for (Student student : student)
         temp = temp + student + "\n";
      return temp;
   } 
}


class Student
{
   private String name;
   private String birthDate;
   private String math;
   private String english;
   
   public Student(String name, String birthDate)
   {
      this.name = name;
      this.birthDate = birthDate;
      math = null;
      english = null;
   }
   
   public String getName()          { return name; }
   public String getBirthDate()     { return birthDate; }
   public String getMath()          { return math; }
   public String getEnglish()       { return english; }
   public void setMath(String m)    { math = m; }
   public void setEnglish(String e) { english = e; }
   
   public String toString()
   {
      String temp = "[";
      temp = temp + name + ", " + birthDate + ", " + math + ", " + "english";
      temp = temp + "]";
      return temp;
   }
}
