package reto_3;

import java.util.ArrayList;

public abstract class persona {

    private String nombres;
    private String apellidos;
    private String cedula;
    private String direccion;
    private String telefono;
    private int porcentajeCoincidencia;

    public persona() {
    }

    public persona(String nombres, String apellidos, String cedula, String direccion, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.porcentajeCoincidencia = (int) 0.d;
    }
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPorcentajeCoincidencia() {
        return porcentajeCoincidencia;
    }

    public void setPorcentajeCoincidencia(int porcentajeCoincidencia) {
        this.porcentajeCoincidencia = porcentajeCoincidencia;
    }

    public void display() {
        System.out.println("Nombre: " + this.nombres);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);
//        System.out.println("Porcentaje Coincidencia: " + this.porcentajeCoincidencia);
    }

    public abstract void getCoincidencia(ArrayList<persona> p, String placa);
}
