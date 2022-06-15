public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    //construtores
    public PersonagemGame() {
        this.saudeAtual = 0;
        this.nome = "";
    }

    //getters and setters

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //metodos

    public void tomarDano(int quantidadeDeDano){
        this.saudeAtual -= quantidadeDeDano;
        if(saudeAtual <= 0){
            saudeAtual = 0;
        }
    }

    public void receberCura(int quantidadeDeCura){
        this.saudeAtual += quantidadeDeCura;
        if (saudeAtual >= 100) {
            saudeAtual = 100;
        }
    }
}
