/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.time;

import java.util.Scanner;

class Student {

    private String name, email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Email of Student " + name + "is: " + email;
    }

}

public class Main {

    public static String Search(Student[] students, String domain) {
        String s = "Search Results:\n";
        int t = 0, n = students.length;
        for (int i = 0; i < n; i++) {
            String sh = students[i].getEmail();
            if (sh.endsWith(domain)) {
                t++;
                s += students[i].getName();
                s += '\n';
            }
        }
        double d = (t * 1.0) / (n * 1.0);
        d = d * 100;
        return "" + t + " students voted using this domain.|" + d + "% of total votes.\n\n" + s;
    }

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("How many Students do you want to add?");
        int a = get.nextInt();
        Student[] arr = new Student[a];
        System.out.println("Enter all the student's name and email:");
        String ni;
        ni = get.nextLine();
        for (int i = 0; i < a; i++) {
            String n, e;
            n = get.nextLine();
            e = get.nextLine();
            System.out.println("kjf" + n + "" + e);
            arr[i] = new Student(n, e);
        }

        System.out.println("Enter a university domain to search");
        String h = get.nextLine();
        System.out.println(Search(arr, h));

    }
}
