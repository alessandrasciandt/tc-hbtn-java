public class PersonagemGame {

    private int saudeAtual;
    private String nome;

    private String status;

    //construtores
    public PersonagemGame() {
    }

    public void tomarDano(int quantidadeDeDano){
        this.saudeAtual -= quantidadeDeDano;
        setSaudeAtual(saudeAtual);
        if(saudeAtual < 0){
            setSaudeAtual(0);
        }
    }

    public void receberCura(int quantidadeDeCura){
        this.saudeAtual += quantidadeDeCura;
        setSaudeAtual(saudeAtual);
        if (saudeAtual >= 100){
            setSaudeAtual(100);
        }
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual){
        this.saudeAtual = saudeAtual;
        if (this.saudeAtual > 0){
            status = "vivo";
        }else{
            status = "morto";
        }
    }

    public String getStatus() {
        return status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}