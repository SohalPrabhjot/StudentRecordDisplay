package studentRecord.pages;

import com.oracle.webservices.internal.api.message.PropertySet;
import org.apache.tapestry5.annotations.Property;
import studentRecord.studentInfo.Student;
import studentRecord.studentInfo.StudentList;
import studentRecord.studentInfo.Subjects;

import java.util.ArrayList;
import java.util.List;

public class MarksView {

    @Property
    private Subjects subject;

    @Property
    private Subjects olympiadSubject;

    @Property
    private List<Subjects> subjects;

    @Property
    private Student[] students;

    @Property
    private Student student;

    @Property
    private List<Subjects> olympiadSubjects = new ArrayList<Subjects>();

    public void onActivate(int index) {
        StudentList studentList = new StudentList();
        students = studentList.getStudentList();
        student=students[index-1];
        subjects = students[index - 1].subjects;
        if (students[index - 1].age > 9) {
            for (Subjects sub : subjects) {
                if (sub.name == "English" || sub.name == "Maths") {
                    olympiadSubjects.add(sub);
                }
            }
        }
    }

    public boolean isShowOlympiadSubject(){
        if(student.age >9){
            return true;
        }
        return false;
    }

    public String getStudentName(){
        return student.studentClass;
    }
}



