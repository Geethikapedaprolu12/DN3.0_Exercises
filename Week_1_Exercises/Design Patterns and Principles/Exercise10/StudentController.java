package ex10;

public class StudentController {
    private Student studentModel;
    private StudentView studentView;

    public StudentController(Student studentModel, StudentView studentView) {
        this.studentModel = studentModel;
        this.studentView = studentView;
    }

    public String getStudentName() {
        return studentModel.getName();
    }

    public void setStudentName(String studentName) {
        studentModel.setName(studentName);
    }

    public int getStudentId() {
        return studentModel.getId();
    }

    public void setStudentId(int studentId) {
        studentModel.setId(studentId);
    }

    public String getStudentGrade() {
        return studentModel.getGrade();
    }

    public void setStudentGrade(String studentGrade) {
        studentModel.setGrade(studentGrade);
    }

    public void updateView() {
        studentView.displayStudentDetails(studentModel.getName(), studentModel.getId(), studentModel.getGrade());
    }
}