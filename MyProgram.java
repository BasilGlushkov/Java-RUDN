package com.company;

import java.util.Scanner;

class Main {
    int x;

    void readingX() {

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
    }

    void toBinary() {
        System.out.println(Integer.toBinaryString(x));
    }

    void toOctal() {
        System.out.println(Integer.toOctalString(x));
    }

    void toHex() {
        System.out.println(Integer.toHexString(x));
    }

    void aboutByte() {
        Byte bt = Byte.valueOf((byte)x);
        if (bt!=x)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
void aboutShort(){
    Short sh = Short.valueOf((short)x);
        if (sh!=x)
            System.out.println("NO");
        else
            System.out.println("YES");
}
    public static void main(String[] args) {
        Main digit = new Main();

        digit.readingX();
//        System.out.print("Вы ввели:");
//digit.printX();
        digit.toBinary();
        digit.toOctal();
        digit.toHex();
        digit.aboutByte();
        digit.aboutShort();
    }
}