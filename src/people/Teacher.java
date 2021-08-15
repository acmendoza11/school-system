package people;
import people.Person;
import studentClassification.Department;

public class Teacher extends Person{

    protected String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private class TeacherDepartment extends Department {
        //department setters and getters
    }
}
