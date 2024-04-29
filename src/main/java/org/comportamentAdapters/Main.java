package org.comportamentAdapters;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Configurar la cadena de responsabilidad
        ManejadorSolicitud nivel1 = new ManejadorNivel();
        ManejadorSolicitud nivel2 = new ManejadorNivel2();
        ManejadorSolicitud nivel3 = new ManejadorNivel3();

        nivel1.setSiguienteManejador(nivel2);
        nivel2.setSiguienteManejador(nivel3);

        // Probar con diferentes solicitudes
        Solicitud solicitud1 = new Solicitud(500);
        Solicitud solicitud2 = new Solicitud(3000);
        Solicitud solicitud3 = new Solicitud(7000);

        nivel1.manejarSolicitud(solicitud1);
        nivel1.manejarSolicitud(solicitud2);
        nivel1.manejarSolicitud(solicitud3);
    }
}