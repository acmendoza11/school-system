package people;
import people.Person;
import studentClassification.Course;
import studentClassification.Department;

public class Student extends Person{

    protected String section;

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    private class StudentCourse extends Course {
        //course setters and getters
    }
    private class StudentDepartment extends Department {
        //department setters and getters
    }

}
