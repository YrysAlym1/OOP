import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      University university = new University();
//      university.name = "Manas";
//      university.address = "Chui prosp";
//      university.ear = 1990;
//      university.students = 500;
//
////
//
//      University university1 = new University();
//        university1.name = "Garvard";
//        university1.address = "Colifornia";
//        university1.ear = 1020;
//        university1.students = 5500;
//
//      University university2 = new University();
//        university2.name = "Ata - Turk";
//        university2.address = "Tunguch";
//        university2.ear = 5655;
//        university2.students = 500;

      Scanner scanner = new Scanner(System.in);

      Scanner scanner1 = new Scanner(System.in);

      Programmer programmer = new Programmer();
      System.out.println("Атынызды жазыныз: ");
      programmer.name = scanner.nextLine();
      System.out.println("Фамилиянызды жазыныз: ");
      programmer.sureName = scanner.nextLine();
      System.out.println("жаш: ");
      programmer.age =scanner1.nextInt();
      programmer.earOfBirth();

      Programmer programmer1 = new Programmer();
      System.out.println("Атынызды жазыныз: ");
      programmer1.name = scanner.nextLine();
      System.out.println("Фамилиянызды жазыныз: ");
      programmer1.sureName = scanner.nextLine();
      System.out.println("жаш: ");
      programmer1.age = scanner1.nextInt();
      programmer1.earOfBirth();









    }
}