public class Administrador extends Funcionario implements Autenticable{

    private AutenticacionUtil util;
    //private String clave;

    public Administrador(){
        this.util = new AutenticacionUtil();
    }
    @Override
    public double getBonificacion() {
        return this.getSalario();
    }


    @Override
    public void setClave(String clave) {
        //this.clave = clave;
        this.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        /*
        if (this.clave == clave){
            return true;
        }
        return false;
        */
        return this.util.iniciarSesion(clave);
    }
}
