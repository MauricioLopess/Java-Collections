import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        // criando um map
        Map<String, Double> carros = new HashMap<>();

        // adicionando elementos 
        carros.put("gol", 14.6);
        carros.put("uno", 17.4);       
        carros.put("mobi", 16.1);
        carros.put("hb20", 14.5);
        carros.put("kwid", 15.6);

        System.out.println(carros);
        
        System.out.println();
        System.out.println("---------------");
        System.out.println();

        // substituindo valores
        carros.put("gol", 15.9);
        System.out.println(carros);

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        // verifique se existe um uno na lista
        System.out.println(carros.containsKey("uno"));

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        // retorne o valor de um elemento
        System.out.println(carros.get("gol"));

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        // retornando todas as chaves
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        // retorne todos os valores
        Collection<Double> consumo = carros.values();
        System.out.println(consumo);

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        // retorne o mais economico e seu tipo
        
        Double consumoMaisEconomico = Collections.max(carros.values());
        String modeloMaisEconomico = "";

        for (Map.Entry<String, Double> entry : carros.entrySet()) {
            if(entry.getValue() == consumoMaisEconomico)
            {
                modeloMaisEconomico = entry.getKey();
                System.out.println(modeloMaisEconomico+ ": " + consumoMaisEconomico);
            }
        }

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        // exiba a soma de todos os consumos
        Double soma = 0d;
        Iterator<Double> iterator = carros.values().iterator();
        while(iterator.hasNext())
        {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        // exiba a média dos consumos
        System.out.println(soma/carros.size());

        System.out.println();
        System.out.println("---------------");
        System.out.println();
        
        // remova aqueles modelos com o consumo igual a 15.6
        System.out.println(carros);
        Iterator<Double> iterator2 = carros.values().iterator();
        while(iterator2.hasNext())
        {
            if(iterator2.next().equals(15.6)) iterator2.remove();
        }
        System.out.println(carros);

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        // exiba todos na ordem em que foram inseridos
        Map<String, Double> carros2 = new LinkedHashMap<>();
        carros2.put("gol", 14.6);
        carros2.put("uno", 17.4);       
        carros2.put("mobi", 16.1);
        carros2.put("hb20", 14.5);
        carros2.put("kwid", 15.6);

        System.out.println(carros2);

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        // exiba a lista ordenando pelo modelo
        Map<String,Double> carros3 = new TreeMap<>();
        carros3.put("gol", 14.6);
        carros3.put("uno", 17.4);       
        carros3.put("mobi", 16.1);
        carros3.put("hb20", 14.5);
        carros3.put("kwid", 15.6);

        System.out.println(carros3);

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        // apague o conjunto
        carros.clear();
        carros2.clear();
        carros3.clear();
        System.out.println(carros);
        System.out.println(carros2);
        System.out.println(carros3);

    }
}
