package main.java.list.OperacaoBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo

    private List<Tarefa> listtarefa;

    public ListaTarefa() {
        this.listtarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listtarefa.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : listtarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        listtarefa.removeAll(tarefasParaRemover);
        }
    public int obterNumeroTotalTarefa(){
        return listtarefa.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(listtarefa);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefa());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefa());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefa());

        listaTarefa.obterDescricoesTarefas();
    }
    }