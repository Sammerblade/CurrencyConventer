 Descripción del Programa
Este programa es un convertidor de divisas que permite al usuario obtener tasas de cambio en tiempo real para varias divisas globales utilizando la API de ExchangeRate-API. Al ejecutar el programa, realiza una solicitud a la API para recuperar las tasas de cambio actuales de USD a divisas específicas como el Euro (EUR), Yen Japonés (JPY), Libra Esterlina (GBP), Peso Mexicano (MXN), Peso Argentino (ARS), y Real Brasileño (BRL).

El sistema utiliza Java como lenguaje de programación principal y Maven para manejar las dependencias y la construcción del proyecto.

Requisitos del Sistema
Para ejecutar este programa, necesitarás:

Java Development Kit (JDK) versión 17 o superior.
Maven para gestionar las dependencias y la construcción del proyecto.
Cómo Configurar y Ejecutar el Programa
Paso 1: Clonar el Repositorio
Primero, necesitas clonar el repositorio desde GitHub. Puedes hacer esto abriendo una terminal y ejecutando el siguiente comando:
git clone [URL del repositorio]

Asegúrate de reemplazar [URL del repositorio] con la URL actual de tu repositorio en GitHub.

Paso 2: Navegar al Directorio del Proyecto
Una vez clonado, navega al directorio del proyecto:
cd CurrencyConverter
Paso 3: Compilar el Proyecto
Antes de ejecutar el programa, compila el proyecto con Maven para asegurarte de que todas las dependencias necesarias estén instaladas correctamente. Ejecuta el siguiente comando en tu terminal:
mvn compile
Paso 4: Ejecutar el Programa
Para iniciar el programa, usa el siguiente comando de Maven, que ejecutará la clase principal del proyecto:
mvn exec:java -Dexec.mainClass=com.miproyecto.App
Este comando inicia el programa, que luego hace una solicitud a la API para obtener las tasas de cambio y las muestra en la consola.

Cómo Contribuir al Proyecto
Si estás interesado en contribuir al proyecto, puedes hacerlo de varias maneras. Puedes abrir un issue en GitHub si encuentras un bug o tienes una sugerencia de mejora. También puedes realizar un fork del repositorio y enviar tus propios pull requests con mejoras o nuevas funcionalidades.

Licencia
El proyecto está distribuido bajo la Licencia [INSERTE EL TIPO DE LICENCIA], lo que significa que puedes modificarlo y distribuirlo libremente, siempre y cuando sigas los términos de esta licencia.
