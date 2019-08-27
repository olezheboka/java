package com.udemy.lessons.excercises;

public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);


    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytesToPrint = (kiloBytes / 1024);
            int kiloBytesRemainder = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + megaBytesToPrint + " MB and " + kiloBytesRemainder + " KB");
        }
    }


}
