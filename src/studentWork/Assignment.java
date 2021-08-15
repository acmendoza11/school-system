package studentWork;
import  studentWork.StudentWorkPaper;

public class Assignment extends StudentWorkPaper{
    protected int assignmentNumber;
    protected String assignmentDeadline;

    public int getAssignmentNumber() {
        return assignmentNumber;
    }

    public void setAssignmentNumber(int assignmentNumber) {
        this.assignmentNumber = assignmentNumber;
    }

    public String getAssignmentDeadline() {
        return assignmentDeadline;
    }

    public void setAssignmentDeadline(String assignmentDeadline) {
        this.assignmentDeadline = assignmentDeadline;
    }
}
