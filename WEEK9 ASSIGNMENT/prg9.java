import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }
}

public class prg9 {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = Arrays.asList(
            new Student("Alice", 20, 85.5),
            new Student("Bob", 22, 78.0),
            new Student("Charlie", 19, 92.0),
            new Student("David", 21, 88.5),
            new Student("Eve", 23, 75.0)
        );

        // 1. Map: Create a new list containing only the names of the students
        List<String> studentNames = students.stream()
                .map(Student::getName) // Use method reference to get names
                .collect(Collectors.toList());

        System.out.println("Student Names:");
        studentNames.forEach(System.out::println);

        // 2. Filter: Filter the students who are above a certain age threshold (e.g., 21)
        int ageThreshold = 21;
        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getAge() > ageThreshold)
                .collect(Collectors.toList());

        System.out.println("\nStudents Above Age " + ageThreshold + ":");
        filteredStudents.forEach(student -> 
            System.out.println(student.getName() + ", Age: " + student.getAge() + ", Grade: " + student.getGrade()));

        // 3. Reduce: Calculate the average grade of all students
        double averageGrade = students.stream()
                .collect(Collectors.averagingDouble(Student::getGrade));

        System.out.println("\nAverage Grade of All Students: " + averageGrade);
    }
}
