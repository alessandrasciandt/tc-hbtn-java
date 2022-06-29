public class PedidoCookie {

    private String sabor;
    private int quantidadedeCaixas;

    public PedidoCookie(String sabor, int quantidade) {
        this.sabor = sabor;
        this.quantidadedeCaixas = quantidade;
    }
    //public PedidoCookie(){};

    public String getSabor() {
        return sabor;
    }


    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getQuantidade() {
        return quantidadedeCaixas;
    }

    public void setQuantidade(int quantidade) {
        this.quantidadedeCaixas = quantidade;
    }
}
