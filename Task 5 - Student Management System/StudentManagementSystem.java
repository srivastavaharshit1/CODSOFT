import java.util.ArrayList;
import java.util.Scanner;

// Class to store student information
class Student {
    private String name;
    private int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String toString() {
        return "Roll No: " + rollNumber + ", Name: " + name + ", Grade: " + grade;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        boolean running = true;

        while (running) {
            // Display the menu
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    // Add student details
                    System.out.print("Enter student's name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter roll number: ");
                    int roll = scanner.nextInt();
                    scanner.nextLine(); // Clear newline

                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();

                    Student newStudent = new Student(name, roll, grade);
                    studentList.add(newStudent);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    // Display all students
                    if (studentList.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\nList of Students:");
                        for (Student s : studentList) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    // Search by roll number
                    System.out.print("Enter roll number to search: ");
                    int searchRoll = scanner.nextInt();
                    boolean found = false;

                    for (Student s : studentList) {
                        if (s.getRollNumber() == searchRoll) {
                            System.out.println("Student Found: " + s);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student with Roll No " + searchRoll + " not found.");
                    }
                    break;

                case 4:
                    // Exit the program
                    running = false;
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }

        scanner.close();
    }
}
