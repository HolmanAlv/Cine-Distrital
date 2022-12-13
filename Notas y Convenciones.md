En este archivo se encuentran las convenciones e indicaciones para marcar:
- Clases
- Interfaces
- Objetos
- Atributos
- Métodos


1. Clases e interfaces en Java
Los nombres de las clases deben ser sustantivos, en mayúsculas y minúsculas, con la primera letra de cada palabra interna en mayúscula. El nombre de las interfaces también debe estar en mayúscula (la primera) al igual que los nombres de las clases. Use palabras completas y debe evitar acrónimos y abreviaturas.

Por ejemplo:

Interface  Bicycle
Class MountainBike implements Bicyle
Interface Sport
Class Football implements Sport


2. Métodos en Java
Los métodos deben ser verbos, en mayúsculas y minúsculas, con la primera letra de cada palabra interna (a partir de la segunda) en mayúscula.

Por ejemplo:

void changeGear(int newValue);
void speedUp(int increment);
void applyBrakes(int decrement);


3. Variables en Java
Los nombres de las variables deben ser cortos pero significativos.

No debería comenzar con un guión bajo (‘_’) o caracteres, como por ejemplo, un signo de dólar ‘$’.
Debe ser mnemotécnico, es decir, diseñado para indicar al observador casual la intención de su uso.
Se deben evitar los nombres de variable de un carácter, excepto para variables temporales.
Los nombres comunes para las variables temporales son: i, j, k, m y n para enteros; c, d y e para los caracteres.
Por ejemplo:

// variables para la clase MountainBike
  int speed = 0;
  int gear = 1;


4. Variables constantes en Java
Debería estar todo en mayúsculas con palabras separadas por guiones bajos (“_”).

Hay varias constantes utilizadas en clases predefinidas como Float, Long, String, etc.
Por ejemplo:

static final int MIN_WIDTH = 4;
// Algunas variables constantes utilizadas en la clase Float predefinida
public static final float POSITIVE_INFINITY = 1.0f / 0.0f;
public static final float NEGATIVE_INFINITY = -1.0f / 0.0f;
public static final float NaN = 0.0f / 0.0f;


5. Paquetes en Java
El prefijo de un nombre de paquete único siempre se escribe en letras ASCII en minúsculas y debe ser uno de los nombres de dominio de nivel superior, como por ejemplo: com, edu, gov, mil, net, org.

Los componentes posteriores del nombre del paquete varían de acuerdo con las convenciones internas de nombres de la organización.
Por ejemplo:

com.sun.eng
com.apple.quicktime.v2
// java.lang packet in JDK
java.lang