@CT03
Feature: Finalizando compra
  Scenario Outline: Fechando a minha compras
    Given acesso a minha conta com "<usuario>" e "<senha>"
    When entro no meu carrinho
    And preencho "<firstName>" , "<lastName>" e "<zip>"
    And finalizo minha compra
    Then devo ver a seguinte mensagem Thank you for your order !
    Examples:
      | usuario       | senha        | firstName | lastName | zip      |
      | standard_user | secret_sauce | Bruno     | Chagas   | 06720-153 |
