# Medi-Home - Sistema de atención médica domiciliaria

**Integrantes:** Drako David Salazar y Jose Nicolas Mora  
**Materia:** Diseño de Software

## Contexto

Este repositorio contiene el trabajo que realizamos para la empresa Medi Home, la cual presta servicios de atención médica domiciliaria y necesitaba un sistema para administrar sus servicios.

Partimos del documento de requisitos (`Medi Home.md`) donde se describe lo que la empresa necesita: registrar pacientes y profesionales de la salud, manejar las solicitudes de servicios domiciliarios con sus estados, registrar la atención médica realizada en cada visita con sus mediciones de signos vitales, y organizar a los profesionales en equipos de atención por zonas de cobertura.

## Lo que hicimos

1. Leímos y analizamos el enunciado para identificar las entidades principales del sistema.
2. Identificamos que tanto los pacientes como los profesionales son usuarios del sistema, por lo que creamos la clase base `Usuario` con los datos comunes (identificación, nombre y correo).
3. Modelamos las clases `Paciente` y `ProfesionalSalud` como especializaciones de `Usuario`, cada una con sus atributos propios.
4. Agregamos la interfaz `Notificable` con la operación `notificar(mensaje)`, que es implementada por `Paciente` y `ProfesionalSalud` para el manejo de notificaciones.
5. Modelamos el `ServicioDomiciliario` con sus datos (código, fecha programada, dirección, motivo y estado) y las relaciones con `Paciente` (solicita) y `ProfesionalSalud` (atiende).
6. Modelamos la `AtencionMedica` como resultado del servicio, con fecha de inicio, fecha de fin, observaciones y recomendaciones.
7. Agregamos `MedicionSignosVitales` para registrar temperatura, frecuencia cardiaca, presiones y saturación de oxígeno durante la atención.
8. Modelamos `EquipoAtencion` (código, nombre y zona de cobertura) y su relación de agrupación con los profesionales.
9. Definimos los getters/setters y las operaciones principales de cada clase, como programar, asignar profesional, iniciar y finalizar la atención.

Todo el modelado lo realizamos en Visual Paradigm y el diagrama de clases quedó guardado en el archivo `MediHome.vpp`.

## Contenido del repositorio

- `Medi Home.md`: documento con la descripción del problema y los requisitos de Medi Home.
- `MediHome.vpp`: proyecto de Visual Paradigm con el diagrama de clases del sistema.
- `README.md`: este archivo.

## Diagrama de clases - resumen

Clases principales:

- `Usuario`: identificacion, nombre, correo.
- `Paciente`: telefono, direccion. Hereda de `Usuario` e implementa `Notificable`.
- `ProfesionalSalud`: numeroRegistroProfesional, especialidad. Hereda de `Usuario` e implementa `Notificable`.
- `Notificable` (interfaz): operación `notificar(mensaje)`.
- `EquipoAtencion`: codigo, nombre, zonaCobertura.
- `ServicioDomiciliario`: codigo, fechaProgramada, direccionAtencion, motivo, estado (solicitado, programado, en atención, finalizado, cancelado).
- `AtencionMedica`: fechaHoraInicio, fechaHoraFin, observaciones, recomendaciones.
- `MedicionSignosVitales`: fechaHora, temperatura, frecuenciaCardiaca, presionSistolica, presionDiastolica, saturacionOxigeno.

Relaciones:

- `Paciente` solicita `ServicioDomiciliario` (1 a muchos).
- `ProfesionalSalud` atiende `ServicioDomiciliario`.
- `ServicioDomiciliario` genera una `AtencionMedica` (composición).
- `AtencionMedica` contiene `MedicionSignosVitales` (composición, 0 a muchas).
- `EquipoAtencion` agrupa `ProfesionalSalud`.

## Cómo abrir el modelo

1. Abrir Visual Paradigm.
2. Abrir el archivo `MediHome.vpp`.
3. Ver el diagrama `Medihome` de tipo ClassDiagram.
