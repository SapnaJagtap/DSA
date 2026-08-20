import java.util.Scanner;

class Student {
    int roll_no;
    String name;
    String course;
    String department;
    String division;

    public void setRollNumber(int roll) {
        roll_no = roll;
    }

    public void setName(String n) {
        name = n;
    }

    public void setCourse(String c) {
        course = c;
    }

    public void setDepartment(String d) {
        department = d;
    }

    public void setDivision(String di) {
        division = di;
    }

    public void displayStudent() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll Number: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Department: " + department);
        System.out.println("Division: " + division);
    }

    public static Student addStudent(Scanner sc) {
        Student s = new Student();

        System.out.println("Enter the roll number: ");
        int roll = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();

        System.out.println("Enter the course: ");
        String course = sc.nextLine();

        System.out.println("Enter the department: ");
        String department = sc.nextLine();

        System.out.println("Enter the division: ");
        String division = sc.nextLine();

        s.setRollNumber(roll);
        s.setName(name);
        s.setCourse(course);
        s.setDepartment(department);
        s.setDivision(division);

        return s;
    }
}

public class Main {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n1. Add student \n2. Remove Student \n3. Update Student "
                    + "\n4. Sort \n5. Search \n6. Filter \n7. Display All \n8. Exit");
            System.out.print("Choose the option: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addStudentMenu();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    sortStudents();
                    break;
                case 5:
                    searchStudent();
                    break;
                case 6:
                    filterStudents();
                    break;
                case 7:
                    displayAll();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 8);

        sc.close();
    }

    // 1. Add
    static void addStudentMenu() {
        Student s = Student.addStudent(sc);
        students.add(s);
        System.out.println("Student added successfully.");
    }

    // 2. Remove
    static void removeStudent() {
        System.out.print("Enter roll number to remove: ");
        int roll = sc.nextInt();
        sc.nextLine();

        boolean removed = students.removeIf(s -> s.roll_no == roll);
        if (removed) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // 3. Update
    static void updateStudent() {
        System.out.print("Enter roll number to update: ");
        int roll = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.roll_no == roll) {
                System.out.print("Enter new name: ");
                s.setName(sc.nextLine());
                System.out.print("Enter new course: ");
                s.setCourse(sc.nextLine());
                System.out.print("Enter new department: ");
                s.setDepartment(sc.nextLine());
                System.out.print("Enter new division: ");
                s.setDivision(sc.nextLine());
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // 4. Sort
    static void sortStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to sort.");
            return;
        }
        System.out.println("Sort by: 1. Roll Number  2. Name");
        int opt = sc.nextInt();
        sc.nextLine();

        if (opt == 1) {
            students.sort(Comparator.comparingInt(s -> s.roll_no));
        } else if (opt == 2) {
            students.sort(Comparator.comparing(s -> s.name));
        } else {
            System.out.println("Invalid option.");
            return;
        }
        System.out.println("Students sorted successfully.");
        displayAll();
    }

    // 5. Search
    static void searchStudent() {
        System.out.print("Enter roll number to search: ");
        int roll = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.roll_no == roll) {
                s.displayStudent();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // 6. Filter
    static void filterStudents() {
        System.out.println("Filter by: 1. Course  2. Department  3. Division");
        int opt = sc.nextInt();
        sc.nextLine();

        String key;
        switch (opt) {
            case 1:
                System.out.print("Enter course: ");
                key = sc.nextLine();
                students.stream()
                        .filter(s -> s.course.equalsIgnoreCase(key))
                        .forEach(Student::displayStudent);
                break;
            case 2:
                System.out.print("Enter department: ");
                key = sc.nextLine();
                students.stream()
                        .filter(s -> s.department.equalsIgnoreCase(key))
                        .forEach(Student::displayStudent);
                break;
            case 3:
                System.out.print("Enter division: ");
                key = sc.nextLine();
                students.stream()
                        .filter(s -> s.division.equalsIgnoreCase(key))
                        .forEach(Student::displayStudent);
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    // 7. Display all
    static void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("\n===== All Students =====");
        for (Student s : students) {
            s.displayStudent();
        }
    }
}