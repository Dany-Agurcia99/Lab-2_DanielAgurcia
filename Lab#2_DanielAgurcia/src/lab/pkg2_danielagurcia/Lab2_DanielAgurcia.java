package lab.pkg2_danielagurcia;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_DanielAgurcia {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1- Registro de los aviones\n"
                    + "2- Manejo del trafico\n"
                    + "3- Log in\n"
                    + "4- Salir");
            System.out.print("Ingrese la opcion: ");
            opcion = read.nextInt();
            if (opcion == 1) {
                System.out.println("1- Crear aviones\n"
                        + "2- Leer aviones\n"
                        + "3- Actualizar aviones\n"
                        + "4- Borrar los aviones");
                System.out.println("Igrese la opcion: ");
                int opcion2 = read.nextInt();
                while (opcion2 <= 0 || opcion2 > 4) {
                    System.out.println("Ingreso una opcion incorrecta");
                    System.out.println("1- Crear aviones\n"
                            + "2- Leer aviones\n"
                            + "3- Actualizar aviones\n"
                            + "4- Borrar los aviones");
                    System.out.println("Igrese la opcion: ");
                    opcion2 = read.nextInt();
                }
                if (opcion2 == 1) {

                } else if (opcion2 == 2) {

                } else if (opcion == 3) {

                } else if (opcion == 4) {

                }

            } else if (opcion == 2) {

            } else if (opcion == 3) {

            }
        }

    }

}
