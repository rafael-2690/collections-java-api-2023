package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        if(!contatoSet.isEmpty()){
            System.out.println(contatoSet);
        }else {
            System.out.println("O conjunto está vazio");
        }
    }
    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatoEncontrado = new HashSet<>();
        for (Contato c : contatoSet){
            if (!contatoSet.isEmpty()){
                if (c.getNome().startsWith(nome)){
                    contatoEncontrado.add(c);
                }
            }else{
                System.out.println("Conjunto vazio");
            }
        }
        return contatoEncontrado;
    }
    public Contato atualizarNumeroContato(String nome, int numero){
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet){
            if (!contatoSet.isEmpty()){
                if (c.getNome().equalsIgnoreCase(nome)){
                    c.setNumeroTelefone(numero);
                    contatoAtualizado = c;
                    break;
                }
            }else{
                System.out.println("Conjunto vazio.");
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContatos();

        // Adicionando contatos à agenda
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);

        // Exibindo os contatos na agenda
        agendaContatos.exibirContatos();

        // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.pesquisaPorNome("Maria"));

        // Atualizando o número de um contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
    }
}
