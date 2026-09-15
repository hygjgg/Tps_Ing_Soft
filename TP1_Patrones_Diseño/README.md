# Trabajo Práctico: Patrones de Diseño I

## Objetivo del Proyecto
 El propósito principal es demostrar de manera práctica y conceptual la implementación de tres patrones de diseño fundamentales del catálogo de GoF (Gang of Four): **Singleton**, **Observer** y **Strategy**.

---

## Patrones Implementados

### 1. Patrón Singleton
* **Propósito:** Garantizar que una clase tenga una única instancia global en todo el ciclo de vida del sistema.
* **Componente:** `DocumentacionEnBlanco.java`, diseñado para centralizar la gestión de documentos en blanco del sistema de forma segura, bloqueando accesos externos mediante un constructor privado.

### 2. Patrón Observer
* **Propósito:** Definir una dependencia de uno-a-muchos entre objetos, notificando automáticamente los cambios de estado en tiempo de ejecución.
* **Componentes:** Interfaz `Observer` y clases `Subject` y `AlertaStockUI`. Ideal para desacoplar el modelo de datos de la interfaz de usuario.

### 3. Patrón Strategy
* **Propósito:** Encapsular una familia de algoritmos intercambiables, permitiendo alterar el comportamiento de un objeto dinámicamente sin usar estructuras condicionales rígidas.
* **Componentes:** Interfaz `CalculoImpuestoStrategy` y sus implementaciones concretas `ImpuestoArgentina` e `ImpuestoExento`.

---

##  Instrucciones de Ejecución

Para compilar y ejecutar este proyecto de manera local, debe tener instalado el **Java Development Kit (JDK)** y seguir los pasos a continuación desde su terminal:

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com
   ```
2. **Navegar al directorio del proyecto:**
   ```bash
   cd nombre-del-repositorio
   ```
3. **Compilar todas las clases de Java:**
   ```bash
   javac Main.java DocumentacionEnBlanco.java PatronObserver.java PatronStrategy.java
   ```
4. **Ejecutar la clase principal:**
   ```bash
   java Main
   ```
