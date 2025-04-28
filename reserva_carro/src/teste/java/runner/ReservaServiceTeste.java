package runner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import reserva.ReservaService;

public class ReservaServiceTest {

    private final ReservaService reservaService = new ReservaService();

    @Test
    void deveReservarDentroDaAreaDeCobertura() {
        String resultado = reservaService.reservar("Belo Horizonte", "Rua A, 123");
        assertEquals("Motorista a caminho", resultado);
    }

    @Test
    void deveReservarDentroDaAreaDeCoberturaContagem() {
        String resultado = reservaService.reservar("Contagem", "Rua B, 456");
        assertEquals("Motorista a caminho", resultado);
    }

    @Test
    void deveRecusarReservaForaDaAreaDeCobertura() {
        String resultado = reservaService.reservar("São Paulo", "Rua C, 789");
        assertEquals("Área fora de cobertura", resultado);
    }
}
