import java.util.*;

public class App2 {
    public static void main(String[] args) {
        // --- ordenando um Map ---

        // crie um map
        Map<String, Livro> livros = new HashMap<>();

        livros.put("Stephen Hawking", new Livro("Uma breve história do tempo", 256));
        livros.put("Charles Duhigg", new Livro("O poder do hábito", 408));
        livros.put("Yuval Noah", new Livro("21 lições para o século 21", 432));

        // exiba na ordem aleatória
        for(Map.Entry<String, Livro> entry : livros.entrySet())
        {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // exiba os itens na ordem de inserção
        Map<String, Livro> livros2 = new LinkedHashMap<>();

        livros2.put("Charles Duhigg", new Livro("O poder do hábito", 408));
        livros2.put("Stephen Hawking", new Livro("Uma breve história do tempo", 256));
        livros2.put("Yuval Noah", new Livro("21 lições para o século 21", 432));

        for (Map.Entry<String, Livro> entry : livros2.entrySet()) 
        {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());    
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // exiba de acordo com o nome dos autores

        Map<String, Livro> livros3 = new TreeMap<>(livros);

        for (Map.Entry<String, Livro> entry : livros3.entrySet()) 
        {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());    
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // exiba de acordo com a ordem do nome dos livros

        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorNomeLivros());
        livros4.addAll(livros3.entrySet());
        for (Map.Entry<String, Livro> entry : livros4) 
        {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());    
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // exiba na ordem numérica de cada página
        Set<Map.Entry<String, Livro>> livros5 = new TreeSet<>(new ComparatorPag());
        livros5.addAll(livros3.entrySet());
        for (Map.Entry<String,Livro> entry : livros5) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getPaginas() + " páginas");    
        }

    }
}
