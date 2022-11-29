#language: pt
#enconding: UTF-8
  //corresponde a uma tag para caso eu queria testar apenas essa feature
  @esse
  Funcionalidade: Passagem


  Cenário: Deve criar steps genéricos para estes passos
    Dado que o ticket é AF345
    Dado que o valor da passagem é R$ 230,45
    Dado que o nome do passageiro é "Fulano da Silva"
    Dado que o telefone do passageiro é 9999-9999
    Quando criar os steps
    Então o teste vai funcionar

  Cenário: Deve reaproveitar os steps "Dado" do cenário anterior
    Dado que o ticket é AB167
    E que o ticket especial é AB167
    E que o valor da passagem é R$ 1120,23
    E que o nome do passageiro é "Cicrano de Oliveira"
    E que o telefone do passageiro é 9888-8888

    @ignore
#  Cenário: Deve negar todos os steps "Dado" dos cenários anteriores
#    Dado que o ticket é CD123
#    Dado que o ticket é AG1234
#    Dado que o valor da passagem é R$ 1.1345,56
#    Dado que o nome do passageiro é "Beltrano Souza Matos de Alcântara Azevedo"
#    Dado que o telefone do passageiro é 1234-5678
#    Dado que o telefone do passageiro é 999-2223