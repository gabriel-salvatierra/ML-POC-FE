$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/Categorias.feature");
formatter.feature({
  "name": "Categorias",
  "description": "  Se probaran en este feature las 5 busquedas por categoria del Ejercicio 1",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CategoriasFeature"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Categorias - Hogar y Electrodomesticos",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@HogarYElectrodomesticos"
    },
    {
      "name": "@Climatizacion"
    }
  ]
});
formatter.step({
  "name": "las categorias estan desplegadas",
  "keyword": "Given "
});
formatter.step({
  "name": "selecciono dentro de Hogar y Electrodomesticos \"\u003csubcategoria\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "se muestran los resultados para la seleccion de \"\u003csubcategoria\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "subcategoria"
      ]
    },
    {
      "cells": [
        "Climatización"
      ]
    }
  ]
});
formatter.background({
  "name": "Navegacion a la web y despliegue del menu de categorias",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "navego hasta la landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundSD.navego_hasta_la_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono en el menu de categorias",
  "keyword": "When "
});
formatter.match({
  "location": "BackgroundSD.selecciono_en_el_menu_de_categorias()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se despliegan las categorias",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundSD.se_despliegan_las_categorias()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Categorias - Hogar y Electrodomesticos",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CategoriasFeature"
    },
    {
      "name": "@HogarYElectrodomesticos"
    },
    {
      "name": "@Climatizacion"
    }
  ]
});
formatter.step({
  "name": "las categorias estan desplegadas",
  "keyword": "Given "
});
formatter.match({
  "location": "CategoriasSD.las_categorias_estan_desplegadas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono dentro de Hogar y Electrodomesticos \"Climatización\"",
  "keyword": "When "
});
formatter.match({
  "location": "CategoriasSD.selecciono_dentro_de_Hogar_y_Electrodomesticos(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se muestran los resultados para la seleccion de \"Climatización\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoriasSD.se_muestran_los_resultados_para_la_seleccion_de(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Categorias - Tecnologia",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Tecnologia"
    },
    {
      "name": "@CelularesYSmartphones"
    }
  ]
});
formatter.step({
  "name": "las categorias estan desplegadas",
  "keyword": "Given "
});
formatter.step({
  "name": "selecciono dentro de Tecnologia \"\u003csubcategoria\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "se muestran los resultados para la seleccion de \"\u003csubcategoria\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "subcategoria"
      ]
    },
    {
      "cells": [
        "Celulares y Smartphones"
      ]
    }
  ]
});
formatter.background({
  "name": "Navegacion a la web y despliegue del menu de categorias",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "navego hasta la landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundSD.navego_hasta_la_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono en el menu de categorias",
  "keyword": "When "
});
formatter.match({
  "location": "BackgroundSD.selecciono_en_el_menu_de_categorias()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se despliegan las categorias",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundSD.se_despliegan_las_categorias()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Categorias - Tecnologia",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CategoriasFeature"
    },
    {
      "name": "@Tecnologia"
    },
    {
      "name": "@CelularesYSmartphones"
    }
  ]
});
formatter.step({
  "name": "las categorias estan desplegadas",
  "keyword": "Given "
});
formatter.match({
  "location": "CategoriasSD.las_categorias_estan_desplegadas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono dentro de Tecnologia \"Celulares y Smartphones\"",
  "keyword": "When "
});
formatter.match({
  "location": "CategoriasSD.selecciono_dentro_de_Tecnologia(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se muestran los resultados para la seleccion de \"Celulares y Smartphones\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoriasSD.se_muestran_los_resultados_para_la_seleccion_de(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Categorias - BellezaYCuidadoPersonal",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@BellezaYCuidadoPersonal"
    },
    {
      "name": "@Perfumes"
    }
  ]
});
formatter.step({
  "name": "las categorias estan desplegadas",
  "keyword": "Given "
});
formatter.step({
  "name": "selecciono Ver más categorias",
  "keyword": "When "
});
formatter.step({
  "name": "se muestra la pantalla de Categorias",
  "keyword": "Then "
});
formatter.step({
  "name": "selecciono dentro de Belleza y cuidado personal \"\u003csubcategoria\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "se muestran los resultados para la seleccion de \"\u003csubcategoria\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "subcategoria"
      ]
    },
    {
      "cells": [
        "Perfumes"
      ]
    }
  ]
});
formatter.background({
  "name": "Navegacion a la web y despliegue del menu de categorias",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "navego hasta la landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundSD.navego_hasta_la_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono en el menu de categorias",
  "keyword": "When "
});
formatter.match({
  "location": "BackgroundSD.selecciono_en_el_menu_de_categorias()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se despliegan las categorias",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundSD.se_despliegan_las_categorias()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Categorias - BellezaYCuidadoPersonal",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CategoriasFeature"
    },
    {
      "name": "@BellezaYCuidadoPersonal"
    },
    {
      "name": "@Perfumes"
    }
  ]
});
formatter.step({
  "name": "las categorias estan desplegadas",
  "keyword": "Given "
});
formatter.match({
  "location": "CategoriasSD.las_categorias_estan_desplegadas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono Ver más categorias",
  "keyword": "When "
});
formatter.match({
  "location": "CategoriasSD.selecciono_Ver_más_categorias()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se muestra la pantalla de Categorias",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoriasSD.se_muestra_la_pantalla_de_Categorias()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono dentro de Belleza y cuidado personal \"Perfumes\"",
  "keyword": "And "
});
formatter.match({
  "location": "CategoriasSD.selecciono_dentro_de_Belleza_y_cuidado_personal(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se muestran los resultados para la seleccion de \"Perfumes\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoriasSD.se_muestran_los_resultados_para_la_seleccion_de(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Categorias - HerramientasEIndustria",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@HerramientasEIndustrias"
    },
    {
      "name": "@IndustriaTextil"
    }
  ]
});
formatter.step({
  "name": "las categorias estan desplegadas",
  "keyword": "Given "
});
formatter.step({
  "name": "selecciono dentro de Herramientas e Industrias \"\u003csubcategoria\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "se muestran los resultados para la seleccion de \"\u003csubcategoria\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "subcategoria"
      ]
    },
    {
      "cells": [
        "Industria Textil"
      ]
    }
  ]
});
formatter.background({
  "name": "Navegacion a la web y despliegue del menu de categorias",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "navego hasta la landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundSD.navego_hasta_la_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono en el menu de categorias",
  "keyword": "When "
});
formatter.match({
  "location": "BackgroundSD.selecciono_en_el_menu_de_categorias()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se despliegan las categorias",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundSD.se_despliegan_las_categorias()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Categorias - HerramientasEIndustria",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CategoriasFeature"
    },
    {
      "name": "@HerramientasEIndustrias"
    },
    {
      "name": "@IndustriaTextil"
    }
  ]
});
formatter.step({
  "name": "las categorias estan desplegadas",
  "keyword": "Given "
});
formatter.match({
  "location": "CategoriasSD.las_categorias_estan_desplegadas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono dentro de Herramientas e Industrias \"Industria Textil\"",
  "keyword": "When "
});
formatter.match({
  "location": "CategoriasSD.selecciono_dentro_de_Herramientas_e_Industrias(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se muestran los resultados para la seleccion de \"Industria Textil\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoriasSD.se_muestran_los_resultados_para_la_seleccion_de(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Categorias - HerramientasEIndustria",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@JuguetesYBebes"
    },
    {
      "name": "@CuartoDelBebe"
    }
  ]
});
formatter.step({
  "name": "las categorias estan desplegadas",
  "keyword": "Given "
});
formatter.step({
  "name": "selecciono dentro de Juguetes y Bebes \"\u003csubcategoria\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "se muestran los resultados para la seleccion de \"\u003csubcategoria\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "subcategoria"
      ]
    },
    {
      "cells": [
        "Cuarto del Bebé"
      ]
    }
  ]
});
formatter.background({
  "name": "Navegacion a la web y despliegue del menu de categorias",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "navego hasta la landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "BackgroundSD.navego_hasta_la_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono en el menu de categorias",
  "keyword": "When "
});
formatter.match({
  "location": "BackgroundSD.selecciono_en_el_menu_de_categorias()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se despliegan las categorias",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundSD.se_despliegan_las_categorias()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Categorias - HerramientasEIndustria",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CategoriasFeature"
    },
    {
      "name": "@JuguetesYBebes"
    },
    {
      "name": "@CuartoDelBebe"
    }
  ]
});
formatter.step({
  "name": "las categorias estan desplegadas",
  "keyword": "Given "
});
formatter.match({
  "location": "CategoriasSD.las_categorias_estan_desplegadas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecciono dentro de Juguetes y Bebes \"Cuarto del Bebé\"",
  "keyword": "When "
});
formatter.match({
  "location": "CategoriasSD.selecciono_dentro_de_Juguetes_y_Bebes(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se muestran los resultados para la seleccion de \"Cuarto del Bebé\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoriasSD.se_muestran_los_resultados_para_la_seleccion_de(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});