package main.java.set.OperacaoBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        palavraSet.add(palavra);
    }
    public void removerPalavra(String palavra){
        if (!palavraSet.isEmpty()){
            if (palavraSet.contains(palavra)){
                palavraSet.remove(palavra);
            }else{
                System.out.println("Palavra não encontrada");
            }
        }else {
            System.out.println("Lista vazia");
        }
    }
    public boolean verificarPalavra(String palavra){
        boolean verificar = false;
        if (!palavraSet.isEmpty()){
            if (palavraSet.contains(palavra)){
                verificar = true;
            }else{
                verificar = false;
            }
        }else {
            System.out.println("Lista vazia");
        }
        return verificar;
    }
    public void exibirPalavrasUnicas(){
        if (!palavraSet.isEmpty()){
            System.out.println(palavraSet);
        }else{
            System.out.println("O conjunto está vazio");
        }
    }
}


