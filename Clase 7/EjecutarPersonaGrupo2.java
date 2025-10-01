public class EjecutarPersonaGrupo2 {
    public static void main(String[] args) {
        
    
        
        
        Persona objPersona1 = new Persona(1006234, 
                                            "Juan Manuel", 
                                            "Quijano López", 
                                            23, 
                                            1.80, 
                                            70.3);

        Persona objPersona2 = new Persona(123408, 
                                            "Oscar Daniel", 
                                            "Balanta Villegas", 
                                            17, 
                                            1.84, 
                                            65.0);

        
        System.out.println(objPersona2.estudiar("Ingeniería de Sistemas"));

       
        System.out.println("Nombre de la persona 1: " + objPersona1.getNombres());
        System.out.println("Edad de la persona 2: " + objPersona2.getEdad());

        
        objPersona1.setEdad(24); 
        objPersona2.setPeso(68.5);

        
        System.out.println("Nueva edad persona 1: " + objPersona1.getEdad());
        System.out.println("Nuevo peso persona 2: " + objPersona2.getPeso());
    }
}
