package softwareweek1;

import java.util.Scanner;

public class Studentlist {

    public static void main(String[] args) {
        int i;
        Student[] s1 = new Student[3];
        Student s2 = new Student();
        s2.setYesr(0000000);
        System.out.println("abhijeet " + s2.getYesr());
        Scanner sc = new Scanner(System.in);
        for (i = 1; i < s1.length; i++) {
            s1[i] = new Student();
            System.out.println("Enter id");
            s1[i].setId(sc.nextInt());
            System.out.println("Enter year");
            s1[i].setYesr(sc.nextInt());
        }
        for (i = 1; i < s1.length; i++) {
            System.out.println("Id= " + s1[i].getId());
            System.out.println("Name= " + s1[i].getYesr());
        }
    }
}
