import java.util.Scanner;

public class Student {
    char[] usn;
    String name;
    int[] marks;
    int[] credits;

    public void cred_marks(int size) {
        credits = new int[size];
        marks = new int[size];
    }

    public void details() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter usn:");
        usn = scan.nextLine().toCharArray();
        System.out.println("Enter name:");
        name = scan.nextLine();
        System.out.println("Enter the no. of subjects:");
        int size = scan.nextInt();
        credits = new int[size];
        marks = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter credits of subject " + (i + 1) + ":");
            credits[i] = scan.nextInt();
            System.out.println("Enter marks of subject " + (i + 1) + ":");
            marks[i] = scan.nextInt();
        }
    }

    public void display() {
        System.out.println("USN: " + String.valueOf(usn));
        System.out.println("Name: " + name);
        System.out.println("Credits and Marks details:");
        for (int i = 0; i < credits.length; i++) {
            System.out.println("Subject " + (i + 1) + " - Credits: " + credits[i] + ", Marks: " + marks[i]);
        }
    }

    public void sgpa() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total no of grade points:");
        int t_gp = scan.nextInt();
        int o_gp = 0;
        for (int i = 0; i < credits.length; i++) {
            if (marks[i] <= 100 && marks[i] >= 90) {
                o_gp += credits[i] * 10;
            } else if (marks[i] >= 80 && marks[i] < 90) {
                o_gp += credits[i] * 9;
            } else if (marks[i] >= 70 && marks[i] < 80) {
                o_gp += credits[i] * 8;
            } else if (marks[i] >= 60 && marks[i] < 70) {
                o_gp += credits[i] * 7;
            } else if (marks[i] >= 50 && marks[i] < 60) {
                o_gp += credits[i] * 6;
            } else if (marks[i] >= 40 && marks[i] < 50) {
                o_gp += credits[i] * 5;
            } else {
                o_gp += credits[i] * 0;
            }
        }
        double sgpa = (double) o_gp / t_gp;
        System.out.println("SGPA of student: " + sgpa*10);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1BM23CS085, Dama Yohitesh Naveen Sai");
        System.out.println("Enter no of subjects:");
        int subs = scan.nextInt();
        Student stud = new Student();
        stud.cred_marks(subs);
        stud.details();
        stud.display();
        stud.sgpa();
        scan.close();
    }
}
