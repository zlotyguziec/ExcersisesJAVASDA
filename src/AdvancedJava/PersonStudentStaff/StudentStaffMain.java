package AdvancedJava.PersonStudentStaff;

public class StudentStaffMain {


    public static void main(String[] args) {
            Person person = new Person("Jacek", "Placek");
        System.out.println(person.toString());
        Student student = new Student(person.name, person.address, StudiesType.ZAOCZARY, 2,2567.65);
        System.out.println(student.toString());
        Lecturer lecturer = new Lecturer(person.name, person.address, Specialization.MATHEMATICS, 1800.97);
        System.out.println(lecturer.toString());
    }
}
