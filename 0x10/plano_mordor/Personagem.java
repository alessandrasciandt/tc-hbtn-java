import comida.Comida;
import humor.*;

public class Personagem {

    public int pontosDeFelicidade;

    public Personagem(){

    };

    public Humor obterHumorAtual(){
        if(pontosDeFelicidade < -5){
            return new Irritado();
        } else if (pontosDeFelicidade <= 0){
            return new Triste();
        } else if (pontosDeFelicidade <= 15) {
            return new Feliz();
        }else {
            return new MuitoFeliz();
        }
    };

    public void comer(Comida[] comidas){
    for (int i=0; i <= comidas.length -1; i++){
        pontosDeFelicidade += comidas[i].getPontosDeFelicidade();
        }
    }

    @Override
    public String toString() {
        return pontosDeFelicidade + " - " + obterHumorAtual().getClass().getSimpleName();
    }
}
