public abstract interface Autenticable{

    //private String clave;
    public void setClave(String clave);


    /*
    public boolean iniciarSesion(String clave){
        return clave == "Alura";
    }
    */
    public abstract boolean iniciarSesion(String clave);

}
