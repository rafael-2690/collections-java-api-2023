package main.java.map.OperacaoBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
        private Map<String,Integer> agendaMap;

    public AgendaContatos() {
        this.agendaMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        agendaMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        agendaMap.remove(nome);
    }
    public void exibirContatos(){
        if (!agendaMap.isEmpty()){
            System.out.println(agendaMap);
        }else {
            throw new RuntimeException("O conjunto está vazio");
        }
    }
    public Integer pesquisarPorPalavra(String palavra){
        Integer numeroPorNome = null;
        if (!agendaMap.isEmpty()){
            numeroPorNome = agendaMap.get(palavra);
            if (numeroPorNome == null){
                System.out.println("Contato não encontrado na lista.");
            }
        }else {
            throw new RuntimeException("O conjunto está vazio");
        }
        return numeroPorNome;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        // Remover um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarPorPalavra("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorPalavra(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }
}
