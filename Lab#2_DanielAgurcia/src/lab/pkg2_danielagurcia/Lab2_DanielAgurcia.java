package lab.pkg2_danielagurcia;

import Clases.Aviones;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_DanielAgurcia {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Aviones> ListaAviones = new ArrayList();
        int opcion2 = 0;
        int opcion1 = 0;
        System.out.println("Usuario = Dany_Agurcia\nPassword = Haxorus");
        while (opcion1 != 2) {
            System.out.println("1) Log in\n2)Salir");
            opcion1 = read.nextInt();
            if (opcion1 == 1) {
                System.out.println("Ingrese nombre de Usuario: ");
                String nombreU = read.next();
                System.out.println("Ingrese Password");
                String passwordU = read.next();
                while (!nombreU.equals("Dany_Agurcia") || !passwordU.equals("Haxorus")) {
                    if (nombreU != "Daniel Agurcia") {
                        System.out.println("Nombre de Usuario Incorrecto");
                        System.out.println("Ingrese nombre de Usuario: ");
                        nombreU = read.next();
                        System.out.println("Ingrese Password");
                        passwordU = read.next();
                    } else {
                        System.out.println("Password incorrecta");
                        System.out.println("Ingrese nombre de Usuario: ");
                        nombreU = read.next();
                        System.out.println("Ingrese Password");
                        passwordU = read.next();
                    }
                }
                System.out.println("Ingreso exitoso, Bienvenido Dany_Agurcia :)");
                while (opcion2 != 3) {
                    System.out.println("1- Registro de los aviones\n"
                            + "2- Manejo del trafico\n"
                            + "3- Salir");
                    System.out.print("Ingrese la opcion: ");
                    opcion2 = read.nextInt();
                    if (opcion2 == 1) {
                        System.out.println("1- Crear aviones\n"
                                + "2- Leer aviones\n"
                                + "3- Actualizar aviones\n"
                                + "4- Borrar los aviones");
                        System.out.println("Igrese la opcion: ");
                        int opcion3 = read.nextInt();
                        while (opcion3 <= 0 || opcion3 > 4) {
                            System.out.println("Ingreso una opcion incorrecta");
                            System.out.println("1- Crear aviones\n"
                                    + "2- Leer aviones\n"
                                    + "3- Actualizar aviones\n"
                                    + "4- Borrar los aviones");
                            System.out.println("Igrese la opcion: ");
                            opcion3 = read.nextInt();
                        }
                        if (opcion3 == 1) {
                            System.out.println("Ingrese modelo del avion: ");
                            String modelo = read.next();
                            System.out.println("Ingrese el codigo del avion: ");
                            String codigo = read.next();
                            int contL = 0;
                            int contN = 0;
                            for (int i = 0; i < codigo.length(); i++) {
                                if (Character.isDigit(codigo.charAt(i))) {
                                    contN++;
                                } else if (Character.isLetter(codigo.charAt(i))) {
                                    contL++;
                                }
                            }
                            while (contL == 0 || contN == 0) {
                                System.out.println("El codigo tiene que ser alphanumerico");
                                System.out.println("Ingrese el codigo del avion: ");
                                codigo = read.next();
                                contL = 0;
                                contN = 0;
                                for (int i = 0; i < codigo.length(); i++) {
                                    if (Character.isDigit(codigo.charAt(i))) {
                                        contN++;
                                    } else if (Character.isLetter(codigo.charAt(i))) {
                                        contL++;
                                    }
                                }
                            }
                            System.out.println("Ingrese fecha de fabricacion del avion: ");
                            String fechafabri = read.next();
                            System.out.println("Ingrese la fecha en la que ingreso el avion al aeropuerto: ");
                            String ingreso = read.next();
                            System.out.println("Ingrese la capacidad de pasajeros del avion: ");
                            int capacidad = read.nextInt();
                            System.out.println("Ingrese la capacidad del peso total que soporta el avion: ");
                            int pesoT = read.nextInt();
                            System.out.println("Ingrese la cantidad de horas de vuelo del avion: ");
                            int cantidadVuelo = read.nextInt();
                            System.out.println("Ingrese cuantos motores tiene el avion: ");
                            int motores = read.nextInt();
                            System.out.println("Nombre del ingeniero a cargo: ");
                            read.nextLine();
                            String nombreIng = read.nextLine();
                            ListaAviones.add(new Aviones(modelo, codigo, fechafabri, ingreso, capacidad, pesoT, cantidadVuelo, motores, nombreIng));
                        } else if (opcion3 == 2) {
                            String salida = "";
                            for (Aviones temp : ListaAviones) {
                                salida += (ListaAviones.indexOf(temp) + 1) + " " + temp + "\n";
                            }
                            System.out.println(salida);
                        } else if (opcion3 == 3) {
                            System.out.println("Ingrese la posicion en la lista del avion que quiere actualizar:  ");
                            int posicion = read.nextInt();
                            while (posicion <= 0 || posicion > ListaAviones.size()) {
                                System.out.println("No existe esa posicion en la lista de aviones");
                                System.out.println("Ingrese la posicion en la lista del avion que quiere actualizar:  ");
                                posicion = read.nextInt();
                            }
                            System.out.println("Ingrese lo que quiere actualizar del avion \n 1-modelo\n2-codigo\n3-fabricacion\n4-fecha de ingreso\n5-capacidad de pasajeros\n"
                                    + "6-capacidad del peso del avion\n7-horas voladas del avion\n8-Motores del avion\n9-Ingeniero a cargo");
                            int cambio = read.nextInt();
                            while (cambio <= 0 || cambio > 9) {
                                System.out.println("Porfavor ingrese una de las opciones validas");
                                System.out.println("Ingrese lo que quiere actualizar del avion \n 1-modelo\n2-codigo\n3-fabricacion\n4-fecha de ingreso\n5-capacidad de pasajeros\n"
                                        + "6-capacidad del peso del avion\n7-horas voladas del avion\n8-Motores del avion\n9-Ingeniero a cargo");
                                cambio = read.nextInt();
                            }
                            switch (cambio) {
                                case 1:
                                    System.out.println("Ingrese el nuevo modelo del avion: ");
                                    String modeloN = read.next();
                                    ListaAviones.get(posicion - 1).setModelo(modeloN);
                                    System.out.println("Actualizacion exitosa :)");
                                    break;
                                case 2:
                                    System.out.println("Ingrese el nuevo codigo del avion: ");
                                    String codigoN = read.next();
                                    ListaAviones.get(posicion - 1).setCodigo(codigoN);
                                    System.out.println("Actualizacion exitosa :)");
                                    break;
                                case 3:
                                    System.out.println("Ingrese la nueva fecha de fabricacion del avion: ");
                                    String fechafabriN = read.next();
                                    ListaAviones.get(posicion - 1).setFechafabri(fechafabriN);
                                    System.out.println("Actualizacion exitosa :)");
                                    break;
                                case 4:
                                    System.out.println("Ingrese la nueva fecha de ingreso del avion: ");
                                    String ingresoN = read.next();
                                    ListaAviones.get(posicion - 1).setIngreso(ingresoN);
                                    System.out.println("Actualizacion exitosa :)");
                                    break;
                                case 5:
                                    System.out.println("Ingrese la nueva capacidad de pasajeros del avion: ");
                                    int capacidadN = read.nextInt();
                                    ListaAviones.get(posicion - 1).setCapacidad(cambio);
                                    System.out.println("Actualizacion exitosa :)");
                                    break;
                                case 6:
                                    System.out.println("Ingrese la nueva capacidad de peso del avion: ");
                                    int pesoTN = read.nextInt();
                                    ListaAviones.get(posicion - 1).setPesoT(pesoTN);
                                    System.out.println("Actualizacion exitosa :)");
                                    break;
                                case 7:
                                    System.out.println("Ingrese las nuevas horas voladas del avion: ");
                                    int cantidadVueloN = read.nextInt();
                                    ListaAviones.get(posicion - 1).setCantidadVuelo(cambio);
                                    System.out.println("Actualizacion exitosa :)");
                                    break;
                                case 8:
                                    System.out.println("Ingrese la nueva cantidad de motores del avion: ");
                                    int motoresN = read.nextInt();
                                    ListaAviones.get(posicion - 1).setMotores(motoresN);
                                    System.out.println("Actualizacion exitosa :)");
                                    break;
                                case 9:
                                    System.out.println("Ingrese el nuevo Ingeniero a cargo del avion: ");
                                    read.nextLine();
                                    String nombreIngN = read.nextLine();
                                    ListaAviones.get(posicion - 1).setNombreIng(nombreIngN);
                                    System.out.println("Actualizacion exitosa :)");
                                    break;
                            }
                        } else if (opcion3 == 4) {
                            System.out.println("Ingrese la posicion en la lista del avion que quiere eliminar:  ");
                            int posicion = read.nextInt();
                            while (posicion <= 0 || posicion > ListaAviones.size()) {
                                System.out.println("No existe esa posicion en la lista de aviones");
                                System.out.println("Ingrese la posicion en la lista del avion que quiere modificar:  ");
                                posicion = read.nextInt();
                            }
                            ListaAviones.remove(posicion - 1);
                        }
                    } else if (opcion2 == 2) {
                        ArrayList<Aviones> ListaAvionesEstacionados = new ArrayList();
                        ArrayList<Aviones> ListaAvionesEnVuelo = new ArrayList();
                        ArrayList<Aviones> ListaAvionesEnEspera = new ArrayList();
                        ArrayList<Aviones> ListaAvionesListos = new ArrayList();
                        for (Aviones avion : ListaAviones) {
                            if (avion.getEstado().equals("Estacionado")) {
                                ListaAvionesEstacionados.add(avion);
                            } else if (avion.getEstado().equals("En Vuelo")) {
                                ListaAvionesEnVuelo.add(avion);
                            } else if (avion.getEstado().equals("En Espera")) {
                                ListaAvionesEnEspera.add(avion);
                            } else {
                                ListaAvionesListos.add(avion);
                            }
                        }
                        String salidaE = "Aviones Estacionados" + ListaAvionesEstacionados.size() + ":\n\n ";
                        for (Aviones temp : ListaAvionesEstacionados) {
                            salidaE += temp.toString() + "\n";
                        }
                        System.out.println(salidaE);
                        String salidaEE = "Aviones En Espera" + ListaAvionesEnEspera.size() + ":\n\n ";
                        for (Aviones temp : ListaAvionesEnEspera) {
                            salidaEE += temp.toString() + "\n";
                        }
                        System.out.println(salidaEE);
                        String salidaEV = "Aviones En Vuelo" + ListaAvionesEnVuelo.size() + ":\n\n ";
                        for (Aviones temp : ListaAvionesEnVuelo) {
                            salidaEV += temp.toString() + "\n";
                        }
                        System.out.println(salidaEV);
                        String salidaL = "Aviones Listos" + ListaAvionesListos.size() + ":\n\n ";
                        for (Aviones temp : ListaAvionesListos) {
                            salidaL += temp.toString() + "\n";
                        }
                        System.out.println(salidaL);
                        System.out.println("Ingrese la posicion en la lista del avion que quiere actualizar el Estado de Vuelo: ");
                        int posicion = read.nextInt();
                        while (posicion <= 0 || posicion > ListaAviones.size()) {
                            System.out.println("No existe esa posicion en la lista de aviones");
                            System.out.println("Ingrese la posicion en la lista del avion que quiere actualizar el Estado de Vuelo:  ");
                            posicion = read.nextInt();
                        }
                        if (ListaAviones.get(posicion - 1).getEstado().equals("Estacionado")) {
                            ListaAviones.get(posicion - 1).setEstado("En Espera");
                            System.out.println("Se le ha cambiado el estado al avion a Espera correctamente");
                        } else if (ListaAviones.get(posicion - 1).getEstado().equals("En Vuelo")) {
                            ListaAviones.get(posicion - 1).setEstado("Estacionado");
                            System.out.println("Se le ha cambiado el estado al avion a Estacionado correctamente");
                        } else if (ListaAviones.get(posicion - 1).getEstado().equals("En Espera")) {
                            ListaAviones.get(posicion - 1).setEstado("Listo");
                            System.out.println("Se le ha cambiado el estado al avion a Listo correctamente");
                        } else {
                            System.out.println("Ingrese a que estado quiere pasar el Avion:\n1)Listo a Espera\n2) Listo a En Vuelo ");
                            int opcion4 = read.nextInt();
                            while (opcion4 <= 0 || opcion4 > 2) {
                                System.out.println("Ingreso una opcion invalida");
                                System.out.println("A que estado quiere pasar el avion:\n1)Listo a Espera\n2Listo a En Vuelo)");
                                opcion4 = read.nextInt();
                            }
                            if (opcion4 == 1) {
                                ListaAviones.get(posicion - 1).setEstado("En Espera");
                                System.out.println("Se le ha cambiado el estado al avion a Espera correctamente");
                            } else {
                                ListaAviones.get(posicion - 1).setEstado("En Vuelo");
                                System.out.println("Se le ha cambiado el estado al avion a En Vuelo correctamente");
                            }
                        }
                    }
                }
            }
        }

    }

}
