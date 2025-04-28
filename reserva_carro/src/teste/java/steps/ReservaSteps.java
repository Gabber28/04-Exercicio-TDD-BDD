package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import reserva.ReservaService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservaSteps {

    private ReservaService reservaService;
    private String cidade;
    private String endereco;
    private String resultado;

    @Dado("que o passageiro deseja reservar um carro")
    public void queOPassageiroDesejaReservarUmCarro() {
        reservaService = new ReservaService();
    }

    @Quando("informar a cidade {string} e o endereco {string}")
    public void informarACidadeEEndereco(String cidade, String endereco) {
        this.cidade = cidade;
        this.endereco = endereco;
        resultado = reservaService.reservar(cidade, endereco);
    }

    @Entao("o sistema deve retornar a mensagem {string}")
    public void oSistemaDeveRetornarAMensagem(String mensagemEsperada) {
        assertEquals(mensagemEsperada, resultado);
    }
}
