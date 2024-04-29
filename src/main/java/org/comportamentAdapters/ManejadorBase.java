package org.comportamentAdapters;

// Implementación de un manejador de solicitud base
abstract class ManejadorBase implements ManejadorSolicitud {
    private ManejadorSolicitud siguiente;

    @Override
    public void setSiguienteManejador(ManejadorSolicitud siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void manejarSolicitud(Solicitud solicitud) {
        if (siguiente != null) {
            siguiente.manejarSolicitud(solicitud);
        }
    }
}
