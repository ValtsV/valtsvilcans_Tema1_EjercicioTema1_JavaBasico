package com.valtsvilcans;

import java.util.Arrays;

public class EjemploClase {

    public static void main(String[] args) {

//        Tipos de datos (primitivos)

//        Integer
        byte tipoInt1 = 73; // rango entre -127 a 128
        short tipoInt2 = 640; // rango entre -32768 a 32767
        int tipoInt3 = 3200360; // rango entre – 2,147,483,648 (-231) a 2,147,483,647 (231 -1)
        long tipoInt4 = -4500500500500L; // rango entre -9,223,372,036,854,775,808(-263) a 9,223,372,036,854,775,807(263 -1)

//        Float
        float tipoFloat1 = 4.5F;    // rango hasta 7 decimales
        double tipoFloat2 = 10.22D;     // rango hasta 15 decimales

//        Character
        char tipoCharacter = 'a';

//        Boolean
        boolean tipoBoolean = true;


//        Tipos de datos (no primitivos)

//        String
        String tipoString = "String consiste de chars";

//        Arrays
        String[] tipoArrayOfStrings = {"Hello", "World"};
        boolean[] tipoArrayOfBooleans = {true, false, true};
        int[] tipoArrayOfInts = {1,2,3,4,5,6};


        System.out.println(tipoInt1);
        System.out.println(tipoInt2);
        System.out.println(tipoInt3);
        System.out.println(tipoInt4);
        System.out.println(tipoFloat1);
        System.out.println(tipoFloat2);
        System.out.println(tipoBoolean);
        System.out.println(tipoCharacter);
        System.out.println(tipoString);
        System.out.println(Arrays.toString(tipoArrayOfStrings));
        System.out.println(Arrays.toString(tipoArrayOfBooleans));
        System.out.println(Arrays.toString(tipoArrayOfInts));
    }
}
