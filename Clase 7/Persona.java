public class Persona {
    
    private int id;
    private String nombres;
    private String apellidos;
    private int edad;
    private double estatura;
    private double peso;

    
    public Persona(int id, String nombres, String apellidos, int edad, double estatura, double peso) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    
    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setPeso(double peso) {
        this.peso  = peso;
    }

    
    public String estudiar(String carrera) {
        return nombres + " " + apellidos + " está estudiando " + carrera;
    }
}

