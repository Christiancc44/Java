package reto_3;

import java.util.ArrayList;

public class ciudadano extends persona {

    private String cromosoma;

    public ciudadano() {
    }

    public ciudadano(String cromosoma, String nombres, String apellidos, String cedula, String direccion, String telefono) {
        super(nombres, apellidos, cedula, direccion, telefono);
        this.cromosoma = cromosoma;
    }

    public String getCromosoma() {
        return cromosoma;
    }

    public void setCromosoma(String cromosoma) {
        this.cromosoma = cromosoma;
    }

    @Override
    public void display() {
        System.out.println("Nombre: " + super.getNombres());
        System.out.println("Apellido: " + super.getApellidos());
        System.out.println("Cedula: " + super.getCedula());
        System.out.println("Cromosoma: " + this.cromosoma);
        System.out.println("Direccion: " + super.getDireccion());
        System.out.println("Telefono: " + super.getTelefono());
        System.out.println("Porcentaje Coincidencia: " + super.getPorcentajeCoincidencia());
    }

    @Override
    public void getCoincidencia(ArrayList<persona> p, String secuencia) {
        ciudadano c = new ciudadano();
        int porcentajeMayor = 0;
        int contador = 0;
        String cromosoma;

        for (persona cromosomas : p) {
            if (cromosomas instanceof ciudadano) {
                cromosoma = ((ciudadano) cromosomas).getCromosoma();
                if (cromosoma.length() == secuencia.length()) {
                    for (int i = 0; i < cromosoma.length(); i++) {
                        if (cromosoma.charAt(i) == secuencia.charAt(i)) {
                            contador++;
                        }
                    }
                } else if (cromosoma.length() > secuencia.length()) {
                    for (int i = 0; i < cromosoma.length() - (cromosoma.length() - secuencia.length()); i++) {
                        if (cromosoma.charAt(i) == secuencia.charAt(i)) {
                            contador++;
                        }
                    }
                } else if (cromosoma.length() < secuencia.length()) {
                    for (int i = 0; i < secuencia.length() - (secuencia.length() - cromosoma.length()); i++) {
                        if (cromosoma.charAt(i) == secuencia.charAt(i)) {
                            contador++;
                        }
                    }
                }
                int porcentaje = (contador * 100) / cromosoma.length();
                porcentaje = (contador * 100) / cromosoma.length();
                if (porcentaje > porcentajeMayor) {
                    porcentajeMayor = porcentaje;
                    setPorcentajeCoincidencia(porcentajeMayor);
                    cromosomas.setPorcentajeCoincidencia(porcentajeMayor);
                    getPorcentajeCoincidencia();
                }
                contador = 0;
            }
        }
    }
}
