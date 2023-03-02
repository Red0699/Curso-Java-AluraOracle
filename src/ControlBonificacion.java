public class ControlBonificacion {

    private double sumaTotal;

    public double registrarSalario(Funcionario funcionario){
        this.sumaTotal = funcionario.getBonificacion() + this.sumaTotal;
        System.out.println("Calculo actual: " + sumaTotal);
        return this.sumaTotal;

    }

    /*
    public double registrarSalario(Gerente gerente){
        this.sumaTotal = gerente.getBonificacion() + this.sumaTotal;
        System.out.println("Calculo actual: " + sumaTotal);
        return this.sumaTotal;
    }

    public double registrarSalario(Contador contador){
        this.sumaTotal = contador.getBonificacion() + this.sumaTotal;
        System.out.println("Calculo actual: " + sumaTotal);
        return this.sumaTotal;
    }
    */

}
