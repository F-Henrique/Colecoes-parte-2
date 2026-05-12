package com.Colecoes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NomeSexo {

    public static void main(String[] args) {

        Set<String> listaM = new HashSet<String>();
        Set<String> listaF = new HashSet<String>();

        Scanner s = new Scanner(System.in);

        //############################################

        System.out.print("Digite o total de pessoas a cadastrar: ");
        Integer totalPessoas = Integer.parseInt(s.nextLine());

        //------------------------------

        for(int i = 1; i <= totalPessoas; ++i) {

            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String nome = s.nextLine();

            System.out.print("Digite o sexo da " + i + "ª pessoa (M-Masculino/F-Feminino: ");
            String sexo = s.nextLine();

            switch (sexo.toUpperCase()) {
                case "M":
                    listaM.add(nome);
                    break;
                case "F":
                    listaF.add(nome);
                    break;
                default:
                    break;
            }

        }

        //------------------------------

        int totalPessoasM =listaM.size();
        int totalPessoasF =listaF.size();

        if(totalPessoasM>0){
            System.out.println("********* "+ totalPessoasM +" nomes Masculinos *********");
            System.out.println(listaM);
        }else {
            System.out.println("Sem nomes masculinos.");
        }

        System.out.println("---");

        if(totalPessoasF>0){
            System.out.println("********* "+ totalPessoasF +" nomes Femininos *********");
            System.out.println(listaF);
        }else {
            System.out.println("Sem nomes Femininos.");
        }




    }

}
