package ex10;

public class Student {
    private static Student instance;
    private String name;
    private int id;
    private String grade;

    private Student(String name, int id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public static Student getInstance(String name, int id, String grade) {
        if (instance == null) {
            synchronized (Student.class) {
                if (instance == null) {
                    instance = new Student(name, id, grade);
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}