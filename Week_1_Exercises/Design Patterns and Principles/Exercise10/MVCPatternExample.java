package ex10;

public class MVCPatternExample {
    public static void main(String[] args) {
        Student student = Student.getInstance("John Doe", 1, "A");
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student, studentView);
        studentController.updateView();
        studentController.setStudentName("Jane Doe");
        studentController.setStudentGrade("B");
        studentController.updateView();
    }
}