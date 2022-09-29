package com.ufv.alberto;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //escanea la sailda del teclado
        Persona p = new Persona();
        System.out.println("Escribe tu nombre: ");
        p.setNombre(sc.nextLine());
        System.out.println(p.getNombre());

        System.out.println("Escribe tu apellido: ");
        p.setApellidos(sc.nextLine());
        System.out.println(p.getApellidos());

        System.out.println("Escribe tu dni sin letra: ");
        p.setDniSinLetra(sc.nextInt());
        System.out.println(p.getDniSinLetra());

        System.out.println("Escribe tu edad: ");
        p.setEdad(sc.nextInt());
        System.out.println("tu edad es :" + p.getEdad());





    }
}