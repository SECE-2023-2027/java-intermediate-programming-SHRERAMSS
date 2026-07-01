import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int numMarks = sc.nextInt();

        int[] marks = new int[numMarks];

        for (int i = 0; i < numMarks; i++) {
            marks[i] = sc.nextInt();
        }

        Student student = new Student(name, marks);

        System.out.println(student.calculateAverage());

        sc.close();
    }
}