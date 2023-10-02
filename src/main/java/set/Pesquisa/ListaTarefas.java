package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }
    }
    public void exibirTarefas(){
        if (!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        }else {
            System.out.println("Conjunto vazio");
        }
    }
    public int contarTarefas(){
        return tarefaSet.size();
    }
    public void marcarTarefaConcluida(String descricao){
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setCheck(true);
                    break;
                }
            }
        }else {
            System.out.println("Conjunto vazio");
        }
    }
    public void marcarTarefaPendente(String descricao){
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setCheck(false);
                    break;
                }
            }
        }else {
            System.out.println("Conjunto vazio");
        }
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (t.isCheck() == true){
                    tarefasConcluidas.add(t);
                }
            }
        }else{
            System.out.println("Conjunto vazio");
        }
        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPedentes = new HashSet<>();
        if (!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet){
                if (t.isCheck() == false){
                    tarefasPedentes.add(t);
                }
            }
        }else{
            System.out.println("Conjunto vazio");
        }
        return tarefasPedentes;
    }

    public void limparListaTarefas(){
        if (!tarefaSet.isEmpty()){
            tarefaSet.clear();
        }else {
            System.out.println("Conjunto vazio");
        }
    }
    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
