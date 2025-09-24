public class Biblioteca {
public static final Object[] Livros = null;
private Livro [] livros;
private int contadorLivros;

public void adicionarLivros(Livro livro) {
    if (contadorLivros < livros.length) {
        livros[contadorLivros] = livro;
        contadorLivros++;
    } else {
        System.out.println("Espaço cheio.");
    }
}

public void empestarLivro(String titulo) {
    for (int i = 0; i < contadorLivros; i++) {
        if (livros[i].getTitulo().equals(titulo)) {
            livros[i].emprestar();
            return;
        }
    }
    System.out.println("Livro não encontrado.");
}

public void devolverLivro(String titulo) {
    for (int i = 0; i < contadorLivros; i++) {
        if (livros[i].getTitulo().equals(titulo)) {
            livros[i].devolver();
            return;
        }
    }
    System.out.println("Livro não encontrado.");
}

public void devolverLivro(String titulo, String autor) {
    for (int i = 0; i < contadorLivros; i++) {
        if (livros[i].getTitulo().equals(titulo) && livros[i].getAutor().equals(autor)) {
            livros[i].devolver();
            return;
        }
    }
    System.out.println("Livro não encontrado.");
}

public void mostrarLivros() {
    for (int i = 0; i < contadorLivros; i++) {
        System.out.println("Título: " + livros[i].getTitulo() + ", Autor: " + livros[i].getAutor() + ", Disponível: " + livros[i].isDisponivel());
    }
}
}