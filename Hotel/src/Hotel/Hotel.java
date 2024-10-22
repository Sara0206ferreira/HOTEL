package Hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Quarto> quartos;
    private List<Reserva> reservas;

    public Hotel() {
        quartos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void cadastrarQuarto(String numero, String tipo, double preco) {
        Quarto quarto = new Quarto(numero, tipo, preco);
        quartos.add(quarto);
    }
    public void relatorioHistoricoReservas() {
        System.out.println("\nHistórico de Reservas:");
        for (Reserva reserva : reservas) {
            System.out.println(reserva.detalhesReserva());
        }
    }
    public String cadastrarReserva(String nomeHospede, LocalDate dataCheckin, LocalDate dataCheckout, String numeroQuarto) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero().equals(numeroQuarto) && quarto.isDisponibilidade()) {
                Hospede hospede = new Hospede(nomeHospede);
                Reserva reserva = new Reserva(hospede, dataCheckin, dataCheckout, quarto);
                reservas.add(reserva);
                quarto.setDisponibilidade(false); 
                hospede.addReserva(reserva); 
                return "Reserva feita com sucesso!";
            }
        }
        return "Quarto não disponível!";
    }
    
}
