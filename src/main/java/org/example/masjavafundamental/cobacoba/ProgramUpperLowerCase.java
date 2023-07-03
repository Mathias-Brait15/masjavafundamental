package org.example.masjavafundamental.cobacoba;

import java.util.Scanner;

public class ProgramUpperLowerCase {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukan huruf: ");
        char ch = inputUser.next().charAt(0);
        int castAscii = (int) ch;

        System.out.println(castAscii);

        if (castAscii >= 65 && castAscii <= 90){
            System.out.println("Huruf kapital");
        }else if(castAscii >= 97 && castAscii <= 122){
            System.out.println("Huruf kecil");
        }else {
            System.out.println("Bukan huruf");
        }

    }
}

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Lenovo a.k.a. Paul Christian
Java Developer
Created on 03/07/2023 21:23
@Last Modified 03/07/2023 21:23
Version 1.0
*/

