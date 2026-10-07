package com.medihome;

public class Paciente extends Usuario implements Notificable {
    private String telefono;
    private String direccionPrincipal;

    public Paciente(String identificacion, String nombre, String correo, String telefono, String direccionPrincipal) {
        super(identificacion, nombre, correo);
        this.telefono = telefono;
        this.direccionPrincipal = direccionPrincipal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccionPrincipal() {
        return direccionPrincipal;
    }

    public void setDireccionPrincipal(String direccionPrincipal) {
        this.direccionPrincipal = direccionPrincipal;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("[Notificacion al paciente " + getNombre() + "]: " + mensaje);
    }

    @Override
    public String toString() {
        return super.toString() + ", tel: " + telefono + ", direccion: " + direccionPrincipal;
    }
}
