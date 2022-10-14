package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        float input;
        float output = 0;
        int z = 1;              // Zählernummer
        input = scanner.nextFloat();

        if (input <= 0) {
            System.out.println("Number 1: No number entered.");
        }

        while (input > 0) {
            System.out.print("Number " + z + ": ");
            if (input > output) {
                output=input;
            }
            z++;
            input = scanner.nextFloat();

            if (input <=0) {
                System.out.print("Number " + z + ": ");
                System.out.printf("The largest number is %.2f" + System.lineSeparator(), output);
            }
        }

    }

    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();  // Zeilen
        int output = 1;
        System.out.print("n: ");

        if (i > 0) {
            for (int x = 1; x<=i; x++) {
                for (int z = 1; z<= x; z++) {
                    System.out.print( output + " ");
                    output++;
                }
                System.out.println();
            }
                } else {
                 System.out.println("Invalid number!");

             }

    }

    //todo Task 3
    public void printPyramid(){

        for (int i = 1; i<=6; i++) {        // Zeilen
            for (int y = i; y<6; y++) {     // Abstände
                System.out.print(" ");
            }
            for (int z = 1; z<(i*2); z++) {      // Sterne
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //todo Task 4
    public void printRhombus(){
    // Code-Inspiration von Tutorium am 14.10.2022

        Scanner scanner = new Scanner(System.in);
        System.out.print("h: "); // row-Anzahl
        int h = scanner.nextInt();
        System.out.print("c: "); // character
        char c = scanner.next().charAt(0);


        if (h % 2 == 1) { // nur wenn Zahl ungerade

            // Oberer Teil
            for (int first = 0; first<= h/2; first++) {
                for (int j = first; j< h/2; j++) { // j sind die Leerzeichen
                    System.out.print(" ");
                }
                for (int print = 0-first; print<=first; print++) {      // Char printen
                    System.out.print((char)(c - Math.abs(print)));
                }
                System.out.println();

            }

            // Unterer Teil
            for (int second = h/2 -1; second >=0; second--) {
                for (int j = second +1; j <= h/2; j++) { // Leerzeichen
                    System.out.print(" ");
                }
                for (int print = 0-second; print <= second; print++ ) {     // selber Code wie oben
                    System.out.print((char) (c-Math.abs(print)));
                }
                System.out.println();

            }

        } else {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 5
    public void marks(){
        int mark;
        Scanner scanner = new Scanner(System.in);
        mark = scanner.nextInt();
        int i = 1;                      // Markzähler
        int z = 0;                      // 5er Zähler
        float sum = 0;                  // Summe der Noten

        while (mark != 0) {             // Schleife

            if (mark <=5 && mark >=1) { // valid mark

                sum = sum + mark;
                System.out.print("Mark " + i + ": ");
                i++;

            } else {                        // invalid mark
                System.out.print("Mark " + i + ": ");
                System.out.println("Invalid mark!");
            }
            if (mark == 5) {            // 5er zählen
                z++;
            }
            mark = scanner.nextInt();
            }

        System.out.print("Mark " + i + ": ");
        float averagemark;              // Durchschnittsnote
        if (sum != 0) {
            averagemark = sum / (i-1);
        } else {
            averagemark = 0;
        }
        System.out.printf("Average: %.2f", averagemark);
        System.out.println();
        System.out.println("Negative marks: " + z);
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int num = scanner.nextInt();
        int first;
        int second;
        int third;
        int sumOfNums;

        while (num > 0) {
            if (num !=4 && num !=1) {
                first = (num/100) % 10; // num: 192 -> first = 1
                second = (num/10) % 10; // num: 192 -> second = 9
                third = num % 10; // num: 192 ->  third = 2

                sumOfNums = first * first + second * second + third * third;
                num = sumOfNums;

            }

            if (num == 4) {
                System.out.println("Sad number!");
                break;
            }

            if (num == 1) {
                System.out.println("Happy number!");
                break;
            }
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}