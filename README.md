# ML-FE-POC
Mercadolibre FE automation POC

Projecto con las siguientes caracteristicas:
- Utiliza Cucumber scenarios para los test cases
- Escrito en Java con Selenium Webdriver
- Las dependencias manejadas por Maven (excepto el driver que se aloja en un directorio)
- Logs en consola y archivo (se puede configurar) a traves de Log4j

En /target se encuentran los resultados de la corrida:
- cucumber-reports, para los reportes propios de Cucumber
- logs, que son los mismos que se muestran en la consola
- screenshots, que se realizan automaticamente en validaciones puntuales
