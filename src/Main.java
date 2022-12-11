public class Main {
    public static void main(String[] args) {
    Persona persona = new Persona();

    persona.setnombre("oscar");
    persona.setedad(26);
    persona.settelefono(3175121);

    
        System.out.println(persona.getnombre());
        System.out.println(persona.getedad());
        System.out.println(persona.gettelefono());

    }
}