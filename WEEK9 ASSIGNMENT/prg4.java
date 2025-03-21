import java.util.ArrayList;

class Student {
    private String name;
    private int age;
    private double grade;

    // Constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters
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

public class prg4 {
    private ArrayList<Student> students; // List to hold student records

    // Constructor
    public prg4() {
        students = new ArrayList<>(); // Initialize the student list
    }

    // Mutable function to add a new student to the list of records
    public void addStudent(String name, int age, double grade) {
        Student newStudent = new Student(name, age, grade); // Create a new student record
        students.add(newStudent); // Add the new student to the list
        System.out.println("Added student: " + name);
    }

    // Immutable function to find the average age of all students in the list
    public double calculateAverageAge() {
        if (students.isEmpty()) {
            return 0.0; // Return 0 if there are no students
        }
        
        int totalAge = 0;
        for (Student student : students) {
            totalAge += student.getAge(); // Sum the ages of all students
        }
        return (double) totalAge / students.size(); // Calculate and return the average age
    }

    public static void main(String[] args) {
        prg4 studentRecords = new prg4(); // Create a StudentRecords object
        
        // Adding students
        studentRecords.addStudent("Alice", 20, 85.5);
        studentRecords.addStudent("Bob", 22, 90.0);
        studentRecords.addStudent("Charlie", 21, 78.0);

        // Calculate and display the average age
        double averageAge = studentRecords.calculateAverageAge();
        System.out.println("Average age of students: " + averageAge);
    }
}
