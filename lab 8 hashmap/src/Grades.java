import java.util.*;

public class Grades {

    public static void main(String[] args) {

        Map<String, Double> students = new HashMap<>();

        students.put("Ali", 3.2);
        students.put("Aytaj", 3.8);
        students.put("Murad", 2.9);
        students.put("Bahshali", 3.8);
        students.put("Turan", 2.5);

        double maxGpa = 0;

        for (double gpa : students.values()) {
            if (gpa > maxGpa) {
                maxGpa = gpa;
            }
        }
        System.out.println("Max gpas: " + maxGpa);

        System.out.println("Top students:");
        for (Map.Entry<String, Double> entry : students.entrySet()) {
            if (entry.getValue() == maxGpa) {
                System.out.println(entry.getKey());
            }
        }

        double sum = 0;
        for (double gpa : students.values()) {
            sum += gpa;
        }
        double average = sum / students.size();
        System.out.println("Average gpa = " + average);

        int count = 0;
        for (double gpa : students.values()) {
            if (gpa < average) {
                count++;
            }
        }

        System.out.println("Students < average == " + count);
    }
}