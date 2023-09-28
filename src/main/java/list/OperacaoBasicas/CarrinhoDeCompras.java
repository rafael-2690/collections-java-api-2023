package main.java.list.OperacaoBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItem;

    public CarrinhoDeCompras() {
        this.listaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItem.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemRemover = new ArrayList<>();
        if(!listaItem.isEmpty()){
        for (Item i : listaItem) {

            if (i.getNome().equalsIgnoreCase(nome)) {
                    itemRemover.add(i);
            }
        }
        listaItem.removeAll(itemRemover);
    }else{
        System.out.println("A lista está vazia!");
    }
}
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!listaItem.isEmpty()){
            for (Item item: listaItem){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;//valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibirItem(){
        if (!listaItem.isEmpty()) {
            System.out.println(listaItem);
        }else {
            System.out.println("A lista está vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "listaItem=" + listaItem +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItem();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Caderno");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItem();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
