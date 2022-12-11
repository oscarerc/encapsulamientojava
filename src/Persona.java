public class Persona {
    private String nombre;
    private int edad;
    private int telefono;


    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public String getnombre(){
        return this.nombre;
    }

    public void setedad(int edad){
        this.edad=edad;
    }
    public int getedad(){
        return this.edad;
    }
    public void settelefono(int telefono){
        this.telefono=telefono;
    }
    public int gettelefono(){
        return this.telefono;
    }

}
