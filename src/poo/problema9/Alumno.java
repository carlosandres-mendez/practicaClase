package poo.problema9;


public class Alumno {
    PadreFamiliar padre;
    String nombre;
    String apellido;
    int carne;
    
    public Alumno(){
    }

    public Alumno(PadreFamiliar padre, String nombre, String apellido, int carne) {
        this.padre = padre;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
    }    
    
    public Alumno(String nombre, String apellido, int carne) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carne = carne;
    }
    
    
    public void mostrardatos(){
        System.out.println(nombre+" "+apellido+" "+ carne);
    }
    
    public void imprimirPadreFamiliar(){
        System.out.println(padre.getNombre() + " " + padre.getApellidos());
        System.out.println(padre); 
    }    
    
    //metodos gets y sets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public PadreFamiliar getPadre() {
        return padre;
    }

    public void setPadre(PadreFamiliar padre) {
        this.padre = padre;
    }
    
}
