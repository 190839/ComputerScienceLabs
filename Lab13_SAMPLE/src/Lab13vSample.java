import java.util.ArrayList;

public class Lab13vSample
{
   public static void main(String[] args)
   {
      String[] temp = {"Sue","01-23-1999","Algebra 1","English 1",
                     "Bob","07-21-2000","Algebra 1","PreAP English 1",
                     "Ann","03-15-1998","PreAP Geometry","English 1",
                     "Joe","08-01-200","Geometry","PreAP English 1" };
      Grade09 g9 = new Grade09();
      g9.addStudents(temp);
      System.out.println(g9);
   }
}


class Grade09  
{
   private ArrayList<Student> students;
   
   public Grade09()
   {
      students = new ArrayList<Student>();
   }
    
   public void addStudents(String[] s)
   {
      for (int k = 0; k < s.length; k+=4)
      {
         Student student = new Student(s[k],s[k+1],s[k+2],s[k+3]);
         students.add(student);
      }
   } 
    
   
   public String toString()
   {
      String temp = "";
      for (Student student : students)
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
    
   public Student(String name, String birthDate, String math, String english)
   {
      this.name = name;
      this.birthDate = birthDate;
      this.math = math;
      this.english = english;
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
      temp = temp + name + ", " + birthDate + ", " + math + ", " + english;
      temp = temp + "]";
      return temp;
   }
}
