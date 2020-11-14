package poo;

public class Persona{
    //propiedades (variable globales)
    String nombre;
    String apellidos;
    int edad;
    boolean sexo;
    String lugarNacionalidad;

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
}