import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        Locale localeBR = new Locale("en", "US");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        float taxa = 0.2456f;
        float valor = 7654.321f;
        System.out.println("Valor: "+dinheiro.format(valor).replace("$","R$ "));
        System.out.println(String.format("Taxa: %02.2f%%", taxa));
    }
}
