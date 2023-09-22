public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student (String n, int a, double g) {
        name = n;
        age = a;
        gpa = g;
    }

    public void introduce() {
        System.out.println("Hello my name is " + name);
    }

    // method that prints Cat info
    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gpa: " + gpa);
    }

}
