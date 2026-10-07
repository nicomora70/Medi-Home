package com.medihome;

import java.time.LocalDateTime;

public class ServicioDomiciliario {
    private String codigo;
    private LocalDateTime fechaProgramada;
    private String direccionAtencion;
    private String motivo;
    private EstadoServicio estado;
    private final Paciente paciente;
    private ProfesionalSalud profesional;
    private AtencionMedica atencion;

    public ServicioDomiciliario(String codigo, LocalDateTime fechaProgramada, String direccionAtencion,
                                String motivo, Paciente paciente) {
        this.codigo = codigo;
        this.fechaProgramada = fechaProgramada;
        this.direccionAtencion = direccionAtencion;
        this.motivo = motivo;
        this.paciente = paciente;
        this.estado = EstadoServicio.SOLICITADO;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(LocalDateTime fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public String getDireccionAtencion() {
        return direccionAtencion;
    }

    public void setDireccionAtencion(String direccionAtencion) {
        this.direccionAtencion = direccionAtencion;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public EstadoServicio getEstado() {
        return estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public ProfesionalSalud getProfesional() {
        return profesional;
    }

    public AtencionMedica getAtencion() {
        return atencion;
    }

    public void programar(ProfesionalSalud profesional, LocalDateTime fecha) {
        asignarProfesional(profesional);
        this.fechaProgramada = fecha;
        this.estado = EstadoServicio.PROGRAMADO;
        paciente.notificar("Su servicio " + codigo + " fue programado para el " + fecha + ".");
        profesional.notificar("Se le asigno el servicio " + codigo + " del paciente " + paciente.getNombre() + ".");
    }

    public void asignarProfesional(ProfesionalSalud profesional) {
        this.profesional = profesional;
    }

    public void iniciarAtencion() {
        this.estado = EstadoServicio.EN_ATENCION;
    }

    public AtencionMedica generarAtencion(LocalDateTime inicio) {
        this.atencion = new AtencionMedica(inicio, this);
        return this.atencion;
    }

    public void finalizar() {
        this.estado = EstadoServicio.FINALIZADO;
        paciente.notificar("Su servicio " + codigo + " ha finalizado.");
    }

    public void cancelar() {
        this.estado = EstadoServicio.CANCELADO;
        paciente.notificar("Su servicio " + codigo + " ha sido cancelado.");
    }

    @Override
    public String toString() {
        return "Servicio " + codigo + " [" + estado + "] paciente=" + paciente.getNombre()
                + ", profesional=" + (profesional == null ? "sin asignar" : profesional.getNombre())
                + ", fecha=" + fechaProgramada;
    }
}
