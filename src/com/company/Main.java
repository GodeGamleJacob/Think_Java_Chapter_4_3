package com.company;

public class Main {                             //

    public static void main(String[] args) {    //1
        System.out.print("No, I ");             //2
        zoop();                                 //3
        System.out.print("I ");                 //24
        baffle();                               //25
    }                                           //34
                                                //
    public static void zoop() {                 //4 + 22
        baffle();                               //5
        System.out.print("You wugga ");         //13
        baffle();                               //14
    }                                           // + 23 + 33
                                                //
    public static void baffle() {               //6 + 15 + 26
        System.out.print("wug");                //7 + 16 + 27
        ping();                                 //8 + 17 + 28
    }                                           //12 + 21+ 32
    public static void ping() {                 //9 + 18 + 29
        System.out.println(".");                //10 + 19 + 30
    }                                           //11 + 20 + 31
}                                               //35

//The output of this program is:

    /*
    No, I wug.
    You wugga wug.
    I wug.
    */