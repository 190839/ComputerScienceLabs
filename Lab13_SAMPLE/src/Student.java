


public class Student
{
   private String name;
   private String birthDate;
   private String courses;
   
   public Student(String name, String birthDate)
   {
      this.name = name;
      this.birthDate = birthDate;
      courses = null;
   }
   
   public String getName()
   {
      return name;
   }
   
   public String getBirthDate()
   {
      return birthDate;
   }
   
   public String getCourses()
   {
      return courses;
   }
   
   public void setCourses(String c)
   {
      courses = c;
   }
}
