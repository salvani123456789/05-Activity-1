//Name: Salvani, Christian Joseph S.
//Section: BSIT - 307
public class Student {
    String firstName, lastName;
    int age;
    String studentStatus;
    public Student() {
        firstName = "No name yet";
        lastName = "Unknown";
        age = 0;
        studentStatus = "Unregistered";
    }
    public Student(String firstName, int age) {
        this.firstName = firstName;
        this.lastName = "Unknown";
        this.age = age;
        this.studentStatus = "Active";
    }
    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentStatus = "Active";
    }
    public Student(String firstName, String lastName, int age, String studentStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentStatus = studentStatus;
    }
    public void displayStudentInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Status: " + studentStatus);
    }

    public static void main(String[] args) {
        Student Student = new Student("Christian Joseph", "Salvani", 20, "Enrolled");
        Student.displayStudentInfo();
    }
}