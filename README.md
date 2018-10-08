# Practica APAW.PD
#### Asignatura: *Arquitecturas y Patrones para Aplicaciones Web*
#### [Máster en Ingeniería Web por la U.P.M.](http://miw.etsisi.upm.es)

### Descripción
APAW. ECP1. Patrones de Diseño

#### [Patrón Strategy](https://es.wikipedia.org/wiki/Strategy_(patr%C3%B3n_de_dise%C3%B1o))
El patrón Strategy (Estrategia, también conocido como Policy) es un patrón de comportamiento porque determina cómo se debe realizar el intercambio de mensajes entre diferentes objetos para resolver una tarea. Cualquier programa que ofrezca un servicio o función determinada, que pueda ser realizada de varias maneras, es candidato a usar el patrón Strategy.
![UML Strategy Pattern](https://upload.wikimedia.org/wikipedia/commons/3/32/Strategy_Pattern.jpg)

**Ventajas**  
El patrón funciona para una clase que defina múltiples comportamientos mediante instrucciones condicionales, evitando emplear estas instrucciones al mover el código a clases independientes donde se almacenará cada estrategia.  
Se pueden agregar tantas estrategias como se deseen sin afectar la integridad del programa.  

**Participantes**  
**Context** *(Contexto):* Es el elemento que usa los algoritmos, por tanto, delega en la jerarquía de estrategias. Configura una estrategia concreta mediante una referencia a la estrategia necesaria. 

**Strategy** *(Estrategia):* Declara una interfaz común para todos los algoritmos soportados. Esta interfaz será usada por el contexto para invocar a la estrategia concreta.

**ConcreteStrategy** *(EstrategiaConcreta):* Implementa el algoritmo utilizando la interfaz definida por la estrategia.  

**Desventajas**  
Se aumenta el número de objetos creados, por lo que se produce una penalización en la comunicación entre estrategia y contexto (hay una indirección adicional).