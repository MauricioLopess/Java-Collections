import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorPag implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {

        return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
    }
    
}
