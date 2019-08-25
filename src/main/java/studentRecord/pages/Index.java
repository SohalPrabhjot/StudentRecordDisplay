package studentRecord.pages;


import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import studentRecord.studentInfo.Student;
import studentRecord.studentInfo.StudentList;

/**
 * Start page of application studentRecord.
 */
public class Index {


    @Property
    private Student student;

    @Property
    private Student[] students;

    @InjectPage
    private MarksView marksView;

    public void onActivate() {
        StudentList studentList = new StudentList();
        students = studentList.getStudentList();
    }
}

