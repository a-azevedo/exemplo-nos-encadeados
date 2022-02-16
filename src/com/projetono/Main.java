package com.projetono;

public class Main {
    public static void main(String[] args) {
        No<String> n1 = new No<>("Conteudo no1");
        var n2 = new No<>(0.2);
        n1.setProximoNo(n2);
        var n3 = new No<>(true);
        n2.setProximoNo(n3);
        var n4 = new No<>("Conteudo no4");
        n3.setProximoNo(n4);
        var n5 = new No<>(5);
        n4.setProximoNo(n5);

        System.out.println(n1);
        System.out.println(n1.getProximoNo());
        System.out.println(n3);
        System.out.println(n5);
        System.out.println(n1.getProximoNo().getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}
