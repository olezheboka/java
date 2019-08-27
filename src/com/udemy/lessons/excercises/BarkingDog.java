package com.udemy.lessons.excercises;

public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));
        System.out.println(shouldWakeUp(true,0));

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && hourOfDay >= 0 && hourOfDay < 8 || barking && hourOfDay <24 && hourOfDay > 22) {
            return true;
        }
        return false;
    }
}
