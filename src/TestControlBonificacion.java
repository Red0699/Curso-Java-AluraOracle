public class TestControlBonificacion {
    public static void main(String[] args) {
        //Funcionario prueba = new Funcionario();
        Funcionario prueba = new Contador();
        prueba.setSalario(2000);

        Gerente prueba2 = new Gerente();
        prueba2.setSalario(10000);

        Contador prueba3 = new Contador();
        prueba3.setSalario(3000);

        ControlBonificacion cb = new ControlBonificacion();

        cb.registrarSalario(prueba);
        cb.registrarSalario(prueba2);
        cb.registrarSalario(prueba3);

    }
}
