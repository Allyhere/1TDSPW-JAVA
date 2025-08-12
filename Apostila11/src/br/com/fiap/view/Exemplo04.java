package br.com.fiap.view;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exemplo04 {
    public static void main(String[] args) {
        Map<String, String> estados = new HashMap<>();

        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapá");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("DF", "Distrito Federal");
        estados.put("ES", "Espírito Santo");
        estados.put("GO", "Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minas Gerais");
        estados.put("PA", "Pará");
        estados.put("PB", "Paraíba");
        estados.put("PR", "Paraná");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piauí");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");

        System.out.println("Quantidade de estados :" + estados.size());

        Set<String> estadosKeys = new HashSet<>(estados.keySet());

        for(String sigla : estadosKeys) {
            System.out.println(sigla + " -> " + estados.get(sigla));
        }

//        System.out.println(estados.entrySet());
//        for (entry : estados.entrySet()) {
//            System.out.println("Sigla: " + entry.getKey() + ", Estado: " + entry.getValue());
//        }
    }
}
