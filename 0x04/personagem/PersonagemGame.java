public class PersonagemGame {
    //atributos
    public String nome;
    public int saudeAtual;

    public PersonagemGame() {
        this.nome = "";
        this.saudeAtual = 0;
    }
    //get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }
}
