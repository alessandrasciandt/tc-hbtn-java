public class Empregado {
    protected double salarioFixo;
    protected double bonus;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
        this.bonus = bonus;
        if(departamento.alcancouMeta() == true){
            return bonus = salarioFixo * 0.10;
        }else{
            return bonus = 0.0;
        }
    }

    public double calcularSalarioTotal(Departamento departamento){
        double salarioTotal = salarioFixo + calcularBonus(departamento);
        return salarioTotal;
    }
}
