package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaodeNumeros {
    private List<Integer> listaNumeros;

    public OrdenacaodeNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : listaNumeros) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int numeroMaior = Integer.MIN_VALUE;
        if (!listaNumeros.isEmpty()){
            for (Integer numero : listaNumeros) {
                if (numero >= numeroMaior) {
                    numeroMaior = numero;
                }
            }
        }
        return numeroMaior;
    }
    public int encontrarMenorNumero(){
        int numeroMenor = Integer.MAX_VALUE;
        for(Integer numero : listaNumeros){
            if(numero <= numeroMenor){
                numeroMenor = numero;
            }
        }
        return numeroMenor;
    }
    public void exibirNumeros(){
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        OrdenacaodeNumeros ordenacaodeNumeros = new OrdenacaodeNumeros();

        ordenacaodeNumeros.adicionarNumero(20);
        ordenacaodeNumeros.adicionarNumero(302);
        ordenacaodeNumeros.adicionarNumero(564);
        ordenacaodeNumeros.adicionarNumero(1);

        System.out.println("O menor número é: " + ordenacaodeNumeros.encontrarMenorNumero() );
        System.out.println("O maior número é: " + ordenacaodeNumeros.encontrarMaiorNumero() );
        System.out.println("A soma dos numeros é: " + ordenacaodeNumeros.calcularSoma() );

        ordenacaodeNumeros.exibirNumeros();
    }
}

