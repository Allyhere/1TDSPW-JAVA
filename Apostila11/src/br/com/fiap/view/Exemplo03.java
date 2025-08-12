package br.com.fiap.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Exemplo03 {
    public static void main(String[] args) {
        Set<String> rm = new HashSet<>();

        rm.add("rm564113");
        rm.add("rm531233");

        System.out.println("Quantidade de RMs" + rm.size() + "\n");

        for (String rmAluno : rm) {
            System.out.println("Aluno:" + rmAluno);
        }
    }
}
