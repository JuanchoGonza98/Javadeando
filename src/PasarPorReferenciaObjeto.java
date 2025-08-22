class Persona {
    private String nombre;
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferenciaObjeto {
    public static void main(String[] args)
    {
      Persona persona = new Persona();
      persona.modificarNombre("Andres");

      System.out.println("Iniciamos el método main");
      System.out.println("persona.nombre = " + persona.leerNombre());
      test(persona);
        System.out.println("persona.nombre = " + persona.leerNombre());
        System.out.println("Finaliza metodo main");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Juancho");
        System.out.println("Finaliza el método test");
    }

}
