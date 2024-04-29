package org.comportamentAdapters;

// Definición de la interfaz para los manejadores de solicitud
interface ManejadorSolicitud {
    void manejarSolicitud(Solicitud solicitud);
    void setSiguienteManejador(ManejadorSolicitud siguiente);
}