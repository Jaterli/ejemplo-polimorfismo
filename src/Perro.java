public class Perro extends Animal {

    public Perro(String nombre){
        super(nombre);
    }

    @Override // sobrescribe el método hacerSonido para proporcionar una implementación específica.
    public void hacerSonido() {
        System.out.println("El perro "+getNombre()+" ladra");
    }
}
