package com.medihome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Equipo de atencion domiciliaria que agrupa profesionales por zona de cobertura. */
public class EquipoAtencion {
    private String codigo;
    private String nombre;
    private String zonaCobertura;
    private final List<ProfesionalSalud> profesionales = new ArrayList<>();

    public EquipoAtencion(String codigo, String nombre, String zonaCobertura) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.zonaCobertura = zonaCobertura;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getZonaCobertura() {
        return zonaCobertura;
    }

    public void setZonaCobertura(String zonaCobertura) {
        this.zonaCobertura = zonaCobertura;
    }

    public List<ProfesionalSalud> getProfesionales() {
        return Collections.unmodifiableList(profesionales);
    }

    public void agregarProfesional(ProfesionalSalud profesional) {
        if (profesional == null || profesionales.contains(profesional)) {
            return;
        }
        if (profesional.getEquipo() != null && profesional.getEquipo() != this) {
            profesional.getEquipo().retirarProfesional(profesional);
        }
        profesionales.add(profesional);
        profesional.setEquipo(this);
    }

    public void retirarProfesional(ProfesionalSalud profesional) {
        if (profesionales.remove(profesional)) {
            profesional.setEquipo(null);
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + codigo + ") - zona: " + zonaCobertura;
    }
}
