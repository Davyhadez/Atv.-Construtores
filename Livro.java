public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro disponível.");
        } else {
            System.out.println("Livro não disponível.");
        }
    }

    public void devolver() { 
        disponivel = true;
        System.out.println("Livro devolvido.");
    }

    Object getAutor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
