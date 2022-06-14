public class InteiroPositivo {
    private int valor;
    //public String valorString;

    //constructor
    public InteiroPositivo(Integer valor) {
        if(valor.intValue() <= 0 || valor == null){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }
    public InteiroPositivo(String valor) {
        if(Integer.parseInt(valor) <= 0 || valor == null){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = Integer.parseInt(valor);
    }

    //getter and setters
    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        if(valor.intValue() <= 0 || valor == null){
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }else{
            this.valor  = valor;
        }
    }


    //metodo
   public boolean ehPrimo(){
        if (valor <= 1){
            return false;
        }
      for (int i = 2; i < valor; i++){
          if (valor % i == 0)
              return false;
      }
      return true;
   }
}
