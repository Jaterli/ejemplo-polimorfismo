# Polimorfismo en Java

El polimorfismo es uno de los cuatro pilares fundamentales de la programación orientada a objetos (POO), junto con la herencia, la encapsulación y la abstracción. En términos simples, el polimorfismo se refiere a la capacidad de un objeto de tomar muchas formas. Esto permite que una clase base se utilice como referencia para objetos de diferentes subclases, y que el comportamiento específico de un método se determine en tiempo de ejecución.

El polimorfismo se puede dividir en dos tipos principales:

1. **Polimorfismo en tiempo de compilación (sobrecarga de métodos):** Este ocurre cuando varios métodos en la misma clase tienen el mismo nombre pero diferentes parámetros.
2. **Polimorfismo en tiempo de ejecución (sobrescritura de métodos):** Este ocurre cuando una subclase proporciona una implementación específica de un método que ya está definido en su clase base.

## Ejemplo de Polimorfismo en Java

En este repositorio veremos un ejemplo de polimorfismo en tiempo de ejecución utilizando una clase base `Animal` y dos subclases `Perro` y `Gato`.

### Explicación del Ejemplo

1.  **Clase Base `Animal`**: Define un método `hacerSonido` que imprime un mensaje genérico.
2.  **Subclases `Perro` y `Gato`**: Cada una sobrescribe el método `hacerSonido` para proporcionar una implementación específica.
3.  **Clase `Main`**:
    -   Crea una referencia de tipo `Animal`.
    -   Asigna un objeto de `Perro` a la referencia `miAnimal` y llama al método `hacerSonido`. Gracias al polimorfismo, se invoca la versión del método de `Perro`.
    -   Luego, asigna un objeto de `Gato` a la misma referencia `miAnimal` y llama al método `hacerSonido`. Esta vez, se invoca la versión del método de `Gato`.

El polimorfismo permite que el mismo método (`hacerSonido`) se comporte de manera diferente según el tipo de objeto que lo invoca, facilitando la flexibilidad y extensibilidad del código.
