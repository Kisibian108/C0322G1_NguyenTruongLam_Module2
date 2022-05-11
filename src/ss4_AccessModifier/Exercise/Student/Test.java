package ss4_AccessModifier.Exercise.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Lam");
        student.setClasses("C03");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
