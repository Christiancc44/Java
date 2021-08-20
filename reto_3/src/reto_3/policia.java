package reto_3;

import java.util.ArrayList;

public class policia extends persona {

    private String placa;

    public policia() {
    }

    public policia(String placa, String nombres, String apellidos, String cedula, String direccion, String telefono) {
        super(nombres, apellidos, cedula, direccion, telefono);
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public void display() {
        System.out.println("Nombre: " + super.getNombres());
        System.out.println("Apellido: " + super.getApellidos());
        System.out.println("Cedula: " + super.getCedula());
        System.out.println("Placa: " + this.placa);
        System.out.println("Direccion: " + super.getDireccion());
        System.out.println("Telefono: " + super.getTelefono());

    }

    @Override
    public int getCoincidencia(ArrayList<persona> p, String placa) {
        int porcentajeMayor = 0;
        int contador = 0;
        String placas;

        String[] letra = new String[28];
        letra[0] = "_";
        letra[1] = "A";
        letra[2] = "B";
        letra[3] = "C";
        letra[4] = "D";
        letra[5] = "E";
        letra[6] = "F";
        letra[7] = "G";
        letra[8] = "H";
        letra[9] = "I";
        letra[10] = "J";
        letra[11] = "K";
        letra[12] = "L";
        letra[13] = "M";
        letra[14] = "N";
        letra[15] = "Ñ";
        letra[16] = "O";
        letra[17] = "P";
        letra[18] = "Q";
        letra[19] = "R";
        letra[20] = "S";
        letra[21] = "T";
        letra[22] = "U";
        letra[23] = "V";
        letra[24] = "W";
        letra[25] = "X";
        letra[26] = "Y";
        letra[27] = "Z";

        for (persona placasPolicias : p) {
            if (placasPolicias instanceof policia) {
                placas = ((policia) placasPolicias).getPlaca();
                for (int i = 0; i < placa.length(); i++) {

                    char var_1 = placa.charAt(i);
                    int entero = Character.getNumericValue(var_1);

                    String var_2 = letra[entero];
                    char var_3 = placas.charAt(i);

                    String var_4 = String.valueOf(var_3);
                    if (var_2.equals(var_4)) {
                        contador++;
                    }
                }
                int porcentaje = ((contador * 100) / placa.length());
                if (porcentaje > porcentajeMayor) {
                    porcentajeMayor = porcentaje;
                    if (porcentajeMayor == 100) {
                        setPorcentajeCoincidencia(porcentajeMayor);
                        System.out.println(getPorcentajeCoincidencia());
                        placasPolicias.display();
                    }
                }
                contador = 0;
            }
        }
//        System.out.println(porcentajeMayor);
        return contador;
    }
}
