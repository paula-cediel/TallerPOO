package app;

import model.Reserva;
import service.SistemaReservas;

public class Main {

    public static void main(String[] args) {

        SistemaReservas sistema = new SistemaReservas();

        Reserva r1 = new Reserva(1, "Paula", "2025-01-10", 2);
        Reserva r2 = new Reserva(2, "Carlos", "2025-01-12", 3);

        sistema.agregarReserva(r1);
        sistema.agregarReserva(r2);

        r1.setDuracionHoras(4);
        System.out.println("\nDuración modificada con setter.");

        sistema.listarReservas();

        System.out.println("\nTotal de reservas: " + sistema.contarReservas());

        try {
            sistema.eliminarReserva(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            sistema.eliminarReserva(50);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sistema.listarReservas();

        System.out.println("\nTotal final: " + sistema.contarReservas());
    }
}
