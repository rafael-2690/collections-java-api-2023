package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoa;

    public OrdenacaoPessoas(){
        this.listaPessoa = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoa.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaOrdenadaPorIdade = new ArrayList<>(listaPessoa);
        Collections.sort(listaOrdenadaPorIdade);
        return listaOrdenadaPorIdade;

    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaOrdenadaPorAltura = new ArrayList<>(listaPessoa);
        Collections.sort(listaOrdenadaPorAltura, new ComparatorPorAltura());
        return listaOrdenadaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Rafael", 18, 1.78);
        ordenacaoPessoas.adicionarPessoa("Lucas", 40, 1.86);
        ordenacaoPessoas.adicionarPessoa("Liza", 6, 1.45);
        ordenacaoPessoas.adicionarPessoa("Marcos", 22, 1.64);

        System.out.println("A lista ordenada por altura fica: " + ordenacaoPessoas.ordenarPorAltura());

        System.out.println("A lista ordenada por idade fica: " + ordenacaoPessoas.ordenarPorIdade());
    }

}
