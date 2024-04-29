package org.comportamentAdapters;

// Implementación de un manejador de solicitud concreto
class ManejadorNivel extends ManejadorBase {
    private static final double LIMITE = 1000;

    @Override
    public void manejarSolicitud(Solicitud solicitud) {
        if (solicitud.getCantidad() <= LIMITE) {
            System.out.println("Solicitud aprobada por Nivel 1");
        } else {
            super.manejarSolicitud(solicitud);
        }
    }
}
