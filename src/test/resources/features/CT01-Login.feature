Feature: Realizar login no site com usuario e senha validos

  Scenario Outline: Realizar login no site sauce
    Given que acesso a tela do login
    When preencho "<usuario>" e "<senha>"
    Then devo ver a tela de dashboard

    Examples:
      | usuario       | senha        |
      | standard_user | secret_sauce |