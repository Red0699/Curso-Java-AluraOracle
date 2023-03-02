public class TestReferencias {

    public static void main(String[] args) {

        // Elemento mas generico puede ser adaptado al elemento mas especifico
        //Funcionario funcionario = new Funcionario();
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Nicolas");

        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);

        //funcionario.iniciarSesion();
        gerente.iniciarSesion("Prueba");
    }
}
