package tasksFromDoc;
/*
72. Students task #1
Create a class named 'Student' with String variable 'name' and integer variable 'role'.
Assign the value of role as '2' and that of name as "John" by creating an object of the class Student.
 */

import java.util.Objects;

public class Task72 {
    public static void main(String[] args) {
        Student studentOne = new Student("John", 2);
        Student studentTwo = new Student();

        System.out.println(studentOne.toString());
        System.out.println(studentTwo.toString());

    }
}


class Student{
    private String name;
    private int role;

    public Student(String name, int role) {
        this.name = name;
        this.role = role;
    }

    public Student() {
        this.name = "John";
        this.role = 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return role == student.role && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, role);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}