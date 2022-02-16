package com.projetono;

public class Main {
    public static void main(String[] args) {
        No n1 = new No("Conteudo no1");
        No n2 = new No("Conteudo no2");
        n1.setProximoNo(n2);
        No n3 = new No("Conteudo no3");
        n2.setProximoNo(n3);
        No n4 = new No("Conteudo no4");
        n3.setProximoNo(n4);
        No n5 = new No<Integer>(5);
        n4.setProximoNo(n5);

        System.out.println(n1);
        System.out.println(n1.getProximoNo());
        System.out.println(n5);
        System.out.println(n1.getProximoNo().getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
