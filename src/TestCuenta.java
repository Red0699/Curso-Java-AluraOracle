public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(1, 200);
        CuentaAhorros ca = new CuentaAhorros(2, 300);
        cc.depositar(2000);
        cc.transferir(1000, ca);

        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());
    }
}
