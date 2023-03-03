public class Cliente implements Autenticable{
    private String documento;
    private String telefono;
    private String nombre;

    private String clave;

    private AutenticacionUtil util;

    public Cliente(){
        this.util = new AutenticacionUtil();
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setClave(String clave) {
        this.setClave(clave);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        /*
        if(this.clave == clave){
            return true;
        }
        return false;
        */
        return this.util.iniciarSesion(clave);
    }
}
