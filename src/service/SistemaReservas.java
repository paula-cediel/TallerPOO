package service;

import model.Reserva;
import java.util.ArrayList;

public class SistemaReservas {

    private ArrayList<Reserva> reservas = new ArrayList<>();

    public void agregarReserva(Reserva r) {
        reservas.add(r);
        System.out.println("Reserva agregada: ID " + r.getId());
    }

    public void eliminarReserva(int id) {
        boolean encontrada = false;

        for (Reserva r : reservas) {
            if (r.getId() == id) {
                reservas.remove(r);
                System.out.println("Reserva eliminada: ID " + id);
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            throw new IllegalArgumentException("No existe una reserva con ID: " + id);
        }
    }

    public void listarReservas() {
        System.out.println("\n--- LISTADO DE RESERVAS ---");
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas.");
        } else {
            for (Reserva r : reservas) {
                r.mostrarInfo();
            }
        }
    }

    public int contarReservas() {
        return reservas.size();
    }
}
