import CIE.Internals;
import SEE.External;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1BM23CS085, Dama Yohitesh Naveen Sai\n");

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        Internals[] internalStudents = new Internals[n];
        External[] externalStudents = new External[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Clear the buffer

            System.out.print("Enter USN: ");
            String usn = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Semester: ");
            int sem = sc.nextInt();

            int[] internalMarks = new int[5]; 
            System.out.println("Enter 5 internal marks:");
            for (int j = 0; j < 5; j++) {
                internalMarks[j] = sc.nextInt();
            }

            internalStudents[i] = new Internals(usn, name, sem, internalMarks);

            int[] seeMarks = new int[5]; 
            System.out.println("Enter 5 SEE marks:");
            for (int j = 0; j < 5; j++) {
                seeMarks[j] = sc.nextInt();
            }

            externalStudents[i] = new External(usn, name, sem, seeMarks);
        }

        System.out.println("\nFinal Marks:");

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("USN: " + internalStudents[i].USN);
            System.out.println("Name: " + internalStudents[i].name);
            System.out.println("Semester: " + internalStudents[i].sem);

            System.out.print("Final Marks in 5 Courses: ");
            for (int j = 0; j < 5; j++) {
                // Calculate final mark for each course
                int finalMark = internalStudents[i].internalMarks[j] + externalStudents[i].seeMarks[j];
                System.out.print(finalMark + " ");
            }
            System.out.println("\n");
        }

        sc.close();
        
    }
}
