package educa;


public class Persona {
    
    private String nombre;
    private char sexo;
    private int edad;
    
    private String[] nombres_chichos = {"Juan", "José", "Antonio", "Alfredo", "Pepe"};
    private String[] nombres_chicas = {"Ana", "María", "Laura", "Carmen", "Sofía"};

    public Persona() {
        
        int determinar_sexo=MetodosSueltos.generaNumeroAleatorio(0, 1);
        
        if (determinar_sexo == 0){
        
            nombre= nombres_chichos[MetodosSueltos.generaNumeroAleatorio(0, 4)];
            sexo = 'H';
            
        }else{
        
            nombre= nombres_chicas[MetodosSueltos.generaNumeroAleatorio(0, 4)];
            sexo = 'M';
        }
        
        edad = MetodosSueltos.generaNumeroAleatorio(12, 15);
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



    
    

}
