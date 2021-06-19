/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

import java.util.*;

public class PracticingMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> estados = new HashMap<>();
        estados.put("PE", 9616621);
        estados.put("AL", 3351543);
        estados.put("CE", 9187103);
        estados.put("RN", 3534265);
        System.out.println(estados + "\n");

        System.out.println("Substitua a população do estado RN por : 3.534.165");
        estados.put("RN", 3534165);
        System.out.println(estados + "\n");

        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione PB - 4.039.277: ");
        estados.put("PB", 4039277);
        System.out.println(estados + "\n");

        System.out.println("Exiba a população de Pernambuco: " + estados.get("PE") + "\n");

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> estados1 = new TreeMap<>(estados);
        System.out.println(estados1 + "\n");

        Collection<Integer> populacao = estados.values();
        String maiorPopulacao = "";
        String menorPopulacao = "";

        for (Map.Entry<String, Integer> entry : estados.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))){
                maiorPopulacao = entry.getKey();
            }
            if (entry.getValue().equals(Collections.min(populacao))) {
                menorPopulacao = entry.getKey();
            }
        }

        System.out.printf("Exiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                menorPopulacao, Collections.min(populacao));
        System.out.printf("Exiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                maiorPopulacao, Collections.max(populacao));

    }
}
