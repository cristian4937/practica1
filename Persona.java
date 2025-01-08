public class Persona {
    String nombres;
    int edad;
    public Persona (String nombres, int edad) {
        this.nombres = nombres;
        this.edad = edad;
    }

    public String getNombre(){
        return  this.nombres;
    }

    public int getEdad(){
        return  this.edad;
    }

    public void setNombre(String nombres){
        this.nombres = nombres;
    }

    public void setEdad (int edad){
        this.edad = edad;
    }

    public String toString(){
        String salida;
        salida = this.nombres + " - " + this.edad;
        return  salida;
    }
    
}
