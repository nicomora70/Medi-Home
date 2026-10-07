# Medi Home — Atención médica domiciliaria

## Descripción de la empresa

Medi Home es una empresa que presta servicios de atención médica domiciliaria y necesita un sistema para administrar sus servicios.

## Pacientes y profesionales

La empresa registra a sus pacientes con número de identificación, nombre, correo electrónico, teléfono y dirección principal.

También registra a los profesionales de la salud, de quienes se conoce la identificación, el nombre, el correo electrónico, el número de registro profesional y la especialidad.

## Usuarios y notificaciones

Tanto los pacientes como los profesionales son considerados usuarios del sistema y pueden recibir notificaciones relacionadas con los servicios que les correspondan.

Además, todo elemento que pueda ser notificado debe ofrecer una operación para recibir un mensaje, aunque la forma concreta de hacerlo puede variar según el tipo de usuario.

## Servicios domiciliarios

Un paciente puede solicitar varios servicios domiciliarios. Cada servicio tiene un código único, fecha y hora programada, dirección de la atención, motivo de la solicitud y estado.

Los estados posibles son:

- Solicitado
- Programado
- En atención
- Finalizado
- Cancelado

Cada servicio domiciliario corresponde a un único paciente y, cuando es programado, se le asigna un profesional de la salud. Un profesional puede atender múltiples servicios en fechas diferentes.

## Atención médica

Durante un servicio, el profesional registra una atención médica, con fecha y hora de inicio, fecha y hora de finalización, observaciones clínicas y recomendaciones.

Una atención médica existe exclusivamente como resultado de un servicio domiciliario y no tiene sentido independientemente de este.

## Mediciones de signos vitales

Durante la atención pueden registrarse cero o varias mediciones de signos vitales. Cada medición registra fecha y hora, temperatura, frecuencia cardiaca, presión sistólica, presión diastólica y saturación de oxígeno.

Las mediciones pertenecen exclusivamente a la atención médica en la cual fueron tomadas.

## Equipos de atención

La empresa organiza a sus profesionales en equipos de atención domiciliaria. Cada equipo tiene código, nombre y zona de cobertura.

Un equipo puede tener varios profesionales y un profesional puede cambiar de equipo sin dejar de pertenecer al sistema.
