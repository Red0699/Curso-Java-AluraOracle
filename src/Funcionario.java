public class Funcionario {
    private String nombre;
    private String documento;
    private double salario;
    private int tipo;

    //Constructor
    public Funcionario(){

    }

    //Getters y Seeders
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    //Metodos
    public double getBonificacion(){
        /*
        //1 = Gerente
        //0 = Funcionario
        if(this.tipo == 0){
            return this.salario * 0.1;
        }else if(this.tipo == 1){
            return this.salario;
        }else{
            return 0;
        }
        */

        return this.salario * 0.1;

    }
}
