package com.medihome;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("1001", "Maria Perez", "maria.perez@correo.com",
                "3001234567", "Calle 10 # 5-20, Barrio Centro");
        ProfesionalSalud profesional = new ProfesionalSalud("2001", "Dr. Carlos Ruiz",
                "carlos.ruiz@medihome.com", "REG-54321", "Medicina general");

        EquipoAtencion equipo = new EquipoAtencion("EQ-01", "Equipo Norte", "Zona norte");
        equipo.agregarProfesional(profesional);

        ServicioDomiciliario servicio = new ServicioDomiciliario("SRV-001",
                LocalDateTime.of(2026, 10, 8, 9, 0),
                "Calle 10 # 5-20, Barrio Centro",
                "Control de presion arterial y fiebre",
                paciente);

        servicio.programar(profesional, LocalDateTime.of(2026, 10, 8, 9, 0));
        servicio.iniciarAtencion();

        AtencionMedica atencion = servicio.generarAtencion(LocalDateTime.of(2026, 10, 8, 9, 5));
        atencion.setObservaciones("Paciente con fiebre leve y presion arterial elevada. Se encuentra estable.");
        atencion.setRecomendaciones("Reposo, hidratacion y control de presion en 48 horas.");

        MedicionSignosVitales m1 = new MedicionSignosVitales(
                LocalDateTime.of(2026, 10, 8, 9, 10), 38.2, 92, 135, 88, 97.0);
        m1.realizarMedicion();
        atencion.agregarMedicion(m1);

        MedicionSignosVitales m2 = new MedicionSignosVitales(
                LocalDateTime.of(2026, 10, 8, 9, 40), 37.6, 84, 128, 82, 98.0);
        m2.realizarMedicion();
        atencion.agregarMedicion(m2);

        atencion.setFechaHoraFin(LocalDateTime.of(2026, 10, 8, 10, 0));
        servicio.finalizar();

        System.out.println();
        System.out.println("======== REPORTE DE ATENCION DOMICILIARIA - MEDI HOME ========");
        System.out.println("Servicio   : " + servicio.getCodigo() + " | Estado: " + servicio.getEstado());
        System.out.println("Fecha      : " + servicio.getFechaProgramada());
        System.out.println("Direccion  : " + servicio.getDireccionAtencion());
        System.out.println("Motivo     : " + servicio.getMotivo());
        System.out.println("Paciente   : " + paciente);
        System.out.println("Profesional: " + profesional);
        System.out.println("Equipo     : " + equipo);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Atencion de " + atencion.getFechaHoraInicio() + " a " + atencion.getFechaHoraFin());
        System.out.println("Observaciones   : " + atencion.getObservaciones());
        System.out.println("Recomendaciones : " + atencion.getRecomendaciones());
        System.out.println("Mediciones (" + atencion.getMediciones().size() + "):");
        for (MedicionSignosVitales m : atencion.getMediciones()) {
            System.out.println("  - " + m);
        }
        System.out.println("=============================================================");
    }
}
