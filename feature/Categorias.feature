@CategoriasFeature

Feature: Categorias
  Se probaran en este feature las 5 busquedas por categoria del Ejercicio 1

  Background: Navegacion a la web y despliegue del menu de categorias
    Given navego hasta la landing page
    When selecciono en el menu de categorias
    Then se despliegan las categorias

  @HogarYElectrodomesticos @Climatizacion
  Scenario Outline: Categorias - Hogar y Electrodomesticos
    Given las categorias estan desplegadas
    When selecciono dentro de Hogar y Electrodomesticos "<subcategoria>"
    Then se muestran los resultados para la seleccion de "<subcategoria>"
    Examples:
      | subcategoria  |
      | Climatización |

  @Tecnologia @CelularesYSmartphones
  Scenario Outline: Categorias - Tecnologia
    Given las categorias estan desplegadas
    When selecciono dentro de Tecnologia "<subcategoria>"
    Then se muestran los resultados para la seleccion de "<subcategoria>"
    Examples:
      | subcategoria            |
      | Celulares y Smartphones |

  @BellezaYCuidadoPersonal @Perfumes
  Scenario Outline: Categorias - BellezaYCuidadoPersonal
    Given las categorias estan desplegadas
    When selecciono Ver más categorias
    Then se muestra la pantalla de Categorias
    And selecciono dentro de Belleza y cuidado personal "<subcategoria>"
    Then se muestran los resultados para la seleccion de "<subcategoria>"
    Examples:
      | subcategoria |
      | Perfumes     |

  @HerramientasEIndustrias @IndustriaTextil
  Scenario Outline: Categorias - HerramientasEIndustria
    Given las categorias estan desplegadas
    When selecciono dentro de Herramientas e Industrias "<subcategoria>"
    Then se muestran los resultados para la seleccion de "<subcategoria>"
    Examples:
      | subcategoria     |
      | Industria Textil |

  @JuguetesYBebes @CuartoDelBebe
  Scenario Outline: Categorias - HerramientasEIndustria
    Given las categorias estan desplegadas
    When selecciono dentro de Juguetes y Bebes "<subcategoria>"
    Then se muestran los resultados para la seleccion de "<subcategoria>"
    Examples:
      | subcategoria    |
      | Cuarto del Bebé |