package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavraMap;

    public ContagemPalavras() {
        this.palavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavraMap.put(palavra,contagem);
    }
    public void removerPalavra(String palavra){
        if (!palavra.isEmpty()){
            palavraMap.remove(palavra);
        }else {
            System.out.println("O conjunto está vazio.");
        }
    }
    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        if (!palavraMap.isEmpty()){
            for (int contagem : palavraMap.values()){
                contagemTotal += contagem;
            }
        }else{
            System.out.println("O conjunto está vazio");
        }
        return contagemTotal;
    }
    public String encontrarPalavraMaisFrequente(){
        String palavraFrequente = null;
        int maiorContagem = 0;
        if (!palavraMap.isEmpty()){
            for (Map.Entry<String,Integer> entry : palavraMap.entrySet()){
                if (entry.getValue() > maiorContagem);
                maiorContagem = entry.getValue();
                palavraFrequente = entry.getKey();
            }
        }else{
            System.out.println("O conjunto está vazio");
        }
        return palavraFrequente;
    }
    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
