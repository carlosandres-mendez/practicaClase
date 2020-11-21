package poo.aerolinea;

public class Persona{
    //propiedades (variable globales)
    String nombre;
    String apellidos;
    int edad;
    boolean sexo;
    String lugarNacionalidad;
    Tiquete tiquete;

    public Persona(){
    }
    
    public Persona(String nombre, String apellidos, int edad, boolean sexo, String lugarNacionalidad, Tiquete tiquete) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.lugarNacionalidad = lugarNacionalidad;
        this.tiquete = tiquete;
    }

    //metodos de funcionalidad
    public void imprimirNombreCompleto(){
        System.out.println("Nombre completo: "+ nombre+" "+apellidos);
    } 
    
    public void imprimirTodosDatos(){
        imprimirNombreCompleto();
        System.out.println("Edad: "+ edad+" "+sexo + "" + lugarNacionalidad);
    }    
    
    //metodos gets y sets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getLugarNacionalidad() {
        return lugarNacionalidad;
    }

    public void setLugarNacionalidad(String lugarNacionalidad) {
        this.lugarNacionalidad = lugarNacionalidad;
    }

    public Tiquete getTiquete() {
        return tiquete;
    }

    public void setTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
    }
    
}