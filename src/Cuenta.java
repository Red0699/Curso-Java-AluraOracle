
//entidad Cuenta:
public abstract class Cuenta {

    //Atributos
    protected double saldo;
    private int agencia;
    private int numero;

    private static int total;
    private Cliente titular = new Cliente();

    //Constructor
    public Cuenta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        Cuenta.total++;
    }

    //Metodos

    //No retorna valor
    /*
    public void depositar(double valor){
        this.saldo += valor;
    }
    */

    public abstract void depositar(double valor);

    //Retorna valor
    public void retirar(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor){
            throw new SaldoInsuficienteException("No tienes saldo");
        }

        this.saldo -= valor;
    }

    public boolean transferir(double valor, Cuenta cuenta){
        if (this.saldo >= valor){
            try {
                this.retirar(valor);
            } catch (SaldoInsuficienteException e) {
                e.printStackTrace();
            }
            cuenta.depositar(valor);
            return true;
        }else{
            return false;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double nuevoSaldo){
        if (nuevoSaldo > 0){
            this.saldo = nuevoSaldo;
        }else{
            System.out.println("No se permite valores negativos");
        }
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
}




