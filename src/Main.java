public class Main {
    public static void main(String[] args) {
        // Crear referencias de la clase base
        Animal miAnimal;

        // Asignar un objeto de la subclase Perro a la referencia de la clase base
        miAnimal = new Perro("Tobi");
        miAnimal.hacerSonido();  // Salida: El perro ladra

        // Asignar un objeto de la subclase Gato a la referencia de la clase base
        miAnimal = new Gato("Matias");
        miAnimal.hacerSonido();  // Salida: El gato maúlla
    }
}
