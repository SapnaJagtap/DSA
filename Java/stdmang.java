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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students do you want to add? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nAdding student " + (i + 1) + ":");
            students[i] = Student.addStudent(sc);
        }

        System.out.println("\n===== All Students =====");
        for (Student s : students) {
            s.displayStudent();
        }

        sc.close();
    }
}

public static void main(String[] args){
    System.out.println("1. Add student \n 2. Remove Student \n 3. Update Student \n 4. Sort \n 5. Search \n 6. Filter");
    System.out.println("Choose the option: ");
    int choice = sc.nextInt();
    int i = 0;

}