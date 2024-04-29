package org.comportamentAdapters;

// Implementación de otro manejador de solicitud concreto
class ManejadorNivel2 extends ManejadorBase {
    private static final double LIMITE = 5000;

    @Override
    public void manejarSolicitud(Solicitud solicitud) {
        if (solicitud.getCantidad() <= LIMITE) {
            System.out.println("Solicitud aprobada por Nivel 2");
        } else {
            super.manejarSolicitud(solicitud);
        }
    }
}