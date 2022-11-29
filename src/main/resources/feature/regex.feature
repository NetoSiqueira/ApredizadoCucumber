#language: pt

  Funcionalidade: Regex

    Cenario: Deve incrementar contador
    Dado que o valor do e 123
    Quando eu incrementar em 35
    Entao o valor do contador sera 158

    Cenario: Deve calcular atraso na entrega
      Dado que prazo e dia 05/04/2018
      Quando a entregar atrasar 2 dias
      Entao o prazo da entrega sera efetuada em 07/04/2018

    Cenario: Entrega da china
      Dado que prazo e dia 05/04/2018
      Quando a entregar atrasar 2 meses
      Entao o prazo da entrega sera efetuada em 05/06/2018