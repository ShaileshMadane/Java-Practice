//university ->department->professor->course.
import java.util.*;
class course{
    String cou;
    int credit;
    course(String cou,int credit)
    {
        this.cou=cou;
        this.credit=credit;
    }
    void showcourses()
    {
        System.out.println("  ----Course: "+cou);
        System.out.println("    ----Credit: "+credit);
    }
}
class professor{
    List<course> courses;
    String pro;
    professor(String pro)
    {
        this.pro=pro;
        this.courses=new ArrayList<>();
    }
    void addcourse(course c)
    {
        courses.add(c);
    }
    void showprofessors()
    {
        System.out.println(" ----Professor: "+pro);
        for(course c: courses)
            c.showcourses();
    }
}
class department{
    String dep;
    List<professor>professors;
    department(String dep)
    {
        this.dep=dep;
        this.professors=new ArrayList<>();
    }
    void addprofessor(professor p)
    {
        professors.add(p);
    }
    void showdepartents()
    {
        System.out.println("----Department: "+dep);
        for(professor p: professors)
            p.showprofessors();
    }
}
class university{
    String uni;
    List<department>departments;
    university(String uni)
    {
        this.uni=uni;
        this.departments=new ArrayList<>();
    }
    void adddepartment(department d)
    {
        departments.add(d);
    }
    void showuniversities()
    {
        System.out.println("University: "+uni);
        for(department d: departments)
        {
            d.showdepartents();
        }
    }
}
public class B {
    public static void  main(String[]args)
    {
        //create the courses
        course java=new course("java programming",4);
        course python=new course("python programming",4);
        course dbms=new course("database system",2);
        course ai=new course("artificial intelligence",3);
        course ml=new course("machine learning",3);
        course ds=new course("Data science",4);

        //create the professor & assign the courses
        professor p1=new professor("Dr.Sharma");
        p1.addcourse(java);
        p1.addcourse(dbms);
        professor p2=new professor("Dr.Gupta");
        p2.addcourse(python);
        p2.addcourse(ds);
        professor p3=new professor("Dr.Mehta");
        p3.addcourse(ai);
        p3.addcourse(ml);

        //create the department & assign the professor
        department CS=new department("Computer Science");
        CS.addprofessor(p1);
        CS.addprofessor(p3);
        department IT=new department("Information Technology");
        IT.addprofessor(p2);
        IT.addprofessor(p3);
        department AIDS=new department("AIDS");
        AIDS.addprofessor(p1);
        AIDS.addprofessor(new professor("Dr. Verma"));

        //create the university & assign the department
        university un1=new university("Pune University");
        un1.adddepartment(CS);
        un1.adddepartment(IT);
        university un2=new university("Mumbai University");
        un2.adddepartment(AIDS);

        un1.showuniversities();
        un2.showuniversities();
    }
}
