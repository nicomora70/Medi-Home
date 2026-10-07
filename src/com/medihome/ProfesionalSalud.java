package com.medihome;

/** Profesional de la salud. Hereda de Usuario e implementa Notificable. */
public class ProfesionalSalud extends Usuario implements Notificable {
    private String numeroRegistroProfesional;
    private String especialidad;
    private EquipoAtencion equipo;

    public ProfesionalSalud(String identificacion, String nombre, String correo,
                            String numeroRegistroProfesional, String especialidad) {
        super(identificacion, nombre, correo);
        this.numeroRegistroProfesional = numeroRegistroProfesional;
        this.especialidad = especialidad;
    }

    public String getNumeroRegistroProfesional() {
        return numeroRegistroProfesional;
    }

    public void setNumeroRegistroProfesional(String numeroRegistroProfesional) {
        this.numeroRegistroProfesional = numeroRegistroProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public EquipoAtencion getEquipo() {
        return equipo;
    }

    void setEquipo(EquipoAtencion equipo) {
        this.equipo = equipo;
    }

    public boolean estaDisponible() {
        return true;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("[Notificacion al profesional " + getNombre() + "]: " + mensaje);
    }

    @Override
    public String toString() {
        String eq = (equipo == null) ? "sin equipo" : equipo.getNombre();
        return super.toString() + ", registro: " + numeroRegistroProfesional
                + ", especialidad: " + especialidad + ", equipo: " + eq;
    }
}
