package org.comportamentAdapters;

// Implementación de otro manejador de solicitud concreto
class ManejadorNivel3 extends ManejadorBase {
    @Override
    public void manejarSolicitud(Solicitud solicitud) {
        System.out.println("Solicitud aprobada por Nivel 3");
    }
}