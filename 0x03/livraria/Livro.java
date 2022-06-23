import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException {
        setTitulo(titulo);
        setAutor(autor);
        setPreco(preco);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {
        //this.titulo = titulo;
        if (titulo.length() < 3) {
            throw new LivroInvalidoException("Titulo de Livro invalido");
        } else {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws AutorInvalidoException {
        //this.autor = autor;
        if (autor.contains(" ") == true) {
            this.autor = autor;
        } else {
            throw new AutorInvalidoException("Nome de autor invalido");
        }
    }
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws LivroInvalidoException {
        //this.preco = preco;
        if (preco <= 0) {
            throw new LivroInvalidoException("Preco de livro invalido");
        }else{
            this.preco = preco;
        }
    }
}
