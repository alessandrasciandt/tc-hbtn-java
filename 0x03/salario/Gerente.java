public class Gerente extends Empregado{

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento){
        if(departamento.alcancouMeta() == true){
            return bonus = salarioFixo * 0.20 + ((departamento.getValorAtingidoMeta() - departamento.getValorMeta())* 0.01);
        }else{
            return bonus = 0.0;
        }
    }
}
