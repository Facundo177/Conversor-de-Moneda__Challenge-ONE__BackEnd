<div align="center">
  <h1 align="center">
    Conversor de Moneda
  </h1>
  <h3> 
    Un Challenge de Alura - ONE
  </h3>
    <br />
  <img src="https://github.com/Facundo177/Conversor-de-Moneda__Challenge-ONE__BackEnd/assets/99448005/9826cebc-1e03-4305-8356-99c036c7d27e">
   <br />
   <br />
</div>

## Introducción

**Challenge realizado en [Java](https://docs.oracle.com/en/java/javase/17/docs/api/index.html)**

El Conversor de Moneda consulta una [API](https://www.exchangerate-api.com) para obtener el valor de cambio de divisas.
El usuario puede elegir entre las opciones de conversión disponibles en el menú, o relizar una consulta manualmente si conoce el código de tres letras de la moneda que desea convertir.

## ¿Cómo se usa?
Se le presenta un menú al usuario que ejecuta el programa:
![menuChallenge](https://github.com/Facundo177/Conversor-de-Moneda__Challenge-ONE__BackEnd/assets/99448005/ce9dd237-0d59-4840-8aa2-233bb74485f4)
<br />
Al elegir la opción de cambio deseada, se le preguntará el valor que desea convertir:
![conversion1](https://github.com/Facundo177/Conversor-de-Moneda__Challenge-ONE__BackEnd/assets/99448005/f60518b6-7e72-4eb1-901f-24c5df6e581b)
<br />
Si la opción elegida es la (7), se solicitarán los dos códigos de las monedas involucradas en la conversión:
![conversion2](https://github.com/Facundo177/Conversor-de-Moneda__Challenge-ONE__BackEnd/assets/99448005/eb3bd688-5d38-40b3-bd09-450f4925a3f8)
<br />
Ya realizada la conversión, se guardará junto a la fecha en un archivo txt como parte del historial:
![log](https://github.com/Facundo177/Conversor-de-Moneda__Challenge-ONE__BackEnd/assets/99448005/4b3a40f1-7a3d-4ba9-8a18-aebebcbcb690)
<br />

## Este proyecto incluye:
- Uso de la API de tasas de cambio
- Uso de la biblioteca Gson
- Solicitudes y respuestas a la API con HttpClient, HttpRequest y HttpResponse
- Manipulación de un JSON
- Interacción con el usuario mediante Scanner
- Historial de conversiones en un .txt creado con FileWriter
- Soporte para todas las monedas
- Registros con marca de tiempo utilizando java.time
- Personalización de respuestas a diversas Excepciones
- Aplicación de los conceptos de abstracción, encapsulamiento y polimorfismo.
