public class TestGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        //Funcionario gerente = new Funcionario();

        gerente.setSalario(5000);
        gerente.setTipo(1);
        gerente.setClave("Alura");

        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("Alura"));
    }
}
