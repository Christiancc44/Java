package reto_3;

import java.util.ArrayList;
import java.util.Scanner;

public class SDP {


    public static void main(String[] args) {
        ArrayList<persona> p = new ArrayList<persona>();
        datos(p);
        policia s = new policia();

        int op = 0;
        do {
            op = menu();
            switch (op) {
                case 1:
                    s.getCoincidencia(p, ingresoPlaca());
                    break;
//                case 2:
//                    ingresoDatos();
//                    break;
            }
        } while (op >= 1 && op <= 2);
        
        
//        
//             
//        mostrarDatos(p);
    }

    public static void datos(ArrayList<persona> p) {
        policia policia_1 = new policia("PPPPP", "Camilo", "Cardona", "1036145987", "Calle 3 # 58 - 36", "3214789652");
        policia policia_2 = new policia("ZWABB", "Esteban", "Montaño", "95748152", "Carrera 50 # 18 - 47", "3018459632");
        policia policia_3 = new policia("TTTTT", "Yuly", "Guzman", "47125963", "Transversal 73H # 75 - 63", "3107896352");
        policia policia_4 = new policia("KPQAS", "Samantha", "Campos", "10253697841", "Calle 4C # 50 - 26", "3218975421");
        policia policia_5 = new policia("HBCEH", "Sebastian", "Castro", "10369874561", "Carrera 68 # 17 - 90", "3026985423");
//        ciudadano ciudadano_1 = new ciudadano("00000101010101010101", "Pedro", "Pérez", "78963147", "Calle 23 No 34-56. Apto 304, Bucaramanga", "3144912736");
//        ciudadano ciudadano_2 = new ciudadano("11110101010101010101", "Andrés", "Duque", "10786904578", "Calle 45 No 56-105. Apto 801, Bucaramanga", "3146855858");
//        ciudadano ciudadano_3 = new ciudadano("0011010101010101111", "María", "de los Ángeles", "36987168", "Cra 35 No 78-105. Apto 405, Bucaramanga", "3146855858");
//        ciudadano ciudadano_4 = new ciudadano("0011010101010101111", "María", "de los Ángeles", "36987168", "Cra 35 No 78-105. Apto 405, Bucaramanga", "3146855858");
//        ciudadano ciudadano_5 = new ciudadano("0011010101010101111", "María", "de los Ángeles", "36987168", "Cra 35 No 78-105. Apto 405, Bucaramanga", "3146855858");
        p.add(policia_1);
        p.add(policia_2);
        p.add(policia_3);
        p.add(policia_4);
        p.add(policia_5);
//        p.add(ciudadano_1);
//        p.add(ciudadano_2);
//        p.add(ciudadano_3);
    }

    public static int seleccionOpcion() {
        int dato;
        Scanner leer = new Scanner(System.in);
        System.out.print("Seleccione una opcion:  ");
        dato = leer.nextInt();
        System.out.println();
        return dato;
    }

    public static int menu() {
        System.out.println("_______________Menu______________");
        System.out.println("____1.Validar Acceso Policia_____");
        System.out.println("____2.Buscar Culpable____________");
        System.out.println("____3.Salir______________________");
        int op = seleccionOpcion();
        return op;
    }

    public static String ingresoPlaca() {
        String placa;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese placa: ");
        placa = leer.nextLine();
        return placa;
    }

//    public String accesoSPD(){
//        
//    }
//    
//    public String getCulpable(){
//        
//    }
}
