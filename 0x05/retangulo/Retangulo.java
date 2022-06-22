public class Retangulo extends FormaGeometrica{

    private double largura;
            private double altura;
    @Override
    public double area() {
        return super.area();
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
        if(largura < 0){
            throw new UnsupportedOperationException("Largura deve ser maior ou igual a 0");
        }else{
            this.largura = largura;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        if(altura < 0){
            throw new UnsupportedOperationException("Altura deve ser maior ou igual a 0");
        }else{
            this.altura = altura;
        }
    }
}
