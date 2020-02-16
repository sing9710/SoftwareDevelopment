package softwareweek1;

import java.util.Scanner;

public class Studentlist {

    public static void main(String[] args) {
        int i;
        Student[] s1 = new Student[3];
        Student s2 = new Student();
        s2.setName("navjot");
        System.out.println("name " + s2.getName());
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < s1.length; i++) {
            s1[i] = new Student();
            System.out.println("Enter id");
            s1[i].setId(sc.nextInt());
            System.out.println("Enter name");
            s1[i].setName(sc.next());
        }
        for (i = 0; i < s1.length; i++) {
            System.out.println("Id= " + s1[i].getId());
            System.out.println("Name= " + s1[i].getName());
        }
    }
}
