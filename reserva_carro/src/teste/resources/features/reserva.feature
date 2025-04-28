Feature: Reserva de Carro
  Como passageiro de um aplicativo de transporte
  Quero reservar um carro informando meu local
  Para que eu possa me deslocar com comodidade e segurança

  Scenario: Reserva dentro da área de cobertura
    Dado que o passageiro deseja reservar um carro
    Quando informar a cidade "Belo Horizonte" e o endereco "Rua A, 123"
    Então o sistema deve retornar a mensagem "Motorista a caminho"

  Scenario: Reserva fora da área de cobertura
    Dado que o passageiro deseja reservar um carro
    Quando informar a cidade "São Paulo" e o endereco "Rua C, 789"
    Então o sistema deve retornar a mensagem "Área fora de cobertura"
