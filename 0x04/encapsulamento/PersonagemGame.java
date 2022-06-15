public class PersonagemGame {

    private int saudeAtual;
    private String nome;

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
}
