###Atención medica domiciliaria 

##Medi Home
#Es una empresa que presta servicios de atención medica domiciliaria y necesita un sistema para administrar sus servicios. La empresa registra a sus pacientes con numero de id, nombre, correo electrónico, teléfono y dirección principal. También registra a los profesionales de salud, de quienes se conoce identificación, nombre, correo electrónico, numero de registro profesional y especialidad. 

#Tanto los pacientes como los profesionales son considerados usuarios del sistema y pueden recibir notificaciones relacionadas con los servicios que le correspondan, paciente puede solicitar varios servicios domiciliarios. Cada servicio tiene un código único, fecha y hora programada, dirección de la atención, motivo de la solicitud y estado. Los estados posibles son, solicitado, programado, en atención, finalizado y cancelado.

#Cada servicio domiciliario corresponde a un único paciente y cuando es programado se le asigna un profesional de la salud. Un profesional puede atender múltiples servicios en fechas diferentes.

#Durante un servicio el profesional registra una atención medica, con fecha, hora de inicio y fecha y hora de finalización, observaciones clínicas y recomendaciones. Una atención medica existe exclusivamente como resultado de un servicio domiciliario y no tiene sentido independientemente de este.

#Durante la atención puede registrarse 0 o varias mediciones de signos vitales, cada medición registra, fecha y hora, temperatura, frecuencia cardiaca, presión sistólica, presión diastólica y saturación de oxigeno. Las mediciones perteneces exclusivamente a la atención medica en la cual fueron tomadas.

#La empresa organiza a sus profesionales en equipos de atención domiciliaria. cada equipo tiene, código, nombre y zona de cobertura, un equipo puede tener varios profesionales y un profesional puede cambiar de equipo sin dejar de pertenecer al sistema. 

#Ademas algunos usuarios pueden recibir notificaciones. Todo elemento que pueda ser notificado debe ofrecer una operación para recibir un mensaje, aunque la forma concreta de hacerlo puede variar 