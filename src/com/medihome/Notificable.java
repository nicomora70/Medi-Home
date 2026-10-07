package com.medihome;

/** Todo elemento que pueda ser notificado debe ofrecer una operacion para recibir un mensaje. */
public interface Notificable {
    void notificar(String mensaje);
}
