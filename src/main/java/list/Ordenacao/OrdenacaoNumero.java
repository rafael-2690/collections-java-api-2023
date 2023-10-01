package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero  {
    private List<Integer> listaNumero;

    public OrdenacaoNumero() {
        this.listaNumero = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        listaNumero.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(this.listaNumero);
        if (!listaNumero.isEmpty()){
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(this.listaNumero);
        if (!listaNumero.isEmpty()){
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }
    public void exibirNumeros(){
        if (!listaNumero.isEmpty()){
            System.out.println(this.listaNumero);
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();

        ordenacaoNumero.adicionarNumero(56);
        ordenacaoNumero.adicionarNumero(21);
        ordenacaoNumero.adicionarNumero(205);
        ordenacaoNumero.adicionarNumero(14);
        ordenacaoNumero.adicionarNumero(1);
        ordenacaoNumero.adicionarNumero(89);
        ordenacaoNumero.adicionarNumero(532);
        ordenacaoNumero.adicionarNumero(1209);

        ordenacaoNumero.exibirNumeros();

        System.out.println("Exibindo lista ordenada em ordem crescente: " + ordenacaoNumero.ordenarAscendente());

        ordenacaoNumero.exibirNumeros();

        System.out.println("Exibindo lista ordenada em ordem decrescente: " + ordenacaoNumero.ordenarDescendente());

        ordenacaoNumero.exibirNumeros();
    }
}
