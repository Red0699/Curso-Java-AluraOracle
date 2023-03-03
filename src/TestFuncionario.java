public class TestFuncionario {
    public static void main(String[] args) {
        //Funcionario nicolas = new Funcionario();
        Funcionario nicolas = new Contador();
        nicolas.setNombre("Nicolas");
        nicolas.setDocumento("1073527466");
        nicolas.setSalario(2000);
        nicolas.setTipo(0);

        System.out.println(nicolas.getNombre());
        System.out.println(nicolas.getSalario());
        System.out.println(nicolas.getBonificacion());
    }
}
