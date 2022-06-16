public class Empregado {

    private String nome;
    private int codigo;
    private Endereco endereco;

    //construtores
    public Empregado(String nome, int codigo, Endereco endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    //getters and setters

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;

    }

    public void apresentar(){
        System.out.println("Codigo: "+this.getCodigo());
        System.out.println("Nome: "+this.getNome());
        System.out.println("Bairro: "+this.getEndereco().getBairro());
        System.out.println("Cidade: "+this.getEndereco().getCidade());
        System.out.print("Pais: "+this.getEndereco().getPais());
    }
}
