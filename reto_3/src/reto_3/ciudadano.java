//package reto_3;
//
//import java.util.ArrayList;
//
//public class ciudadano extends persona {
//
//    private String cromosoma;
//
//    public ciudadano() {
//    }
//
//    public ciudadano(String cromosoma, String nombres, String apellidos, String cedula, String direccion, String telefono) {
//        super(nombres, apellidos, cedula, direccion, telefono);
//        this.cromosoma = cromosoma;
//    }
//
//    public String getCromosoma() {
//        return cromosoma;
//    }
//
//    public void setCromosoma(String cromosoma) {
//        this.cromosoma = cromosoma;
//    }
//
//    @Override
//    public void display() {
//        System.out.println("Nombre: " + super.getNombres());
//        System.out.println("Apellido: " + super.getApellidos());
//        System.out.println("Placa: " + this.cromosoma);
//        System.out.println("Direccion: " + super.getDireccion());
//        System.out.println("Telefono: " + super.getTelefono());
//    }
//
//    @Override
//    public int getCoincidencia(ArrayList<persona> p, String placa) {
//        int contador = 0;
//        String t;
//        for (persona s : p) {
//            if (s instanceof policia) {
//                t = ((policia) s).getPlaca();
//                for (int i = 0; i < placa.length(); i++) {
//                    System.out.println(placa.charAt(i));
//                    if (placa.charAt(i) == t.charAt(i)) {
//                        contador++;
//                    }
//                }
//
//            }
//        }
//        return contador;
//    }
//}
