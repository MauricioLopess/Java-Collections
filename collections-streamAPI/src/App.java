import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> lista = Arrays.asList("1", "2", "4", "6", "9", "7", "3", "8", "5");

        // exibindo a lista
        lista.stream().forEach(s -> System.out.println(s));
        // lista.forEach(System.out::println);

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // colete 5 da lista e transforme-os em um set
        Set<String> listaSet = lista.stream()
            .limit(5)
            .collect(Collectors.toSet());

        listaSet.forEach(System.out::println);

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // transforme esta lista de string em uma lista de inteiros
        List<Integer> listaList = lista.stream()
            .map(i -> Integer.parseInt(i))
            .collect(Collectors.toList());

        // List<Integer> listaList = lista.stream()
        //     .map(Integer::parseInt)
        //     .collect(Collectors.toList());

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // pegue os números pares e maiores que dois e coloque-os em uma lista
        List<Integer> listaList2 = lista.stream()
            .map(Integer::parseInt)
            .filter(i -> (i % 2 == 0 && i > 2))
            .collect(Collectors.toList());

        System.out.println(listaList2);

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // mostre a média dos valores
        lista.stream()
            .mapToInt(Integer::parseInt)
            .average()
            .ifPresent(System.out::println);

        System.out.println();
        System.out.println("------------------");
        System.out.println();

        // remova valores impares
        listaList.removeIf(i -> (i % 2 != 0));
        System.out.println(listaList);

    }
}
