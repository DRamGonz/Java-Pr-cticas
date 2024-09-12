package practica.farmacia;


public class Pacientes {
    
    protected String nombre, apellido, motivoConsulta, medicamentoRecetado, sexo;
    protected int edad;
    protected Medicamento medicamento;

    public Pacientes(String nombre, String apellido, String motivoConsulta, String medicamentoRecetado, String sexo, int edad, Medicamento medicamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.motivoConsulta = motivoConsulta;
        this.medicamentoRecetado = medicamentoRecetado;
        this.sexo = sexo;
        this.edad = edad;
        this.medicamento = medicamento;
    }

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

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getMedicamentoRecetado() {
        return medicamentoRecetado;
    }

    public void setMedicamentoRecetado(String medicamentoRecetado) {
        this.medicamentoRecetado = medicamentoRecetado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public boolean mayorEdad () {
    
        if (this.edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimirGeneral () {
        String datosGenerales = "Pacientes:" + "\nNombre= " + this.nombre + ". \nApellido=" + this.apellido + "\nNombre del Medicamento= " + this.medicamento.getNombre() + "\nDescripcíon del Medicamento= " + this.medicamento.getDescripcion();
        System.out.println(datosGenerales);
    }
    
    public boolean comprobarDatos () {
        if (this.nombre.length() > 4 && this.edad > 0 && this.edad <=99 && this.medicamento.getDescripcion().length() > 15) {
            return true;
        } else {
            return false;   
        }
    }
}
