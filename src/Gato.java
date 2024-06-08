public class Gato extends Animal {

    public Gato(String nombre){
        super(nombre);
    }

    @Override // sobrescribe el método hacerSonido para proporcionar una implementación específica.
    public void hacerSonido() {
        System.out.println("El gato "+getNombre()+" maúlla");
    }
}
