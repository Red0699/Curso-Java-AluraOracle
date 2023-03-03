
//entidad Cuenta:
class Cuenta {

    //Atributos
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    //Constructor
    public Cuenta(int agencia){
        int total = 0;
        if(agencia <= 0){
            System.out.println("No se permite 0");
            this.agencia = 1;
        } else{
            this.agencia = agencia;
        }
        total++;
        System.out.println("Se van creando: " + total + " cuentas");
    }

    //Metodos



    //No retorna valor
    public void depositar(double valor){
        this.saldo += valor;
    }
    //Retorna valor
    public boolean retirar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else{
            return false;
        }
    }

    public boolean transferir(double valor, Cuenta cuenta){
        if (this.saldo >= valor){
            this.saldo -= valor;
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




