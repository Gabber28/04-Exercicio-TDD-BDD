package reserva;

public class Main {

    public static void main(String[] args) {
        ReservaService reservaService = new ReservaService();
        System.out.println(reservaService.reservar("Belo Horizonte", "Rua Exemplo, 123"));
        System.out.println(reservaService.reservar("São Paulo", "Rua Teste, 456"));
    }
}

