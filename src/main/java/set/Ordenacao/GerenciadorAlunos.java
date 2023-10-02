package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        alunoSet.add(new Aluno(nome,matricula, media));
    }
    public void removerAluno(long matricula){
        Aluno alunoRemover = null;
        if (!alunoSet.isEmpty()){
            for (Aluno a : alunoSet){
                if (a.getMatricula() == matricula){
                    alunoRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoRemover);
        }else{
            throw new RuntimeException("O conjunto está vazio");
        }
    }
    public Set<Aluno> exibirAlunosPorNome(){
    Set<Aluno> OrdenadoPorNome = new TreeSet<>(alunoSet);
    return OrdenadoPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
    Set<Aluno> OrdenadoPorNota = new TreeSet<>(new ComparatorNota());
    OrdenadoPorNota.addAll(alunoSet);
    return OrdenadoPorNota;
    }
    public void exibirAlunos(){
        System.out.println(alunoSet);
    }
    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunoSet);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        System.out.println(gerenciadorAlunos.alunoSet);

        // Exibindo alunos ordenados por nome
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        // Exibindo alunos ordenados por nota
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
