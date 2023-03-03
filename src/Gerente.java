public class Gerente extends Funcionario implements Autenticable {
    /*
    private String clave;
    public void setClave(String clave){
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave){
        return clave == "Alura";
    }
    */
     
    //Sobre-escritura de metodo
    @Override
    public double getBonificacion(){
        System.out.println("Ejecutando desde gerente");
        return super.getSalario() + this.getSalario() * 0.05;
    }


    @Override
    public void setClave(String clave) {

    }

    @Override
    public boolean iniciarSesion(String clave) {
        return false;
    }
}
