//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> livros = new DatasetReader().readDataset("src/data.csv");
        Book livro = new Book();

//        System.out.print(livro.numberOfBookByAuthor(livros, "J.K. Rowling"));
//        System.out.println("\n");
//        System.out.print(livro.listaAutor(livros));
//        System.out.println("\n");
//        livro.livrosDoAutor(livros, "J.K. Rowling");
//        System.out.println("\n");
        livro.avaliacao(livros, "4.6");
    }
}