package week5;

import java.util.Scanner;
import java.util.ArrayList;
public class Ex88 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();

        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            students.add( new Student(name, studentNumber) );

        }

        System.out.println("");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("");

        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");


        for (Student student : students) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
}
